package wansun.visit.android.adapter;

import android.content.Context;
import android.graphics.Color;
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
 * 案件详细外访记录adapter
 * Created by User on 2019/1/11.
 */

public class caseVisitRecordAdapter extends BaseAdapter {
    Context mconext;
    List<caseAllDetailBean.DataBean.UrgeItemsBean.UrgeVisitItemsBean> data;
    LayoutInflater inflater;

    public caseVisitRecordAdapter(Context mconext, List <caseAllDetailBean.DataBean.UrgeItemsBean.UrgeVisitItemsBean>data) {
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
            convertView= inflater.inflate(R.layout.case_visit_record_item,parent,false);
            holder.tv_case_visit_operate_type_text= (TextView) convertView.findViewById(R.id.tv_case_visit_operate_type_text);
            holder.tv_case_visit_operator_name= (TextView) convertView.findViewById(R.id.tv_case_visit_operator_name);
            holder.tv_case_case_operate_time= (TextView) convertView.findViewById(R.id.tv_case_case_operate_time);
            holder.tv_case_operate_operate_content= (TextView) convertView.findViewById(R.id.tv_case_operate_operate_content);
            holder.tv_case_visit_people= (TextView) convertView.findViewById(R.id.tv_case_visit_people);
            holder.tv_case_visit_account= (TextView) convertView.findViewById(R.id.tv_case_visit_account);
            holder.tv_case_visit_apply_time= (TextView) convertView.findViewById(R.id.tv_case_visit_apply_time);
            holder.tv_case_visit_end_time= (TextView) convertView.findViewById(R.id.tv_case_visit_end_time);
            holder.tv_case_operate_operate_visit_address= (TextView) convertView.findViewById(R.id.tv_case_operate_operate_visit_address);
            holder.tv_case_operate_operate_visit_goal= (TextView) convertView.findViewById(R.id.tv_case_operate_operate_visit_goal);
            holder.tv_case_operate_operate_remark= (TextView) convertView.findViewById(R.id.tv_case_operate_operate_remark);
            convertView.setTag(holder);

        }

        caseAllDetailBean.DataBean.UrgeItemsBean.UrgeVisitItemsBean Bean = data.get(position);
        holder= (ViewHolder) convertView.getTag();
        holder.tv_case_visit_operate_type_text.setText("访问对象名字："+Bean.getVisitObjectName());
        holder.tv_case_visit_operator_name.setText("外访机构："+Bean.getVisitOrgName());
     //   long operateTime = Bean.getOperateTime()/1000;
      //  String promiseTime= unixTime.stampToTime(operateTime);

        holder.tv_case_case_operate_time.setText("外访员:"+Bean.getVisitors());
        holder.tv_case_operate_operate_content.setText("外访员账号:"+Bean.getVisitorsName());
        holder.tv_case_visit_account.setText("与债务人关系："+Bean.getRelationText());
        holder.tv_case_visit_people.setText("外访状态："+Bean.getVisitStatusText());
        long visitEndTime = Bean.getVisitEndTime()/1000;
        String visitEndTimeData= unixTime.stampToTime(visitEndTime);
        holder.tv_case_visit_end_time.setText("结束时间:"+ visitEndTimeData);
        long visitBegTime = Bean.getVisitBeginTime()/1000;
        String visitBegTimeData= unixTime.stampToTime(visitBegTime);
        holder.tv_case_visit_apply_time.setText("开始时间:"+ visitBegTimeData);
        holder.tv_case_operate_operate_visit_address.setText("外访地址:"+Bean.getAddress());
        holder.tv_case_operate_operate_visit_address.setTextColor(Color.RED);
        holder.tv_case_operate_operate_visit_goal.setText("外访目标:"+Bean.getVisitGoal());
        holder.tv_case_operate_operate_remark.setText("备注:"+Bean.getRemark());
        holder.tv_case_operate_operate_visit_goal.setTextColor(Color.GREEN);
        List<caseAllDetailBean.DataBean.UrgeItemsBean.UrgeVisitItemsBean.VisitRecordItemsBean> visitRecordItems = Bean.getVisitRecordItems();

        return convertView;
    }
    class  ViewHolder {
        TextView tv_case_visit_operate_type_text,tv_case_visit_operator_name,tv_case_case_operate_time,tv_case_operate_operate_content;
        TextView tv_case_visit_people,tv_case_visit_account,tv_case_visit_apply_time,tv_case_visit_end_time;
        TextView tv_case_operate_operate_visit_address,tv_case_operate_operate_visit_goal,tv_case_operate_operate_remark;

    }

}
