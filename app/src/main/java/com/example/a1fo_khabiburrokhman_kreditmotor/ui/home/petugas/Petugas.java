package com.example.a1fo_khabiburrokhman_kreditmotor.ui.home.petugas;

public class Petugas {
    private String id, nama, jabatan, username, password;

    public Petugas() {
    }

    public Petugas(String id, String nama, String jabatan, String username, String password) {
        this.id = id;
        this.nama = nama;
        this.jabatan = jabatan;
        this.username = username;
        this.password = password;
    }

    public String getId() {
        return id;
    }
    public String setId(String id) {
        return this.id;
    }

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJabatan() {
        return jabatan;
    }
    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
