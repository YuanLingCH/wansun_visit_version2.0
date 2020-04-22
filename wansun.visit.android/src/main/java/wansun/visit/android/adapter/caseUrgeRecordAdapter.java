package wansun.visit.android.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

import wansun.visit.android.R;
import wansun.visit.android.bean.collectionRrecordsBean;
import wansun.visit.android.utils.unixTime;

import static wansun.visit.android.R.id.tv_case_rege_measure;
import static wansun.visit.android.R.id.tv_case_return_money_state;

/**
 * 案件电话详细adapter
 * Created by User on 2019/1/11.
 */

public class caseUrgeRecordAdapter extends BaseAdapter {
    Context mconext;
    List<collectionRrecordsBean> data;
    LayoutInflater inflater;

    public caseUrgeRecordAdapter(Context mconext, List <collectionRrecordsBean>data) {
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
            holder.tv_case_rege_measure= (TextView) convertView.findViewById(tv_case_rege_measure);
            holder.ll_return_check= (LinearLayout) convertView.findViewById(R.id.ll_return_check);
            holder.ll_return_check.setVisibility(View.VISIBLE);
            holder.tv_case_rege_vertify_data= (TextView) convertView.findViewById(R.id.tv_case_rege_vertify_data);
            holder.tv_case_return_money_state= (TextView) convertView.findViewById(tv_case_return_money_state);
            holder.tv_case_return_remark= (TextView) convertView.findViewById(R.id.tv_case_return_remark);
            convertView.setTag(holder);

        }

        collectionRrecordsBean urgeRecord  = data.get(position);
        holder= (ViewHolder) convertView.getTag();
        holder.tv_case_rege_promise_amount.setText("催收对象："+urgeRecord.getName());
        long promiseDate = urgeRecord.getCreateDate()/1000;
        String promiseTime= unixTime.stampToTime(promiseDate );
        if (promiseDate==0){
            holder.tv_case_rege_promise_date.setText("添加时间："+ "暂时无时间");
        }else {
            holder.tv_case_rege_promise_date.setText("添加时间："+ promiseTime);
        }
        holder.tv_case_rege_operate_type_decoration.setText("号码："+urgeRecord.getPhone());
        holder.tv_case_return_remark.setVisibility(View.VISIBLE);
        holder.tv_case_return_remark.setText("地址："+urgeRecord.getAddress());

        String urgeTypeName = urgeRecord.getUrgeTypeName();
        holder.tv_case_rege_operate_date.setText("催收类型："+ urgeTypeName);
        if (urgeTypeName.equals("电催")){
            holder.tv_case_rege_operate_date.setTextColor(Color.BLUE);
        }else if (urgeTypeName.equals("外访")){
            holder.tv_case_rege_operate_date.setTextColor(Color.GREEN);
        }else if (urgeTypeName.equals("信函")){
            holder.tv_case_rege_operate_date.setTextColor(Color.RED);
        }
        holder.tv_case_rege_measure.setText("催收类容："+urgeRecord.getCallRecords());
        holder.tv_case_rege_operator.setText("电话接通总结："+urgeRecord.getContactSummaryText());
        holder.tv_case_rege_vertify_data.setText("联系结果："+urgeRecord.getContactResultText());
        holder.tv_case_return_money_state.setVisibility(View.VISIBLE);
       // holder.tv_case_return_money_state.setText("备注:"+urgeRecord.getRemark());
        return convertView;
    }
    class  ViewHolder {
        TextView tv_case_rege_promise_amount,tv_case_rege_promise_date,tv_case_rege_operate_type_decoration,tv_case_rege_operate_object_content;
        TextView tv_case_rege_operate_date,tv_case_rege_operator,tv_case_rege_measure,tv_case_rege_vertify_data,tv_case_return_money_state,tv_case_return_remark;
        LinearLayout ll_return_check;

    }

}
