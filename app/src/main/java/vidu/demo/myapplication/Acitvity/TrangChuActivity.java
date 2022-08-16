package vidu.demo.myapplication.Acitvity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationBarView;

import vidu.demo.myapplication.Adapter.AdapterTrangChuActivity;
import vidu.demo.myapplication.R;

public class TrangChuActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    ViewPager2 mViewPager2;
    AdapterTrangChuActivity adapterTrangChuActivity;
    FloatingActionButton floatingActionButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_trang_chu);
        bottomNavigationView = findViewById (R.id.bottom_navigation);
        floatingActionButton = findViewById (R.id.float_bottom_add);
        mViewPager2 = findViewById (R.id.view_page2);
        adapterTrangChuActivity = new AdapterTrangChuActivity (this);
        mViewPager2.setAdapter (adapterTrangChuActivity);

        bottomNavigationView.setOnItemSelectedListener (new NavigationBarView.OnItemSelectedListener () {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId ()){
                    case R.id.item_home:
                        mViewPager2.setCurrentItem (0);
                        break;
                    case R.id.item_lich:
                        mViewPager2.setCurrentItem (1);
                        break;
                    case R.id.item_discover:
                        mViewPager2.setCurrentItem (2);
                        break;
                    case R.id.item_ca_nhan:
                        mViewPager2.setCurrentItem (3);
                        break;
                }
                return true;
            }
        });
        floatingActionButton.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (TrangChuActivity.this,ChucNangFloataddActivity.class));
            }
        });

    }
}