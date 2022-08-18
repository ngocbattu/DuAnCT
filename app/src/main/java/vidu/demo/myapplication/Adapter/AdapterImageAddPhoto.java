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

import vidu.demo.myapplication.Model.AddPhoTo;
import vidu.demo.myapplication.R;

public class AdapterImageAddPhoto extends RecyclerView.Adapter<AdapterImageAddPhoto.ViewHodelAddPhoto>{
    private Context context;
    private List<AddPhoTo> list;

    public AdapterImageAddPhoto(Context context, List<AddPhoTo> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHodelAddPhoto onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_recy_add_photo,null);
        return new ViewHodelAddPhoto(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHodelAddPhoto holder, int position) {
        AddPhoTo phoTo = list.get(position);
        Glide.with(context).load(phoTo.getImage_add_photo()).into(holder.image_anh);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ViewHodelAddPhoto extends RecyclerView.ViewHolder {
        ImageView image_anh;
        public ViewHodelAddPhoto(@NonNull View itemView) {
            super(itemView);
            image_anh = itemView.findViewById(R.id.image_list_add_photo);
        }
    }
}
