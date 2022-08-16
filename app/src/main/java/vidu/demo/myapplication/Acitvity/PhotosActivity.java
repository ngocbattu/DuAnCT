package vidu.demo.myapplication.Acitvity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;

import java.util.ArrayList;

import vidu.demo.myapplication.Adapter.AdapterPhotos;
import vidu.demo.myapplication.Model.Photos;
import vidu.demo.myapplication.R;

public class PhotosActivity extends AppCompatActivity {
    Toolbar toolbar;
    RecyclerView mRecyclerView;
    ArrayList<Photos> arrayList;
    AdapterPhotos adapterPhotos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_photos);
        toolbar = findViewById (R.id.toolbar_Photos);
        mRecyclerView = findViewById (R.id.recy_Photos);
        setSupportActionBar (toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.icon_back);
        getSupportActionBar ().setTitle ("");

        arrayList = new ArrayList<> ();
        arrayList.add (new Photos (1,R.drawable.photo1));
        arrayList.add (new Photos (2,R.drawable.photo2));
        arrayList.add (new Photos (3,R.drawable.photo3));
        arrayList.add (new Photos (4,R.drawable.photo4));
        arrayList.add (new Photos (5,R.drawable.photo5));
        adapterPhotos = new AdapterPhotos (this,arrayList);
        mRecyclerView.setLayoutManager (new GridLayoutManager (this,2));
        mRecyclerView.setAdapter (adapterPhotos);
        adapterPhotos.notifyDataSetChanged ();

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