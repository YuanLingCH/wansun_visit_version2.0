package wansun.visit.android.ui.activity;

import android.content.Intent;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.core.SearchResult;
import com.baidu.mapapi.search.geocode.GeoCodeOption;
import com.baidu.mapapi.search.geocode.GeoCodeResult;
import com.baidu.mapapi.search.geocode.GeoCoder;
import com.baidu.mapapi.search.geocode.OnGetGeoCoderResultListener;
import com.baidu.mapapi.search.geocode.ReverseGeoCodeResult;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import wansun.visit.android.R;
import wansun.visit.android.adapter.visitOrderAdapter;
import wansun.visit.android.api.apiManager;
import wansun.visit.android.bean.visitItemBean;
import wansun.visit.android.event.AddressEvent;
import wansun.visit.android.event.LatlngEvent;
import wansun.visit.android.global.waifangApplication;
import wansun.visit.android.net.requestBodyUtils;
import wansun.visit.android.utils.MapUtil;
import wansun.visit.android.utils.NetWorkTesting;
import wansun.visit.android.utils.SharedUtils;
import wansun.visit.android.utils.ToastUtil;
import wansun.visit.android.utils.dialogUtils;
import wansun.visit.android.utils.logUtils;
import wansun.visit.android.utils.netUtils;
import wansun.visit.android.view.EmptyLayout;
import wansun.visit.android.view.loadMoreListView;

/**
 * 历史外访单
 * Created by User on 2019/2/22.
 */

public class VistRecordActivity extends BaseActivity implements loadMoreListView.onLoadMoreListenner{
   ImageView iv_visit_back,image_name;
    TextView tv_visit_tobar,tv_explain;
    List visitData;
    loadMoreListView lv_visit_order;
    EditText et_qury_name,et_qury_customer_name,et_qury_address;
    EmptyLayout empty_layout;
    visitOrderAdapter adapter;
    // 当前页号
    public  int pageNo=1;
    //每页显示的记录输
    public  int pageSize=20;  //  10
    private  boolean isFirst=false;
    TextView total,current_total;
    int currentNumbler=0;
    int currentNumblerFirst=0; //第一次加载的条数
    int counts;// 加载数据的总条数
    LinearLayout onLine_qury;
    int  scrolledX, scrolledY;
    private  boolean isQueryFlag=false;  //查询的标记
    String etName;
    String etAddress;
    String etCustomerName;
    dialogUtils utilDialog;
    double currentLat;
    double currentLng;
    String currentAdress;
    String desAddress;
    //   SwipeRefreshLayout srf;//下拉刷新控件
  //

    @Override
    protected int getLayoutId() {

        return R.layout.activity_visit_order_record;
    }

    @Override
    protected void initView() {
        tv_visit_tobar= (TextView) findViewById(R.id.tv_visit_tobar);
        tv_visit_tobar.setText("未标记完成外访单/未外访单");
        iv_visit_back= (ImageView) findViewById(R.id.iv_visit_back_one);
        lv_visit_order= (loadMoreListView) findViewById(R.id.lv_visit_order);
        empty_layout= (EmptyLayout) findViewById(R.id.empty_layout);
        total= (TextView) findViewById(R.id.total);
        current_total= (TextView) findViewById(R.id.current_total);
        image_name= (ImageView) findViewById(R.id.image_name);
        et_qury_name= (EditText) findViewById(R.id.et_qury_name);
        et_qury_address= (EditText) findViewById(R.id.et_qury_address);
        et_qury_customer_name= (EditText) findViewById(R.id.et_qury_customer_name);
        onLine_qury= (LinearLayout) findViewById(R.id.onLine_qury);
        tv_explain= (TextView) findViewById(R.id.tv_explain);
        //  srf= (SwipeRefreshLayout) findViewById(R.id.srf);
        isFirst=true;  //第一次加载数据*/
        getIntentData();
    }
    private void getIntentData() {

    }

