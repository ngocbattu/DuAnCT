package vidu.demo.myapplication.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import vidu.demo.myapplication.FragmnetChucNang.CalendarFragment_add;
import vidu.demo.myapplication.FragmnetChucNang.GooglemapFragment_add;
import vidu.demo.myapplication.FragmnetChucNang.PhotoFragment_add;

public class AdapterChuNangAdd extends FragmentStateAdapter {
    public AdapterChuNangAdd(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0 :
                return new CalendarFragment_add();
            case 1:
                return new GooglemapFragment_add();
            case 2:
                return new PhotoFragment_add();
        }
        return null;
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
