package wansun.visit.android.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

import wansun.visit.android.R;
import wansun.visit.android.bean.performancCountsBean;
import wansun.visit.android.utils.unixTime;

/**
 * 案件文件查询adapter
 * Created by User on 2019/1/11.
 */

public class performancCountsAdapter extends BaseAdapter {
    Context mconext;
    private List<performancCountsBean.DataBean> data ;
    LayoutInflater inflater;
    ListView lv;
    public performancCountsAdapter(Context mconext, List<performancCountsBean.DataBean> data) {
        this.mconext = mconext;
        this.data = data;
        inflater=LayoutInflater.from(mconext);


    }

    private void updateUI() {
        this.notifyDataSetChanged();
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
            convertView= inflater.inflate(R.layout.performanc_count_item,parent,false);
            holder.tvAttachmentFullName= (TextView) convertView.findViewById(R.id.tvAttachmentFullName);
            holder.tvAttachmentType= (TextView) convertView.findViewById(R.id.tvAttachmentType);
            holder.tvAttachmentTakeOperateDate= (TextView) convertView.findViewById(R.id.tvAttachmentTakeOperateDate);
            holder.tv_address= (TextView) convertView.findViewById(R.id.tv_address);
            holder.tv_debtor= (TextView) convertView.findViewById(R.id.tv_debtor);

            convertView.setTag(holder);
        }else {
            holder= (ViewHolder) convertView.getTag();

        }
        performancCountsBean.DataBean bean = data.get(position);
              holder.tvAttachmentTakeOperateDate.setText("外访员："+bean.getOperatorName());

        String operateTime= unixTime.stampToTime(bean.getOperateTime()/1000 );
        holder.tvAttachmentType.setText("外访时间："+ operateTime);
        holder.tvAttachmentFullName.setText("案件编号:"+bean.getCaseCode());
        holder.tv_address.setText("地址："+bean.getGpsAddress());
        holder.tv_debtor.setText("债务人："+bean.getVisitObjectName());
        return convertView;
    }
    class  ViewHolder {

        TextView tvAttachmentFullName,tvAttachmentType,tvAttachmentTakeOperateDate,tv_address,tv_debtor;

    }

}
