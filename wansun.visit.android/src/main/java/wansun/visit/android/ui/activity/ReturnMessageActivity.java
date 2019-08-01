package wansun.visit.android.ui.activity;

import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import wansun.visit.android.R;
import wansun.visit.android.adapter.returnMessagedAdapter;
import wansun.visit.android.bean.caseAllDetailBean;
import wansun.visit.android.utils.logUtils;

/**
 * Created by User on 2019/7/24.
 */

public class ReturnMessageActivity  extends BaseActivity{
    ImageView iv_visit_back;
    TextView tv_visit_tobar;
    ListView lv_follow_message;
    List<caseAllDetailBean.DataBean.UrgeItemsBean.UrgePhoneItemsBean.PromisePaymentItemsBean> data;
    returnMessagedAdapter adapter;
    @Override
    protected int getLayoutId() {
        return R.layout.activity_follow_message;
    }

    @Override
    protected void initView() {
        iv_visit_back= (ImageView) findViewById(R.id.iv_visit_back);
        tv_visit_tobar= (TextView) findViewById(R.id.tv_visit_tobar);
        tv_visit_tobar.setText("回款信息");
        lv_follow_message= (ListView) findViewById(R.id.lv_follow_message);
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
    }

    @Override
    protected void initData() {
        data=new ArrayList<>();
        data.clear();
        List<caseAllDetailBean.DataBean.UrgeItemsBean.UrgePhoneItemsBean.PromisePaymentItemsBean> followMessage = (List) getIntent().getSerializableExtra("returnMessage");
        Iterator iterator = followMessage.iterator();
        while (iterator.hasNext()){
            caseAllDetailBean.DataBean.UrgeItemsBean.UrgePhoneItemsBean.PromisePaymentItemsBean next = (caseAllDetailBean.DataBean.UrgeItemsBean.UrgePhoneItemsBean.PromisePaymentItemsBean) iterator.next();
            logUtils.d(next.getOperatorName());
            data.add(next);
        }
        updataUI();
    }

    private void updataUI() {
      adapter=new  returnMessagedAdapter(ReturnMessageActivity.this,data);
       lv_follow_message.setAdapter(adapter);

    }

    @Override
    protected void initLise() {

    }
}
