package wansun.visit.android.ui.activity;

import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.AbsListView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import wansun.visit.android.R;
import wansun.visit.android.adapter.performancCountsAdapter;
import wansun.visit.android.api.apiManager;
import wansun.visit.android.bean.performancCountsBean;
import wansun.visit.android.config.MessageCode;
import wansun.visit.android.event.EventMessage;
import wansun.visit.android.net.requestBodyUtils;
import wansun.visit.android.utils.SharedUtils;
import wansun.visit.android.utils.ToastUtil;
import wansun.visit.android.utils.logUtils;
import wansun.visit.android.utils.netUtils;
import wansun.visit.android.utils.unixTime;
import wansun.visit.android.widget.DatePicier;

/**
 * Created by User on 2019/10/23.
 *
 * 业绩统计
 *
 * 外访员只能看到自己的业绩
 * 外访管理员能看到机构全部的统计数量
 */

public class CountsActivity extends BaseActivity {
    ImageView iv_visit_back;
    TextView tv_visit_tobar,tv_counts,tv_counts_people,tv_start_time,tv_end_time;
    performancCountsAdapter adapter;
    ListView lv_counts;
    List <String>userNameData;
    EditText et_qury_name;
   ImageView image_name;
    List<performancCountsBean.DataBean> querydata;
    List queyData;  //查询数据
    Button but_qury_history;
    LinearLayout ll_start_time,ll_end_time;  //开始  结束
    String startTime,endTime;
    LinearLayout ll_query_history;
    @Override
    protected int getLayoutId() {
        return R.layout.activity_counts;
    }

    @Override
    protected void initView() {
        iv_visit_back= (ImageView) findViewById(R.id.iv_visit_back);
        tv_visit_tobar= (TextView) findViewById(R.id.tv_visit_tobar);
        lv_counts= (ListView) findViewById(R.id.lv_counts);
        tv_counts= (TextView) findViewById(R.id.tv_counts);  //外访数量
        tv_counts_people= (TextView) findViewById(R.id.tv_counts_people); //   分人员统计数量
        et_qury_name= (EditText) findViewById(R.id.et_qury_name);
        image_name= (ImageView) findViewById(R.id.image_name);
        but_qury_history= (Button) findViewById(R.id.but_qury_history);
        ll_start_time= (LinearLayout) findViewById(R.id.ll_start_time);
        ll_end_time= (LinearLayout) findViewById(R.id.ll_end_time);
        tv_start_time= (TextView) findViewById(R.id.tv_start_time);
        tv_end_time= (TextView) findViewById(R.id.tv_end_time);
        ll_query_history= (LinearLayout) findViewById(R.id.ll_query_history);
    }

