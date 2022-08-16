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

import vidu.demo.myapplication.Adapter.AdapterCalendra;
import vidu.demo.myapplication.Model.Calendra;
import vidu.demo.myapplication.R;


public class CalendarFragment extends Fragment {

    RecyclerView mRecyclerView;
    AdapterCalendra adapterCalendra;
    ArrayList<Calendra> arrayList;

    public CalendarFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate (R.layout.fragment_calendar, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated (view, savedInstanceState);
        mRecyclerView = view.findViewById (R.id.recy_calenfra);
        mRecyclerView.setLayoutManager (new LinearLayoutManager (getActivity (),LinearLayoutManager.VERTICAL,false));
        arrayList = new ArrayList<> ();
        arrayList.add (new Calendra (1,03,"JAN"," Tuesday, 11:30 AM ","A slow but sure start."));
        adapterCalendra = new AdapterCalendra (getContext (),arrayList);
        mRecyclerView.setAdapter (adapterCalendra);

    }
}