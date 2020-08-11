package wansun.visit.android.global;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.media.AudioManager;
import android.os.Build;
import android.os.StrictMode;
import android.support.annotation.RequiresApi;

import com.baidu.mapapi.CoordType;
import com.baidu.mapapi.SDKInitializer;
import com.baidu.tts.client.SpeechSynthesizer;
import com.baidu.tts.client.TtsMode;
import com.franmontiel.persistentcookiejar.ClearableCookieJar;
import com.franmontiel.persistentcookiejar.PersistentCookieJar;
import com.franmontiel.persistentcookiejar.cache.SetCookieCache;
import com.franmontiel.persistentcookiejar.persistence.SharedPrefsCookiePersistor;
import com.taobao.sophix.PatchStatus;
import com.taobao.sophix.SophixManager;
import com.taobao.sophix.listener.PatchLoadStatusListener;
import com.tencent.bugly.crashreport.CrashReport;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import soundrecorderutils.LiveService;
import wansun.visit.android.greendao.gen.DaoMaster;
import wansun.visit.android.greendao.gen.DaoSession;
import wansun.visit.android.utils.logUtils;


/**
 * Created by User on 2019/1/8.
 */
public class waifangApplication extends Application {
    static Context mcontext;
    static   SpeechSynthesizer mSpeechSynthesizer;
    private List<Activity> oList;//用于存放所有启动的Activity的集合
    static   waifangApplication app;
    private DaoMaster.DevOpenHelper dbHelper;
    private SQLiteDatabase db;
    private DaoMaster mDaoMaster;
    private DaoSession mDaoSession;
    Intent intLiveService;



