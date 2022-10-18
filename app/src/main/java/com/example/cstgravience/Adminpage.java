package com.example.cstgravience;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.widget.TableLayout;

import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class Adminpage extends AppCompatActivity {
    ViewPager2 viewPager2;
    TabLayout tabLayout;
    myadapter myadapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_adminpage);

        viewPager2=findViewById(R.id.viewpage);
        tabLayout=findViewById(R.id.tablayout);
        myadapter=new myadapter(this);
        viewPager2.setAdapter(myadapter);

        BadgeDrawable badgeDrawableA = tabLayout.getTabAt(0).getOrCreateBadge();
        badgeDrawableA.setVisible(true);
        badgeDrawableA.setNumber(5);

        BadgeDrawable badgeDrawableH = tabLayout.getTabAt(1).getOrCreateBadge();
        badgeDrawableH.setVisible(true);
        badgeDrawableH.setNumber(6);

        BadgeDrawable badgeDrawableP = tabLayout.getTabAt(2).getOrCreateBadge();
        badgeDrawableP.setVisible(true);
        badgeDrawableP.setNumber(9);

        BadgeDrawable badgeDrawableO= tabLayout.getTabAt(3).getOrCreateBadge();
        badgeDrawableO.setVisible(true);
        badgeDrawableO.setNumber(12);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager2.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }


        });

viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        super.onPageScrolled(position, positionOffset, positionOffsetPixels);
        tabLayout.getTabAt(position).select();


    }

});


    }


}