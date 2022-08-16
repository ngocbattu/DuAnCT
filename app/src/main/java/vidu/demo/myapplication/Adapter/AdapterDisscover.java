package vidu.demo.myapplication.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

import vidu.demo.myapplication.Model.Discover;
import vidu.demo.myapplication.R;

public class AdapterDisscover extends RecyclerView.Adapter<AdapterDisscover.ViewHodelDisscover>{

    private Context context;
    private List<Discover> list;

    public AdapterDisscover(Context context, List<Discover> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHodelDisscover onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from (context).inflate (R.layout.item_recy_discover,null);
        return new ViewHodelDisscover (view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHodelDisscover holder, int position) {
        Discover discover = list.get (position);

        Glide.with (context).load (discover.getImage ()).into (holder.image_avt);
        holder.txt_noi_dung.setText (discover.getNoiDung ());
        holder.txt_ten_gio.setText (discover.getGioVaTen ());
    }

    @Override
    public int getItemCount() {
        return list.size ();
    }

    class ViewHodelDisscover extends RecyclerView.ViewHolder{
        ImageView image_avt ;
        TextView txt_noi_dung , txt_ten_gio;
        public ViewHodelDisscover(@NonNull View itemView) {
            super (itemView);
            image_avt = itemView.findViewById (R.id.image_avt);
            txt_noi_dung = itemView.findViewById (R.id.txt_noi_dung_disscover);
            txt_ten_gio = itemView.findViewById (R.id.txt_gio_ten_disscover);

        }
    }
}
