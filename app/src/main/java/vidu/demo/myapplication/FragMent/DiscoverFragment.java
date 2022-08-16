package vidu.demo.myapplication.FragMent;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import vidu.demo.myapplication.Adapter.AdapterDisscover;
import vidu.demo.myapplication.Model.Discover;
import vidu.demo.myapplication.R;


public class DiscoverFragment extends Fragment {

    RecyclerView mRecyclerView;
    ArrayList<Discover> arrayList;
    AdapterDisscover adapterDisscover;


    public DiscoverFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate (R.layout.fragment_discover, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated (view, savedInstanceState);
        mRecyclerView = view.findViewById (R.id.recy_discover);
        mRecyclerView.setHasFixedSize (true);
        mRecyclerView.setLayoutManager (new LinearLayoutManager (getActivity (),LinearLayoutManager.VERTICAL,false));
        arrayList = new ArrayList<> ();
        arrayList.add (new Discover (1,R.drawable.oval3,"Soaring in the Destiny","03:02PM  |" +
                "Christina Munoz"));
        arrayList.add (new Discover (2,R.drawable.oval2,"Lets all be unique together","02:27PM  |" +
                "Jerry Powers"));
        arrayList.add (new Discover (3,R.drawable.oval1,"Sometimes, all you need to do…","02:46AM  |" +
                "Ellen Beck"));
        arrayList.add (new Discover (4,R.drawable.oval4,"A slow but sure start.","09:29 AM  |" +
                "Adele McKenzie"));
        arrayList.add (new Discover (5,R.drawable.oval5,"What was the person thinking…","09:29 AM  |" +
                "Garrett Jordan"));
        adapterDisscover = new AdapterDisscover (getActivity (),arrayList);
        mRecyclerView.setAdapter (adapterDisscover);
        adapterDisscover.notifyDataSetChanged ();

    }
}