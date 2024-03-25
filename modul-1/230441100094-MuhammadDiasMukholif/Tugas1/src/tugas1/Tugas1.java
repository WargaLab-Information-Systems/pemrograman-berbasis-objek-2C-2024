/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1;

class Manusia {
    String nama;
    int umur;
    String alamat;
    
    void berjalan () {
        System.out.println("Jalan");
    }
    void berlari () {
        System.out.println("Lari");
    }
}

public class Tugas1 {
       
    public static void main(String[] args) {
        Manusia satu = new Manusia();
        Manusia dua = new Manusia();
        satu.nama = "Dias";
        satu.umur = 18;
        satu.alamat = "Lamongan";
        dua.nama = "Ivan";
        dua.umur = 19;
        dua.alamat = "Surabaya";
        System.out.println("Nama :"+satu.nama);
        System.out.println("Umur :"+satu.umur);
        System.out.println("Alamat :"+satu.alamat);
        satu.berjalan();
        satu.berlari();
        System.out.println("Nama :"+dua.nama);
        System.out.println("Umur :"+dua.umur);
        System.out.println("Alamat :"+dua.alamat);
        dua.berjalan();
        dua.berlari();
    }
    
}
