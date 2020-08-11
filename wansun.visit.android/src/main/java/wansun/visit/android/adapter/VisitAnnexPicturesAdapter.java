package wansun.visit.android.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import wansun.visit.android.R;
import wansun.visit.android.bean.VisitAnnexPicturesBean;
import wansun.visit.android.global.AppConfig;
import wansun.visit.android.ui.activity.playPictureAndVideoActivity;
import wansun.visit.android.utils.logUtils;

import static wansun.visit.android.R.id.ll_annex_audio;

/**
 * Created by User on 2019/1/11.
 */

public class VisitAnnexPicturesAdapter extends BaseAdapter {
    Context mconext;
    List<VisitAnnexPicturesBean.DataBean> data;
    LayoutInflater inflater;
    String typeAnnex;
    List dataPicture;
    public VisitAnnexPicturesAdapter(Context mconext, List<VisitAnnexPicturesBean.DataBean> data,String typeAnnex,List dataPicture) {
        this.mconext = mconext;
        this.data = data;
        this.typeAnnex=typeAnnex;
        this.dataPicture=dataPicture;
        inflater=LayoutInflater.from(mconext);
    }

    @Override
    public int getCount() {
        return dataPicture.size();
    }

    @Override
    public Object getItem(int position) {
        return dataPicture.get(position);
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
            convertView= inflater.inflate(R.layout.visit_annex_picture,parent,false);
            holder.visit_annex_img= (ImageView) convertView.findViewById(R.id.visit_annex_img);
            holder.iv_audio_icon=(ImageView) convertView.findViewById(R.id.iv_audio_icon);
            holder.tv_url=(TextView) convertView.findViewById(R.id.tv_url);
            holder.ll_annex_audio=(LinearLayout) convertView.findViewById(ll_annex_audio);
            convertView.setTag(holder);

        }
            holder= (ViewHolder) convertView.getTag();
        VisitAnnexPicturesBean.DataBean dataBean = data.get(position);
        final String newUrl = (String) dataPicture.get(position);
        String type = dataBean.getType();
        if (type.equals("照片")){
            if (typeAnnex.equals(AppConfig.VISIT_ANNEX_PICTURE)){
                holder.visit_annex_img.setVisibility(View.VISIBLE);
                holder.ll_annex_audio.setVisibility(View.INVISIBLE);

                final ViewHolder finalHolder = holder;
             //   String urlone="http://192.168.66.52:8082/case/writerPicture?timestamp=1594276620951&caseCode=AFF-20191127-001-000008&annexId=81c2cc95-33bf-4c8e-8ceb-8109d3d54d40&sign=5b8e31fbe5f90daae34a2036450b263d&token=f2f507707dad47e88c80f0c3bd2de33e";

                    Glide.with(mconext).load(newUrl).into(finalHolder.visit_annex_img);


                logUtils.d("newUrl=======>"+newUrl);

            }
        } else if (type.equals("录音文件")){
            if (typeAnnex.equals(AppConfig.VISIT_ANNEX_AUDIO))
            holder.ll_annex_audio.setVisibility(View.VISIBLE);
            holder.visit_annex_img.setVisibility(View.INVISIBLE);
            holder.tv_url.setText(dataBean.getName());
            VisitAnnexPicturesBean.DataBean dataBean1 = data.get(position);

            holder.ll_annex_audio.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(mconext,playPictureAndVideoActivity.class);
                    intent.putExtra("path",newUrl);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    mconext.startActivity(intent);
                }
            });
        }



        return convertView;
    }
    class  ViewHolder {
        ImageView visit_annex_img,iv_audio_icon;
        LinearLayout ll_annex_audio;
        TextView tv_url;


    }

}
