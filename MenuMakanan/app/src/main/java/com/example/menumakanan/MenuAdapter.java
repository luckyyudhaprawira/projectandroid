package com.example.menumakanan;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MenuViewHolder> {

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
