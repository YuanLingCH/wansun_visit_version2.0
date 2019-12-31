package wansun.visit.android.utils;


import android.app.Activity;
import android.content.Context;
import android.graphics.PixelFormat;
import android.media.AudioFormat;
import android.os.Environment;
import android.os.SystemClock;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.zlw.main.recorderlib.RecordManager;
import com.zlw.main.recorderlib.recorder.RecordConfig;
import com.zlw.main.recorderlib.recorder.RecordHelper;
import com.zlw.main.recorderlib.recorder.listener.RecordResultListener;
import com.zlw.main.recorderlib.recorder.listener.RecordStateListener;
import com.zlw.main.recorderlib.utils.Logger;

import org.greenrobot.eventbus.EventBus;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import wansun.visit.android.R;
import wansun.visit.android.db.fileInfo;
import wansun.visit.android.event.MessageEvent;
import wansun.visit.android.global.waifangApplication;
import wansun.visit.android.greendao.gen.fileInfoDao;

/**

 * 悬浮窗工具类

 * created by Pumpkin at 17/3/28

 */

public class WindowsRecordUitlity {
    private static String TAG = WindowsRecordUitlity.class.getSimpleName();
    private static WindowManager mWindowManager = null;
    private static WindowManager.LayoutParams params;
    public static Boolean isShown = false;
    private static View mView = null;
    private boolean mStartRecording = true;
    private boolean mPauseRecording = true;
    long timeWhenPaused = 0;
    private com.melnykov.fab.FloatingActionButton mFabRecord;
    private Chronometer mChronometerTime;
    private ImageView mIvClose;
    private fileInfoDao dao;
    Button but;
    List bottomPath;
    Activity activity;

    List<Long> dataDaoId;
    final RecordManager recordManager = RecordManager.getInstance();
    private boolean isStart = false;
    private boolean isPause = false;

    public WindowsRecordUitlity(Activity activity, Button  but) {
        this.activity=activity;
        dao= waifangApplication.getInstence().getSession().getFileInfoDao();
        bottomPath=new ArrayList();
        dataDaoId=new ArrayList();
        this.but=but;
    }

    /**

     * 显示弹出框

     *

     * @param context

     */

    @SuppressWarnings("WrongConstant")

    public  void showPopupWindow(final Context context, String showtxt) {
        logUtils.d("添加了view1");
        if (isShown) {

            return;

        }
        logUtils.d("添加了view2");
        isShown = true;

        // 获取WindowManager

        mWindowManager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        logUtils.d("添加了view");
        mView = setUpView(context, showtxt);
        params = new WindowManager.LayoutParams();

        // 类型，系统提示以及它总是出现在应用程序窗口之上。
//WindowManager.LayoutParams.TYPE_SYSTEM_ALERT
        params.type = WindowManager.LayoutParams.TYPE_SYSTEM_ALERT |

                WindowManager.LayoutParams.TYPE_SYSTEM_OVERLAY;



        // 设置flag

        int flags = canTouchFlags;



        // | WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE;

        // 如果设置了WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE，弹出的View收不到Back键的事件

        params.flags = flags;

        // 不设置这个弹出框的透明遮罩显示为黑色

        params.format = PixelFormat.TRANSLUCENT;

        // FLAG_NOT_TOUCH_MODAL不阻塞事件传递到后面的窗口

        // 设置 FLAG_NOT_FOCUSABLE 悬浮窗口较小时，后面的应用图标由不可长按变为可长按

        // 不设置这个flag的话，home页的划屏会有问题

        params.width = WindowManager.LayoutParams.WRAP_CONTENT;

        params.height = WindowManager.LayoutParams.WRAP_CONTENT;

        params.gravity = Gravity.TOP;

        mWindowManager.addView(mView, params);

    }

    private static int canTouchFlags = WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE | WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL;

    private static int notTouchFlags = WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE| WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE;

    /**

     * 设置是否可响应点击事件

     *

     * @param isTouchable

     */

    public static void setTouchable(boolean isTouchable) {

        if (isTouchable) {

            params.flags = canTouchFlags;

        } else {

            params.flags = notTouchFlags;

        }

        mWindowManager.updateViewLayout(mView, params);

    }


    /**

     * 隐藏弹出框

     */

    public static void hidePopupWindow() {

        if (isShown && null != mView) {

            mWindowManager.removeView(mView);

            isShown = false;

        }

    }

    static LinearLayout rl_drag_showinpop;

    public  View setUpView(final Context context, String showtxt) {

        View view = LayoutInflater.from(context).inflate(R.layout.fragment_record_audio, null);


        initView(view);

        rl_drag_showinpop = (LinearLayout) view.findViewById(R.id.record_audio_cv);

        rl_drag_showinpop.setVisibility(View.VISIBLE);
        rl_drag_showinpop.setOnTouchListener(new View.OnTouchListener() {

            private float lastX; //上一次位置的X.Y坐标

            private float lastY;

            private float nowX;  //当前移动位置的X.Y坐标

            private float nowY;

            private float tranX; //悬浮窗移动位置的相对值

            private float tranY;

            @Override

            public boolean onTouch(View v, MotionEvent event) {

                boolean ret = false;

                switch (event.getAction()) {

                    case MotionEvent.ACTION_DOWN:

                        // 获取按下时的X，Y坐标

                        lastX = event.getRawX();

                        lastY = event.getRawY();

                        ret = true;

                        break;

                    case MotionEvent.ACTION_MOVE:

                        // 获取移动时的X，Y坐标

                        nowX = event.getRawX();

                        nowY = event.getRawY();

                        // 计算XY坐标偏移量

                        tranX = nowX - lastX;

                        tranY = nowY - lastY;

                        params.x += tranX;

                        params.y += tranY;

                        //更新悬浮窗位置

                        mWindowManager.updateViewLayout(mView, params);

                        //记录当前坐标作为下一次计算的上一次移动的位置坐标

                        lastX = nowX;

                        lastY = nowY;



                        break;

                    case MotionEvent.ACTION_UP:

                        break;

                }

                return ret;

            }

        });



        return view;

    }

