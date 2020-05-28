package wansun.visit.android.ui.activity;

import android.Manifest;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.FileProvider;
import android.text.TextUtils;
import android.util.Log;
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

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import wansun.visit.android.R;
import wansun.visit.android.api.apiManager;
import wansun.visit.android.bean.uploadFileBean;
import wansun.visit.android.config.AppConfig;
import wansun.visit.android.db.fileInfo;
import wansun.visit.android.global.waifangApplication;
import wansun.visit.android.greendao.gen.fileInfoDao;
import wansun.visit.android.utils.CommonUtil;
import wansun.visit.android.utils.NetWorkTesting;
import wansun.visit.android.utils.SharedUtils;
import wansun.visit.android.utils.ToastUtil;
import wansun.visit.android.utils.dialogUtils;
import wansun.visit.android.utils.logUtils;

import static wansun.visit.android.config.MessageCode.VISIT_DETAIL_CAMERA;

/**
 * 拍照上传照片
 * Created by User on 2019/3/11.
 */

public class TakePhotosActivity extends BaseActivity {
    private fileInfoDao dao;

    ImageView iv_visit_back,iv_photos;
    TextView tv_visit_tobar;
    Button but_photos,but_upload_photos;
    private static final int REQUEST_TAKE_PHOTO_PERMISSION = 1;
    Uri imageUri;//图片地址
    String fullPath;//图片路径
    dialogUtils utils;
    String destPath;//图片压缩后的路径
    public  final static  int SUCCESS=0x01;
    public  final static  int fAIL=0x02;
    boolean isPictures=false;   //视频录制标记
    private String outputDir = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath();
    Handler mHandler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what){
                case SUCCESS:
                    utils.cancleDialog();
                    ToastUtil.showToast(TakePhotosActivity.this,"图片上传完成");
                    iv_photos.setImageDrawable(null);  //清空图片数据
                    fullPath="";
                    deletePicture();
                    break;
                case fAIL:
                    ToastUtil.showToast(TakePhotosActivity.this,"图片上传失败,请再试一下...");
                    utils.cancleDialog();
                    break;
            }

        }
    };

    @Override
    protected int getLayoutId() {
        return R.layout.activity_take_photo;

    }

    @Override
    protected void onStart() {
        super.onStart();
        dao=waifangApplication.getInstence().getSession().getFileInfoDao();
    }

    @Override
    protected void initView() {
        iv_visit_back= (ImageView) findViewById(R.id.iv_visit_back);
        tv_visit_tobar= (TextView) findViewById(R.id.tv_visit_tobar);
        tv_visit_tobar.setText("拍照");
        iv_photos= (ImageView) findViewById(R.id.iv_photos);
        but_photos= (Button) findViewById(R.id.but_photos);
        but_upload_photos= (Button) findViewById(R.id.but_upload_photos);


    }

    @Override
    protected void initEvent() {
        iv_visit_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                overridePendingTransition(R.anim.in_from_left,R.anim.out_to_right);
            }
        });
        but_photos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isPictures=true;
                permission();
            }
        });
        but_upload_photos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                upLoadToService();
            }
        });

    }

    /**
     * 上传到服务器
     */
    private void upLoadToService() {
        if (TextUtils.isEmpty(fullPath)){
            ToastUtil.showToast(TakePhotosActivity.this,"请拍照片在上传");
            return;
        }else {
            NetWorkTesting net = new NetWorkTesting(TakePhotosActivity.this);
            if (net.isNetWorkAvailable()) {
                WindowManager manager = getWindowManager();
                View view = LayoutInflater.from(waifangApplication.getContext()).inflate(R.layout.loading_layout, null);
                utils = new dialogUtils(TakePhotosActivity.this, manager, view);
                TextView tv= (TextView) view.findViewById(R.id.tv_load);
                tv.setText(R.string.upload_pictureing);
                utils.getDialog();
                String caseCode = SharedUtils.getString("caseCode");
                String visitGuid = SharedUtils.getString("visitGuid");
                final String account = SharedUtils.getString("account");
                logUtils.d("account"+account);
                String id = SharedUtils.getString("id");
               File file = new File(fullPath);
                final   OkHttpClient okHttpClient = waifangApplication.getInstence().getClient();
                MultipartBody.Builder builder = new MultipartBody.Builder()
                            .setType(MultipartBody.FORM)
                            .addFormDataPart("caseCode", caseCode)
                            .addFormDataPart("visitGuid", visitGuid)
                            .addFormDataPart("uploaderName", account)
                            .addFormDataPart("uploaderId", id)
                            .addFormDataPart("uploadFile", file.getName(), RequestBody.create(MediaType.parse("image/jpeg"), file));
                    RequestBody requestBody = builder.build();
                    final Request request = new Request.Builder()
                            .url(apiManager.upLoadPicturesToService).post(requestBody).build();
                    new Thread() {
                        @Override
                        public void run() {
                            super.run();
                            Call call = okHttpClient.newCall(request);
                            call.enqueue(new Callback() {
                                @Override
                                public void onFailure(Call call, IOException e) {
                                    logUtils.d("图片上传错误" + e.toString());
                                    mHandler.sendEmptyMessage(fAIL);
                                }
                                @Override
                                public void onResponse(Call call, Response response) throws IOException {
                                    try {
                                    ResponseBody body = response.body();
                                    String s = body.string();   //数据类型
                                        Gson gson=new Gson();
                                        uploadFileBean bean= gson.fromJson(s, new TypeToken<uploadFileBean>() {}.getType());
                                        if (bean!=null){
                                            String statusID = bean.getStatusID();
                                            if (!TextUtils.isEmpty(statusID)&&statusID.equals("200")){
                                                logUtils.d("图片上传" + s);
                                                mHandler.sendEmptyMessage(SUCCESS);

                                            }else {
                                                mHandler.sendEmptyMessage(fAIL);
                                            }
                                        }

                                    } catch (JsonSyntaxException e) {
                                        e.printStackTrace();
                                        mHandler.sendEmptyMessage(fAIL);
                                    }

                                }
                            });
                        }
                    }.start();

                }else {
                ToastUtil.showToast(TakePhotosActivity.this,R.string.network_unavailing);
            }
        }
    }
    //上传后就删掉数据库
    private void deletePicture() {
        List<fileInfo> fileInfos = dao.loadAll();
        if (!fileInfos.isEmpty()&&fileInfos.size()>0) {
            Iterator<fileInfo> iterator = fileInfos.iterator();
            String visitGuid = SharedUtils.getString("visitGuid");
            while (iterator.hasNext()) {    //  遍历数据
                fileInfo next = iterator.next();
                String batch = next.getBatch();
                if (batch.equals(visitGuid) && next.getType().equals("0")) {  //2为选择图片
                    Long id = next.getId();
                    dao.deleteByKey(id);
                    String path = next.getPath();
                    boolean b = CommonUtil.deleteFile(path);  //删除文件夹里面的
                    logUtils.d("删除文件"+b);
                    //BitmapUtils.deleteCacheFile();

                }
            }
        }
    }






    @Override
    protected void initData() {

    }

    @Override
    protected void initLise() {

    }

    private void permission() {
        List<String> permissionLists = new ArrayList<>();
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
            permissionLists.add(Manifest.permission.CAMERA);
        }
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
            permissionLists.add(Manifest.permission.READ_EXTERNAL_STORAGE);
        }
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
            permissionLists.add(Manifest.permission.WRITE_EXTERNAL_STORAGE);
        }
        if (!permissionLists.isEmpty()) {//说明肯定有拒绝的权限

            ActivityCompat.requestPermissions(this, permissionLists.toArray(new String[permissionLists.size()]), REQUEST_TAKE_PHOTO_PERMISSION);

        } else {
          //  Toast.makeText(this, "权限都授权了",Toast.LENGTH_SHORT).show();
                takePhoto();
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
                        takePhoto();
                    }
                }
                break;

            default:

                break;
        }
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }



    // 调用系统相机
    public void takePhoto() {
        fullPath="";
        String appName = getPackageName();
        logUtils.d("拍照走了");
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);// 调用系统相机
       fullPath = Environment.getExternalStorageDirectory().getAbsolutePath();;
        fullPath +=  "/"+appName ;
        Log.v(AppConfig.TAG, "takePhoto - fullPath = " + fullPath);

       File dir=new File(fullPath);
        if (!dir.exists()){
            dir.mkdir();
        }
        File dirone=new File(dir+"/"+"picture");
        if (!dirone.exists()){
            dirone.mkdir();
        }
        String caseCode = SharedUtils.getString("caseCode");

        fullPath=dirone+"/" +caseCode+"_" +new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date()) + ".jpg";

        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.N){  //sdk大于24
            Log.d("TAG","拍照24以上");
            imageUri = FileProvider.getUriForFile(TakePhotosActivity.this, "wansun.visit.android.fileprovider", new File(fullPath));
        }else {
            imageUri = Uri.fromFile(new File(fullPath));
            Log.d("TAG","拍照24以下");
        }
        intent.putExtra(MediaStore.EXTRA_OUTPUT, imageUri);

        startActivityForResult(intent, VISIT_DETAIL_CAMERA);





    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
      //  super.onActivityResult(requestCode, resultCode, data);
        //得到图片的路径
        logUtils.d("拍照图片显示11");
        Log.d("TAG","拍照图片显示111");
      if (requestCode==VISIT_DETAIL_CAMERA){
         Bitmap bitmap = null;
          try {
              bitmap = BitmapFactory.decodeStream(getContentResolver().openInputStream(imageUri));
              // 获取水印文本 -- 日期
              String date = CommonUtil.getCurrentDateTimeString();
              // 创建水印位图
              String account = SharedUtils.getString("account");
              Bitmap waterMap = CommonUtil.CreateWatermark(date+"拍摄账号:"+account);
              // 合并水印
              final Bitmap destMap = CommonUtil.CreateBitmapWithWatermark(bitmap, waterMap);
              logUtils.d("拍照图片显示");
              if (destMap!=null){
              final Bitmap bitmap1 = CommonUtil.getBitmap(destMap,2);     //图片压缩   6为采样率
              iv_photos.setImageBitmap(bitmap1);//显示到ImageView上
          new Thread(){
                  @Override
                  public void run() {
                      super.run();
                      if ( CommonUtil.saveImage(bitmap1, fullPath)){
                          String visitGuid = SharedUtils.getString("visitGuid");
                          fileInfo info=new fileInfo(null,fullPath,"0",System.currentTimeMillis(),visitGuid );  //0为拍照
                          dao.insert(info);
                          String fileSize = getFileSize(fullPath);
                          logUtils.d("fileSize" + fileSize);
                      }
                  }
              }.start();

              }

          } catch (FileNotFoundException e) {
              e.printStackTrace();
          }

      }
    }

    private String getFileSize(String path) {

        File f = new File(path);

        if (!f.exists()) {

            return "0 MB";

        } else {

            long size = f.length();

            return (size / 1024f) / 1024f + "MB";

        }

    }

    public static String getRealFilePath(final Context context, final Uri uri ) {
        if ( null == uri ) return null;
        final String scheme = uri.getScheme();
        String data = null;
        if ( scheme == null )
            data = uri.getPath();
        else if ( ContentResolver.SCHEME_FILE.equals( scheme ) ) {
            data = uri.getPath();
        } else if ( ContentResolver.SCHEME_CONTENT.equals( scheme ) ) {
            Cursor cursor = context.getContentResolver().query( uri, new String[] { MediaStore.Images.ImageColumns.DATA }, null, null, null );
            if ( null != cursor ) {
                if ( cursor.moveToFirst() ) {
                    int index = cursor.getColumnIndex( MediaStore.Images.ImageColumns.DATA );
                    if ( index > -1 ) {
                        data = cursor.getString( index );
                    }
                }
                cursor.close();
            }
        }
        return data;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (utils!=null){
            utils.cancleDialog();
        }
    }
}
