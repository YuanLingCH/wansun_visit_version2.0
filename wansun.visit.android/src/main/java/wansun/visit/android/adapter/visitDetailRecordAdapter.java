package wansun.visit.android.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import wansun.visit.android.R;
import wansun.visit.android.bean.caseAllDetailBean;
import wansun.visit.android.utils.unixTime;

/**
 * 外访记录adapter
 * Created by User on 2019/1/11.
 */

public class visitDetailRecordAdapter extends BaseAdapter {
    Context mconext;
    List<caseAllDetailBean.DataBean.UrgeItemsBean.UrgeVisitItemsBean.VisitRecordItemsBean> data;
    LayoutInflater inflater;

    public visitDetailRecordAdapter(Context mconext, List <caseAllDetailBean.DataBean.UrgeItemsBean.UrgeVisitItemsBean.VisitRecordItemsBean>data) {
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
            convertView= inflater.inflate(R.layout.urge_record_item,parent,false);
            holder.tv_case_rege_promise_amount= (TextView) convertView.findViewById(R.id.tv_case_rege_promise_amount);
            holder.tv_case_rege_promise_date= (TextView) convertView.findViewById(R.id.tv_case_rege_promise_date);
            holder.tv_case_rege_operate_type_decoration= (TextView) convertView.findViewById(R.id.tv_case_rege_operate_type_decoration);
            holder.tv_case_rege_operate_object_content= (TextView) convertView.findViewById(R.id.tv_case_rege_operate_object_content);
            holder.tv_case_rege_operate_date= (TextView) convertView.findViewById(R.id.tv_case_rege_operate_date);
            holder.tv_case_rege_operator= (TextView) convertView.findViewById(R.id.tv_case_rege_operator);
            holder.tv_case_rege_measure= (TextView) convertView.findViewById(R.id.tv_case_rege_measure);
            convertView.setTag(holder);

        }

        caseAllDetailBean.DataBean.UrgeItemsBean.UrgeVisitItemsBean.VisitRecordItemsBean urgeRecord  = data.get(position);
        holder= (ViewHolder) convertView.getTag();
        holder.tv_case_rege_promise_amount.setText("操作类型："+urgeRecord.getOperateTypeText());
        long promiseDate = urgeRecord.getOperateTime()/1000;
        String promiseTime= unixTime.stampToTime(promiseDate );
        if (promiseDate==0){
            holder.tv_case_rege_promise_date.setText("操作时间："+ "暂时时间");
        }else {
            holder.tv_case_rege_promise_date.setText("操作时间："+ promiseTime);
        }
        holder.tv_case_rege_operate_type_decoration.setText("操作人："+urgeRecord.getOperatorName());
        holder.tv_case_rege_measure.setText("操作类容："+urgeRecord.getOperateContent());
        return convertView;
    }
    class  ViewHolder {
        TextView tv_case_rege_promise_amount,tv_case_rege_promise_date,tv_case_rege_operate_type_decoration,tv_case_rege_operate_object_content;
        TextView tv_case_rege_operate_date,tv_case_rege_operator,tv_case_rege_measure;

    }

}
