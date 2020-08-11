package wansun.visit.android.api;

import java.util.Map;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PartMap;
import retrofit2.http.Query;

/**
 * Created by User on 2019/2/12.
 */

public interface apiManager {
//String baseUrl="http://192.168.66.52:8082";  //测试环境  http://visit-api.cnwansun.com/visit       datahouse-api

String baseUrl="https://ws-api.cnwansun.com";   // 7月1号上线环境   http://ws-api.cnwansun.com/auth/checkIMEI
String path="";     //生产

//String baseUrl="https://ws.test.cnwansun.com";   //测试环境  https://ws.test.cnwansun.com/visit
//String path="/visit";  //测试
    //内网用这个  https://ws.test.cnwansun.com/api/visit
   // 外网用https://ws.test.cnwansun.com/visit
    //登陆接口
   //@FormUrlEncoded
   @Headers({"Content-Type: application/json","Accept: application/json"})
    @POST(baseUrl+path+"/user/login?")
    Call<String> login(@Body RequestBody body);
  //  Call<String> login(@Field("userName") String username,@Field("passWord") String password);
    //外访列表
      @Headers({"Content-Type: application/json","Accept: application/json"})
      @POST(baseUrl+path+"/case/findVisit")
      Call<String> visitListFormeService(@Body RequestBody  body);

    //外访案件详情
    @Headers({"Content-Type: application/json","Accept: application/json"})
    @POST(baseUrl+path+"/case/visitDetail")
    Call<String> visitCaseDetailsFormeService(@Body RequestBody  body);

    //外访案件详情联系人
    @Headers({"Content-Type: application/json","Accept: application/json"})
    @POST(baseUrl+path+"/case/contacts")
    Call<String> visitCaseDetailsContactsFormeService(@Body RequestBody  body);

    //外访案件详情催收记录
    @Headers({"Content-Type: application/json","Accept: application/json"})
    @POST(baseUrl+path+"/case/phoneUrgeRecord")
    Call<String> visitCaseDetailsUrgeRecordFormeService(@Body RequestBody  body);

    // 外访案件详情外访记录
    @Headers({"Content-Type: application/json","Accept: application/json"})
    @POST(baseUrl+path+"/case/visitRecord")
    Call<String> visitCaseDetailsRecordFormeService(@Body RequestBody  body);
    // 外访案件详情卡信息
    @Headers({"Content-Type: application/json","Accept: application/json"})
    @POST(baseUrl+path+"/case/cards")
    Call<String> visitCaseDetailsCardFormeService(@Body RequestBody  body);
    //外方单添加标记visit
    @Headers({"Content-Type: application/json","Accept: application/json"})
    @POST(baseUrl+path+"/case/markAsCurrentVisit")
    Call<String> visitLabCurrentVisit(@Body RequestBody  body);
    //外方单添加标记为完成状态
    @Headers({"Content-Type: application/json","Accept: application/json"})
    @POST(baseUrl+path+"/case/markAsCompleted")
    Call<String> visitLabCompleterState(@Body RequestBody  body);
    //添加电话datahouse_api
    @Headers({"Content-Type: application/json","Accept: application/json"})
    @POST(baseUrl+path+"/case/addDebtorPhone")
    Call<String> visitCaseAddPhone(@Body RequestBody  body);
    //添加上门催记
    @Headers({"Content-Type: application/json","Accept: application/json"})
    @POST(baseUrl+path+"/case/visitRecord/addRecord")
    Call<String> visitCaseAddVisitUrge(@Body RequestBody  body);
    //添加案件地址信息  datahouse_api
    @Headers({"Content-Type: application/json","Accept: application/json"})
    @POST(baseUrl+path+"/case/increaseAddress")
    Call<String> visitCaseAddAddddressMessage(@Body RequestBody  body);
   //添加案件联系人
   @Headers({"Content-Type: application/json","Accept: application/json"})
   @POST(baseUrl+path+"/case/saveContacts")
   Call<String> visitCaseAddAddcontacts(@Body RequestBody  body);
    //添加案件电话催收
    @Headers({"Content-Type: application/json","Accept: application/json"})
    @POST(baseUrl+path+"/case/addUrgePhone")
    Call<String> visitCaseAddPhoneUrge(@Body RequestBody  body);
   //图片上传
     @Multipart
    @POST(baseUrl+path+"/case/uploadPhoto")
    Call <String>upLoadImage(@Query("caseCode") String caseCode, @Query("visitGuid") String visitGuid,
    @Query("uploaderId") String uploaderId, @Query("uploaderName") String uploaderName, @PartMap Map<String,RequestBody> map);
    //  录音文件上传
    String recordFileUpToService=baseUrl+path+"/case/uploadRecord";
    //上传附件
    String FielsUploadToService=baseUrl+path+"/case/uploadAttachment";
    //上传视频
    String videoUploadToService=baseUrl+path+"/case/uploadVideo";
    // 上传图片
    String upLoadPicturesToService=baseUrl+path+"/case/uploadPhoto";
     // 查询文件
     @Headers({"Content-Type: application/json","Accept: application/json"})
    @POST(baseUrl+path+"/case/findDebtorVisitData")
    Call <String>queryFileFromeService(@Body RequestBody  body);
    // app升级
    @FormUrlEncoded
    @POST (baseUrl+path+"/version/checkUpdate")
    Call <String>appUpdata(@Field("versionName") String versionName,@Field("versionCode") String versionCode);

