package vidu.demo.myapplication.Acitvity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

import vidu.demo.myapplication.Adapter.AdapterCalendra;
import vidu.demo.myapplication.FragMent.ProfileFragment;
import vidu.demo.myapplication.Model.Calendra;
import vidu.demo.myapplication.R;

public class FavouritesActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;
    AdapterCalendra adapterCalendra;
    ArrayList<Calendra> arrayList;
    Toolbar toolbar ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_favourites);
        mRecyclerView = findViewById (R.id.recy_Favourites);
        toolbar = findViewById (R.id.toolbar_Favourites);
        mRecyclerView.setLayoutManager (new LinearLayoutManager (FavouritesActivity.this,LinearLayoutManager.VERTICAL,false));
        arrayList = new ArrayList<> ();
        arrayList.add (new Calendra (1,03,"JAN"," Tuesday, 11:30 AM ","A slow but sure start."));
        arrayList.add (new Calendra (2,02,"JAN"," Monday, 11:30 AM ","First working day of the new…"));
        arrayList.add (new Calendra (2,01,"JAN"," Sunday, 12:30 AM ","tow working day of the new…"));
        adapterCalendra = new AdapterCalendra (FavouritesActivity.this,arrayList);
        mRecyclerView.setAdapter (adapterCalendra);

        setSupportActionBar (toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.icon_back);
        getSupportActionBar ().setTitle ("");
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case android.R.id.home:
                onBackPressed();
                return true;

            default:break;
        }

        return super.onOptionsItemSelected(item);
    }
}