    private void initView(final View view) {
        mChronometerTime = (Chronometer) view.findViewById(R.id.record_audio_chronometer_time);
        mFabRecord = (com.melnykov.fab.FloatingActionButton) view.findViewById(R.id.record_audio_fab_record);
        mIvClose = (ImageView) view.findViewById(R.id.record_audio_iv_close);
        mFabRecord.setMinimumWidth(25);
        mFabRecord.setMinimumHeight(25);
        mFabRecord.setColorNormal(activity.getResources().getColor(R.color.colorPrimary));
        mFabRecord.setColorPressed(activity.getResources().getColor(R.color.colorPrimaryDark));
        initEvent();
        mFabRecord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doPlay();  // 开始
            }
        });
        /**
         * 关掉录音
         */
        mIvClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logUtils.d("关掉录音");
                but.setEnabled(true);
                doStop();  //关掉录音
            }
        });
    }

    private void doStop() {
        recordManager.stop();
        //    btRecord.setText("开始");
        isPause = false;
        isStart = false;
        mChronometerTime.stop();
        mFabRecord.setImageResource(R.drawable.ic_mic_white_36dp);
        //mPauseButton.setVisibility(View.GONE);
        Toast.makeText(activity, "关掉录音...", Toast.LENGTH_SHORT).show();
        rl_drag_showinpop.setVisibility(View.GONE);
        hidePopupWindow();

    }



    private void doPlay() {
        if (isStart) {
            recordManager.pause();
            //   btRecord.setText("开始");
            isPause = true;
            isStart = false;
            mFabRecord.setImageResource(R.drawable.ic_media_stop);
            //mPauseButton.setVisibility(View.GONE);
            Toast.makeText(activity, "暂停录音...", Toast.LENGTH_SHORT).show();
            mChronometerTime.stop();
            timeWhenPaused = SystemClock.elapsedRealtime();
            logUtils.d("recordManager.pause()");
        } else {
            if (isPause) {
                recordManager.resume();
                logUtils.d("recordManager.resume()");
                Toast.makeText(activity, "继续录音...", Toast.LENGTH_SHORT).show();
                mFabRecord.setImageResource(R.drawable.ic_mic_white_36dp);
                    mChronometerTime.setBase(mChronometerTime.getBase()+(SystemClock.elapsedRealtime()-timeWhenPaused));
            } else {
                recordManager.start();
                logUtils.d("recordManager.start()");
                mFabRecord.setImageResource(R.drawable.ic_media_stop);
                //mPauseButton.setVisibility(View.VISIBLE);
                Toast.makeText(activity, "开始录音...", Toast.LENGTH_SHORT).show();
                mChronometerTime.setBase(SystemClock.elapsedRealtime());//计时器清零
                timeWhenPaused = SystemClock.elapsedRealtime();
            }
            mChronometerTime.start();
            // btRecord.setText("暂停");
            isStart = true;
        }
    }


    private void initEvent() {
        RecordManager.getInstance().init(waifangApplication.getInstence(), true);
        RecordManager.getInstance().changeFormat(RecordConfig.RecordFormat.MP3);
        RecordManager.getInstance().changeRecordConfig(recordManager.getRecordConfig().setSampleRate(8000));
        RecordManager.getInstance().changeRecordConfig(recordManager.getRecordConfig().setEncodingConfig(AudioFormat.ENCODING_PCM_8BIT));

        String caseCode = SharedUtils.getString("caseCode");
        String str="%s/wansun.visit.android/record/"+caseCode+"_";     //"%s/wansun.visit.android/record/test"
        final String recordDir = String.format(Locale.getDefault(), str,
                Environment.getExternalStorageDirectory().getAbsolutePath());
                  recordManager.changeRecordDir(recordDir);

        recordManager.setRecordStateListener(new RecordStateListener() {
            @Override
            public void onStateChange(RecordHelper.RecordState state) {
                Logger.i(TAG, "onStateChange %s", state.name());

                switch (state) {
                    case PAUSE:
                      //  tvState.setText("暂停中");
                        logUtils.d("暂停中");
                        break;
                    case IDLE:
                       // tvState.setText("空闲中");
                        logUtils.d("空闲中");
                        break;
                    case RECORDING:
                       // tvState.setText("录音中");

                        break;
                    case STOP:
                       // tvState.setText("停止");
                        break;
                    case FINISH:
                        logUtils.d("结束");
                        break;
                    default:
                        break;
                }
            }

            @Override
            public void onError(String error) {
                Logger.i(TAG, "onError %s", error.toString());
            }
        });
        RecordManager.getInstance().setRecordResultListener(new RecordResultListener() {
            @Override
            public void onResult(File result) {


                logUtils.d("结束录音》》》》"+result.getPath());
                String    visitGuid = SharedUtils.getString("visitGuid");
                fileInfo info=new fileInfo(null,result.getPath(),"41",System.currentTimeMillis(),visitGuid);  //4为录音  41为合并录音
                dao.insert(info);
                EventBus.getDefault().post(new MessageEvent(result.getPath()));
            }
        });
    }


}

