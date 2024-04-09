/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kendaraan;

/**
 *
 * @author USER
 */
public class Kendaraan {

    String jenis;
    String merek;
    String model;
    String status;
    int tahun;
    
    Kendaraan(String jenis, String merek, String model, String status, int tahun) {
        this.jenis = jenis;
        this.merek = merek;
        this.model = model;
        this.status = status;
        this.tahun = tahun;
    }
    void info() {
        System.out.println("Jenis knd : " + jenis);
        System.out.println("Merek knd : " + merek);
        System.out.println("Model knd : " + model);
        System.out.println("Status knd : " + status);
        System.out.println("Tahun knd : " + tahun);
    }
}
class tersedia extends Kendaraan {
    tersedia(String jenis, String merek, String model, int tahun) {
        super(jenis, merek, model, "tersedia", tahun);
    }
}

class sewa extends Kendaraan {
    sewa(String jenis, String merek, String model, int tahun) {
        super(jenis, merek, model, "doisewakan", tahun);
    }
}
