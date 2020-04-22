package soundrecorderutils;


import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.app.NotificationCompat;

import wansun.visit.android.R;
import wansun.visit.android.ui.activity.MainActivity;
import wansun.visit.android.utils.logUtils;

/**
 * Created by User on 2020/4/1.
 * 前台通知 使应用在低内存下 不被kill
 */

public class LiveService extends Service {

    private NotificationManager notificationManager;
    //通知的唯一标识号。
    private int NOTIFICATION = 1;

    final String CHANNEL_ID = "channel_id_1";
    final String CHANNEL_NAME = "channel_name_1";

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @RequiresApi(api = 26)
    @Override
    public void onCreate() {
        super.onCreate();
        notificationManager = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);
        showNotification();
    }

    @RequiresApi(api = 26)
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        logUtils.d("录音服务开始");
        showNotification();

        return START_STICKY;
    }



    @RequiresApi(api = 26)
    private void showNotification(){
/*
        // PendingIntent如果用户选择此通知，则启动我们的活动
        Log.d("TAG","通知启动");
         PendingIntent pendingIntent = PendingIntent.getActivity(this,0,new Intent(this,MainActivity.class),0);
        String channelId = null;
        String channelName = "录音";
        int importance = NotificationManager.IMPORTANCE_HIGH;
        NotificationChannel channel = null;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {//
             channelId ="1";
            channel = new NotificationChannel(channelId,channelName,importance);//第二步
            notificationManager.createNotificationChannel(channel);//第三步
        } else {
            Log.d("MainActivity", "error ");
        }

        //设置通知面板中显示的视图的信息。
   //  NotificationCompat.Builder notification=new NotificationCompat.Builder(this,"");
        NotificationCompat.Builder notification=new NotificationCompat.Builder(this,channelId)
                 .setSmallIcon(R.mipmap.ic_launcher).setTicker("外访启动")
                .setContentTitle(getText(R.string.notification_live_start))
                .setContentTitle("正在运行")
                .setWhen(System.currentTimeMillis())
                .setContentIntent(pendingIntent)
                .build();
*/
/*  Notification notification =new  Notification.Builder(this,channelId)
                .setSmallIcon(R.mipmap.ic_launcher).setTicker("外访启动")
               .setContentTitle(getText(R.string.notification_live_start))
                .setContentTitle("正在运行")
             .setWhen(System.currentTimeMillis())
            .setContentIntent(pendingIntent)
                .build();*//*

        // LogUtil.i(TAG,"显示通知");
        Log.d("TAG","通知开始");
        //发送通知
        notificationManager.notify(NOTIFICATION,notification.build());
        startForeground(NOTIFICATION,notification.build());

*/
        PendingIntent pendingIntent = PendingIntent.getActivity(this,0,new Intent(this,MainActivity.class),0);
        NotificationManager mNotificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            //只在Android O之上需要渠道
            NotificationChannel notificationChannel = new NotificationChannel(CHANNEL_ID,
                    CHANNEL_NAME, NotificationManager.IMPORTANCE_HIGH);
            //如果这里用IMPORTANCE_NOENE就需要在系统的设置里面开启渠道，
            //通知才能正常弹出
            mNotificationManager.createNotificationChannel(notificationChannel);
        }
        NotificationCompat.Builder builder= new NotificationCompat.Builder(this,CHANNEL_ID);
        builder.setSmallIcon(R.mipmap.ic_launcher)
                .setContentTitle("外访")
                .setContentText("正在运行")
                .setContentIntent( pendingIntent)
                .setAutoCancel(true);
        mNotificationManager.notify(NOTIFICATION, builder.build());
        startForeground(NOTIFICATION,builder.build());







    }


    @RequiresApi(api = 26)
    @Override
    public void onDestroy() {
        super.onDestroy();
      //  notificationManager.cancel(NOTIFICATION);
      //  showNotification();
    }
}
