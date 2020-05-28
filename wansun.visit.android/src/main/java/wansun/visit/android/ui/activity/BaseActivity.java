package wansun.visit.android.ui.activity;

import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

import wansun.visit.android.global.waifangApplication;
import wansun.visit.android.utils.SharedUtils;
import wansun.visit.android.utils.waterMark;

/**
 * Created by User on 2019/1/8.
 * 基类的封装
 */

public abstract class BaseActivity extends AppCompatActivity {
    waifangApplication application;
    private BaseActivity oContext;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initLise();
        this.getWindow().addFlags(WindowManager.LayoutParams.FLAG_SECURE);  //设置防止用截屏
        setContentView(getLayoutId());
        String userName = SharedUtils.getString("account");
        long  currentTime=System.currentTimeMillis();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm");
        String formatTime = sdf.format(new Date(currentTime));
        String waterText="WanSun"+"-"+userName+"-"+formatTime;
        waterMark.getInstance().show(this, waterText);   //水印加在布局文件的上面
        initView();
        initEvent();
        initData();
        if (application == null) {
            // 得到Application对象
            application = (waifangApplication) getApplication();
        }
        oContext = this;// 把当前的上下文对象赋值给BaseActivity
        addActivity();// 调用添加方法

    }
    protected  abstract  int getLayoutId();   //加载布局文件
    protected  abstract void  initView();
    protected  abstract void  initEvent();
    protected  abstract void  initData();
    protected  abstract void  initLise();
    // 添加Activity方法
    public void addActivity() {
        application.addActivity_(oContext);// 调用myApplication的添加Activity方法
    }
    //销毁当个Activity方法
    public void removeActivity() {
        application.removeActivity_(oContext);// 调用myApplication的销毁单个Activity方法
    }
    //销毁所有Activity方法
    public  void removeALLActivity() {
        application.removeALLActivity_();// 调用myApplication的销毁所有Activity方法
    }

    /**
     * 权限检查
     *
     * @param neededPermissions 需要的权限
     * @return 是否全部被允许
     */
    protected boolean checkPermissions(String[] neededPermissions) {
        if (neededPermissions == null || neededPermissions.length == 0) {
            return true;
        }
        boolean allGranted = true;
        for (String neededPermission : neededPermissions) {
            allGranted &= ContextCompat.checkSelfPermission(this, neededPermission) == PackageManager.PERMISSION_GRANTED;
        }
        return allGranted;
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        boolean isAllGranted = true;
        for (int grantResult : grantResults) {
            isAllGranted &= (grantResult == PackageManager.PERMISSION_GRANTED);
        }
       // afterRequestPermission(requestCode, isAllGranted);
    }


  //  abstract void afterRequestPermission(int requestCode, boolean isAllGranted);

    protected void showToast(String s) {
        Toast.makeText(getApplicationContext(), s, Toast.LENGTH_SHORT).show();
    }
    protected void showLongToast(String s) {
        Toast.makeText(getApplicationContext(), s, Toast.LENGTH_LONG).show();
    }





}
