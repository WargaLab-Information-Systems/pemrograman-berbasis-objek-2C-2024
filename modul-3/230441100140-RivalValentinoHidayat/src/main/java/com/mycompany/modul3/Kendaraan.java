/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul3;

/**
 *
 * @author LENOVO
 */
public class Kendaraan {
    protected String jenis;
    protected String merek;
    protected String model;
    protected char status; // T untuk Tersedia, D untuk Disewakan
    protected int tahun;

    public Kendaraan(String jenis, String merek, String model, char status, int tahun) {
        this.jenis = jenis;
        this.merek = merek;
        this.model = model;
        this.status = status;
        this.tahun = tahun;
    }

    public void displayInfo() {
        System.out.println("Jenis Kendaraan: " + jenis);
        System.out.println("Merek: " + merek);
        System.out.println("Model: " + model);
        System.out.println("Status: " + (status == 'T' ? "Tersedia" : "Disewakan"));
        System.out.println("Tahun Kendaraan: " + tahun);
    }
}