    @Override
    protected void initEvent() {
        iv_visit_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                logUtils.d("点击返回按钮");
                overridePendingTransition(R.anim.in_from_left,R.anim.out_to_right);
            }
        });
        tv_visit_tobar.setText("业绩统计");
        image_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logUtils.d("点击返回按钮");
                String et_user = et_qury_name.getText().toString().trim();
                queryUserName(et_user);
            }
        });
        /**
         * 查询历史记录
         */
        but_qury_history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("TAG","点击开始时间"+startTime);
                if (TextUtils.isEmpty(startTime)){
                    ToastUtil.showToast(CountsActivity.this,"请选择开始时间");
                    return;
                }
                if (TextUtils.isEmpty(endTime)){
                    ToastUtil.showToast(CountsActivity.this,"请选择结束时间");
                    return;
                }
                String longStart = unixTime.dateToStamp(startTime);
                String longEnd = unixTime.dateToStamp(endTime);
                if (Long.parseLong(longStart)<Long.parseLong(longEnd)){
                    logUtils.d("longStart"+longStart);
                    queryHistoryRecord(Long.parseLong(longStart), Long.parseLong(longEnd) );
                }else {
                    ToastUtil.showToast(CountsActivity.this,"开始时间不能晚于结束时间");
                }

            }
        });

        DatePicier.initDatePicker(tv_end_time, tv_start_time, CountsActivity.this);
        /**
         * 开始时间
         */
        ll_start_time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePicier.getCustomDatePicker2().show(tv_start_time.getText().toString());
            }
        });
        /**
         * 结束时间
         */
        ll_end_time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePicier.getCustomDatePicker1().show(tv_end_time.getText().toString());
            }
        });


        lv_counts.setOnScrollListener(new AbsListView.OnScrollListener() {
            /**
             *
             * @param view
             * @param scrollState  状态
             *   0  表示屏幕已停止。屏幕停止滚动时为0。
             *   1  表示正在滚动。当屏幕滚动且用户使用的触碰或手指还在屏幕上时为1
             *   2  表示手指做了抛的动作（手指离开屏幕前，用力滑了一下，屏幕产生惯性滑动）。
             */
            @Override
            public void onScrollStateChanged(AbsListView view, int scrollState) {
                logUtils.d("onScrollStateChanged"+scrollState);
                if (scrollState==0){
                    ll_query_history.setVisibility(View.VISIBLE);

                }else {
                    ll_query_history.setVisibility(View.GONE);
                }

            }

            /**
             *
             * @param view
             * @param firstVisibleItem
             * @param visibleItemCount
             * @param totalItemCount
             */
            @Override
            public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
                logUtils.d("onScroll");
            }
        });

    }

    /**
     * 按照账号查询数展示数据
     */
    private void queryUserName(String et_qury_name) {
        queyData.clear();
        if (querydata!=null){
            Iterator<performancCountsBean.DataBean> iterator = querydata.iterator();
            while (iterator.hasNext()){
                performancCountsBean.DataBean next = iterator.next();
                String operatorName = next.getOperatorName();
                if ( operatorName.contains(et_qury_name)){
                    queyData.add(next);
                }
            }
            updataUI(queyData);

        }else {
            ToastUtil.showToast(CountsActivity.this,"暂无数据...");
        }

    }

    @Override
    protected void initData() {
        queyData=new ArrayList();
       userNameData=new ArrayList();


        Date date = new Date();
        System.out.println(date.getTime());
        SimpleDateFormat smt = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String todayStr = smt.format(date);
        System.out.println(todayStr);

        Date beginDate = null;

        try {
            beginDate = smt.parse(todayStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        long time = beginDate.getTime();
        logUtils.d("点击返回按钮"+ time);
        long currentTime= System.currentTimeMillis();

        queryHistoryRecord(time, currentTime);
    }



    private void queryHistoryRecord(long time, long currentTime) {
        userNameData.clear();
        Retrofit retrofit = netUtils.getRetrofit();
        apiManager manager= retrofit.create(apiManager.class);
        String id = SharedUtils.getString("id");
        RequestBody requestBody = requestBodyUtils.queryCounts(time + "", currentTime+ "", id);
        Call<String> call = manager.findVisitRecordList(requestBody);
        call.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                try {
                    String body = response.body();
                    logUtils.d("数据查询"+ body);
                    Gson gson=new Gson();
                    performancCountsBean bean= gson.fromJson(body, new TypeToken<performancCountsBean>() {}.getType());
                    String statusID = bean.getStatusID();
                    if (statusID.equals("200")){
                       querydata= bean.getData();
                        if (querydata!=null){
                            Iterator<performancCountsBean.DataBean> iterator = querydata.iterator();
                            while (iterator.hasNext()){
                                performancCountsBean.DataBean next = iterator.next();
                                String operatorName = next.getOperatorName();

                                userNameData.add(operatorName);
                            }
                            updataUI(querydata);
                            tv_counts.setText("完成外访总数量："+querydata.size());

                            Map<String,Integer> map = new HashMap<>();

                            for (String string : userNameData) {
                                if(map.containsKey(string)) {
                                    map.put(string, map.get(string).intValue()+1);
                                }else {
                                    map.put(string, new Integer(1));
                                }
                            }

             /*               for (String temp : userNameData) {

                                Integer count = (Integer) map.get(temp);

                                map.put(temp, (count == null) ? 1 : count + 1);

                            }*/
                            logUtils.d("外访员"+ map);
                            tv_counts_people.setText("人员统计："+map);
                 /*           Iterator<String> iter = map.keySet().iterator();
                            while(iter.hasNext()) {
                                String key = iter.next();
                                System.out.println(key+"有"+map.get(key)+"个");
                                map.remove(key);
                            }*/

                        }else {
                            ToastUtil.showToast(CountsActivity.this,"暂无数据...");
                            tv_counts.setText("完成外访总数量："+0);
                        }
                    }
                } catch (JsonSyntaxException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                logUtils.d("数据查询失败"+ t.toString());
            }
        });
    }

    private void updataUI(List<performancCountsBean.DataBean>data) {
        adapter=new performancCountsAdapter(CountsActivity.this,data);
        lv_counts.setAdapter(adapter);
    }

    @Override
    protected void initLise() {
        EventBus.getDefault().register(CountsActivity.this);
    }



    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(CountsActivity.this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(EventMessage message){
        //接收到发布者发布的事件后，进行相应的处理操作
        switch (message.state){
            case MessageCode.START_TIME:
                startTime=message.time;
                Log.d("TAG","接收到开始时间数据"+message.time);
                break;
            case MessageCode.END_TIME:
                endTime=message.time;
                Log.d("TAG","接收到结束时间数据"+message.time);
                break;
        }
    }
}
