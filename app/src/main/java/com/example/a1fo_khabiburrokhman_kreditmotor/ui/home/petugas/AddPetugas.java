package com.example.a1fo_khabiburrokhman_kreditmotor.ui.home.petugas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.a1fo_khabiburrokhman_kreditmotor.R;

public class AddPetugas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_petugas);

        getSupportActionBar().setTitle("Tambah Petugas");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}