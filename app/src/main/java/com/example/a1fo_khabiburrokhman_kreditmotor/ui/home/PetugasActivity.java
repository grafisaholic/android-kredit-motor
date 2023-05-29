package com.example.a1fo_khabiburrokhman_kreditmotor.ui.home;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.example.a1fo_khabiburrokhman_kreditmotor.R;
import com.example.a1fo_khabiburrokhman_kreditmotor.ui.home.petugas.AddPetugas;
import com.example.a1fo_khabiburrokhman_kreditmotor.ui.home.petugas.Petugas;
import com.example.a1fo_khabiburrokhman_kreditmotor.ui.home.petugas.PetugasAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class PetugasActivity extends AppCompatActivity {
    ListView listPetugas;
    PetugasAdapter adapter;
    Petugas petugas;
    public static ArrayList<Petugas> petugasArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_petugas);

        getSupportActionBar().setTitle("Data Petugas");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        FloatingActionButton btnAddPetugas = findViewById(R.id.addPetugas);
        btnAddPetugas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PetugasActivity.this, AddPetugas.class);
                startActivity(i);
            }
        });

        // LIST VIEW PETUGAS
        listPetugas = findViewById(R.id.listPetugas);
        adapter = new PetugasAdapter(this, petugasArrayList);
        listPetugas.setAdapter(adapter);

        retrievePetugas();

    }

    private void retrievePetugas() {
        petugasArrayList.clear();

        for (int i = 0; i < 12; i++) {
            petugas = new Petugas(String.valueOf(i), "Petugas " + i, "SALES", "", "");
            petugasArrayList.add(petugas);

            adapter.notifyDataSetChanged();
        }
    }
}