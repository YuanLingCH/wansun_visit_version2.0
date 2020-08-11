package wansun.visit.android.global;

import android.content.Intent;
import android.text.TextUtils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONObject;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import okhttp3.FormBody;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSink;
import okio.GzipSink;
import okio.Okio;
import retrofit2.Call;
import retrofit2.Retrofit;
import wansun.visit.android.api.apiManager;
import wansun.visit.android.bean.TokenBean;
import wansun.visit.android.bean.loginBean;
import wansun.visit.android.net.requestBodyUtils;
import wansun.visit.android.ui.activity.LoginActiovity;
import wansun.visit.android.utils.JsonMapUtil;
import wansun.visit.android.utils.MD5Utils;
import wansun.visit.android.utils.SharedUtils;
import wansun.visit.android.utils.logUtils;
import wansun.visit.android.utils.netUtils;
import wansun.visit.android.utils.unixTime;

/**
 * Created by User on 2020/6/17.
 *
 * 请求的拦截器统一加密加密处理
 */

public class RequestEncrypIntercepter implements Interceptor {

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request encrypt = encrypt(chain.request(),chain);
        Response response = chain.proceed(encrypt);
        Response decrypt = decrypt(response,chain);
        return  decrypt;

    }

    /**
     * 加密
     * @param originalRequest
     * @return
     */
    private Request encrypt(Request originalRequest,Chain chain) {
        Charset UTF8 = Charset.forName("UTF-8");
        String FORM_NAME = "encryptData";
        String token = SharedUtils.getString("token");
        long getCurrentTime = unixTime.getCurrentTime;
        HttpUrl.Builder url = originalRequest.url().newBuilder();//  得到请求地址
        RequestBody orginalBody = originalRequest.body();
        Buffer buffer = new Buffer();
        MediaType mediaType1 = orginalBody.contentType();
        logUtils.d("token"+token);
        if (mediaType1.toString().equals("application/json")||mediaType1.toString().equals("application/json; charset=utf-8")) {   //body提交
         // application/json
            RequestBody requestBody = (RequestBody) orginalBody;
                try {
                    requestBody.writeTo(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                MediaType mediaType = requestBody.contentType();
                if (mediaType != null) {
                    Charset charset = mediaType.charset(UTF8);
                    String s = buffer.readString(charset);
                    logUtils.d("拦截请求参数"+s);
                    Map<String, Object> map = JsonMapUtil.getMap(s);
                    Set set = map.keySet();
                    List list = new ArrayList(set);
                    Iterator iterator = list.iterator();
                    StringBuffer buf = new StringBuffer();
                    while (iterator.hasNext()) {
                        buf.append(map.get(iterator.next()));
                    }
                    buf.append(getCurrentTime);
                    String sign = MD5Utils.stringToMD5(buf.toString());  // 签名
                    map.put("timestamp", getCurrentTime);
                    map.put("sign", sign);
                    JSONObject json=new JSONObject(map);
                    logUtils.d("请求地址JSON"+json);
                    String encry = null;
                    try {
                      //  encry = RSAUtils.encryptByPublicKey(gson.toJson(map), RSAUtils.encrykey).replace("\r\n|\r|\n", "");  //加密
                        //// TODO: 2020/6/18  加密
                        Map jsonMap=new HashMap();
                        jsonMap.put(FORM_NAME,json);
                        JSONObject jsonSend=new JSONObject(jsonMap);
                        //String  jsonSend = gson.toJson(jsonMap);
                        logUtils.d("拦截请求参数发送jsonSend" + jsonSend);
                        RequestBody newResquestBody = RequestBody.create(orginalBody.contentType(), jsonSend+"");
                        return  originalRequest.newBuilder().addHeader("token",token).method(originalRequest.method(),newResquestBody).build();
                    } catch (Exception e) {
                        e.printStackTrace();
                        logUtils.d("拦截请求参数GeneralSecurityException"+e.toString());
                    }


                }

        }else if (orginalBody instanceof FormBody){   //表单提交
            logUtils.d("FormBody拦截");
           FormBody forBody=(FormBody) orginalBody;
            Map<String,String> forMap=new HashMap<>();
            for (int i = 0; i < forBody.size(); i++) {
                forMap.put(forBody.name(i),forBody.value(i));
            }
            Set<String> set = forMap.keySet();
            List list=new ArrayList(set);
            Collections.sort(list);
            StringBuffer buf=new StringBuffer();
            Iterator iterator = list.iterator();
            while (iterator.hasNext()){
                buf.append(forMap.get(iterator.next()));
            }
            buf.append(getCurrentTime);
            buf.append(token);
            String sign = MD5Utils.stringToMD5(buf.toString());  // 加密
            forMap.put("sign",sign);
            forMap.put("timestamp",getCurrentTime+"");
            Gson gson=new Gson();
            String s = gson.toJson(forMap);   // 得到json数据
            logUtils.d("发送参数"+s);
             FormBody   newForBody=new FormBody.Builder().add(FORM_NAME,s).build();
            if (newForBody!=null){
          return  originalRequest.newBuilder().header("token",token).post(newForBody).build();
            }

        }else if (orginalBody instanceof MultipartBody){  //文件提交
            logUtils.d("传文件拦截");

            return originalRequest.newBuilder().addHeader("token",token).build();
        }

        return originalRequest;
    }

    private RequestBody gzip(final RequestBody body){
        return  new RequestBody() {
            @Override
            public MediaType contentType() {
                return body.contentType();
            }

        public long contentLength(){
            return -1;
        }

            @Override
            public void writeTo(BufferedSink sink) throws IOException {
            BufferedSink gzipSink= Okio.buffer(new GzipSink(sink));
                body.writeTo(gzipSink);
                logUtils.d("压缩走了");
                gzipSink.close();
            }
        };
    }


    /**
     * 解密
     * @param originalResponse
     * @return
     */
    private  Response decrypt(Response originalResponse,Chain chain){
        try {
            ResponseBody originalResponseBody = originalResponse.body();
            if (originalResponseBody==null || originalResponseBody.contentType()==null){
                return originalResponse;
            }
            logUtils.d("===========================================================");

            // 判断token 是否过期  如果过期了 就getNewToken()得到newToken 在请求数据  Authority
            if (isTokenExpired(originalResponse)){
            // 发送新的请求
                Request newRequest = chain.request().newBuilder()
                       // .addHeader("token",newToken)
                        .build();
                logUtils.d("重新发送请求》》》》》");

                return chain.proceed(encrypt(newRequest, chain));  //  chain.proceed(newRequest);

            }
            //解密
            if (!TextUtils.isEmpty(json)){
                String decrypt=json;    //原始数据  没有解密
                ResponseBody newResonseBody = ResponseBody.create(originalResponseBody.contentType(), decrypt);
                logUtils.d("转发========"+json);
                json=null;  //要清空
                return originalResponse.newBuilder().body(newResonseBody).build();

            }else {

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return originalResponse;
    }


    String json=null;
    public boolean isTokenExpired(Response originalResponse) throws IOException{
       json = originalResponse.body().string();
         Gson gson=new Gson();
        TokenBean bean = gson.fromJson(json, new TypeToken<TokenBean>() {}.getType());
        logUtils.d("json====================="+json);
        if ( bean.getStatusID().equals("401")){
            logUtils.d("token失效"+json);
            getNewToken();

            return true;
        }
        return false;
    }

    /**
     * 重新登录获取token
     * @return         必须使用同步方法      带验证
     */
             String newToken=null;
            public String getNewToken(){
                // 获取用户名 和密码  重新登录
                String account = SharedUtils.getString("account");
                String password = SharedUtils.getString("password");
                String token1 = SharedUtils.getString("token");
                logUtils.d("account"+account+":"+"password"+password);
                String imeiSucess = SharedUtils.getString("imei");
                if (!TextUtils.isEmpty(account)&&!TextUtils.isEmpty(password)&&!TextUtils.isEmpty(token1)){
                    Retrofit retrofit = netUtils.getRetrofit();
                    apiManager manager1 = retrofit.create(apiManager.class);
                    Call<String> call = manager1.login(requestBodyUtils.getLoginMessage(account,password,imeiSucess));
                    try {
                        String body = call.execute().body();
                        if (!TextUtils.isEmpty(body)){
                            logUtils.d("登陆>>>>>>>>" + body);
                            Gson gson=new Gson();
                            loginBean bean = gson.fromJson(body, new TypeToken<loginBean>() {}.getType());
                            String statusID = bean.getStatusID();
                            if (statusID.equals(AppConfig.SUCCESS)){// 200成功
                                loginBean.DataBean data = bean.getData();
                                String token = data.getToken();
                                newToken= token;
                                SharedUtils.putString("token", token);
                                SharedUtils.putString("userName",data.getName()+"");
                                logUtils.d("token"+ token);

                            }else {
                        waifangApplication.getContext().startActivity(new Intent(waifangApplication.getContext(), LoginActiovity.class));  //密码错误
                            }
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                        waifangApplication.getContext().startActivity(new Intent(waifangApplication.getContext(), LoginActiovity.class));
                    }


                    return newToken;
                }else {
                    waifangApplication.getContext().startActivity(new Intent(waifangApplication.getContext(), LoginActiovity.class));
                }

                return  null;

            }

}
