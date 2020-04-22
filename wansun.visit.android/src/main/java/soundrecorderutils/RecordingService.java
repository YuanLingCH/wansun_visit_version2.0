package soundrecorderutils;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.media.MediaRecorder;
import android.os.Environment;
import android.os.IBinder;
import android.util.Log;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimerTask;

import wansun.visit.android.R;
import wansun.visit.android.db.fileInfo;
import wansun.visit.android.event.MessageEvent;
import wansun.visit.android.event.MessageStartAndPauseRecord;
import wansun.visit.android.global.waifangApplication;
import wansun.visit.android.greendao.gen.fileInfoDao;
import wansun.visit.android.utils.SharedUtils;
import wansun.visit.android.utils.logUtils;


/**
 * 录音的 Service
 *
 * Created by developerHaoz on 2017/8/12.
 */

public class RecordingService extends Service {
    private fileInfoDao dao;
    private static final String LOG_TAG = "RecordingService";

    private String mFileName = null;
    private String mFilePath = null;

    private MediaRecorder mRecorder = null;

    private long mStartingTimeMillis = 0;
    private long mElapsedMillis = 0;
    private TimerTask mIncrementTimerTask = null;
     List fileList=new ArrayList();

    private NotificationManager notificationManager;
    //通知的唯一标识号。
    private int NOTIFICATION = 1;
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        dao= waifangApplication.getInstence().getSession().getFileInfoDao();
        logUtils.d("onCreate()。。。。 ");
        notificationManager = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);
        showNotification();
        EventBus.getDefault().register(this);


    }

    private void showNotification(){
        // PendingIntent如果用户选择此通知，则启动我们的活动
        Log.d("TAG","通知启动");
       // PendingIntent pendingIntent = PendingIntent.getActivity(this,0,new Intent(this,RecordingService.class),0);

        //设置通知面板中显示的视图的信息。
        Notification notification =new Notification.Builder(this).setSmallIcon(R.mipmap.ic_launcher).setTicker("正在通话")
                .setContentTitle(getText(R.string.notification_live_start))
                .setContentTitle("正在运行")
               // .setContentIntent(pendingIntent)
                .build();
       // LogUtil.i(TAG,"显示通知");
        Log.d("TAG","通知开始");
        //发送通知
        notificationManager.notify(NOTIFICATION,notification);
        startForeground(NOTIFICATION,notification);
    }




    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        logUtils.d("录音服务开始");
        startRecording();

        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        if (mRecorder != null) {
            stopRecording();
            logUtils.d("录音服务销毁"+fileList.size());
            EventBus.getDefault().unregister(this);
        }
        notificationManager.cancel(NOTIFICATION);
        super.onDestroy();
    }



    public void startRecording() {
        setFileNameAndPath();
        mRecorder = new MediaRecorder();
        mRecorder.setAudioSource(MediaRecorder.AudioSource.MIC);
        mRecorder.setOutputFormat(MediaRecorder.OutputFormat.RAW_AMR);  //mpeg_4    RAW_AMR   RAW_AMR
        mRecorder.setOutputFile(mFilePath);
        mRecorder.setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB);  //ACC   AMR_NB
        mRecorder.setAudioChannels(1);
        mRecorder.setAudioSamplingRate(8000);   //44100      改变录音文件的质量
        mRecorder.setAudioEncodingBitRate(12200);  //19200

        //发生错误的时候回调
        mRecorder.setOnErrorListener(new MediaRecorder.OnErrorListener() {
            @Override
            public void onError(MediaRecorder mr, int what, int extra) {
                mRecorder.stop();
                mRecorder.release();
                mRecorder.reset();
            }
        });

        mRecorder.setOnInfoListener(new MediaRecorder.OnInfoListener() {
            @Override
            public void onInfo(MediaRecorder mr, int what, int extra) {
                logUtils.d("录音异常"+what+extra);
            }
        });
        try {
            mRecorder.prepare();
            mRecorder.start();
            mStartingTimeMillis = System.currentTimeMillis();
            logUtils.d("录音服务开始");
        } catch (IOException e) {
            Log.e(LOG_TAG, "prepare() failed");
        }
    }

    public void setFileNameAndPath() {
        String appName = getPackageName();

        int count = 0;

        String caseCode = SharedUtils.getString("caseCode");

            count++;
            mFileName = caseCode
                    + "_" + (System.currentTimeMillis()) + ".mp3";
            mFilePath = Environment.getExternalStorageDirectory().getAbsolutePath();
           mFilePath +=  "/"+appName ;
            File dir=new File(mFilePath);
            if (!dir.exists()){
                dir.mkdir();
            }

            File dirone=new File(dir+"/"+"record");
            if (!dirone.exists()){
                dirone.mkdir();
            }
            mFilePath= dirone+"/" +caseCode+"_" +new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date()) + "test.mp3";



    }

    public void stopRecording() {

        if (mRecorder!=null){
            mRecorder.stop();
            mElapsedMillis = (System.currentTimeMillis() - mStartingTimeMillis);
            mRecorder.release();
        }
     getSharedPreferences("sp_name_audio", MODE_PRIVATE)
                .edit()
                .putString("audio_path", mFilePath)
                .putLong("elpased", mElapsedMillis)
                .apply();
        if (mIncrementTimerTask != null) {
            mIncrementTimerTask.cancel();
            mIncrementTimerTask = null;
        }
        String visitGuid = SharedUtils.getString("visitGuid");
        fileInfo info=new fileInfo(null,mFilePath,"4",System.currentTimeMillis(),visitGuid);  //4为录音
        dao.insert(info);
        mRecorder = null;
        logUtils.d("录音保存.......>>>>>>.");
        EventBus.getDefault().post(new MessageEvent(mFilePath));
    }

    /**
     * 暂停录音
     */
    public  void pauseRecord(){
            if (mRecorder!=null){
               // mRecorder.pause();
            }

        }
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMessageEvent(MessageStartAndPauseRecord event) {
        logUtils.d("收到事件消息RECORD_PAUSE"+event.getRECORD_PAUSE());
        if (event.getRECORD_PAUSE()==2){
            pauseRecord();

        }else if (event.getRECORD_START()==1){
            logUtils.d("收到事件消息RECORD_START"+event.getRECORD_START());
        }

    };

}
