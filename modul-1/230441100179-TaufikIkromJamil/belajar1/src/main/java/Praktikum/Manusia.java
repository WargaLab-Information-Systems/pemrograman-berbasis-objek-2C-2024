/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum;

public class Manusia {
    String nama;
    int umur;
    String alamat;

    public Manusia(String nama, int umur, String alamat) {
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }

    public void berjalan() {
        System.out.println(nama + " sedang berjalan kaki menuju kampus.");
    }

    public void berlari() {
        System.out.println(nama + " pun berlari karena hampir terlambat.");
    }

    public void tampilkanInformasi() {
        System.out.println("Terdapat mahasiswa bernama " + nama);
        System.out.println("berumur " + umur + "th");
        System.out.println("bertempat tinggal di: " + alamat);
    }
    
    
}