    @RequiresApi(api = 26)
    @Override
    public void onCreate() {
        super.onCreate();
        init();
        mcontext=getApplicationContext();
        SDKInitializer.initialize(this);
        //自4.3.0起，百度地图SDK所有接口均支持百度坐标和国测局坐标，用此方法设置您使用的坐标类型.
        //包括BD09LL和GCJ02两种坐标，默认是BD09LL坐标。
        SDKInitializer.setCoordType(CoordType.BD09LL);
        mSpeechSynthesizer = SpeechSynthesizer.getInstance();
        app=this;
        oList = new ArrayList<Activity>();
        initDatabass();

        /*

        * 第三个参数为SDK调试模式开关，调试模式的行为特性如下：
        输出详细的Bugly SDK的Log；
        每一条Crash都会被立即上报；
        自定义日志将会在Logcat中输出。
        建议在测试阶段建议设置成true，发布时设置为false。
        *
        * */
        CrashReport.initCrashReport(getApplicationContext(), "18ca237fe3", true);

        try {
            intLiveService=new Intent(this, LiveService.class);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                mcontext.startForegroundService(intLiveService);
            } else {
                mcontext.startService(intLiveService);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder();
        StrictMode.setVmPolicy(builder.build());
        builder.detectFileUriExposure();
    }
    private void initDatabass() {
        //这里之后会修改，关于升级数据库
        dbHelper = new DaoMaster.DevOpenHelper(this, "visit-db", null);
        db = dbHelper.getWritableDatabase();
        mDaoMaster = new DaoMaster(db);
        mDaoSession = mDaoMaster.newSession();
    }

    public DaoSession getSession(){
        return mDaoSession;
    }
    public SQLiteDatabase getDb(){
        return db;
    }
    /**
     * 初始化语音
     * @return
     */
    public static SpeechSynthesizer getmSpeechSynthesizer() {
        new Thread(){
            @Override
            public void run() {
                super.run();
                mSpeechSynthesizer.setContext(mcontext); // this 是Context的之类，如Activity
                mSpeechSynthesizer.setAppId("15391877");/*这里只是为了让Demo运行使用的APPID,请替换成自己的id。*/
                mSpeechSynthesizer.setApiKey("H8hwKCV0LzHK6wXuOp28D05q4oozGAfG","cmLBTFqVFd0IFgdKcpS6AiivnyPhXClY");/*这里只是为了让Demo正常运行使用APIKey,请替换成自己的APIKey*/
                mSpeechSynthesizer.auth(TtsMode.MIX);  // 纯在线
                mSpeechSynthesizer.initTts(TtsMode.MIX); // 初始化离在线混合模式，如果只需要在线合成功能，使用 TtsMode.ONLINE
                mSpeechSynthesizer.setParam(SpeechSynthesizer.PARAM_MIX_MODE, SpeechSynthesizer.MIX_MODE_DEFAULT);
                mSpeechSynthesizer.setAudioStreamType(AudioManager.MODE_IN_CALL);
            }
        }.start();

        return mSpeechSynthesizer;
    }

    public  static    Context getContext(){
        return mcontext;
    }
    public static waifangApplication getInstence() {
        return app;
    }

    OkHttpClient okHttpClient;
    ClearableCookieJar cookieJar;
    public   OkHttpClient getClient() {
        if (cookieJar==null){
            cookieJar =
                    new PersistentCookieJar(new SetCookieCache(), new SharedPrefsCookiePersistor(waifangApplication.getContext()));
        }
        if (okHttpClient==null){
            okHttpClient = new OkHttpClient.Builder()
                    .cookieJar(cookieJar)
                    .retryOnConnectionFailure(true)
                    . connectTimeout(30, TimeUnit.SECONDS)
                    .readTimeout(30, TimeUnit.SECONDS)
                    . writeTimeout(30, TimeUnit.SECONDS)
                    .sslSocketFactory(HttpsTrustManager.createSSLSocketFactory())
                    .hostnameVerifier(new HttpsTrustManager.TrustAllHostnameVerifier())
                .addInterceptor(new RequestEncrypIntercepter())
                    .build();

        }
        return okHttpClient;
    }

    /**
     * 添加Activity
     */
    public void addActivity_(Activity activity) {
            // 判断当前集合中不存在该Activity
        if (!oList.contains(activity)) {
            oList.add(activity);//把当前Activity添加到集合中
        }
    }

    /**
     * 销毁单个Activity
     */
    public void removeActivity_(Activity activity) {
           //判断当前集合中存在该Activity
        if (oList.contains(activity)) {
            oList.remove(activity);//从集合中移除
            activity.finish();//销毁当前Activity
        }
    }
    /**
     * 销毁所有的Activity
     */
    public void removeALLActivity_() {
        //通过循环，把集合中的所有Activity销毁
        for (Activity activity : oList) {
            activity.finish();
        }
    }
    private void init() {
        // initialize最好放在attachBaseContext最前面
        String appVersion;
        try {
            appVersion = this.getPackageManager().getPackageInfo(this.getPackageName(), 0).versionName;
        } catch (Exception e) {
            appVersion = "1.0.0";
        }
        SophixManager.getInstance().setContext(this)
                .setAppVersion(appVersion)
                .setAesKey(null)
                .setEnableDebug(true)
                .setPatchLoadStatusStub(new PatchLoadStatusListener() {
                    @Override
                    public void onLoad(final int mode, final int code, final String info, final int handlePatchVersion) {
                        // 补丁加载回调通知
                        logUtils.d("补丁代码"+code+"====="+info);
                        if (code == PatchStatus.CODE_LOAD_SUCCESS) {
                            // 表明补丁加载成功
                            logUtils.d("表明补丁加载成功");
                        } else if (code == PatchStatus.CODE_LOAD_RELAUNCH) {
                            // 表明新补丁生效需要重启. 开发者可提示用户或者强制重启;
                            // 建议: 用户可以监听进入后台事件, 然后应用自杀
                            logUtils.d("表明新补丁生效需要重启. 开发者可提示用户或者强制重启");
                        } else if (code == PatchStatus.CODE_LOAD_FAIL) {
                            // 内部引擎异常, 推荐此时清空本地补丁, 防止失败补丁重复加载
                            // SophixManager.getInstance().cleanPatches();
                            logUtils.d("内部引擎异常, 推荐此时清空本地补丁, 防止失败补丁重复加载");
                        } else {
                            // 其它错误信息, 查看PatchStatus类说明
                            logUtils.d("其它错误信息, 查看PatchStatus类说明");
                        }
                    }
                }).initialize();
        // queryAndLoadNewPatch不可放在attachBaseContext 中，否则无网络权限，建议放在后面任意时刻，如onCreate中
        SophixManager.getInstance().queryAndLoadNewPatch();
    }
}
