package vidu.demo.myapplication.FragMent;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

import vidu.demo.myapplication.Adapter.AdapterNgayLamViec;
import vidu.demo.myapplication.Model.NgayCongViec;
import vidu.demo.myapplication.R;

public class HomeFragment extends Fragment {

    RecyclerView mRecyclerView;
    ArrayList<NgayCongViec> arrayList;
    AdapterNgayLamViec adapterNgayLamViec;

    public HomeFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate (R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated (view, savedInstanceState);
        // Write a message to the database
        mRecyclerView = view.findViewById (R.id.recy_home_day);
        mRecyclerView.setHasFixedSize (true);
        mRecyclerView.setLayoutManager (new LinearLayoutManager (getActivity (),RecyclerView.HORIZONTAL,false));
        arrayList = new ArrayList<> ();
        arrayList.add (new NgayCongViec (1,3,"TUE","A slow but sure\n" +
                "start."));
        arrayList.add (new NgayCongViec (2,2,"MON","First working day\n" +
                "of the new year!"));
        arrayList.add (new NgayCongViec (3,1,"SUN","What a way to\n" +
                "start the year :)"));
        adapterNgayLamViec = new AdapterNgayLamViec (getActivity (),arrayList);
        mRecyclerView.setAdapter (adapterNgayLamViec);
    }


}