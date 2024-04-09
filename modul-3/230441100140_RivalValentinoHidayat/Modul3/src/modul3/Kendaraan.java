/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul3;

public abstract class Kendaraan {
    protected String jenis;
    protected String merek;
    protected String model;
    protected char status;
    protected int tahun;

    public Kendaraan(String jenis, String merek, String model, char status, int tahun) {
        this.jenis = jenis;
        this.merek = merek;
        this.model = model;
        this.status = status;
        this.tahun = tahun;
    }

    public abstract void displayInfo();
}

