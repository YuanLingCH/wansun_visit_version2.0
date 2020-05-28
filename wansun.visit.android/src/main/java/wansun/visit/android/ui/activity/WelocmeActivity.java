package wansun.visit.android.ui.activity;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.provider.Settings;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.arcsoft.arcfacedemo.common.Constants;
import com.arcsoft.face.ActiveFileInfo;
import com.arcsoft.face.ErrorInfo;
import com.arcsoft.face.FaceEngine;
import com.arcsoft.face.enums.RuntimeABI;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import wansun.visit.android.R;
import wansun.visit.android.api.apiManager;
import wansun.visit.android.bean.stateMessageBean;
import wansun.visit.android.global.AppConfig;
import wansun.visit.android.net.requestBodyUtils;
import wansun.visit.android.utils.CommonUtil;
import wansun.visit.android.utils.NetWorkTesting;
import wansun.visit.android.utils.SharedUtils;
import wansun.visit.android.utils.ToastUtil;
import wansun.visit.android.utils.logUtils;
import wansun.visit.android.utils.netUtils;

/**
 * 首页
 * Created by User on 2019/3/26.
 */

public class WelocmeActivity extends BaseActivity {
    TextView tv_imie,tv_check_state,tv_link_devices;
    private static final int REQUEST_TAKE_PHOTO_PERMISSION = 1;
    Button but_imei;
    private Toast toast = null;
    String imei=null;
    private static final int ACTION_REQUEST_PERMISSIONS = 0x001;
    /**
     * 所需的所有权限信息
     */
    private static final String[] NEEDED_PERMISSIONS = new String[]{
            Manifest.permission.CAMERA,
            Manifest.permission.READ_PHONE_STATE

    };

    boolean libraryExists = true;
    // Demo 所需的动态库文件
    private static final String[] LIBRARIES = new String[]{
            // 人脸相关
            "libarcsoft_face_engine.so",
            "libarcsoft_face.so",
            // 图像库相关
            "libarcsoft_image_util.so",
    };

    @Override
    protected int getLayoutId() {
        return R.layout.activity_welcome;
    }
    @Override
    protected void initView() {
        libraryExists = checkSoFile(LIBRARIES);
        tv_imie= (TextView) findViewById(R.id.tv_imie);
        tv_link_devices= (TextView) findViewById(R.id.tv_link_devices);
        tv_check_state= (TextView) findViewById(R.id.tv_check_state);
        but_imei= (Button) findViewById(R.id.but_imei);
// 避免从桌面启动程序后，会重新实例化入口类的activity
        if (!this.isTaskRoot()) { // 当前类不是该Task的根部，那么之前启动
            Intent intent = getIntent();
            if (intent != null) {
                String action = intent.getAction();
                if (intent.hasCategory(Intent.CATEGORY_LAUNCHER) && Intent.ACTION_MAIN.equals(action)) { // 当前类是从桌面启动的
                    finish(); // finish掉该类，直接打开该Task中现存的Activity
                    return;
                }
            }
        }

    }

    @Override
    protected void initEvent() {
    }

    @Override
    protected void initData() {

        permission();
    }

