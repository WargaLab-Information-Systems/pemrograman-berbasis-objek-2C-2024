/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul3;

/**
 *
 * @author LENOVO
 */
public class Motor extends Kendaraan {
    private int kapasitasMesin;

    public Motor(String merek, String model, char status, int tahun, int kapasitasMesin) {
        super("Motor", merek, model, status, tahun);
        this.kapasitasMesin = kapasitasMesin;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Kapasitas Mesin: " + kapasitasMesin + "cc");
    }
}



