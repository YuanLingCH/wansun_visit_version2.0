package wansun.visit.android.ui.fragment;

import android.text.TextUtils;
import android.widget.ListView;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import wansun.visit.android.R;
import wansun.visit.android.adapter.VisitAnnexUrgeAdapter;
import wansun.visit.android.api.apiManager;
import wansun.visit.android.bean.VisitAnnexUrgeBean;
import wansun.visit.android.global.AppConfig;
import wansun.visit.android.global.waifangApplication;
import wansun.visit.android.utils.logUtils;
import wansun.visit.android.utils.netUtils;

/**
 * 外访催记附件列表
 * Created by User on 2020/4/16.
 */

public class VisitAnnexLisitUrgeFragment extends BaseFragment {
    List<VisitAnnexUrgeBean.DataBean.UrgeRecordsBean> dataUrge;
    VisitAnnexUrgeAdapter adapter;
    ListView lv_annex_urge;
    @Override
    protected int getLayoutId() {
        return R.layout.fragment_annex_urge;
    }

    @Override
    protected void initViews() {
        lv_annex_urge=(ListView) root.findViewById(R.id.lv_annex_urge);

    }

    @Override
    protected void initEvents() {

    }

    @Override
    protected void initData() {
        dataUrge=new ArrayList<>();
        String caseCode = getActivity().getIntent().getStringExtra("caseCodeAnnex");
        logUtils.d("获取案件编号Fragment=======>"+caseCode);
        Retrofit retrofit = netUtils.getRetrofit();
        apiManager manager= retrofit.create(apiManager.class);
        //   RequestBody requestBody = requestBodyUtils.findVisitAnnex(caseCode);
        Call<String> call = manager.findVisitRecord(caseCode);
        dataUrge.clear();
        call.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                try {
                    String body = response.body();
                    logUtils.d("查询全部数据=======>" + body);   //  http://192.168.166.133:8082/files

                    if (!TextUtils.isEmpty(body)) {
                        Gson gson = new Gson();
                        VisitAnnexUrgeBean bean = gson.fromJson(body, new TypeToken<VisitAnnexUrgeBean>() {
                        }.getType());
                        String statusID = bean.getStatusID();
                        if (AppConfig.SUCCESS.equals(statusID)) {
                            VisitAnnexUrgeBean.DataBean data = bean.getData();
                            List<VisitAnnexUrgeBean.DataBean.UrgeRecordsBean> urgeRecords = data.getUrgeRecords();
                            Iterator<VisitAnnexUrgeBean.DataBean.UrgeRecordsBean> iterator = urgeRecords.iterator();
                            while (iterator.hasNext()){
                                VisitAnnexUrgeBean.DataBean.UrgeRecordsBean next = iterator.next();
                                dataUrge.add(next);
                            }
                            updataUI();
                        }


                    }
                } catch (JsonSyntaxException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                logUtils.d("查询数据失败=======>"+t.toString());
            }
        });
    }

    private void updataUI() {
        adapter=new VisitAnnexUrgeAdapter(waifangApplication.getContext(),dataUrge);
        lv_annex_urge.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }
}
