package wansun.visit.android.ui.activity;

import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import wansun.visit.android.R;
import wansun.visit.android.adapter.CaseAddressAdapter;
import wansun.visit.android.bean.caseAddressBean;
import wansun.visit.android.utils.logUtils;

/**
 * 案件地址信息
 * Created by User on 2019/7/25.
 */

public class CaseAddressActivity extends BaseActivity {
    ImageView iv_visit_back;
    TextView tv_visit_tobar;

    ListView lv_follow_message;
    List<caseAddressBean> data;
    CaseAddressAdapter adapter;
    @Override
    protected int getLayoutId() {
        return R.layout.activity_follow_message;
    }

    @Override
    protected void initView() {
        iv_visit_back= (ImageView) findViewById(R.id.iv_visit_back);
        tv_visit_tobar= (TextView) findViewById(R.id.tv_visit_tobar);
        tv_visit_tobar.setText("案件地址");
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
            //  caseAddress
        data=new ArrayList<>();
        data.clear();
        List<caseAddressBean>  caseAddress = (List) getIntent().getSerializableExtra("caseAddress");

        Iterator<caseAddressBean> iterator = caseAddress.iterator();
        while (iterator.hasNext()){
            caseAddressBean next = iterator.next();
            String address1 = next.getAddress1();
            logUtils.d("地址："+ address1);
            data.add(next);
        }
        updataUI();

    }

    private void updataUI() {
        adapter=new CaseAddressAdapter(this,data);
        lv_follow_message.setAdapter(adapter);
    }

    @Override
    protected void initLise() {

    }
}
