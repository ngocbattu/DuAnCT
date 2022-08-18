package vidu.demo.myapplication.FragmnetChucNang;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

import vidu.demo.myapplication.Acitvity.ChucNangFloataddActivity;
import vidu.demo.myapplication.Adapter.AdapterImageAddPhoto;
import vidu.demo.myapplication.Model.AddPhoTo;
import vidu.demo.myapplication.R;


public class PhotoFragment_add extends Fragment {
    ImageView image_close_photo;
    RecyclerView mRecyclerView;
    AdapterImageAddPhoto adapterImageAddPhoto;
    ArrayList<AddPhoTo> arrayList;
    public PhotoFragment_add() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        image_close_photo = view.findViewById(R.id.image_close_photo);
        mRecyclerView = view.findViewById(R.id.recy_view_photo_add);
        image_close_photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), ChucNangFloataddActivity.class));
            }
        });
        arrayList = new ArrayList<>();
        arrayList.add(new AddPhoTo(1,R.drawable.listanh1));
        arrayList.add(new AddPhoTo(2,R.drawable.listanh2));
        arrayList.add(new AddPhoTo(3,R.drawable.listanh3));
        arrayList.add(new AddPhoTo(4,R.drawable.listanh4));
        arrayList.add(new AddPhoTo(5,R.drawable.listanh5));
        arrayList.add(new AddPhoTo(6,R.drawable.listanh7));
        arrayList.add(new AddPhoTo(7,R.drawable.listanh8));
        arrayList.add(new AddPhoTo(8,R.drawable.listanh9));
        arrayList.add(new AddPhoTo(9,R.drawable.listanh10));
        adapterImageAddPhoto = new AdapterImageAddPhoto(getActivity(),arrayList);
        mRecyclerView.setLayoutManager(new GridLayoutManager(getActivity(),3));
        mRecyclerView.setAdapter(adapterImageAddPhoto);
        adapterImageAddPhoto.notifyDataSetChanged();
    }
}