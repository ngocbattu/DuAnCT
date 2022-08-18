package vidu.demo.myapplication.FragMent;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
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
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.GoogleApiActivity;

import java.util.ArrayList;

import vidu.demo.myapplication.Acitvity.DraftsActivity;
import vidu.demo.myapplication.Acitvity.FavouritesActivity;
import vidu.demo.myapplication.Acitvity.GoogleMapActivity;
import vidu.demo.myapplication.Acitvity.PhotosActivity;
import vidu.demo.myapplication.Adapter.AdapterIconProfile;
import vidu.demo.myapplication.Adapter.ImageConverter;
import vidu.demo.myapplication.InterFace.ItemClick;
import vidu.demo.myapplication.Model.IconProfile;
import vidu.demo.myapplication.R;


public class ProfileFragment extends Fragment {

    RecyclerView mRecyclerView;
    ArrayList<IconProfile> arrayList;
    AdapterIconProfile adapterIconProfile;
    GoogleSignInClient googleSignInClient;
    GoogleSignInOptions googleSignInOptions;
    ImageView image_Anh;
    TextView txt_ten,txt_email;


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
        image_Anh = view.findViewById(R.id.image_anh_profile);
        txt_ten = view.findViewById(R.id.txt_ten_profile);
        txt_email = view.findViewById(R.id.txt_email_profile);
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
                startActivity(new Intent(getActivity(), GoogleMapActivity.class));
                Toast.makeText (getActivity (), "ClickMyMap", Toast.LENGTH_SHORT).show ();
            }

            @Override
            public void ClickDrafts() {
                startActivity(new Intent(getActivity(), DraftsActivity.class));
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
        GetGG();
        BitMapp();

    }
    public void GetGG(){
        googleSignInOptions = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail().build();
        googleSignInClient = GoogleSignIn.getClient(getActivity(),googleSignInOptions);

        GoogleSignInAccount account = GoogleSignIn.getLastSignedInAccount(getActivity());
        if(account != null ){
            Uri anh = account.getPhotoUrl();
            String ten = account.getDisplayName();
            String email = account.getEmail();

            Glide.with(getActivity()).load(anh).into(image_Anh);
            txt_ten.setText(ten);
            txt_email.setText(email);
        }
    }
    public void BitMapp(){
        Bitmap bitmap = BitmapFactory.decodeResource(this.getResources(), R.drawable.img_placeholder);
        Bitmap circularBitmap = ImageConverter.getRoundedCornerBitmap(bitmap, 100);

        image_Anh.setImageBitmap(circularBitmap);
    }
}