package vidu.demo.myapplication.Acitvity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationBarView;

import vidu.demo.myapplication.Adapter.AdapterChuNangAdd;
import vidu.demo.myapplication.R;

public class ChucNangFloataddActivity extends AppCompatActivity {
    FloatingActionButton floatingActionButton;
    AdapterChuNangAdd adapterChuNangAdd;
    ViewPager2 mViewPager2;
    ConstraintLayout constraintLayout;
    ImageView image_calendar , image_map , image_photo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_chuc_nang_floatadd);
        Init();
        floatingActionButton.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (ChucNangFloataddActivity.this,TrangChuActivity.class));
            }
        });
        adapterChuNangAdd = new AdapterChuNangAdd(this);
        mViewPager2.setAdapter(adapterChuNangAdd);
        constraintLayout.setVisibility(View.GONE);

        image_calendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mViewPager2.setCurrentItem(0);
                constraintLayout.setVisibility(View.VISIBLE);
            }
        });
        image_map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mViewPager2.setCurrentItem(1);
                constraintLayout.setVisibility(View.VISIBLE);
            }
        });
        image_photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mViewPager2.setCurrentItem(2);
                constraintLayout.setVisibility(View.VISIBLE);
            }
        });

    }
    public void Init(){
        mViewPager2 = findViewById(R.id.viewpage_chuc_nang_add);
        floatingActionButton = findViewById (R.id.float_close);
        constraintLayout = findViewById(R.id.contrain12);
        image_calendar = findViewById(R.id.image_calendar_add);
        image_map = findViewById(R.id.image_map_add);
        image_photo = findViewById(R.id.image_photo_add);
    }
}