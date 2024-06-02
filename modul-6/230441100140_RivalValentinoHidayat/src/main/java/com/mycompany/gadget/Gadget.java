/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gadget;

/**
 *
 * @author LENOVO
 */

public abstract class Gadget implements Kamera, Bluetooth, Wifi, Gps {
    protected String merk;
    protected String model;

    public Gadget(String merk, String model) {
        this.merk = merk;
        this.model = model;
    }

    public String getMerk() {
        return merk;
    }

    public String getModel() {
        return model;
    }

    @Override
    public void ambilFoto() {
        System.out.println("Mengambil foto");
    }

    @Override
    public void rekamVideo() {
        System.out.println("Merekam video");
    }

    @Override
    public void kirimFile() {
        System.out.println("Mengirim file via Bluetooth");
    }

    @Override
    public void terimaFile() {
        System.out.println("Menerima file via Bluetooth");
    }

    @Override
    public void koneksiPerangkat() {
        System.out.println("Menghubungkan perangkat via Bluetooth");
    }

    @Override
    public void cariJaringan() {
        System.out.println("Mencari jaringan WiFi");
    }

    @Override
    public void hubungkanJaringan() {
        System.out.println("Menghubungkan ke jaringan WiFi");
    }

    @Override
    public void lupakanJaringan() {
        System.out.println("Melupakan jaringan WiFi");
    }

    @Override
    public void ambilKordinat() {
        System.out.println("Mengambil koordinat GPS");
    }

    public abstract void tampilkanInfo();
}
