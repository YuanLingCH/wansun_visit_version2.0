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
import wansun.visit.android.adapter.VisitAnnexPicturesAdapter;
import wansun.visit.android.api.apiManager;
import wansun.visit.android.bean.VisitAnnexPicturesBean;
import wansun.visit.android.global.AppConfig;
import wansun.visit.android.global.waifangApplication;
import wansun.visit.android.utils.logUtils;
import wansun.visit.android.utils.netUtils;

/**
 * 外访录音附件列表
 * Created by User on 2020/4/16.
 */

public class VisitAnnexLisitAudioFragment extends BaseFragment {
    ListView lv_visit_annex_audio;
    VisitAnnexPicturesAdapter adapter;
    List<VisitAnnexPicturesBean.DataBean>data;
    List  dataAudio;
    @Override
    protected int getLayoutId() {
        return R.layout.fragment_annex_audio;
    }

    @Override
    protected void initViews() {
        lv_visit_annex_audio=(ListView) root.findViewById(R.id.lv_visit_annex_audio);
    }

    @Override
    protected void initEvents() {

    }

    @Override
    protected void initData() {
        data=new ArrayList();
        dataAudio=new ArrayList();
        String caseCode = getActivity().getIntent().getStringExtra("caseCodeAnnex");
        logUtils.d("获取案件编号Fragment=======>"+caseCode);
        Retrofit retrofit = netUtils.getRetrofit();
        apiManager manager= retrofit.create(apiManager.class);
        //   RequestBody requestBody = requestBodyUtils.findVisitAnnex(caseCode);
        Call<String> call = manager.findAnnex(caseCode);
        data.clear();
        dataAudio.clear();
        call.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                try {
                    String body = response.body();
                    logUtils.d("查询录音数据=======>" + body);   //  http://192.168.166.133:8082/files

                    if (!TextUtils.isEmpty(body)) {
                        Gson gson = new Gson();
                        VisitAnnexPicturesBean bean = gson.fromJson(body, new TypeToken<VisitAnnexPicturesBean>() {
                        }.getType());
                        String statusID = bean.getStatusID();
                        if (AppConfig.SUCCESS.equals(statusID)) {
                            List<VisitAnnexPicturesBean.DataBean> beanlist = bean.getData();
                            Iterator<VisitAnnexPicturesBean.DataBean> iterator = beanlist.iterator();
                            while (iterator.hasNext()){
                                VisitAnnexPicturesBean.DataBean next = iterator.next();
                                if (next.getType().equals("录音文件")){
                                    dataAudio.add(next.getUrl());
                                    data.add(next);
                                }

                            }
                            updataUi();
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

    private void updataUi() {
        adapter=new VisitAnnexPicturesAdapter(waifangApplication.getContext(),data, AppConfig.VISIT_ANNEX_AUDIO,dataAudio);
        lv_visit_annex_audio.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}