package wansun.visit.android.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import soundrecorderutils.RecordActivity;
import wansun.visit.android.R;
import wansun.visit.android.adapter.AttachmentListAdapter;
import wansun.visit.android.adapter.visitAdapter;
import wansun.visit.android.api.apiManager;
import wansun.visit.android.bean.caseAddressBean;
import wansun.visit.android.bean.caseAllDetailBean;
import wansun.visit.android.bean.caseDetailBean;
import wansun.visit.android.bean.collectionRrecordsBean;
import wansun.visit.android.bean.fileInfoCustomerBean;
import wansun.visit.android.db.fileInfo;
import wansun.visit.android.global.waifangApplication;
import wansun.visit.android.greendao.gen.fileInfoDao;
import wansun.visit.android.net.requestBodyUtils;
import wansun.visit.android.utils.SharedUtils;
import wansun.visit.android.utils.ToastUtil;
import wansun.visit.android.utils.dialogUtils;
import wansun.visit.android.utils.logUtils;
import wansun.visit.android.utils.netUtils;
import wansun.visit.android.utils.unixTime;
import wansun.visit.android.widget.ListViewForScrollView;

/**
 * 案件详情界面
 * Created by User on 2019/1/22.
 */

public class OutBoundActivity extends BaseActivity {
    private fileInfoDao dao;
    ImageView iv_visit_back;
    ListView lv_visit;
    visitAdapter adapter;
    List data;
    String caseCode;
    String visitGuid;
    TextView tv_debtor_name,tv_debtor_money,tv_debtor_adress,tv_base_collecta_mount,tv_base_last_arrears,tv_visit_area,tv_visit_goal;
    TextView tv_visit_remark,tv_customer_name,tv_gender,tv_clerk,tv_visitors,tv_collect_status,tv_deadline,tv_entrust_date,tv_visit_opertor;
    TextView tvAppDate,tvApplicant,tv_card_address,tvVisitStatus,tvIdno,tvLastProcessDate,tv_visit_caseid,tvBatchCode;
    RelativeLayout rl_phone,rl_Address,rl_urge_recode,rl_visit_record,rl_visit_cord_detail,rl_visit_file_query,rl_follow_message,rl_urge_return_message,rl_case_operator_record;
    TextView tv_fCamera,tv_fRecord,tv_fFile,tv_fVideo,tv_file_upload;
    LinearLayout ll;  //地址整个布局
    ListViewForScrollView lvAttachment;  //底部附件lv
    AttachmentListAdapter bottomAdapter;
   List <fileInfoCustomerBean>bottomData;
    List<?> caseFollowMessageItems;  //案件跟进信息
    List<caseAllDetailBean.DataBean.UrgeItemsBean.UrgePhoneItemsBean.PromisePaymentItemsBean>  promisePaymentItems;  //回款信息
    List caseAddressData;  //案件地址信息
    List<caseAllDetailBean.DataBean.OperateLogsBean> operateLogs;  //案件操作记录
    List<collectionRrecordsBean> collectionData; //催收记录
    List<caseAllDetailBean.DataBean.UrgeItemsBean.UrgeVisitItemsBean> urgeVisitItems; //外访记录
    @Override
    protected int getLayoutId() {
        return R.layout.activity_out_round;
    }

