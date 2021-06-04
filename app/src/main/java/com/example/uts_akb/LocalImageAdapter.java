package com.example.uts_akb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.uts_akb.entity.LocalImages;

import java.util.ArrayList;
import java.util.List;
/*
Tanggal Pengerjaan  : 3 June 2021
Nim                 : 10118067
Nama                : Agus Awaludin
Kelas               : IF-2
 */
public class LocalImageAdapter extends RecyclerView.Adapter<LocalImageAdapter.Holder> {

    private List<LocalImages> images;
    private Context context;

    LocalImageAdapter(ArrayList<LocalImages> images, Context context) {
        this.images = images;
        this.context = context;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_image, parent, false);
        context = parent.getContext();
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        LocalImages allData = images.get(position);
        holder.bind(allData);
    }

    @Override
    public int getItemCount() {
        return images.size();
    }

    static class Holder extends RecyclerView.ViewHolder {
        Holder(@NonNull View itemView) {
            super(itemView);
        }

        void bind(LocalImages allData) {
            ImageView ivLocal = itemView.findViewById(R.id.iv_animal);
            ivLocal.setImageResource(allData.imageId);
        }
    }
}
