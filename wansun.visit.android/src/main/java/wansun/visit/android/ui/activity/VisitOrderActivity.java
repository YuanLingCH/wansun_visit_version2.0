package wansun.visit.android.ui.activity;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.core.SearchResult;
import com.baidu.mapapi.search.geocode.GeoCodeOption;
import com.baidu.mapapi.search.geocode.GeoCodeResult;
import com.baidu.mapapi.search.geocode.GeoCoder;
import com.baidu.mapapi.search.geocode.OnGetGeoCoderResultListener;
import com.baidu.mapapi.search.geocode.ReverseGeoCodeResult;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import wansun.visit.android.R;
import wansun.visit.android.adapter.visitOrderAdapter;
import wansun.visit.android.bean.visitItemBean;
import wansun.visit.android.event.AddressEvent;
import wansun.visit.android.event.LatlngEvent;
import wansun.visit.android.utils.MapUtil;
import wansun.visit.android.utils.ToastUtil;
import wansun.visit.android.utils.dialogUtils;
import wansun.visit.android.utils.logUtils;
import wansun.visit.android.view.EmptyLayout;

/**
 * 外访单界面
 * Created by User on 2019/2/19.
 */

public class VisitOrderActivity extends BaseActivity {
    TextView tv_visit_tobar,tv_case_number;
    ImageView iv_visit_back;
    ListView lv_visit_order;
    visitOrderAdapter adapter;
    List data=new ArrayList();;
    EmptyLayout empty_layout;
    Button but_all_message;
    EditText et_qury_name;
    ImageView image_name;
    String quaryDebrotName=null;
    List<visitItemBean.DataBean> receiveData;
    double currentLat;
    double currentLng;
    String currentAdress;
    String desAddress;
    @Override
    protected int getLayoutId() {
        return R.layout.activity_visit_order;
    }

    @Override
    protected void initView() {
        tv_visit_tobar= (TextView) findViewById(R.id.tv_visit_tobar);
        iv_visit_back= (ImageView) findViewById(R.id.iv_visit_back);
        lv_visit_order= (ListView) findViewById(R.id.lv_visit_order);
        empty_layout= (EmptyLayout) findViewById(R.id.empty_layout);
        tv_case_number= (TextView) findViewById(R.id.tv_case_number);
        but_all_message= (Button) findViewById(R.id.but_all_message);
        et_qury_name= (EditText) findViewById(R.id.et_qury_name);
        image_name= (ImageView) findViewById(R.id.image_name);
        EventBus.getDefault().register(VisitOrderActivity.this);

     //   getIntentData();
    }

    private void getIntentData() {
        logUtils.d("搜索走了");
        if (receiveData.size()>0){
            Iterator<visitItemBean.DataBean> iterator = receiveData.iterator();
            data.clear();
            while (iterator.hasNext()){
                visitItemBean.DataBean next = iterator.next();
                String debtorName = next.getName();
                String address = next.getAddress();
                String customerName = next.getCustomerName();
                logUtils.d("debtorName"+debtorName+">>>>>地址"+address);
                if (TextUtils.isEmpty(quaryDebrotName)&&quaryDebrotName==null){  //正常逻辑
                    data.add(next);
                    logUtils.d("正常逻辑");
                }else {
                    if (debtorName.contains(quaryDebrotName)||address.contains(quaryDebrotName)||customerName.contains(quaryDebrotName)){   //搜索按钮逻辑
                     // quaryDebrotName=null;
                        logUtils.d("搜索逻辑");
                        data.add(next);
                    }
                }

            }
            updataUI();
        }else {
            ToastUtil.showToast(VisitOrderActivity.this,"没有数据...");
            empty_layout.setVisibility(View.VISIBLE);
            empty_layout.setErrorType(EmptyLayout.NODATA);
        }

    }

    private void updataUI() {
            adapter=new visitOrderAdapter(this,data,false);
            lv_visit_order.setAdapter(adapter);
            tv_case_number.setText("当前案件数量："+data.size());
    }

