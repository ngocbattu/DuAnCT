package vidu.demo.myapplication.Adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

import vidu.demo.myapplication.InterFace.ItemClick;
import vidu.demo.myapplication.Model.Calendra;
import vidu.demo.myapplication.Model.IconProfile;
import vidu.demo.myapplication.R;

public class AdapterIconProfile extends RecyclerView.Adapter<AdapterIconProfile.ViewHodelProfile>{
    private Context context;
    private List<IconProfile> list;
    private ItemClick itemClick;

    public AdapterIconProfile(Context context, List<IconProfile> list, ItemClick itemClick) {
        this.context = context;
        this.list = list;
        this.itemClick = itemClick;
    }

    @NonNull
    @Override
    public ViewHodelProfile onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from (context).inflate (R.layout.item_recy_proflie,null);
        return new ViewHodelProfile (view);
    }

    @SuppressLint("RecyclerView")
    @Override
    public void onBindViewHolder(@NonNull ViewHodelProfile holder, int position) {
        IconProfile profile = list.get (position);
        Glide.with (context).load (profile.getImageProflie ()).into (holder.image_chuc_nang);
        holder.ten_chuc_nang.setText (profile.getTenProflie ());
        holder.clickItem.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                switch (position){
                    case 0 :
                        itemClick.ClickFavourites ();
                        break;
                    case 1:
                        itemClick.ClickMyMap ();
                        break;
                    case 2:
                        itemClick.ClickDrafts ();
                        break;
                    case 3:
                        itemClick.ClickPhotos ();
                        break;
                    case 4:
                        itemClick.ClickVideos ();
                        break;
                    case 5:
                        itemClick.CickStatics ();
                        break;
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size ();
    }

    class ViewHodelProfile extends RecyclerView.ViewHolder {
        ImageView image_chuc_nang;
        TextView ten_chuc_nang;
        ConstraintLayout clickItem;
        public ViewHodelProfile(@NonNull View itemView) {
            super (itemView);
            image_chuc_nang = itemView.findViewById (R.id.image_icon_profile);
            ten_chuc_nang = itemView.findViewById (R.id.txt_ten_chuc_nang);
            clickItem = itemView.findViewById (R.id.contrain_6);
        }
    }
}
