package vidu.demo.myapplication.FragMent;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;

import vidu.demo.myapplication.Acitvity.FavouritesActivity;
import vidu.demo.myapplication.Acitvity.PhotosActivity;
import vidu.demo.myapplication.Adapter.AdapterIconProfile;
import vidu.demo.myapplication.InterFace.ItemClick;
import vidu.demo.myapplication.Model.Calendra;
import vidu.demo.myapplication.Model.IconProfile;
import vidu.demo.myapplication.R;


public class ProfileFragment extends Fragment {

    RecyclerView mRecyclerView;
    ArrayList<IconProfile> arrayList;
    AdapterIconProfile adapterIconProfile;

    public ProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate (R.layout.fragment_profile, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated (view, savedInstanceState);
        mRecyclerView = view.findViewById (R.id.recy_proflie);
        mRecyclerView.setHasFixedSize (true);
        mRecyclerView.setLayoutManager (new GridLayoutManager (getActivity (),3));
        arrayList = new ArrayList<> ();
        arrayList.add (new IconProfile (1,R.drawable.ic_favorite,"Favourites"));
        arrayList.add (new IconProfile (2,R.drawable.mymap,"My Map"));
        arrayList.add (new IconProfile (3,R.drawable.ic_drafts,"Drafts"));
        arrayList.add (new IconProfile (4,R.drawable.ic_photo,"Photos"));
        arrayList.add (new IconProfile (5,R.drawable.ic_video,"Videos"));
        arrayList.add (new IconProfile (6,R.drawable.ic_statics,"Statics"));
        adapterIconProfile = new AdapterIconProfile (getActivity (), arrayList, new ItemClick () {
            @Override
            public void ClickFavourites() {
                startActivity (new Intent (getActivity (), FavouritesActivity.class));
                Toast.makeText (getActivity (), "ClickFavourites", Toast.LENGTH_SHORT).show ();
            }

            @Override
            public void ClickMyMap() {
                Toast.makeText (getActivity (), "ClickMyMap", Toast.LENGTH_SHORT).show ();
            }

            @Override
            public void ClickDrafts() {
                Toast.makeText (getActivity (), "ClickDrafts", Toast.LENGTH_SHORT).show ();
            }

            @Override
            public void ClickPhotos() {
                startActivity (new Intent (getActivity (), PhotosActivity.class));
                Toast.makeText (getActivity (), "ClickPhotos", Toast.LENGTH_SHORT).show ();
            }

            @Override
            public void ClickVideos() {
                Toast.makeText (getActivity (), "ClickVideos", Toast.LENGTH_SHORT).show ();
            }

            @Override
            public void CickStatics() {
                Toast.makeText (getActivity (), "CickStatics", Toast.LENGTH_SHORT).show ();
            }
        });
        mRecyclerView.setAdapter (adapterIconProfile);
        adapterIconProfile.notifyDataSetChanged ();
    }
}