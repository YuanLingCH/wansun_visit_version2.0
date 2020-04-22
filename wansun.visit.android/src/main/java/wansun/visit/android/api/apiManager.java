package wansun.visit.android.api;

import java.util.Map;

import okhttp3.RequestBody;
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
//String baseUrl="http://192.168.166.133:8082";  //测试环境  http://visit-api.cnwansun.com/visit       datahouse-api
  //  String baseUrl_datahouse_api="http://192.168.166.133:8080";
//String baseUrl="http://192.168.166.38:8082";
    //  19.168.166.133：8082

   // http://192.168.166.45:8080
   // String baseUrl="http://192.168.166.45:8082";  //陈江新的地址
//  visit-api.cnwansun.com        ws-api.cnwansun.com/visit         http://visit-api.cnwansun.com/visit/"  上一次的url  测试通过的
//ssString baseUrl="http://ws-api.cnwansun.com/visit/";   // 7月1号上线环境
String baseUrl= "https://visit-api.cnwansun.com"; // 测试环境 https
//String baseUrl="http://visit-api.cnwansun.com/visit/";   //测试环境
    //登陆接口
    @FormUrlEncoded
    @POST(baseUrl+"/user/login?")
    Call<String> login(@Field("userName") String username,@Field("passWord") String password);
    //外访列表
      @Headers({"Content-Type: application/json","Accept: application/json"})
      @POST(baseUrl+"/case/findVisit")
      Call<String> visitListFormeService(@Body RequestBody  body);

    //外访案件详情
    @Headers({"Content-Type: application/json","Accept: application/json"})
    @POST(baseUrl+"/case/visitDetail")
    Call<String> visitCaseDetailsFormeService(@Body RequestBody  body);

    //外访案件详情联系人
    @Headers({"Content-Type: application/json","Accept: application/json"})
    @POST(baseUrl+"/case/contacts")
    Call<String> visitCaseDetailsContactsFormeService(@Body RequestBody  body);

    //外访案件详情催收记录
    @Headers({"Content-Type: application/json","Accept: application/json"})
    @POST(baseUrl+"/case/phoneUrgeRecord")
    Call<String> visitCaseDetailsUrgeRecordFormeService(@Body RequestBody  body);

    // 外访案件详情外访记录
    @Headers({"Content-Type: application/json","Accept: application/json"})
    @POST(baseUrl+"/case/visitRecord")
    Call<String> visitCaseDetailsRecordFormeService(@Body RequestBody  body);
    // 外访案件详情卡信息
    @Headers({"Content-Type: application/json","Accept: application/json"})
    @POST(baseUrl+"/case/cards")
    Call<String> visitCaseDetailsCardFormeService(@Body RequestBody  body);
    //外方单添加标记visit
    @Headers({"Content-Type: application/json","Accept: application/json"})
    @POST(baseUrl+"/case/markAsCurrentVisit")
    Call<String> visitLabCurrentVisit(@Body RequestBody  body);
    //外方单添加标记为完成状态
    @Headers({"Content-Type: application/json","Accept: application/json"})
    @POST(baseUrl+"/case/markAsCompleted")
    Call<String> visitLabCompleterState(@Body RequestBody  body);
    //添加电话datahouse_api
    @Headers({"Content-Type: application/json","Accept: application/json"})
    @POST(baseUrl+"/case/addDebtorPhone")
    Call<String> visitCaseAddPhone(@Body RequestBody  body);
    //添加上门催记
    @Headers({"Content-Type: application/json","Accept: application/json"})
    @POST(baseUrl+"/case/visitRecord/addRecord")
    Call<String> visitCaseAddVisitUrge(@Body RequestBody  body);
    //添加案件地址信息  datahouse_api
    @Headers({"Content-Type: application/json","Accept: application/json"})
    @POST(baseUrl+"/case/increaseAddress")
    Call<String> visitCaseAddAddddressMessage(@Body RequestBody  body);
   //添加案件联系人
   @Headers({"Content-Type: application/json","Accept: application/json"})
   @POST(baseUrl+"/case/saveContacts")
   Call<String> visitCaseAddAddcontacts(@Body RequestBody  body);
    //添加案件电话催收
    @Headers({"Content-Type: application/json","Accept: application/json"})
    @POST(baseUrl+"/case/addUrgePhone")
    Call<String> visitCaseAddPhoneUrge(@Body RequestBody  body);
   //图片上传
     @Multipart
    @POST(baseUrl+"/case/uploadPhoto")
    Call <String>upLoadImage(@Query("caseCode") String caseCode, @Query("visitGuid") String visitGuid,
    @Query("uploaderId") String uploaderId, @Query("uploaderName") String uploaderName, @PartMap Map<String,RequestBody> map);
    //  录音文件上传
    String recordFileUpToService=baseUrl+"/case/uploadRecord";
    //上传附件
    String FielsUploadToService=baseUrl+"/case/uploadAttachment";
    //上传视频
    String videoUploadToService=baseUrl+"/case/uploadVideo";
    // 上传图片
    String upLoadPicturesToService=baseUrl+"/case/uploadPhoto";
     // 查询文件
     @Headers({"Content-Type: application/json","Accept: application/json"})
    @POST(baseUrl+"/case/findDebtorVisitData")
    Call <String>queryFileFromeService(@Body RequestBody  body);
    // app升级
    @FormUrlEncoded
    @POST (baseUrl+"/version/checkUpdate")
    Call <String>appUpdata(@Field("versionName") String versionName,@Field("versionCode") String versionCode);

    // 修改外访路径
    @Headers({"Content-Type: application/json","Accept: application/json"})
    @POST(baseUrl+"/case/updateVisitAddress")
    Call <String>modifyAddressToService(@Body RequestBody  body);
    //保存定位信息
    @Headers({"Content-Type: application/json","Accept: application/json"})
    @POST (baseUrl+"/case/position/savePositionInfo")
    Call <String>saveLocationMessage(@Body RequestBody  body);
    //上传定位信息
    @Headers({"Content-Type: application/json","Accept: application/json"})
    @POST (baseUrl+"/case/position/addPoints")
    Call <String>uploadLocationMessage(@Body RequestBody  body);
    // 验证手机串号
    @Headers({"Content-Type: application/json","Accept: application/json"})
    @POST (baseUrl+"/auth/checkIMEI")
    Call <String>checkImie(@Body RequestBody  body);
    // 上传普通定位的信息
    @Headers({"Content-Type: application/json","Accept: application/json"})
    @POST (baseUrl+"/case/position/addPoints")
    Call <String>uploadCommonLocationMessage(@Body RequestBody  body);

    //绑定userID和IMEI
    @FormUrlEncoded
    @POST(baseUrl+"/auth/bindUser")
    Call<String> bindUserAndImei(@Field("userId") int userId,@Field("imei") String imei);

    //根据案件编号查询案件详情    以后界面卡顿  服务端要优化
    @FormUrlEncoded
    @POST(baseUrl+"/case/getByCaseCode")
    Call<String> getByCaseCodeFromService(@Field("caseCode") String caseCode);
    //根据案件编号查询案件详情    以后界面卡顿  服务端要优化

    // 业绩统计
    @Headers({"Content-Type: application/json","Accept: application/json"})
    @POST (baseUrl+"/case/visitRecord/findVisitRecordList")
    Call <String>findVisitRecordList(@Body RequestBody  body);

 //查询案件外访记录 图片
 @POST (baseUrl+"/case/visitRecord/findAnnex")
 Call <String>findAnnex(@Query("caseCode") String caseCode);

 //查询案件外访记录 图片
 @POST (baseUrl+"/case/visitRecord/findAudio")
 Call <String>findAnnexAudio(@Query("caseCode") String caseCode);

 //  /case/visitRecord/findVisitRecord
 //查询案件外访全部数据
 @POST (baseUrl+"/case/visitRecord/findVisitRecord")
 Call <String>findVisitRecord(@Query("caseCode") String caseCode);
}

