/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kendaraan;


/**
 *
 * @author pinokio
 */
public class Kendaraan {
    protected String jenisKendaraan;
    protected String merek;
    protected String model;
    protected char status; // 'T' untuk Tersedia, 'D' untuk Disewakan
    protected int tahun;
    //buat konstruktor
    public Kendaraan(String jenisKendaraan, String merek, String model, char status, int tahun) {
        this.jenisKendaraan = jenisKendaraan;
        this.merek = merek;
        this.model = model;
        this.status = status;
        this.tahun = tahun;
    }

    public void setStatus(char status) {
        this.status = status;
    }
    //untuk menampilkan pilihan tersedia atau tidak
    public String getInformasiPenyewaan() {
        return "Jenis Kendaraan: " + jenisKendaraan + ", Merek: " + merek + ", Model: " + model + ", Status: " + (status == 'T' ? "Tersedia" : "Disewakan") + ", Tahun: " + tahun;
    }
}
//untuk menampilkan kendaraan yang dipilih
