 package com.mycompany.manusia;
class manusia {
    String nama;
    String umur;
    String alamat;

  
    void berjalan() {
        System.out.println(nama + " sedang berjalan");
        }
    void berlari() {
        System.out.println(nama + " sedang berlari");
        }
}
public class ManusiaHuman {
    public static void main(String[] args) {
        System.out.println("manusia just human");
        manusia a = new manusia();
        a.nama = "kimy";
        a.umur = "2 tahun";
        a.alamat = "kayangan";
        
        System.out.println("Nama:" + a.nama);
        System.out.println("Umur:" + a.umur);
        System.out.println("Alamat:" + a.alamat);
        
        a.berjalan();
        a.berlari();
    }
}
