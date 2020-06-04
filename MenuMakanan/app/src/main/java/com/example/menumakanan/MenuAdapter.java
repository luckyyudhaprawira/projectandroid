package com.example.menumakanan;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MenuViewHolder> {
    private Context context;
    private ArrayList<Menu> menus;

    public MenuAdapter (Context mcontext, ArrayList<Menu> menumakanan){
        context=mcontext;
        menus=menumakanan;

    }

    @NonNull
    @Override
    public MenuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MenuViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MenuViewHolder extends RecyclerView.ViewHolder {
        public ImageView imdata;
        public TextView tvhargadata;
        public TextView tvnamadata;

        public MenuViewHolder(@NonNull View itemView) {
            imdata= itemView.findViewById(R.id.img_menu);
            tvhargadata= itemView.findViewById(R.id.tv_harga);
            tvnamadata= itemView.findViewById(R.id.tv_nama);





            super(itemView);
        }
    }

}