    @Override
    protected void initView() {
        getIntentData();
        iv_visit_back= (ImageView) findViewById(R.id.iv_visit_back);
     //   lv_visit= (ListView) findViewById(R.id.lv_visit);
        tv_debtor_name= (TextView) findViewById(R.id.tv_debtor_name);
        tv_debtor_money= (TextView) findViewById(R.id.tv_debtor_money);
        tv_debtor_adress= (TextView) findViewById(R.id.tv_debtor_adress);
        tv_base_collecta_mount= (TextView) findViewById(R.id.tv_base_collecta_mount);
        tv_base_last_arrears= (TextView) findViewById(R.id.tv_base_last_arrears);
        tv_visit_area= (TextView) findViewById(R.id.tv_visit_area);
        tv_visit_goal= (TextView) findViewById(R.id.tv_visit_goal);
        tv_visit_remark= (TextView) findViewById(R.id.tv_visit_remark);
        tv_customer_name= (TextView) findViewById(R.id.tv_customer_name);
        tv_gender= (TextView) findViewById(R.id.tv_gender);
        tv_clerk= (TextView) findViewById(R.id.tv_clerk);
        tv_visitors= (TextView) findViewById(R.id.tv_visitors);
        tv_collect_status= (TextView) findViewById(R.id.tv_collect_status);
        tv_deadline= (TextView) findViewById(R.id.tv_deadline);
        tv_entrust_date= (TextView) findViewById(R.id.tv_entrust_date);
        rl_phone= (RelativeLayout) findViewById(R.id.rl_phone);
        rl_Address= (RelativeLayout) findViewById(R.id.rl_Address);
        rl_urge_recode= (RelativeLayout) findViewById(R.id.rl_urge_recode);
        rl_visit_record= (RelativeLayout) findViewById(R.id.rl_visit_record);
        rl_visit_cord_detail= (RelativeLayout) findViewById(R.id.rl_visit_cord_detail);
        tv_visit_opertor= (TextView) findViewById(R.id.tv_visit_opertor);
        tv_fCamera= (TextView) findViewById(R.id.tv_fCamera);
        tv_fRecord= (TextView) findViewById(R.id.tv_fRecord);
        tv_fFile= (TextView) findViewById(R.id.tv_fFile);
        tv_fVideo= (TextView) findViewById(R.id.tv_fVideo);
        tvAppDate= (TextView) findViewById(R.id.tvAppDate);
        tvApplicant= (TextView) findViewById(R.id.tvApplicant);
        tv_card_address= (TextView) findViewById(R.id.tv_card_address);
        tvVisitStatus= (TextView) findViewById(R.id.tvVisitStatus);
        tvIdno= (TextView) findViewById(R.id.tvIdno);
        tvLastProcessDate= (TextView) findViewById(R.id.tvLastProcessDate);
        tv_visit_caseid= (TextView) findViewById(R.id.tv_visit_caseid);
        tvBatchCode= (TextView) findViewById(R.id.tvBatchCode);
        ll= (LinearLayout) findViewById(R.id.ll);
        tv_file_upload= (TextView) findViewById(R.id.tv_file_upload);
        rl_visit_file_query= (RelativeLayout) findViewById(R.id.rl_visit_file_query);
        rl_follow_message= (RelativeLayout) findViewById(R.id.rl_follow_message);
        rl_urge_return_message= (RelativeLayout) findViewById(R.id.rl_urge_return_message);
        rl_case_operator_record= (RelativeLayout) findViewById(R.id.rl_case_operator_record);


    }