    private void getData() {
        NetWorkTesting net = new NetWorkTesting(WelocmeActivity.this);
        if (net.isNetWorkAvailable()) {
       TelephonyManager telephonyManager = (TelephonyManager) this.getSystemService(Context.TELEPHONY_SERVICE);
            String android_id= Settings.System.getString(getContentResolver(),Settings.Secure.ANDROID_ID);
           imei = telephonyManager.getDeviceId();
            if (TextUtils.isEmpty(imei)){
          imei= CommonUtil.getIMEINew(WelocmeActivity.this);
            }
        SharedUtils.putString("imei", imei);
        logUtils.d("手机串号" + imei);
        tv_link_devices.setText(R.string.link_devices);
        Retrofit retrofit = netUtils.getRetrofit();
        apiManager manager = retrofit.create(apiManager.class);
        final RequestBody requestBody = requestBodyUtils.checkImie(imei);
        Call<String> call = manager.checkImie(requestBody);
        call.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                try {
                    String body = response.body();
                    logUtils.d("手机串号下载" + body);

                    if (!TextUtils.isEmpty(body)) {
                        Gson gson = new Gson();
                        stateMessageBean data = gson.fromJson(body, new TypeToken<stateMessageBean>() {}.getType());
                        String statusID = data.getStatusID();
                        if (statusID.equals(AppConfig.SUCCESS)) {
                                Intent intent = new Intent(WelocmeActivity.this,RegisterAndRecognizeActivity.class);
                                startActivity(intent);
                                finish();

                        } else {
                            tv_check_state.setText(R.string.check_imei_state);
                            tv_imie.setText("设备IMEI:" + imei.toString().trim());
                            tv_imie.setTextSize(18);
                            tv_link_devices.setText("设备连接失败...");
                            String imeiSucess = SharedUtils.getString("imeiSucess");
                            if (!TextUtils.isEmpty(imeiSucess)) {
                                SharedUtils.clear("imeiSucess");
                            }
                        }
                    }
                } catch (JsonSyntaxException e) {
                    e.printStackTrace();
                    ToastUtil.showToast(WelocmeActivity.this, "网络错误，请稍后再试...");
                }
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                logUtils.d("手机串号下载失败" + t.toString());
                ToastUtil.showToast(WelocmeActivity.this, t.toString());
            }
        });
    }else {
            ToastUtil.showToast(WelocmeActivity.this, "网络错误，请稍后再试...");

        }
    }
    @Override
    protected void initLise() {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,  WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    private void permission() {
        List<String> permissionLists = new ArrayList<>();
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_PHONE_STATE) != PackageManager.PERMISSION_GRANTED) {
            permissionLists.add(Manifest.permission.READ_PHONE_STATE);
        }
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
            permissionLists.add(Manifest.permission.CAMERA);
        }
        if (!permissionLists.isEmpty()) {//说明肯定有拒绝的权限

            ActivityCompat.requestPermissions(this, permissionLists.toArray(new String[permissionLists.size()]), REQUEST_TAKE_PHOTO_PERMISSION);

        } else {
            //  Toast.makeText(this, "权限都授权了",Toast.LENGTH_SHORT).show();
            getData();
            activeEngine();

        }
    }


    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode) {

            case REQUEST_TAKE_PHOTO_PERMISSION:
                if (grantResults.length > 0) {
                    for (int grantResult : grantResults) {
                        if (grantResult != PackageManager.PERMISSION_GRANTED) {
                            Toast.makeText(this, "某一个权限被拒绝了", Toast.LENGTH_SHORT).show();
                            return;
                        }
                        getData();
                        activeEngine();
                    }
                }
                break;

            default:

                break;
        }
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }



    /**
     * 激活引擎
     *
     *
     */
    public void activeEngine() {
        if (!libraryExists) {
            showToast("没发现动态库");
            return;
        }
        if (!checkPermissions(NEEDED_PERMISSIONS)) {
            ActivityCompat.requestPermissions(this, NEEDED_PERMISSIONS, ACTION_REQUEST_PERMISSIONS);
            return;
        }

        Observable.create(new ObservableOnSubscribe<Integer>() {
            @Override
            public void subscribe(ObservableEmitter<Integer> emitter) {
                RuntimeABI runtimeABI = FaceEngine.getRuntimeABI();


                long start = System.currentTimeMillis();
                int activeCode = FaceEngine.activeOnline(WelocmeActivity.this, Constants.APP_ID, Constants.SDK_KEY);
                logUtils.d("激活代码"+activeCode );
                emitter.onNext(activeCode);
            }
        })
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Integer>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(Integer activeCode) {
                        if (activeCode == ErrorInfo.MOK) {
                            showToast(getString(R.string.active_success));
                        } else if (activeCode == ErrorInfo.MERR_ASF_ALREADY_ACTIVATED) {
                            showToast(getString(R.string.already_activated));
                            logUtils.d("激活代码"+activeCode );
                        } else {
                            showToast(getString(R.string.active_failed, activeCode));
                        }


                        ActiveFileInfo activeFileInfo = new ActiveFileInfo();
                        int res = FaceEngine.getActiveFileInfo(WelocmeActivity.this, activeFileInfo);
                        if (res == ErrorInfo.MOK) {
                            String startTime = activeFileInfo.getStartTime();
                            logUtils.d("开始时间"+startTime);
                        }

                    }

                    @Override
                    public void onError(Throwable e) {
                        showToast(e.getMessage());

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    /**
     * 检查能否找到动态链接库，如果找不到，请修改工程配置
     *
     * @param libraries 需要的动态链接库
     * @return 动态库是否存在
     */
    private boolean checkSoFile(String[] libraries) {
        File dir = new File(getApplicationInfo().nativeLibraryDir);
        File[] files = dir.listFiles();
        if (files == null || files.length == 0) {
            return false;
        }
        List<String> libraryNameList = new ArrayList<>();
        for (File file : files) {
            libraryNameList.add(file.getName());
        }
        boolean exists = true;
        for (String library : libraries) {
            exists &= libraryNameList.contains(library);
        }
        return exists;
    }

}
