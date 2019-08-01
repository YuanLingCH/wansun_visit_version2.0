package wansun.visit.android.ui.activity;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import wansun.visit.android.R;
import wansun.visit.android.adapter.caseVisitRecordAdapter;
import wansun.visit.android.bean.caseAllDetailBean;
import wansun.visit.android.utils.ToastUtil;
import wansun.visit.android.utils.logUtils;

/**
 * Created by User on 2019/2/21.
 */

public class CaseVisitRecordAcitvity extends BaseActivity {
    ImageView iv_visit_back;
    TextView tv_visit_tobar,tv_ff;
    caseVisitRecordAdapter adapter;
    List<caseAllDetailBean.DataBean.UrgeItemsBean.UrgeVisitItemsBean> recordData;
    ListView lv_case_urge_visit_record;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_case_ugre_record;
    }

    @Override
    protected void initView() {
        iv_visit_back= (ImageView) findViewById(R.id.iv_visit_back);
        tv_visit_tobar= (TextView) findViewById(R.id.tv_visit_tobar);
        lv_case_urge_visit_record= (ListView) findViewById(R.id.lv_case_urge_visit_record);
        tv_visit_tobar.setText("外访记录");
        tv_ff= (TextView) findViewById(R.id.tv_ff);
        tv_ff.setVisibility(View.VISIBLE);
        getIntentData();
    }

   private void getIntentData() {
       recordData=new ArrayList();
       recordData.clear();

       List<caseAllDetailBean.DataBean.UrgeItemsBean.UrgeVisitItemsBean> urgeVisitItems = (List) getIntent().getSerializableExtra("urgeVisitItems");
       Iterator<caseAllDetailBean.DataBean.UrgeItemsBean.UrgeVisitItemsBean> iterator = urgeVisitItems.iterator();
       while (iterator.hasNext()){
           caseAllDetailBean.DataBean.UrgeItemsBean.UrgeVisitItemsBean next = iterator.next();
           String applicantName = next.getApplicantName();
           logUtils.d("外访记录"+applicantName);
           recordData.add(next);
       }
       updataUI();



    }

    private void updataUI() {
       adapter=new caseVisitRecordAdapter(CaseVisitRecordAcitvity.this,recordData);
      lv_case_urge_visit_record.setAdapter(adapter);



    }

    @Override
    protected void initEvent() {
        iv_visit_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right);  //左边进去 右边出来
            }
        });
        lv_case_urge_visit_record.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                caseAllDetailBean.DataBean.UrgeItemsBean.UrgeVisitItemsBean  bean = recordData.get(position);
                String address = bean.getAddress();
                logUtils.d("外访地址"+address);
                List<caseAllDetailBean.DataBean.UrgeItemsBean.UrgeVisitItemsBean.VisitRecordItemsBean> visitRecordItems = bean.getVisitRecordItems();
                try {
                    if (visitRecordItems.size()>0&&visitRecordItems!=null) {
                            Intent intent =new Intent(CaseVisitRecordAcitvity.this,VisitDetailRecordActivity.class);
                        intent.putExtra("visitRecordItems", (Serializable) visitRecordItems);
                        startActivity(intent);
                        overridePendingTransition(R.anim.in_from_right,R.anim.out_to_left);
                    }else {
                        ToastUtil.showToast(CaseVisitRecordAcitvity.this,"暂无数据...");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    new Throwable("空数据");
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
}
