package com.example.a1fo_khabiburrokhman_kreditmotor.ui.home.petugas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.a1fo_khabiburrokhman_kreditmotor.R;

import java.util.List;

public class PetugasAdapter extends ArrayAdapter<Petugas> {

    Context context;
    List<Petugas> arrayListPetugas;

    public PetugasAdapter(@NonNull Context context, List<Petugas> arrayListPetugas) {
        super(context, R.layout.custom_petugas_item, arrayListPetugas);

        this.context = context;
        this.arrayListPetugas = arrayListPetugas;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_petugas_item, null, true);

        TextView petugasUrut = view.findViewById(R.id.petugasUrut);
        TextView petugasNama = view.findViewById(R.id.petugasNama);
        TextView petugasJabatan = view.findViewById(R.id.petugasJabatan);

        petugasUrut.setText(arrayListPetugas.get(position).getId());
        petugasNama.setText(arrayListPetugas.get(position).getNama());
        petugasJabatan.setText(arrayListPetugas.get(position).getJabatan());

        return view;
    }
}
