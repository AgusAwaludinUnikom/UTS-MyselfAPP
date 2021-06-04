package com.example.uts_akb;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.uts_akb.entity.LocalImages;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
/*
Tanggal Pengerjaan  : 3 June 2021
Nim                 : 10118067
Nama                : Agus Awaludin
Kelas               : IF-2
 */
public class GalleryFragment extends Fragment {
    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_favorite, container, false);
        setupRecyclerView(view);
        return view;
    }
    private void setupRecyclerView(View view) {
        ArrayList<LocalImages> data = new ArrayList<>();

        data.add(new LocalImages(R.drawable.matoi));
        data.add(new LocalImages(R.drawable.alma));
        data.add(new LocalImages(R.drawable.echo));
        data.add(new LocalImages(R.drawable.annete));
        data.add(new LocalImages(R.drawable.gene));
        data.add(new LocalImages(R.drawable.pso));
        data.add(new LocalImages(R.drawable.klee));
        data.add(new LocalImages(R.drawable.axu));
        data.add(new LocalImages(R.drawable.anone));
        data.add(new LocalImages(R.drawable.lumine));


        RecyclerView rvFavorite = view.findViewById(R.id.rv_favorite);
        LocalImageAdapter adapter = new LocalImageAdapter(data, getContext());
        rvFavorite.setHasFixedSize(true);
        rvFavorite.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        rvFavorite.setLayoutManager(new GridLayoutManager(getContext(), 2));
    }
}
