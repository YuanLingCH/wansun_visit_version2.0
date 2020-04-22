package wansun.visit.android.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import wansun.visit.android.R;
import wansun.visit.android.bean.VisitAnnexUrgeBean;
import wansun.visit.android.utils.unixTime;

/**
 * Created by User on 2019/1/11.
 */

public class VisitAnnexUrgeAdapter extends BaseAdapter {
    Context mconext;
    List<VisitAnnexUrgeBean.DataBean.UrgeRecordsBean> data;
    LayoutInflater inflater;

    public VisitAnnexUrgeAdapter(Context mconext, List <VisitAnnexUrgeBean.DataBean.UrgeRecordsBean>data) {
        this.mconext = mconext;
        this.data = data;
        inflater=LayoutInflater.from(mconext);
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView==null){
            holder=new ViewHolder();
            convertView= inflater.inflate(R.layout.visit_annex_urge,parent,false);
            holder.tv_annex_name= (TextView) convertView.findViewById(R.id.tv_annex_name);
            holder.tv_annex_time= (TextView) convertView.findViewById(R.id.tv_annex_time);
            holder.tv_urge= (TextView) convertView.findViewById(R.id.tv_urge);
            convertView.setTag(holder);

        }
            holder= (ViewHolder) convertView.getTag();
        VisitAnnexUrgeBean.DataBean.UrgeRecordsBean urgeRecordsBean = data.get(position);

            holder.tv_annex_name.setText("管理员:"+urgeRecordsBean.getOperatorName());
            holder.tv_annex_time.setText("外访时间:"+ unixTime.getStrTime(urgeRecordsBean.getOperateTime()+""));
            holder.tv_urge.setText("催记:"+urgeRecordsBean.getOperateContent());



        return convertView;
    }
    class  ViewHolder {
        TextView tv_annex_name,tv_annex_time,tv_urge;

    }

}
