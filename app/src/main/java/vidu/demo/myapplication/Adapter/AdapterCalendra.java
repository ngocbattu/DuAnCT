package vidu.demo.myapplication.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.List;

import vidu.demo.myapplication.Model.Calendra;
import vidu.demo.myapplication.R;

public class AdapterCalendra  extends RecyclerView.Adapter<AdapterCalendra.ViewHodelCalendra>{


    private Context context;
    private List<Calendra> list;

    public AdapterCalendra(Context context, List<Calendra> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHodelCalendra onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from (context).inflate (R.layout.item_recy_calendra,null);
        return new ViewHodelCalendra (view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHodelCalendra holder, int position) {
        Calendra calendra = list.get (position);
        holder.txt_so_ngay_calendra.setText ("0"+calendra.getSo_ngay ()+"");
        holder.txt_thang.setText (calendra.getThang ());
        holder.txt_ngay_gio.setText (calendra.getNgayGio ());
        holder.txt_noi_dung.setText (calendra.getNoiDungCV ());
    }

    @Override
    public int getItemCount() {
        return list.size ();
    }

    class ViewHodelCalendra extends RecyclerView.ViewHolder {
        TextView txt_so_ngay_calendra , txt_thang , txt_noi_dung ,txt_ngay_gio;
        public ViewHodelCalendra(@NonNull View itemView) {
            super (itemView);
            txt_so_ngay_calendra =  itemView.findViewById (R.id.txt_so_ngay_calendra);
            txt_thang = itemView.findViewById (R.id.txt_thang_calendra);
            txt_ngay_gio = itemView.findViewById (R.id.txt_ngay_gio_calendra);
            txt_noi_dung = itemView.findViewById (R.id.txt_trang_thai_calendra);
        }
    }
}
