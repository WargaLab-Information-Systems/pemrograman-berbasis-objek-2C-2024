/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul3;

/**
 *
 * @author LENOVO
 */
public class Mobil extends Kendaraan {
    private int pintu;

    public Mobil(String merek, String model, char status, int tahun, int pintu) {
        super("Mobil", merek, model, status, tahun);
        this.pintu = pintu;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Jumlah Pintu: " + pintu);
    }
}