    // 修改外访路径
    @Headers({"Content-Type: application/json","Accept: application/json"})
    @POST(baseUrl+path+"/case/updateVisitAddress")
    Call <String>modifyAddressToService(@Body RequestBody  body);
    //保存定位信息
    @Headers({"Content-Type: application/json","Accept: application/json"})
    @POST (baseUrl+path+"/case/position/savePositionInfo")
    Call <String>saveLocationMessage(@Body RequestBody  body);
    //上传定位信息
    @Headers({"Content-Type: application/json","Accept: application/json"})
    @POST (baseUrl+path+"/case/position/addPoints")
    Call <String>uploadLocationMessage(@Body RequestBody  body);
    // 验证手机串号
    @Headers({"Content-Type: application/json","Accept: application/json"})
    @POST (baseUrl+path+"/auth/checkIMEI")
    Call <String>checkImie(@Body RequestBody  body);
    // 上传普通定位的信息

    @Headers({"Content-Type: application/json","Accept: application/json"})
    @POST (baseUrl+path+"/case/position/addPoints")
    Call <String>uploadCommonLocationMessage(@Body RequestBody  body);

    //根据案件编号查询案件详情    以后界面卡顿  服务端要优化
    @FormUrlEncoded
    @POST(baseUrl+path+"/case/getByCaseCode")
    Call<String> getByCaseCodeFromService(@Field("caseCode") String caseCode);
    //根据案件编号查询案件详情    以后界面卡顿  服务端要优化

    // 业绩统计
    @Headers({"Content-Type: application/json","Accept: application/json"})
    @POST (baseUrl+path+"/case/visitRecord/findVisitRecordList")
    Call <String>findVisitRecordList(@Body RequestBody  body);

 //查询案件外访记录 图片
@FormUrlEncoded
 @POST (baseUrl+path+"/case/visitRecord/findAnnex")
 Call <String>findAnnex(@Field("caseCode") String caseCode);

 //查询案件外访记录 图片
 @FormUrlEncoded
 @POST (baseUrl+path+"/case/visitRecord/findAudio")
 Call <String>findAnnexAudio(@Field("caseCode") String caseCode);

 //  /case/visitRecord/findVisitRecord
 //查询案件外访全部数据
    @FormUrlEncoded
 @POST (baseUrl+path+"/case/visitRecord/findVisitRecord")
 Call <String>findVisitRecord(@Field("caseCode") String caseCode);

    //查询图片
    @Headers({"Content-Type: application/json","Accept: application/json"})
    @POST (baseUrl+path+"/case/writerPicture")
    Call <ResponseBody>findWriterPicture(@Body RequestBody body);       //@Field("caseCode") String caseCode,@Field("annexId")String annexId

    String getPicturePath=baseUrl+path+"/case/writerPicture";
}

