package wansun.visit.android.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

import wansun.visit.android.R;
import wansun.visit.android.bean.caseAllDetailBean;
import wansun.visit.android.utils.unixTime;

import static wansun.visit.android.R.id.tv_case_rege_operator;

/**
 * 案件电话详细adapter
 * Created by User on 2019/1/11.
 */

public class returnMessagedAdapter extends BaseAdapter {
    Context mconext;
    List<caseAllDetailBean.DataBean.UrgeItemsBean.UrgePhoneItemsBean.PromisePaymentItemsBean> data;
    LayoutInflater inflater;

    public returnMessagedAdapter(Context mconext, List <caseAllDetailBean.DataBean.UrgeItemsBean.UrgePhoneItemsBean.PromisePaymentItemsBean>data) {
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
            holder.tv_case_rege_operator= (TextView) convertView.findViewById(tv_case_rege_operator);
            holder.tv_case_rege_measure= (TextView) convertView.findViewById(R.id.tv_case_rege_measure);
            holder.ll_return_check=(LinearLayout) convertView.findViewById(R.id.ll_return_check);
            holder.tv_case_rege_vertify_data= (TextView) convertView.findViewById(R.id.tv_case_rege_vertify_data);
            holder.tv_case_check_data= (TextView) convertView.findViewById(R.id.tv_case_check_data);
            holder.ll_return_check_time= (LinearLayout) convertView.findViewById(R.id.ll_return_check_time);
            holder.tv_case_rege_check_time= (TextView) convertView.findViewById(R.id.tv_case_rege_check_time);
            holder.tv_case_check_people= (TextView) convertView.findViewById(R.id.tv_case_check_people);
            holder.ll_return_apply= (LinearLayout) convertView.findViewById(R.id.ll_return_apply);
            holder.tv_case_rege_apply_data= (TextView) convertView.findViewById(R.id.tv_case_rege_apply_data);
            holder.tv_case_apply_people= (TextView) convertView.findViewById(R.id.tv_case_apply_people);
            holder.tv_case_return_money_state= (TextView) convertView.findViewById(R.id.tv_case_return_money_state);
            convertView.setTag(holder);

        }

        caseAllDetailBean.DataBean.UrgeItemsBean.UrgePhoneItemsBean.PromisePaymentItemsBean urgeRecord  = data.get(position);
        holder= (ViewHolder) convertView.getTag();
        holder.tv_case_rege_promise_amount.setText("承诺还款金额："+urgeRecord.getPromisePaymentAmount());
      //  long promiseDate = urgeRecord.getCreateDate()/1000;
       // String promiseTime= unixTime.stampToTime(promiseDate );
        holder.tv_case_rege_promise_date.setText("操作人："+ urgeRecord.getOperatorName());

        long promisePaymentDate = urgeRecord.getPromisePaymentDate()/1000;
        String promiseTime= unixTime.stampToTime(promisePaymentDate);
        if (promisePaymentDate==0){
            holder.tv_case_rege_operate_type_decoration.setText("还款日期："+ "暂无承诺");
        }else {
            holder.tv_case_rege_operate_type_decoration.setText("还款日期："+ promiseTime);
        }
        long promiseDate = urgeRecord.getPromiseDate()/1000;
        String promiseDateTime= unixTime.stampToTime(promiseDate);
        if (promiseDate==0){
            holder.tv_case_rege_operate_object_content.setText("操作时间："+ "暂无承诺");
        }else {
            holder.tv_case_rege_operate_object_content.setText("操作时间："+ promiseDateTime);
        }
        holder.tv_case_rege_operate_date.setText("核实金额："+urgeRecord.getConfirmAmount());
        holder.tv_case_rege_operator.setText("核实人："+urgeRecord.getConfirmPersonName());
        long confirmDate = urgeRecord.getConfirmDate()/1000;
        String confirmDateTime= unixTime.stampToTime(confirmDate);
        holder.ll_return_check.setVisibility(View.VISIBLE);

        if (confirmDate==0){
            holder.tv_case_rege_vertify_data.setText("核实日期："+ "暂无时间");
        }else {
            holder.tv_case_rege_vertify_data.setText("核实日期："+ confirmDateTime);
        }
        holder.tv_case_check_data.setText("检查付款金额："+urgeRecord.getCheckAmount());
        holder.ll_return_check_time.setVisibility(View.VISIBLE);
        long checkDate = urgeRecord.getCheckDate()/1000;
        String checkDateTime= unixTime.stampToTime(checkDate);
        if (checkDate==0){
            holder.tv_case_rege_check_time.setText("检查时间："+ "暂无时间");
        }else {
            holder.tv_case_rege_check_time.setText("检查时间："+ checkDateTime);
        }
        holder.tv_case_check_people.setText("检查人："+urgeRecord.getCheckPersonName());
        holder.ll_return_apply.setVisibility(View.VISIBLE);
        long applicationCheckAccountDate = urgeRecord.getApplicationCheckAccountDate()/1000;
        String applicationCheckAccountDateTime= unixTime.stampToTime(applicationCheckAccountDate);
        if (applicationCheckAccountDate==0){
            holder.tv_case_rege_apply_data.setText("对账申请时间:"+ "暂无时间");
        }else {
            holder.tv_case_rege_apply_data.setText("对账申请时间:"+ applicationCheckAccountDateTime);
        }
        holder.tv_case_apply_people.setText("对账申请人:"+urgeRecord.getApplicationPersonName());
        holder.tv_case_return_money_state.setVisibility(View.VISIBLE);
        holder.tv_case_return_money_state.setText("承诺还款状态:"+urgeRecord.getPromiseStatusText());
        holder.tv_case_rege_measure.setText("卡号："+urgeRecord.getCardNo());

        return convertView;
    }
    class  ViewHolder {
        TextView tv_case_rege_promise_amount,tv_case_rege_promise_date,tv_case_rege_operate_type_decoration,tv_case_rege_operate_object_content;
        TextView tv_case_rege_operate_date,tv_case_rege_operator,tv_case_rege_measure,tv_case_rege_vertify_data,tv_case_check_data;
        TextView tv_case_rege_check_time,tv_case_check_people,tv_case_rege_apply_data,tv_case_apply_people,tv_case_return_money_state;
        LinearLayout ll_return_check,ll_return_check_time,ll_return_apply;
    }

}