    private void updataUI() {
                logUtils.d("updataUI");
        if (adapter==null){
            adapter=new visitOrderAdapter(this,visitData,true); //true 为完成
            lv_visit_order.setAdapter(adapter);
        }else {
            adapter.notifyDataSetChanged();
        }

        if (currentNumbler==0){
            current_total.setText("当前条数："+currentNumblerFirst);
        }else {
            int i = currentNumbler + currentNumblerFirst;
            current_total.setText("当前条数："+i);
        }

    }

    @Override
    protected void initEvent() {
        EventBus.getDefault().register(VistRecordActivity.this);
        visitData=new ArrayList();
        iv_visit_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                logUtils.d("点击返回按钮");
                overridePendingTransition(R.anim.in_from_left,R.anim.out_to_right);
            }
        });



      lv_visit_order.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                visitItemBean.DataBean  o = (visitItemBean.DataBean) visitData.get(position);
                String caseCode = o.getCaseCode();
                String bacthCode = o.getBatchCode();
                String visitGuid = o.getVisitGuid();

                if (!TextUtils.isEmpty(caseCode)&&!TextUtils.isEmpty(visitGuid )){
                    Intent intent =new Intent(VistRecordActivity.this,OutBoundActivity.class);
                    intent.putExtra("caseCode",caseCode);
                    intent.putExtra("visitGuid",visitGuid);
                    startActivity(intent);
                    overridePendingTransition(R.anim.in_from_right,R.anim.out_to_left);
                }else {
                    ToastUtil.showToast(VistRecordActivity.this,"案件号和标识不能为空");
                }

            }
        });

        empty_layout.setOnLayoutClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logUtils.d("点击重新加载数据");
                loadData( pageNo+"","","","");
            }
        });
        //设置回调
        lv_visit_order.setLoadMoreListnner(this);

        /**
         * 查询按钮的点击事件
         */
        image_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etName = et_qury_name.getText().toString().toString();
               etAddress = et_qury_address.getText().toString().trim();
               etCustomerName = et_qury_customer_name.getText().toString().trim();
                if (!TextUtils.isEmpty(etName)||!TextUtils.isEmpty(etAddress)||!TextUtils.isEmpty(etCustomerName)){
                    //查询数据
                    visitData.clear();

                    counts=0;
                    currentNumblerFirst=0;
                    currentNumbler=0;
                    pageNo=1;
                    current_total.setText("");
                    logUtils.d("etName"+etName);
                    logUtils.d("etAddress"+etAddress);
                    logUtils.d("etCustomerName"+etCustomerName);
                    loadData( pageNo+"",etName,etCustomerName,etAddress);
                    et_qury_name.setText("");
                    et_qury_address.setText("");
                    et_qury_customer_name.setText("");
                    isQueryFlag=true;
                }else {
                    ToastUtil.showToast(VistRecordActivity.this,"请输入条件查询");
                }
            }
        });


    }
    dialogUtils utils;
    @Override
    protected void initData() {
        //加载数据
        View view = LayoutInflater.from(waifangApplication.getContext()).inflate(R.layout.loading_layout, null);
        utils = new dialogUtils(VistRecordActivity.this, getWindowManager(), view);
        utils.getDialog();
      loadData(pageNo+"","","","");
    }

    private void loadData(String pageNo,String debtorName,String etCustomerName,String etAddress ) {
        NetWorkTesting net=new NetWorkTesting(this);
        if (net.isNetWorkAvailable()){

        String userName = SharedUtils.getString("account");
        logUtils.d("userName"+userName);
        Retrofit retrofit = netUtils.getRetrofit();
        apiManager manager= retrofit.create(apiManager.class);
        RequestBody requestBody = requestBodyUtils.visitItemToService(userName,false,pageNo,pageSize+"",debtorName,etCustomerName,etAddress);
        Call<String> call = manager.visitListFormeService(requestBody);
        call.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                String body = response.body();
                logUtils.d("body"+body);
                try {
                    if (!TextUtils.isEmpty(body)){
                        Gson gson=new Gson();
                        visitItemBean bean = gson.fromJson(body, new TypeToken<visitItemBean>() {}.getType());
                        String statusID = bean.getStatusID();
                        if (statusID.equals("200")){
                            utils.cancleDialog();
                            List<visitItemBean.DataBean> data = bean.getData();
                            visitItemBean.PageBean page = bean.getPage();
                            counts = page.getCounts();
                            total.setText("总条数："+ counts);
                           // visitData.clear();
                            if (data.size()>0){
                                Iterator<visitItemBean.DataBean> iterator = data.iterator();
                                while (iterator.hasNext()) {
                                    visitItemBean.DataBean next = iterator.next();
                                    String visitStatusText = next.getVisitStatusText();

                                    if (!visitStatusText.equals("外访完成")) {  //外访完成了就不加载数据
                                    if (isFirst) {
                                        visitData.add(next);
                                        ++currentNumblerFirst;
                                        logUtils.d("正常情况" + currentNumbler);
                                    } else {
                                      adapter.addItem(next);
                                        ++currentNumbler;
                                        logUtils.d("加载当前条数：" + currentNumbler);
                                        lv_visit_order.loadFinsh();
                                    }
                                    String name = next.getName();
                                    logUtils.d("债务人名字：" + name);
                                }
                                }

                            //    srf.setRefreshing(false);
                                isFirst=false;
                              //  onLine_qury.setVisibility(View.VISIBLE);
                               // tv_explain.setVisibility(View.VISIBLE);
                                empty_layout.setVisibility(View.GONE);
                                updataUI();
                            }else {
                                ToastUtil.showToast(VistRecordActivity.this,"没有数据...");
                                logUtils.d("没有数据activity");
                                empty_layout.setVisibility(View.VISIBLE);
                                empty_layout.setErrorType(EmptyLayout.NODATA);
                                onLine_qury.setVisibility(View.GONE);
                                tv_explain.setVisibility(View.GONE);
                            }
                        //  srf.setRefreshing(false);

                        }
                    }
                } catch (JsonSyntaxException e) {
                    e.printStackTrace();
                    ToastUtil.showToast(VistRecordActivity.this,"服务器异常..."+e.toString());
                    utils.cancleDialog();
                }

            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
             //  srf.setRefreshing(false);
                logUtils.d("请求数据失败"+t.toString());
                utils.cancleDialog();
            }
        });
        }else {
            empty_layout.setErrorType(EmptyLayout.NETWORK_LOADING);
        }
    }

    @Override
    protected void initLise() {

    }


    @Override
    public void loadMore() {
        logUtils.d("上啦加载更多走了"+pageNo);
      int page=  ++pageNo;
        logUtils.d("上啦加载更多走了page"+page);
     if (counts>pageSize*page-pageSize&&counts>=pageSize){ //总条数 要大于已经加载的数据条数
         if (!isQueryFlag){
             loadData(page+"","","","");  //  正常情况下跟多  或者查询条件下更多
             logUtils.d("上啦加载更多走了");
         }else {
             if (counts==currentNumbler){
                 isQueryFlag=!isQueryFlag;
                 etName="";
                 etCustomerName="";
                 etAddress="";
             }else {
                 loadData( pageNo+"",etName,etCustomerName,etAddress);
             }

         }

        }else {
            lv_visit_order.loadFinsh();
            ToastUtil.showToast(this,"没有更多数据...");
       //  lv_visit_order.scrollTo(scrolledX,scrolledY);

        }


 //  loadData("1");
    }

    GeoCoder mSearch = null;


    public void getSearch(String city,String address){
        mSearch = GeoCoder.newInstance();
        mSearch.setOnGetGeoCodeResultListener(GeoListener);
        mSearch.geocode(new GeoCodeOption()
                .city(city)
                .address(address));
    }

    OnGetGeoCoderResultListener GeoListener = new OnGetGeoCoderResultListener() {
        @Override
        public void onGetGeoCodeResult(GeoCodeResult geoCodeResult) {
            if (null != geoCodeResult && null != geoCodeResult.getLocation()) {
                if (geoCodeResult == null || geoCodeResult.error != SearchResult.ERRORNO.NO_ERROR) {
                    //没有检索到结果
                    logUtils.d("没有检索到结果退出循环>>>>>>>>>>>>>>>>>>>");
                    return;
                } else {
                    try {
                        double latitude = geoCodeResult.getLocation().latitude;
                        double longitude = geoCodeResult.getLocation().longitude;
                        LatLng latLng=new LatLng(latitude,longitude );
                        logUtils.d("没有检索到结果退出循环"+"latitude"+latitude+"longitude "+longitude );
                        if (!TextUtils.isEmpty(currentAdress)){
                            selcetMap(currentLat,currentLng,currentAdress,latitude,longitude,desAddress);
                        }else {
                            ToastUtil.showToast(VistRecordActivity.this,"数据正在加载请稍等...");
                        }



                    } catch (Exception e) {
                        e.printStackTrace();
                        ToastUtil.showToast(VistRecordActivity.this,"地址异常");

                    }

                }
            }

        }

        @Override
        public void onGetReverseGeoCodeResult(ReverseGeoCodeResult reverseGeoCodeResult) {

        }
    };


    @Subscribe(threadMode = ThreadMode.MAIN)
    public void receiveAddress(AddressEvent event){
        this.desAddress=event.address;
        getSearch("",event.address);  //接收地址信息转化为经纬度
    }



    @Subscribe(sticky = true)
    public void receiveLatLng(LatlngEvent event){

        this.currentLat=event.lat;
        this.currentLng=event.lng;
        this.currentAdress=event.currentAddress;

    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(VistRecordActivity.this);
    }



    private void selcetMap(final double curlatitude,final double curlongitude,final  String locationDescribe,final double destinationLatitude,final double destinationLongitude ,final  String address) {
        //  sNode = new BNRoutePlanNode(curlongitude, curlatitude, locationDescribe, null, coType);
        //eNode = new BNRoutePlanNode(destinationLongitude, destinationLatitude, s,null, coType);
        View view = getLayoutInflater().inflate(R.layout.map_select_layout, null);
        Button but_select_tencent = (Button) view.findViewById(R.id.but_select_tencent);
        Button  but_select_baidu = (Button) view.findViewById(R.id.but_select_baidu);
        Button  but_select_gaode = (Button) view.findViewById(R.id.but_select_gaode);
        Button but_cancle = (Button) view.findViewById(R.id.but_cancle);
        WindowManager manager=getWindowManager();
        final dialogUtils utils=new dialogUtils(VistRecordActivity.this,manager,view );
        utils.getDialog();
        but_cancle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                utils.cancleDialog();

            }
        });
        // 腾讯
        but_select_tencent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                utils.cancleDialog();
                if (MapUtil.isTencentMapInstalled()){
                    MapUtil.openTencentMap(VistRecordActivity.this, curlatitude, curlongitude, null, destinationLatitude, destinationLongitude, address);
            ;;
                } else {
                    Toast.makeText(VistRecordActivity.this, "尚未安装腾讯地图", Toast.LENGTH_SHORT).show();
                }

            }
        });
        //百度
        but_select_baidu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                utils.cancleDialog();
                if (MapUtil.isBaiduMapInstalled()){
                    MapUtil.openBaiDuNavi(VistRecordActivity.this, curlatitude, curlongitude, locationDescribe, destinationLatitude, destinationLongitude, address);

                } else {
                    Toast.makeText(VistRecordActivity.this, "尚未安装百度地图", Toast.LENGTH_SHORT).show();
                }


            }
        });
        // 高德
        but_select_gaode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                utils.cancleDialog();
                if (MapUtil.isGdMapInstalled()) {
                    MapUtil.openGaoDeNavi(VistRecordActivity.this, curlatitude, curlongitude, locationDescribe, destinationLatitude, destinationLongitude, address);

                } else {
                    //这里必须要写逻辑，不然如果手机没安装该应用，程序会闪退，这里可以实现下载安装该地图应用
                    Toast.makeText(VistRecordActivity.this, "尚未安装高德地图", Toast.LENGTH_SHORT).show();
                }


            }
        });
    }
}
