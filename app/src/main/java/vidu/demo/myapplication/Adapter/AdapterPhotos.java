package vidu.demo.myapplication.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

import vidu.demo.myapplication.Model.Photos;
import vidu.demo.myapplication.R;

public class AdapterPhotos extends RecyclerView.Adapter<AdapterPhotos.ViewHodelPhotos>{
    private Context context;
    private List<Photos> list;

    public AdapterPhotos(Context context, List<Photos> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHodelPhotos onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from (context).inflate (R.layout.item_recy_photos,null);
        return new ViewHodelPhotos (view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHodelPhotos holder, int position) {
        Photos photos = list.get (position);
        Glide.with (context).load (photos.getImage_list_photo ()).into (holder.imageView);
    }

    @Override
    public int getItemCount() {
        return list.size ();
    }

    class ViewHodelPhotos extends RecyclerView.ViewHolder {
        ImageView imageView;
        public ViewHodelPhotos(@NonNull View itemView) {
            super (itemView);
            imageView = itemView.findViewById (R.id.image_list_photo);
        }
    }
}
