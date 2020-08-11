package wansun.visit.android.ui.fragment;

import android.text.TextUtils;
import android.widget.ListView;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import wansun.visit.android.R;
import wansun.visit.android.adapter.VisitAnnexPicturesAdapter;
import wansun.visit.android.api.apiManager;
import wansun.visit.android.bean.VisitAnnexPicturesBean;
import wansun.visit.android.global.AppConfig;
import wansun.visit.android.utils.MD5Utils;
import wansun.visit.android.utils.SharedUtils;
import wansun.visit.android.utils.logUtils;
import wansun.visit.android.utils.netUtils;
import wansun.visit.android.utils.unixTime;

/**
 * 外访图片附件列表
 * Created by User on 2020/4/16.
 */

public class VisitAnnexLisitPicturesFragment extends BaseFragment {
    ListView lv_picture;
    VisitAnnexPicturesAdapter adapter;
    List<VisitAnnexPicturesBean.DataBean>data;
    List dataPicture;
    String caseCode;
    @Override
    protected int getLayoutId() {
        return R.layout.fragment_annex_pictures;
    }

    @Override
    protected void initViews() {
        lv_picture=(ListView) root.findViewById(R.id.lv_picture);

    }

    @Override
    protected void initEvents() {


    }

    @Override
    protected void initData() {
        data=new ArrayList();
        dataPicture=new ArrayList();
        caseCode = getActivity().getIntent().getStringExtra("caseCodeAnnex");
        logUtils.d("获取案件编号Fragment=======>"+caseCode);
        Retrofit retrofit = netUtils.getRetrofit();
        apiManager manager= retrofit.create(apiManager.class);
     //   RequestBody requestBody = requestBodyUtils.findVisitAnnex(caseCode);
        Call<String> call = manager.findAnnex(caseCode);
        data.clear();
        dataPicture.clear();
        call.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                try {
                    String body = response.body();
                    logUtils.d("查询数据成功=======>" + body);   //  http://192.168.166.133:8082/files

                    if (!TextUtils.isEmpty(body)) {
                        Gson gson = new Gson();
                        VisitAnnexPicturesBean bean = gson.fromJson(body, new TypeToken<VisitAnnexPicturesBean>() {
                        }.getType());
                        String statusID = bean.getStatusID();
                        if (AppConfig.SUCCESS.equals(statusID)) {
                            List<VisitAnnexPicturesBean.DataBean> beanlist = bean.getData();
                            Iterator<VisitAnnexPicturesBean.DataBean> iterator = beanlist.iterator();
                            while (iterator.hasNext()){
                                VisitAnnexPicturesBean.DataBean next = iterator.next();
                                if (next.getType().equals("照片")){

                                  //  dataPicture.add(next.getUrl());
                            dataPicture.add( getPictureUrl(next.getAnnexId(),caseCode));
                                    data.add(next);
                                }
                            }
                            updataUi();
                            logUtils.d("图片数量"+dataPicture.size());
                        }


                    }
                } catch (JsonSyntaxException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                logUtils.d("查询数据失败=======>"+t.toString());
            }
        });
    }

    public String getPictureUrl(String annexId,String caseCode){
        if (!TextUtils.isEmpty(annexId)&&!TextUtils.isEmpty(caseCode)){


       String url=apiManager.getPicturePath+"?"+"timestamp="+unixTime.getCurrentTime+"&"+"caseCode="+caseCode+"&"+"annexId="+annexId+"&"+"sign="+getSign(annexId,caseCode)+"&"+"token="+ SharedUtils.getString("token");
      //logUtils.d("图片地址拼接"+url);
            return url;
        }
        return null;
    }




    public String getSign(String annexId,String caseCode){
        if (!TextUtils.isEmpty(annexId)){
            Map<String,String> map=new HashMap<>();
            map.put("caseCode",caseCode);
            map.put("annexId",annexId);
            Set set = map.keySet();
            List list = new ArrayList(set);
            Iterator iterator = list.iterator();
            StringBuffer buf = new StringBuffer();
            while (iterator.hasNext()) {
                buf.append(map.get(iterator.next()));
            }
            buf.append(unixTime.getCurrentTime);
           return MD5Utils.stringToMD5(buf.toString());  // 签名
        }
        return  null;
    }




    private void updataUi() {

        adapter=new VisitAnnexPicturesAdapter(getActivity(),data, AppConfig.VISIT_ANNEX_PICTURE,dataPicture);
        lv_picture.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}
