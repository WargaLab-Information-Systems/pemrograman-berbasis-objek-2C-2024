/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

// Import kelas Scanner dari pustaka java.util untuk mengambil input dari pengguna


class Manusia {
    String nama;
    int umur;
    String alamat;

     Manusia(String nama, int umur, String alamat) {
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }
     void berjalan() {
        System.out.println(nama + " sedang berjalan.");
    }
     void berlari() {
        System.out.println(nama + " sedang berlari.");
    }
}
public class Main {
    public static void main(String[] args) {
        Manusia manusia1 = new Manusia("Andi", 25, "Jl. Merdeka No. 10");
        Manusia manusia2 = new Manusia("Budi", 30, "Jl. Pahlawan No. 5");
        System.out.println(manusia1.nama);
        System.out.println(manusia1.umur);
        System.out.println(manusia1.alamat);
        manusia1.berjalan();
        System.out.println(manusia2.nama);
        System.out.println(manusia2.umur);
        System.out.println(manusia2.alamat);
        manusia2.berlari();
    }
}
