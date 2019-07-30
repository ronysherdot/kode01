package com.android.budayaende;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

public class FotoActivity extends Fragment {

    GridView gridView;
    int galeri1[] = {
            R.drawable.example1, R.drawable.example2, R.drawable.example1
    };

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_foto, container, false);

        gridView = view.findViewById(R.id.gridFoto1);
        FotoAdapter fotoAdapter = new FotoAdapter(view.getContext(), galeri1);
        gridView.setAdapter(fotoAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent detail = new Intent(view.getContext(), FotoDetailActivity.class);
                detail.putExtra("image", galeri1[i]);
                startActivity(detail);
            }
        });

        return view;
    }
}
