package soundrecorderutils;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.provider.Settings;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;

import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import wansun.visit.android.R;
import wansun.visit.android.adapter.otherFileReAdapter;
import wansun.visit.android.api.apiManager;
import wansun.visit.android.bean.uploadFileBean;
import wansun.visit.android.db.fileInfo;
import wansun.visit.android.event.MessageEvent;
import wansun.visit.android.global.waifangApplication;
import wansun.visit.android.greendao.gen.fileInfoDao;
import wansun.visit.android.net.requestBodyUtils;
import wansun.visit.android.ui.activity.BaseActivity;
import wansun.visit.android.utils.CommonUtil;
import wansun.visit.android.utils.NetWorkTesting;
import wansun.visit.android.utils.SharedUtils;
import wansun.visit.android.utils.ToastUtil;
import wansun.visit.android.utils.WindowsRecordUitlity;
import wansun.visit.android.utils.dialogUtils;
import wansun.visit.android.utils.logUtils;
import wansun.visit.android.utils.unixTime;

import static wansun.visit.android.R.id.lv_other_file;
import static wansun.visit.android.utils.floatWindownUtils.isFloatWindowOpAllowed;

public class RecordActivity extends BaseActivity {
    private fileInfoDao dao;
    private static final int REQUEST_TAKE_PHOTO_PERMISSION = 1;
    private Button mBtnRecordAudio;
    private Button mBtnPlayAudio,btn_record_upload;
    ImageView iv_visit_back;
    TextView tv_visit_tobar,tv_record_flag;
    dialogUtils utils;
    String visitGuid;
    List<fileInfo>  recordData; //录音文件地址
    RecyclerView lv_record;
    otherFileReAdapter bottomAdapter;
    List dataDaoId;
    int cont = 0;
    List currentCont=new ArrayList();
    Handler mHandler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what){
                case 0:
                    ToastUtil.showToast(RecordActivity.this,"录音文件上传失败");
                    utils.cancleDialog();
                    break;
                case 1:
                    ToastUtil.showToast(RecordActivity.this,"录音文件上传完成");
                    recordData.clear();
                    updataUI();
                    tv_record_flag.setText("暂无录音文件");
                    utils.cancleDialog();


                    break;
            }




        }
    };

    /**
     * 删除上传成功的文件
     */
    private void delectFile() {
        try {
            Iterator<fileInfo> iterator = recordData.iterator();
            while (iterator.hasNext()){
                fileInfo next = iterator.next();

                String path = next.getPath();
                    boolean b = CommonUtil.deleteFile(path);
                   dao.deleteByKey(next.getId());
                    logUtils.d("删除文件"+b);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Override
    protected int getLayoutId() {
        return R.layout.activity_record;
    }
    protected void initEvent() {
        recordData=new ArrayList<>();
        dataDaoId=new ArrayList();
        dataDaoId.clear();
        recordData.clear();
        //进行录音
        mBtnRecordAudio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mBtnRecordAudio.setEnabled(false);
              permission();

            }
        });

        //上传录音文件到服务器
        btn_record_upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentCont.clear();
                NetWorkTesting net=new NetWorkTesting(RecordActivity.this);
                WindowManager manager = getWindowManager();
                View view = LayoutInflater.from(waifangApplication.getContext()).inflate(R.layout.loading_layout, null);
                utils = new dialogUtils(RecordActivity.this, manager, view);

                if (net.isNetWorkAvailable()) {
                    String caseCode = SharedUtils.getString("caseCode");
                    long getCurrentTime = unixTime.getCurrentTime;
                    final String account = SharedUtils.getString("account");
                    logUtils.d("account"+account);
                    String id1 = SharedUtils.getString("id");
                    Map<String,Object> map=new HashMap<>();
                    map.put("caseCode",caseCode);
                    map.put("visitGuid", visitGuid);
                    map.put("uploaderName", account);
                    map.put("uploaderId", id1);
                    logUtils.d("测试数据"+caseCode+":"+visitGuid+":"+ account+":"+id1);
                    String sign = requestBodyUtils.getSign(map, getCurrentTime + "");
                    MultipartBody.Builder builder = new MultipartBody.Builder()
                            .setType(MultipartBody.FORM)
                            .addFormDataPart("sign",sign)
                            .addFormDataPart("timestamp",getCurrentTime+"");
                List<fileInfo> fileInfos = dao.loadAll();
                try {
                    if (fileInfos.size()>0&&fileInfos!=null){
                        utils.getDialog();
                    TextView tv= (TextView) view.findViewById(R.id.tv_load);
                    tv.setText(R.string.upload_record);
                    //TODO 上传到服务器
                        if (recordData.size()>0){
                            Iterator<fileInfo> iterator = recordData.iterator();
                            try {
                                while (iterator.hasNext()){    //  遍历数据
                                    fileInfo next = iterator.next();
                                    Long id = next.getId();
                                    String batch = next.getBatch();
                                    String  path = next.getPath();
                                    if (batch.equals(visitGuid)&&path.endsWith("recording.mp3")||path.endsWith(".mp3")){
                                        logUtils.d("录音地址"+path);
                                        dataDaoId.add(id);
                                      //  doUpLoad(path,id);    //上传成功后才散掉数据库
                                        File file = new File(path);
                                        builder.addFormDataPart("uploadFile", file.getName(), RequestBody.create(MediaType.parse("image/jpeg"), file));


                                    }else {
                                        ToastUtil.showToast(RecordActivity.this,"请关闭录音...");
                                    }
                                }
                                for (Map.Entry entry:map.entrySet()){
                                    builder.addFormDataPart(String.valueOf(entry.getKey()),String.valueOf(entry.getValue()));
                                    logUtils.d("遍历key"+String.valueOf(entry.getKey()));
                                }
                                RequestBody requestBody = builder.build();
                                final   OkHttpClient okHttpClient = waifangApplication.getInstence().getClient();
                                final Request request = new Request.Builder()
                                        .url(apiManager.recordFileUpToService).post(requestBody).build();
                                new Thread(){
                                    @Override
                                    public void run() {
                                        super.run();
                                        Call call = okHttpClient.newCall(request);
                                        call.enqueue(new Callback() {
                                            @Override
                                            public void onFailure(Call call, IOException e) {
                                                logUtils.d("上传录音"+e.toString());
                                                mHandler.sendEmptyMessage(0);

                                            }

                                            @Override
                                            public void onResponse(Call call, Response response) throws IOException {
                                                String body = response.body().string();
                                                Gson gson=new Gson();
                                                try {
                                                    uploadFileBean bean= gson.fromJson(body , new TypeToken<uploadFileBean>() {}.getType());
                                                    String statusID = bean.getStatusID();
                                                    if (statusID.equals("200")){
                                                        delectFile();
                                                        logUtils.d("上传录音"+body);
                                                        logUtils.d("上传录音"+"recordData.size()"+recordData.size()+">>>"+cont);
                                                            mHandler.sendEmptyMessage(1);

                                                       // }

                                                    }else {
                                                        mHandler.sendEmptyMessage(0);
                                                    }
                                                } catch (JsonSyntaxException e) {
                                                    e.printStackTrace();
                                                    mHandler.sendEmptyMessage(0);
                                                }
                                            }
                                        });
                                    }
                                }.start();





                            } catch (Exception e) {
                                e.printStackTrace();
                                logUtils.d("录音地址为空");
                                new Throwable("录音地址为空");
                            }
                        }

                    }else {
                        ToastUtil.showToast(RecordActivity.this,"请先录制...");
                    }



                } catch (Exception e) {
                    e.printStackTrace();
                }
                }else {
                    utils.cancleDialog();
                    ToastUtil.showToast(RecordActivity.this,R.string.network_unavailing);
                }
            }
        });
        iv_visit_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                overridePendingTransition(R.anim.in_from_left,R.anim.out_to_right);
            }
        });


    }

    /**
     * 展示录音
     *
     */
    private void displayRecord() {
        List<fileInfo> fileInfos = dao.loadAll();
        if (fileInfos.size()>0){
            Iterator<fileInfo> iterator = fileInfos.iterator();
            try {
                while (iterator.hasNext()){    //  遍历数据
                    fileInfo next = iterator.next();
                    logUtils.d("测试数据"+next.path+"ID:"+next.getId());
                    String batch = next.getBatch();
                  String  path = next.getPath();
                    if (batch.equals(visitGuid)&&path.endsWith(".mp3")){
                        recordData.add(next);
                        logUtils.d("录音地址"+path);
                    }
                }
                updataUI();

            } catch (Exception e) {
                e.printStackTrace();
                logUtils.d("录音地址为空");
                new Throwable("录音地址为空");
            }
        }
    }

    /**
     * 更新UI
     */
    private void updataUI() {
        bottomAdapter=new otherFileReAdapter(RecordActivity.this,recordData,false);
        LinearLayoutManager lin=new LinearLayoutManager(RecordActivity.this);
        lv_record.setLayoutManager(lin);
        lv_record.setAdapter(bottomAdapter);
        lv_record.setAdapter(bottomAdapter);
        bottomAdapter.setItemClickListener(new otherFileReAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(long id,int postion) {
                logUtils.d("测试数据"+id+":"+postion);
                delete(id, postion);
            }
        });
    }
    private void delete(final long id, final int postion) {
        View view = getLayoutInflater().inflate(R.layout.custom_diaglog_layut_exit_app, null);
        final TextView tv = (TextView) view.findViewById(R.id.tv);
        TextView tv_cancle= (TextView) view.findViewById(R.id.add_cancle);
        tv.setText(R.string.confirm_delete);
        tv.setTextSize(16);
        tv.setGravity(Gravity.CENTER);
        TextView tv_submit= (TextView) view.findViewById(R.id.add_submit);
        WindowManager manager=getWindowManager();
        final dialogUtils utils=new dialogUtils(RecordActivity.this,manager,view );
        utils.getDialog();
        tv_cancle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                utils.cancleDialog();

            }
        });
        tv_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                utils.cancleDialog();
                dao.deleteByKey(id);
                recordData.remove(postion);
                bottomAdapter.notifyDataSetChanged();
            }
        });
    }



    private void permission() {
        List<String> permissionLists = new ArrayList<>();
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.RECORD_AUDIO) != PackageManager.PERMISSION_GRANTED) {
            permissionLists.add(Manifest.permission.RECORD_AUDIO);
        }
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
            permissionLists.add(Manifest.permission.READ_EXTERNAL_STORAGE);
        }
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
            permissionLists.add(Manifest.permission.WRITE_EXTERNAL_STORAGE);
        }

        if (!permissionLists.isEmpty()) {//说明肯定有拒绝的权限
            ActivityCompat.requestPermissions(this, permissionLists.toArray(new String[permissionLists.size()]), REQUEST_TAKE_PHOTO_PERMISSION);
            Toast.makeText(this, "权限被拒绝",Toast.LENGTH_SHORT).show();
            return;
        } else {
            //  Toast.makeText(this, "权限都授权了",Toast.LENGTH_SHORT).show();
           // record();
            openFloat();
        }
    }

    private void windownRecord() {
        logUtils.d("点击录音....");
        WindowsRecordUitlity uitlity=new WindowsRecordUitlity(RecordActivity.this,mBtnRecordAudio);
        uitlity.showPopupWindow(RecordActivity.this,"");


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
                    //    record();
                        openFloat();

                    }
                }
                break;

            default:

                break;
        }
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }




    @Override
    protected void initData() {
        displayRecord();    //显示录音列表
        tv_record_flag.setVisibility(View.VISIBLE);
        if (recordData.size()>0){
            tv_record_flag.setText("点击条目可以删除,点击左边图片进行播放录音...");
        }else {
            tv_record_flag.setText("暂无录音文件");
        }

    }

    @Override
    protected void initLise() {
       // EventBus.getDefault().register(RecordActivity.this);
        visitGuid = SharedUtils.getString("visitGuid");
        dao= waifangApplication.getInstence().getSession().getFileInfoDao();
        org.greenrobot.eventbus.EventBus.getDefault().register(RecordActivity.this);
    }

    protected void initView() {
        mBtnRecordAudio = (Button)findViewById(R.id.main_btn_record_sound);
        mBtnPlayAudio = (Button) findViewById(R.id.main_btn_play_sound);
        btn_record_upload= (Button) findViewById(R.id.btn_record_upload);
        iv_visit_back= (ImageView) findViewById(R.id.iv_visit_back);
        tv_visit_tobar= (TextView) findViewById(R.id.tv_visit_tobar);
        tv_visit_tobar.setText("录音");
        lv_record= (RecyclerView ) findViewById(lv_other_file);
        tv_record_flag= (TextView) findViewById(R.id.tv_record_flag);
    }
        ////////////////////////////////判断悬浮窗///////////////////////////////////////////////////////////////////
    /**
     * 请求用户给予悬浮窗的权限
     */
    public void requestPermission() {
        if (isFloatWindowOpAllowed(this)) {//已经开启
            windownRecord();
        } else {
            openSetting();
        }
    }

    /**
     * 打开权限设置界面
     */
    public void openSetting() {
   startActivityForResult(new Intent(Settings.ACTION_MANAGE_OVERLAY_PERMISSION, Uri.parse("package:" + getPackageName())), 11);



/*     Intent intent= new Intent(Settings.ACTION_MANAGE_OVERLAY_PERMISSION, Uri.parse("package:" + getPackageName()));
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        if (intent.resolveActivity(RecordActivity.this.getPackageManager()) != null) {
            RecordActivity.this.startActivityForResult(intent, 11);
        }*/


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 11) {
          if (isFloatWindowOpAllowed(this)) {//已经开启
               windownRecord();
            } else {
                logUtils .e("开启悬浮窗失败11");
                ToastUtil.showToast(this,"请手动开启悬浮窗允许");
            }


        } else if (requestCode == 12) {
            if (Build.VERSION.SDK_INT >= 23) {
                if (!Settings.canDrawOverlays(RecordActivity.this)) {

                    try {
                        windownRecord();
                    } catch (Exception e) {
                        ToastUtil.showToast(this,"权限授予失败,无法开启悬浮窗");
                        e.printStackTrace();
                    }
                } else {
                    windownRecord();
                }
            }
        }

    }

    public void openFloat(){
        //开启悬浮窗前先请求权限
        if ("Xiaomi".equals(Build.MANUFACTURER)) {//小米手机
            logUtils .e("小米手机");
            requestPermission();
        } else if ("Meizu".equals(Build.MANUFACTURER)) {//魅族手机
            logUtils .e("魅族手机");

            requestPermission();
        } else {//其他手机
            logUtils .e("其他手机"+getPackageName());
            if (Build.VERSION.SDK_INT >= 23) {
                if (!Settings.canDrawOverlays(this)) {
                  Intent intent = new Intent(Settings.ACTION_MANAGE_OVERLAY_PERMISSION,Uri.parse("package:" + getPackageName()));
                   startActivityForResult(intent, 12);

                } else {
                    windownRecord();
                }
            } else {
                windownRecord();
            }
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.EventBus.getDefault().unregister(RecordActivity.this);


    }


    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMessageEvent(MessageEvent event) {
        logUtils.d("收到事件消息"+event.getFilePath());
        recordData.clear();
        displayRecord();
        tv_record_flag.setText("点击条目可以删除,点击左边图片进行播放录音...");
    };


}
