package vidu.demo.myapplication.Acitvity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import vidu.demo.myapplication.R;

public class ChucNangFloataddActivity extends AppCompatActivity {
    FloatingActionButton floatingActionButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_chuc_nang_floatadd);
        floatingActionButton = findViewById (R.id.float_close);
        floatingActionButton.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (ChucNangFloataddActivity.this,TrangChuActivity.class));
            }
        });
    }
}