    @Override
    protected void initEvent() {
        tv_visit_tobar.setText("我的外访单");
        iv_visit_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                overridePendingTransition(R.anim.in_from_left,R.anim.out_to_right);
            }
        });

        lv_visit_order.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               visitItemBean.DataBean  o = (visitItemBean.DataBean) data.get(position);
                String caseCode = o.getCaseCode();
                String bacthCode = o.getBatchCode();
                String visitGuid = o.getVisitGuid();

                if (!TextUtils.isEmpty(caseCode)&&!TextUtils.isEmpty(visitGuid )){
                    Intent intent =new Intent(VisitOrderActivity.this,OutBoundActivity.class);
                    intent.putExtra("caseCode",caseCode);
                    intent.putExtra("visitGuid",visitGuid);
                    startActivity(intent);
                    overridePendingTransition(R.anim.in_from_right,R.anim.out_to_left);
                }else {
                    ToastUtil.showToast(VisitOrderActivity.this,"案件号和标识不能为空");
                }

            }
        });
        //加载全部数据
        but_all_message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (receiveData!=null&&receiveData.size()!=0){
                    data.clear();
                    quaryDebrotName=null;
                }

                getIntentData();
            }
        });
        //点击搜索按钮
        image_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 quaryDebrotName = et_qury_name.getText().toString().trim();
                logUtils.d("quaryDebrotName"+quaryDebrotName);
                if (!TextUtils.isEmpty(quaryDebrotName)){
                    if (receiveData!=null&&receiveData.size()!=0){
                        data.clear();
                        getIntentData();
                    }
                }else {
                    ToastUtil.showToast(VisitOrderActivity.this,"请输入债务人名字或者地址或者客户名称");
                }

            }
        });

    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initLise() {

    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(VisitOrderActivity.this);
    }

    /**
     * 接收MainActivity的数据
     * @param bean
     */
    @Subscribe(sticky = true)
         public void reveiveList(List<visitItemBean.DataBean> bean) {
             logUtils.d("TAG"+"eventBus接受事件"+bean.size());
             this.receiveData=bean;
             getIntentData();
                // 删除事件，否则会出现重复的响应事件
            EventBus.getDefault().removeStickyEvent(bean.getClass());
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
                            ToastUtil.showToast(VisitOrderActivity.this,"数据正在加载请稍等...");
                        }



                    } catch (Exception e) {
                        e.printStackTrace();
                        ToastUtil.showToast(VisitOrderActivity.this,"地址异常");

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




    private void selcetMap(final double curlatitude,final double curlongitude,final  String locationDescribe,final double destinationLatitude,final double destinationLongitude ,final  String address) {
        //  sNode = new BNRoutePlanNode(curlongitude, curlatitude, locationDescribe, null, coType);
        //eNode = new BNRoutePlanNode(destinationLongitude, destinationLatitude, s,null, coType);
        View view = getLayoutInflater().inflate(R.layout.map_select_layout, null);
        Button but_select_tencent = (Button) view.findViewById(R.id.but_select_tencent);
        Button  but_select_baidu = (Button) view.findViewById(R.id.but_select_baidu);
        Button  but_select_gaode = (Button) view.findViewById(R.id.but_select_gaode);
        Button but_cancle = (Button) view.findViewById(R.id.but_cancle);
        WindowManager manager=getWindowManager();
        final dialogUtils utils=new dialogUtils(VisitOrderActivity.this,manager,view );
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
                    MapUtil.openTencentMap(VisitOrderActivity.this, curlatitude, curlongitude, null, destinationLatitude, destinationLongitude, address);
                    ;;
                } else {
                    Toast.makeText(VisitOrderActivity.this, "尚未安装腾讯地图", Toast.LENGTH_SHORT).show();
                }

            }
        });
        //百度
        but_select_baidu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                utils.cancleDialog();
                if (MapUtil.isBaiduMapInstalled()){
                    MapUtil.openBaiDuNavi(VisitOrderActivity.this, curlatitude, curlongitude, locationDescribe, destinationLatitude, destinationLongitude, address);

                } else {
                    Toast.makeText(VisitOrderActivity.this, "尚未安装百度地图", Toast.LENGTH_SHORT).show();
                }


            }
        });
        // 高德
        but_select_gaode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                utils.cancleDialog();
                if (MapUtil.isGdMapInstalled()) {
                    MapUtil.openGaoDeNavi(VisitOrderActivity.this, curlatitude, curlongitude, locationDescribe, destinationLatitude, destinationLongitude, address);

                } else {
                    //这里必须要写逻辑，不然如果手机没安装该应用，程序会闪退，这里可以实现下载安装该地图应用
                    Toast.makeText(VisitOrderActivity.this, "尚未安装高德地图", Toast.LENGTH_SHORT).show();
                }


            }
        });
    }


}
