package ru.room108.dmitry.uskov.pojrat;

import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ImageSpan;

import java.util.ArrayList;

import ru.room108.dmitry.uskov.pojrat.animation.FallingAnimation;
import ru.room108.dmitry.uskov.pojrat.fragments.AbstractMyFragment;
import ru.room108.dmitry.uskov.pojrat.fragments.FirstFragment;
import ru.room108.dmitry.uskov.pojrat.fragments.SecondFragment;
import ru.room108.dmitry.uskov.pojrat.fragments.ThirdFragment;
import ru.room108.dmitry.uskov.pojrat.view.sliding.SlidingTabLayout;

public class MainActivity extends AppCompatActivity {

    public static final int ICON_SIZE = 55;

    private static final int ANIMATION_DURATION = 10000;

    private static final int ANIMATION_RESPOUN = 3000;

    private static final int MAX_COUNT_ITEMS_ANIMATION_ON_DISPLAY = 5;

    private ViewPager mViewPager;

    private MyPagerAdapter adapter;

    private ArrayList<AbstractMyFragment> fragments;

    private SlidingTabLayout mSlidingTabLayout;

    private int[] imagesForAnimation = {
            R.drawable.potato1,
            R.drawable.potato2,
            R.drawable.potato3,
            R.drawable.potato4,
            R.drawable.potato5,
            R.drawable.potato6,
    };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mViewPager= (ViewPager)findViewById(R.id.main_pager);
        fragments = new ArrayList<AbstractMyFragment>();
        fragments.add(new FirstFragment(this));
        fragments.add(new SecondFragment(this));
        fragments.add(new ThirdFragment(this));
        adapter = new MyPagerAdapter(getSupportFragmentManager(), fragments);
        mViewPager.setAdapter(adapter);

        mSlidingTabLayout = (SlidingTabLayout)findViewById(R.id.sliding_tabs);

        mSlidingTabLayout.setCustomTabColorizer(new SlidingTabLayout.TabColorizer() {
            @Override
            public int getIndicatorColor(int position) {
                return getResources().getColor(R.color.slodong_indicator);
            }

        });

        mSlidingTabLayout.setDistributeEvenly(true);

        mSlidingTabLayout.setCustomTabView(R.layout.custom_tab_view, R.id.tabText);

        mSlidingTabLayout.setViewPager(mViewPager);


        startAnimation();

    }

    private void startAnimation() {
        new FallingAnimation(this, R.id.main_layout, ANIMATION_DURATION, ANIMATION_RESPOUN, MAX_COUNT_ITEMS_ANIMATION_ON_DISPLAY, imagesForAnimation).start();
    }

    private class MyPagerAdapter extends FragmentPagerAdapter   {

        int[] icons;

        ArrayList<AbstractMyFragment> fragments;

        public MyPagerAdapter(FragmentManager fm, ArrayList<AbstractMyFragment> fragments) {
            super(fm);
            this.fragments = fragments;
            icons = new int[fragments.size()];
            for(int i=0; i<icons.length; i++){
                icons[i]=fragments.get(i).getIconId();
            }
        }

        @Override
        public Fragment getItem(int i) {
            return fragments.get(i);
        }

        @Override
        public int getCount() {
            return fragments.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            Drawable drawable = getResources().getDrawable(icons[position]);
            drawable.setBounds(0, 0, ICON_SIZE, ICON_SIZE);
            ImageSpan imageSpan = new ImageSpan(drawable);
            SpannableString spannableString = new SpannableString("     ");
            spannableString.setSpan(imageSpan, 0, spannableString.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
            return spannableString;
        }

    }

}
