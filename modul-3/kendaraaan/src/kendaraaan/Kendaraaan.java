/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kendaraaan;


public class Kendaraaan {
    String jenis;
    String merek;
    String model;
    char status;
    int tahun;

    public Kendaraaan(String jenis, String merek, String model, char status, int tahun) {
        this.jenis = jenis;
        this.merek = merek;
        this.model = model;
        this.status = status;
        this.tahun = tahun;
    }

    public String getJenis() {
        return jenis;
    }

    public String getMerek() {
        return merek;
    }

    public String getModel() {
        return model;
    }

    public char getStatus() {
        return status;
    }

    public int getTahun() {
        return tahun;
    }
}
   
  
