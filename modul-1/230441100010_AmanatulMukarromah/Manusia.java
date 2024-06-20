/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manusia;

public class Manusia {
    // Atribut
    String nama;
    int umur;
    String alamat;
    
    // Constructor dengan parameter digunakan untuk menginisialisasi atribut diatas mem
    public Manusia(String nama, int umur, String alamat) {
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }
    
    // Method berjalan
    void berjalan() {
        System.out.println(nama + " sedang berjalan.");
    }
    
    // Method berlari
    void berlari() {
        System.out.println(nama + " sedang berlari cepat.");
    }
    
    // Method untuk mendapatkan informasi manusia
    void Info() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Alamat: " + alamat);
    }
    public static void main(String[] args) { //eksekusi program
         // Membuat objek manusia untuk memanggil method info
        Manusia manusia1 = new Manusia("Amna", 25, "Jl. Merdeka No. 10");
        Manusia manusia2 = new Manusia("vega", 30, "Jl. Raya Kencana No. 5");
        
        // Menampilkan informasi manusia yang sudah di definisikan dan di panggil
        System.out.println("\nData Manusia 1:");
        manusia1.Info();
        
        // Memanggil method berjalan
        manusia1.berjalan();
        manusia1.berlari();
        
        System.out.println("\nData Manusia 2:");
        manusia2.Info();
        
        manusia2.berjalan();
        manusia2.berlari();
        
    }
}