    private void getIntentData() {
         caseCode = getIntent().getStringExtra("caseCode");
         visitGuid = getIntent().getStringExtra("visitGuid");
        logUtils.d("案件编号"+caseCode+"visitGuid"+visitGuid);
        SharedUtils.putString("caseCode",caseCode);
        SharedUtils.putString("visitGuid",visitGuid );
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
        rl_phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logUtils.d("点击案件电话");
                Intent intent=new Intent(OutBoundActivity.this,CasePhoneActivity.class);
                intent.putExtra("caseCode",caseCode);
                startActivity(intent);
                overridePendingTransition(R.anim.in_from_right, R.anim.out_to_left); // 由右向左滑入的效果
            }
        });
        rl_Address.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logUtils.d("点击案件地址");
                if (caseAddressData.size()>0&&caseAddressData!=null){
                    Intent intent=new Intent(OutBoundActivity.this,CaseAddressActivity.class);
                    intent.putExtra("caseAddress", (Serializable) caseAddressData);
                    startActivity(intent);
                    overridePendingTransition(R.anim.in_from_right,R.anim.out_to_left);
                }else {
                    ToastUtil.showToast(OutBoundActivity.this,"暂时无数据...");
                }
            }
        });
        //急催记录
        rl_urge_recode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (collectionData.size()>0&&collectionData!=null){
                    Intent intent=new Intent(OutBoundActivity.this,UrgeRecordActivity.class);
                    intent.putExtra("urgeRecode", (Serializable) collectionData);
                    startActivity(intent);
                    overridePendingTransition(R.anim.in_from_right,R.anim.out_to_left);
                }else {
                    ToastUtil.showToast(OutBoundActivity.this,"暂时无数据...");
                }

            }
        });
        // 外访记录
        rl_visit_record.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (urgeVisitItems.size()>0&&urgeVisitItems!=null){
                    Intent intent=new Intent(OutBoundActivity.this,CaseVisitRecordAcitvity .class);
                    intent.putExtra("urgeVisitItems", (Serializable) urgeVisitItems);
                    startActivity(intent);
                    overridePendingTransition(R.anim.in_from_right,R.anim.out_to_left);
                }else {
                    ToastUtil.showToast(OutBoundActivity.this,"暂时无数据...");
                }

       /*


                Intent intent=new Intent(OutBoundActivity.this,CaseVisitRecordAcitvity .class);
            //    intent.putExtra("visitRecord", (Serializable) visitRecord);   urgeVisitItems
                intent.putExtra("caseCode",caseCode);
                intent.putExtra("visitGuid",visitGuid);
                startActivity(intent);
                overridePendingTransition(R.anim.in_from_right, R.anim.out_to_left); // 由右向左滑入的效果*/
            }
        });
        // 卡信息
        rl_visit_cord_detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lookCardID( "", "2");
                isFlag=true;

            }
        });
        //操作界面
        tv_visit_opertor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logUtils.d("onclick"+caseCode+":"+visitGuid);
                Intent intent=new Intent(OutBoundActivity.this,OperationActivity.class);
                startActivity(intent);
                intent.putExtra("caseCode",caseCode);
                intent.putExtra("visitGuid",visitGuid);
                overridePendingTransition(R.anim.in_from_right,R.anim.out_to_left);
            }
        });
        // 跟进信息记录
        rl_follow_message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (caseFollowMessageItems.size()>0&&caseFollowMessageItems!=null){
                    Intent intent=new Intent(OutBoundActivity.this,FollowMessageActivity.class);
                    intent.putExtra("followMessage", (Serializable) caseFollowMessageItems);
                    startActivity(intent);
                    overridePendingTransition(R.anim.in_from_right,R.anim.out_to_left);
                }else {
                    ToastUtil.showToast(OutBoundActivity.this,"暂时无数据...");
                }

            }
        });
        // 回款信息
        rl_urge_return_message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (promisePaymentItems.size()>0&&promisePaymentItems!=null){

                    Intent intent=new Intent(OutBoundActivity.this,ReturnMessageActivity.class);
                    intent.putExtra("returnMessage", (Serializable) promisePaymentItems);
                    startActivity(intent);
                    overridePendingTransition(R.anim.in_from_right,R.anim.out_to_left);
                }else {
                    ToastUtil.showToast(OutBoundActivity.this,"暂时无数据...");
                }
            }
        });
        //案件操作记录
        rl_case_operator_record.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operateLogs.size()>0&&operateLogs!=null){
                    Intent intent=new Intent(OutBoundActivity.this,OperaterRecordActivity.class);
                    intent.putExtra("operateRecord", (Serializable) operateLogs);
                    startActivity(intent);
                    overridePendingTransition(R.anim.in_from_right,R.anim.out_to_left);
                }else {
                    ToastUtil.showToast(OutBoundActivity.this,"暂时无数据...");
                }
            }
        });

        //拍照
        tv_fCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent intent=new Intent(OutBoundActivity.this,TakePhotosActivity.class);
                startActivity(intent);


            }
        });
        // 录音
        tv_fRecord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(OutBoundActivity.this, RecordActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_from_right,R.anim.out_to_left);
            }
        });
        //选择图片
        tv_fFile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(OutBoundActivity.this, PictureSelectActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_from_right,R.anim.out_to_left);
            }
        });
        //录制视频界面
        tv_fVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(OutBoundActivity.this,VideoRecorderActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_from_right,R.anim.out_to_left);
            }
        });
        //跳到定位界面去
        ll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //把地址传过去定位
  /*              String trim = tv_debtor_adress.getText().toString().trim();
                String[] split = trim.split("欠款人地址：");
                String address = split[1];
                logUtils.d("地址显示："+address);
                Intent intent=new Intent(OutBoundActivity.this,MainActivity.class);
                intent.putExtra("address",address);
                startActivity(intent);*/

            }
        });
        /**
         * 文件上传  图片 ，文件 ，视频，录音
         */
        tv_file_upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(OutBoundActivity.this,FileUploadActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_from_right,R.anim.out_to_left);
            }
        });
        /**
         * 文件查询
         */
        rl_visit_file_query.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(OutBoundActivity.this,FileQueryActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_from_right,R.anim.out_to_left);
            }
        });

        /**
         * 底部附件lv
         *
         */


    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        dao= waifangApplication.getInstence().getSession().getFileInfoDao();

    }

    @Override
    protected void onStart() {
        super.onStart();
      //  loadBottomLvData();
    }

    /**
     * 加载底部数据
     */
    private void loadBottomLvData() {
        bottomData=new ArrayList();

        List<fileInfo> fileInfos = dao.loadAll();
        if (fileInfos.size()>0){
        Iterator<fileInfo> iterator = fileInfos.iterator();
        bottomData.clear();

        while (iterator.hasNext()){    //  遍历数据
            fileInfoCustomerBean bean=new fileInfoCustomerBean();
            fileInfo next = iterator.next();
            logUtils.d("测试数据"+next.path);
            bean.setId(next.getId());
            bean.setPath(next.getPath());
            bean.setType(next.getType());
            bottomData.add(bean);
        }

        bottomAdapter=new AttachmentListAdapter(OutBoundActivity.this,bottomData);
            lvAttachment.setVisibility(View.VISIBLE);
        lvAttachment.setAdapter(bottomAdapter);


   }

    }


    /**
     * 数据加载
     */
    @Override
    protected void initData() {
        promisePaymentItems=new ArrayList<>();
        promisePaymentItems.clear();
        caseAddressData=new ArrayList();
        caseAddressData.clear();
        collectionData=new ArrayList<>();
        collectionData.clear();
        Retrofit retrofit = netUtils.getRetrofit();
        apiManager manager= retrofit.create(apiManager.class);
        //TODO注意换回数据 caseData
        final RequestBody requestBody = requestBodyUtils.visitCaseDetailsFromeService(caseCode,visitGuid);

        Call<String> call = manager.visitCaseDetailsFormeService(requestBody);
        call.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                String body = response.body();
                logUtils.d("下载数据"+body);
                if (!TextUtils.isEmpty(body)){
                    Gson gson=new Gson();
                    caseDetailBean data = gson.fromJson(body, new TypeToken<caseDetailBean>() {}.getType());
                    caseDetailBean.DataBean bean = data.getData();
                    updataUi(bean);

                }

            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {

            }
        });

        data=new ArrayList();
        for (int i = 0; i < 5; i++) {
            data.add(i);
        }
        adapter=new visitAdapter(this,data);
    //    lv_visit.setAdapter(adapter);
       //


        Call<String> calldata = manager.getByCaseCodeFromService(caseCode);
        calldata.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                String body = response.body();
                logUtils.d("下载详细的数据："+body);
                if (!TextUtils.isEmpty(body)){
                    Gson gson=new Gson();
                    caseAllDetailBean data = gson.fromJson(body, new TypeToken<caseAllDetailBean>() {}.getType());
                    String statusID = data.getStatusID();
                    if (statusID.equals("200")) {
                        caseAllDetailBean.DataBean data1 = data.getData();
                        caseFollowMessageItems = data1.getCaseFollowMessageItems();
                        List<caseAllDetailBean.DataBean.UrgeItemsBean> urgeItems = data1.getUrgeItems();

                        try {
                            if (urgeItems.size() > 0 && urgeItems != null) {
                                Iterator<caseAllDetailBean.DataBean.UrgeItemsBean> iterator = urgeItems.iterator();
                                while (iterator.hasNext()) {
                                    caseAllDetailBean.DataBean.UrgeItemsBean next = iterator.next();
                                       urgeVisitItems = next.getUrgeVisitItems();
                                    List<caseAllDetailBean.DataBean.UrgeItemsBean.UrgeLetterItemsBean> urgeUrgeLetterItems = next.getUrgeLetterItems();  //信函
                                    try {
                                        if (urgeUrgeLetterItems.size()>0&&urgeUrgeLetterItems!=null){
                                            Iterator<caseAllDetailBean.DataBean.UrgeItemsBean.UrgeLetterItemsBean> iterator1 = urgeUrgeLetterItems.iterator();
                                            while (iterator1.hasNext()){
                                                caseAllDetailBean.DataBean.UrgeItemsBean.UrgeLetterItemsBean next1 = iterator1.next();
                                                collectionRrecordsBean recordBean = new collectionRrecordsBean();
                                                recordBean.setName(next1.getLetterAcceptor());
                                                recordBean.setRemark(next1.getContact() + "");
                                                recordBean.setAddress(next1.getLetterAddress());
                                                recordBean.setCreateDate(next1.getCreateDate());
                                                recordBean.setUrgeTypeName("信函");
                                                recordBean.setCreator(next1.getCreator());
                                                collectionData.add(recordBean);
                                            }

                                        }
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }


                                    try {
                                        if (urgeVisitItems.size() > 0 && urgeVisitItems != null) {
                                            Iterator<caseAllDetailBean.DataBean.UrgeItemsBean.UrgeVisitItemsBean> iterator1 = urgeVisitItems.iterator();

                                            while (iterator1.hasNext()) {
                                                caseAllDetailBean.DataBean.UrgeItemsBean.UrgeVisitItemsBean next1 = iterator1.next();

                                                collectionRrecordsBean recordBean = new collectionRrecordsBean();
                                                recordBean.setName(next1.getVisitObjectName());
                                                recordBean.setRemark(next1.getRemark() + "");
                                                recordBean.setAddress(next1.getAddress());
                                                recordBean.setCreateDate(next1.getApplyTime());
                                                recordBean.setRemark(next1.getRemark());
                                                recordBean.setUrgeTypeName("外访");
                                                collectionData.add(recordBean);
                                            }
                                        }
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                    List<caseAllDetailBean.DataBean.UrgeItemsBean.UrgePhoneItemsBean> urgePhoneItems = next.getUrgePhoneItems();
                                    if (urgePhoneItems.size() > 0 && urgePhoneItems != null) {
                                        Iterator<caseAllDetailBean.DataBean.UrgeItemsBean.UrgePhoneItemsBean> iterator1 = urgePhoneItems.iterator();
                                        while (iterator1.hasNext()) {
                                            caseAllDetailBean.DataBean.UrgeItemsBean.UrgePhoneItemsBean next1 = iterator1.next();
                                            collectionRrecordsBean recordBean = new collectionRrecordsBean();
                                            recordBean.setName(next1.getName());
                                            recordBean.setPhone(next1.getPhone());
                                            recordBean.setCreateDate(next1.getCreateDate());
                                            recordBean.setRemark(next1.getRemark());
                                            recordBean.setContactSummaryText(next1.getContactSummaryText());
                                            recordBean.setCallRecords(next1.getCallRecords());
                                            recordBean.setCreator(next1.getCreator());
                                            recordBean.setContactResultText(next1.getContactResultText());
                                            recordBean.setRemark(next1.getRemark());
                                            recordBean.setUrgeTypeName(next1.getUrgeTypeName());

                                            collectionData.add(recordBean);
                                            List<caseAllDetailBean.DataBean.UrgeItemsBean.UrgePhoneItemsBean.PromisePaymentItemsBean> promisePaymentItems1 = next1.getPromisePaymentItems();
                                        try {
                                            if (!next1.getPromisePaymentItems().isEmpty()) {
                                                Iterator<caseAllDetailBean.DataBean.UrgeItemsBean.UrgePhoneItemsBean.PromisePaymentItemsBean> iterator2 = promisePaymentItems1.iterator();
                                                while (iterator2.hasNext()) {
                                                    promisePaymentItems.add(iterator2.next());
                                                }
                                            }
                                        }catch (Exception e){
                                            logUtils.d("下载详细的数据："+new Throwable("空指针"));
                                        }

                                        }
                                    }

                                }
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        /////////////////////////////////////////////////////////案件地址/////////////////////////////////////////////////////
                        List<caseAllDetailBean.DataBean.ContactItemsBean> contactItems = data1.getContactItems();
                        try {
                            if (contactItems.size() > 0 && contactItems != null) {
                                Iterator<caseAllDetailBean.DataBean.ContactItemsBean> iterator = contactItems.iterator();
                                String name;
                                String relation;
                                while (iterator.hasNext()) {
                                    caseAllDetailBean.DataBean.ContactItemsBean next = iterator.next();  //住宅地址
                                    name = next.getName();
                                    relation = next.getRelationText();
                                    List<caseAllDetailBean.DataBean.ContactItemsBean.AddressItemsBean> addressItems = (List<caseAllDetailBean.DataBean.ContactItemsBean.AddressItemsBean>) next.getAddressItems();
                                    try {
                                        if (addressItems.size() > 0 && addressItems != null) {
                                            Iterator<caseAllDetailBean.DataBean.ContactItemsBean.AddressItemsBean> iterator1 = addressItems.iterator();
                                            while (iterator1.hasNext()) {
                                                caseAllDetailBean.DataBean.ContactItemsBean.AddressItemsBean next1 = iterator1.next();
                                                String address1 = next1.getAddress1();
                                                logUtils.d("地址：" + address1);
                                                caseAddressBean bean = new caseAddressBean();
                                                bean.setAddress1(next1.getAddress1());
                                                bean.setAddress2(next1.getAddress2());
                                                bean.setAddressStatusText(next1.getAddressStatusText());
                                                bean.setPostCode(next1.getPostCode());
                                                bean.setAddressTypeText(next1.getAddressTypeText());
                                                bean.setCreator(next1.getCreator());
                                                bean.setCreateDate(next1.getCreateDate());
                                                bean.setRemark(next1.getRemark());
                                                bean.setName(name);
                                                bean.setRelationText(relation);
                                                logUtils.d("name：" + name);
                                                caseAddressData.add(bean);
                                            }
                                        }
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        String name1;
                        List<caseAllDetailBean.DataBean.DebtorItemsBean> debtorItems = data1.getDebtorItems();  //户籍地址
                        try {
                            if (debtorItems.size() > 0 && debtorItems != null) {

                            Iterator<caseAllDetailBean.DataBean.DebtorItemsBean> iterator1 = debtorItems.iterator();
                            while (iterator1.hasNext()) {
                                caseAllDetailBean.DataBean.DebtorItemsBean next = iterator1.next();
                                List<caseAllDetailBean.DataBean.DebtorItemsBean.AddressItemsBean> addressItems = next.getAddressItems();
                                try {
                                    if (addressItems.size()>0&&addressItems!=null){

                                    name1 = next.getName();
                                    Iterator<caseAllDetailBean.DataBean.DebtorItemsBean.AddressItemsBean> iterator2 = addressItems.iterator();
                                    while (iterator2.hasNext()) {
                                        caseAllDetailBean.DataBean.DebtorItemsBean.AddressItemsBean next1 = iterator2.next();
                                        caseAddressBean bean = new caseAddressBean();
                                        bean.setAddress1(next1.getAddress1());
                                        bean.setAddress2(next1.getAddress2());
                                        bean.setAddressStatusText(next1.getAddressStatusText());
                                        bean.setPostCode(next1.getPostCode());
                                        bean.setAddressTypeText(next1.getAddressTypeText());
                                        bean.setCreator(next1.getCreator());
                                        bean.setCreateDate(next1.getCreateDate());
                                        bean.setName(name1);
                                        bean.setRemark(next1.getRemark());
                                        caseAddressData.add(bean);

                                        logUtils.d("地址：" + next1.getAddress1());
                                    }
                                }
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        List<caseAllDetailBean.DataBean.CardItemsBean> cardItems = data1.getCardItems();
                        try {
                            if (cardItems.size()>0&&cardItems!=null){
                            Iterator<caseAllDetailBean.DataBean.CardItemsBean> iterator2 = cardItems.iterator();
                            while (iterator2.hasNext()){
                                caseAllDetailBean.DataBean.CardItemsBean next = iterator2.next();
                                caseAllDetailBean.DataBean.CardItemsBean.CardAddressBean cardAddress = next.getCardAddress();
                                logUtils.d("地址："+ cardAddress.getAddress1());
                                caseAddressBean bean=new caseAddressBean();
                                bean.setAddress1(cardAddress.getAddress1());
                                bean.setAddress2(cardAddress.getAddress2());
                                bean.setAddressStatusText(cardAddress.getAddressStatusText());
                                bean.setPostCode(cardAddress.getPostCode());
                                bean.setAddressTypeText(cardAddress.getAddressTypeText());
                                bean.setCreator(cardAddress.getCreator());
                                bean.setCreateDate(cardAddress.getCreateDate());
                                bean.setRemark(cardAddress.getRemark());
                                bean.setName(ugrerName);
                                caseAddressData.add(bean);

                             //   caseAddressData.add(cardAddress);
                                List<caseAllDetailBean.DataBean.CardItemsBean.ReconciliationAddressBean> reconciliationAddress = next.getReconciliationAddress();
                                try {
                                    if (reconciliationAddress.size()>0&&reconciliationAddress!=null){


                                    Iterator<caseAllDetailBean.DataBean.CardItemsBean.ReconciliationAddressBean> iterator3 = reconciliationAddress.iterator();
                                    while (iterator3.hasNext()){
                                        caseAllDetailBean.DataBean.CardItemsBean.ReconciliationAddressBean next1 = iterator3.next();
                                        caseAddressBean bean2=new caseAddressBean();
                                        bean2.setAddress1(next1.getAddress1());
                                        bean2.setAddress2(next1.getAddress2());
                                        bean2.setAddressStatusText(next1.getAddressStatusText());
                                        bean2.setPostCode(next1.getPostCode());
                                        bean2.setAddressTypeText(next1.getAddressTypeText());
                                        bean2.setCreator(next1.getCreator());
                                        bean2.setCreateDate(next1.getCreateDate());
                                        bean2.setRemark(next1.getRemark());
                                        bean2.setName(ugrerName);
                                        caseAddressData.add(bean2);

                                     //   caseAddressData.add(next1);
                                        logUtils.d("地址："+ next1.getAddress1());
                                    }
                                    }
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                                List<caseAllDetailBean.DataBean.CardItemsBean.MortgageAddressItemsBean> mortgageAddressItems = next.getMortgageAddressItems();
                                try {
                                    if (mortgageAddressItems.size()>0&& mortgageAddressItems!=null){
                                    Iterator<caseAllDetailBean.DataBean.CardItemsBean.MortgageAddressItemsBean> iterator4 = mortgageAddressItems.iterator();
                                    while (iterator4.hasNext()){
                                        caseAllDetailBean.DataBean.CardItemsBean.MortgageAddressItemsBean next1 = iterator4.next();
                                        caseAddressBean bean1=new caseAddressBean();
                                        bean1.setAddress1(next1.getAddress1());
                                        bean1.setAddress2(next1.getAddress2());
                                        bean1.setAddressStatusText(next1.getAddressStatusText());
                                        bean1.setPostCode(next1.getPostCode());
                                        bean1.setAddressTypeText(next1.getAddressTypeText());
                                        bean1.setCreator(next1.getCreator());
                                        bean1.setCreateDate(next1.getCreateDate());
                                        bean1.setRemark(next1.getRemark());
                                        bean1.setName(ugrerName);
                                        caseAddressData.add(bean1);
                                     //   caseAddressData.add(next1);
                                        logUtils.d("地址："+ next1.getAddress1());
                                    }
                                    }
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        logUtils.d("最后集合size"+ caseAddressData.size());
                        operateLogs = data1.getOperateLogs();  //案件操作记录搜索
                //////////// ///////////////////////////////////////催收记录///////////////////////////////////////////////////////////////////////
                        List<caseAllDetailBean.DataBean.UrgeItemsBean> urgeItems1 = data1.getUrgeItems();

                    }else {
                        ToastUtil.showToast(OutBoundActivity.this,"服务器出现错误...");
                    }

                }
            }

            @Override
            public void onFailure(Call<String> call, Throwable throwable) {
                logUtils.d("下载详细的数据失败："+throwable.toString());
            }
        });


    }

    /**
     * 得到数据后更新界面UI
     * @param bean
     */
    String ugrerName;
    double caseTotalAppointAmount;
    double caseTotalUrgeAmount;
    double caseTotalReceiptAmount;
    private void updataUi(caseDetailBean.DataBean bean) {
     ugrerName = bean.getName();
        tv_debtor_name.setText("欠款人："+ ugrerName);
        tv_debtor_money.setVisibility(View.GONE);
        caseTotalAppointAmount = bean.getCaseTotalAppointAmount();
        tv_debtor_money.setText("委案金额："+ caseTotalAppointAmount +"元");
        tv_debtor_adress.setText("欠款人地址："+bean.getAddress());
        caseTotalUrgeAmount = bean.getCaseTotalUrgeAmount();
        tv_base_collecta_mount.setText("催收金额："+ caseTotalUrgeAmount +"元");
        caseTotalReceiptAmount = bean.getCaseTotalReceiptAmount();
        tv_base_last_arrears.setText("回款金额："+ caseTotalReceiptAmount +"元");
        tv_visit_area.setText("外访区域："+bean.getVisitArea());
        tv_visit_goal.setText("外访目标："+bean.getVisitGoal());
        tv_visit_remark.setText("外访备注："+bean.getRemark());
        tv_customer_name.setText("甲方："+bean.getCustomerName());
        tv_gender.setText("性别："+bean.getGenderText());
        tv_clerk.setText("管理员："+bean.getClerkName());
        tv_visitors.setText("外访员："+bean.getVisitors());
        tv_collect_status.setText("催收状态："+bean.getCaseUrgeStatusText());
        logUtils.d("案件编号："+caseCode);
        tv_visit_caseid.setText("案件编号："+caseCode);
        logUtils.d("批次编号："+bean.getBatchCode());
        tvBatchCode.setText("批次编号："+bean.getBatchCode());
        long deadLine = bean.getAppointBeginDate()/1000;
        String s = unixTime.stampToTime(deadLine);
        logUtils.d("时间转换"+s);
        tv_deadline.setText("委案日期："+s);
        long entrustDate = bean.getAppointEndBeginDate()/1000;
        tv_entrust_date.setText("截止日期："+unixTime.stampToTime(entrustDate));
        long applyTime = bean.getApplyTime()/1000;
        tvAppDate.setText("申请时间："+unixTime.stampToTime(applyTime));
        tvApplicant.setText("申请人："+bean.getApplicantName());
        tv_card_address.setText("开卡地址："+bean.getCardAddress());
        tvVisitStatus.setText("外访状态："+bean.getVisitStatusText());
      final   String cidNo = bean.getCidNo();
        logUtils.d("证件号码："+ cidNo);
        tvIdno.setText("证件号码："+"点击查看详情");

        long lasttime = bean.getLatestFollowUpTime();
        if (lasttime!=0){
            tvLastProcessDate.setText("最后催收时间："+unixTime.stampToTime(lasttime/1000));
        }
        tvIdno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logUtils.d("点击查看证件号码：");
                lookCardID(cidNo,"1");
            }
        });

    }


    private  boolean isFlag=true;
    private void lookCardID(final String cidNo,final String type) {
        View view = getLayoutInflater().inflate(R.layout.custom_diaglog_layut_exit_app, null);
        final TextView tv = (TextView) view.findViewById(R.id.tv);
        TextView tv_cancle= (TextView) view.findViewById(R.id.add_cancle);
        if (type.equals("1")){
            tv.setText(R.string.look_cardID);
        }else if (type.equals("2")){

            tv.setText("查看卡信息");
        }

        tv.setTextSize(16);
        tv.setGravity(Gravity.CENTER);
        TextView tv_submit= (TextView) view.findViewById(R.id.add_submit);
        final EditText et_modify= (EditText) view.findViewById(R.id.et_modify);
        et_modify.setVisibility(View.VISIBLE);
        et_modify.setHint("请输入登录密码");
        WindowManager manager=getWindowManager();
        final dialogUtils utils=new dialogUtils(OutBoundActivity.this,manager,view );
        utils.getDialog();
        tv_cancle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                utils.cancleDialog();
                et_modify.setFocusable(true);
            }
        });
        tv_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String trim = et_modify.getText().toString().trim();
                String password = SharedUtils.getString("password");
                if (trim.equals(password)){
                    if (type.equals("1")){
                        if (!TextUtils.isEmpty(cidNo)){
                            StringBuilder sb  =new StringBuilder();
                            for (int i = 0; i <cidNo.length(); i++) {
                                char c = cidNo.charAt(i);
                                if (i <= 5) {
                                    sb.append("*");
                                } else {
                                    sb.append(c);
                                }
                            }
                            et_modify.setText(sb.toString());
                            isFlag=false;
                            et_modify.setFocusable(false);
                        }else {
                            ToastUtil.showToast(OutBoundActivity.this,"暂无证件号码");
                        }
                    }else if (type.equals("2")){
                        utils.cancleDialog();

             /*           double caseTotalAppointAmount;
                        double caseTotalUrgeAmount;
                        double caseTotalReceiptAmount;
                        */

                        Intent intent=new Intent(OutBoundActivity.this,CaseCardMessageActivity .class);
                        intent.putExtra("caseCode",caseCode);
                        intent.putExtra("caseTotalAppointAmount",caseTotalAppointAmount+"");
                        intent.putExtra("caseTotalUrgeAmount",caseTotalUrgeAmount+"");
                        intent.putExtra("caseTotalReceiptAmount",caseTotalReceiptAmount+"");
                        startActivity(intent);
                        overridePendingTransition(R.anim.in_from_right, R.anim.out_to_left); // 由右向左滑入的效果
                    }



                }else {
                    if (isFlag){
                        ToastUtil.showToast(OutBoundActivity.this,"输入密码错误");
                    }

                }

            }
        });
    }

    @Override
    protected void initLise() {

    }
}
