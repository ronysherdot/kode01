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
    private int adat3;
    int galeri1[] = {
            R.drawable.upacara1, R.drawable.upacara2, R.drawable.tarian1, R.drawable.tarian2, R.drawable.rumah_adat1, R.drawable.rumah_adat2,R.drawable.rumahadat3, R.drawable.pakaian_adat1, R.drawable.pakaian_adat2, R.drawable.pakaian_adat3, R.drawable.pakaian_adat4, R.drawable.pakaian_adat5, R.drawable.alat_musik1, R.drawable.alat_musik2, R.drawable.alat_musik3
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
