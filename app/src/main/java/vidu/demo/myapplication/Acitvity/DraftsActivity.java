package vidu.demo.myapplication.Acitvity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;

import java.util.ArrayList;

import vidu.demo.myapplication.Adapter.AdapterCalendra;
import vidu.demo.myapplication.Model.Calendra;
import vidu.demo.myapplication.R;

public class DraftsActivity extends AppCompatActivity {
    Toolbar toolbar ;
    RecyclerView mRecyclerView;
    ArrayList<Calendra> arrayList;
    AdapterCalendra adapterCalendra;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drafts);
        toolbar = findViewById(R.id.toolbar_drafts);
        mRecyclerView = findViewById(R.id.recy_view_drafts);
        setSupportActionBar (toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.icon_back);
        getSupportActionBar ().setTitle ("");
        arrayList = new ArrayList<>();
        arrayList.add (new Calendra (1,03,"JAN"," Tuesday, 11:30 AM ","A slow but sure start."));
        arrayList.add (new Calendra (2,02,"JAN"," Monday, 11:30 AM ","First working day of the new…"));
        arrayList.add (new Calendra (2,01,"JAN"," Sunday, 12:30 AM ","tow working day of the new…"));
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        adapterCalendra = new AdapterCalendra(this,arrayList);
        mRecyclerView.setAdapter(adapterCalendra);

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