package wansun.visit.android.ui.activity;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import wansun.visit.android.R;
import wansun.visit.android.adapter.BaseFragmentPagerAdapter;
import wansun.visit.android.ui.fragment.VisitAnnexLisitAudioFragment;
import wansun.visit.android.ui.fragment.VisitAnnexLisitPicturesFragment;
import wansun.visit.android.ui.fragment.VisitAnnexLisitUrgeFragment;
import wansun.visit.android.utils.logUtils;

/**
 *
 * 案件的外访催记  录音  图片
 * Created by User on 2020/4/16.
 */

public class VisitAnnexActivity extends BaseActivity {
    ImageView iv_visit_back;
    TextView tv_visit_tobar;
    private TabLayout tabLayout;
    ViewPager vp;
    @Override
    protected int getLayoutId() {
        return R.layout.activity_visit_annex;
    }

    @Override
    protected void initView() {
        iv_visit_back= (ImageView) findViewById(R.id.iv_visit_back);
        tv_visit_tobar= (TextView) findViewById(R.id.tv_visit_tobar);
        tv_visit_tobar.setText("文件列表");
        tabLayout= (TabLayout) findViewById(R.id.tab);
        vp= (ViewPager) findViewById(R.id.vp);
        tabLayout.addTab(tabLayout.newTab().setText("外访录音列表"));
        tabLayout.addTab(tabLayout.newTab().setText("外访图片列表"));
        tabLayout.addTab(tabLayout.newTab().setText("外访催记列表"));

        tabLayout.setTabMode(TabLayout.MODE_FIXED);
        List<Fragment> list = new ArrayList<>();
        list.add(new VisitAnnexLisitAudioFragment());
        list.add(new VisitAnnexLisitPicturesFragment());
        list.add(new VisitAnnexLisitUrgeFragment());

        // Fragment嵌套Fragment传入FragmentManager用getChildFragmentManager()
        BaseFragmentPagerAdapter pagerAdapter = new BaseFragmentPagerAdapter(
                getSupportFragmentManager(), list);
        vp.setAdapter(pagerAdapter);
    }

    @Override
    protected void initEvent() {
        iv_visit_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                logUtils.d("点击返回按钮");
                overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right);
            }
        });

        vp.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                //让TabLayout和ViewPager联动
                tabLayout.getTabAt(position).select();
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                //让viewPager和TabLayout联动
                vp.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initLise() {

    }
}
