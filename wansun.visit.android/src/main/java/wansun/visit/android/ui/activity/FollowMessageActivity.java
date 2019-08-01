package wansun.visit.android.ui.activity;

import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import wansun.visit.android.R;
import wansun.visit.android.adapter.followMessagedAdapter;
import wansun.visit.android.bean.caseAllDetailBean;
import wansun.visit.android.utils.logUtils;

/**
 *
 * 跟进信息记录
 * Created by User on 2019/7/23.
 */

public class FollowMessageActivity extends BaseActivity {
    ImageView iv_visit_back;
    TextView tv_visit_tobar;
    followMessagedAdapter adapter;
    ListView lv_follow_message;
    List<caseAllDetailBean.DataBean.CaseFollowMessageItemsBean > data;
    @Override
    protected int getLayoutId() {
        return R.layout.activity_follow_message;
    }

    @Override
    protected void initView() {
        iv_visit_back= (ImageView) findViewById(R.id.iv_visit_back);
        tv_visit_tobar= (TextView) findViewById(R.id.tv_visit_tobar);
        tv_visit_tobar.setText("跟进信息记录");
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
        List <caseAllDetailBean.DataBean.CaseFollowMessageItemsBean > followMessage = (List) getIntent().getSerializableExtra("followMessage");
        Iterator iterator = followMessage.iterator();
        while (iterator.hasNext()){
            caseAllDetailBean.DataBean.CaseFollowMessageItemsBean next = (caseAllDetailBean.DataBean.CaseFollowMessageItemsBean) iterator.next();
            logUtils.d(next.getOperatorName());
            data.add(next);
        }
        updataUI();
    }

    private void updataUI() {
        adapter=new followMessagedAdapter(FollowMessageActivity.this,data);
        lv_follow_message.setAdapter(adapter);

    }

    @Override
    protected void initLise() {

    }
}
