package com.example.uts_akb;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.uts_akb.entity.AdapterMusic;

import org.jetbrains.annotations.NotNull;
/*
Tanggal Pengerjaan  : 3 June 2021
Nim                 : 10118067
Nama                : Agus Awaludin
Kelas               : IF-2
 */

public class MusicVideoFragment extends Fragment {
    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_music_video, container, false);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view_music);
        AdapterMusic listAdapter = new AdapterMusic();
        recyclerView.setAdapter(listAdapter);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        return view;
    }
}
