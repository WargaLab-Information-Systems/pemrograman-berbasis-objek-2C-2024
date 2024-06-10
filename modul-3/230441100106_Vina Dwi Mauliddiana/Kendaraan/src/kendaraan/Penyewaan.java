/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kendaraan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author pinokio
 */
public class Penyewaan {

    private List<Kendaraan> daftarKendaraan = new ArrayList<>();
    //arrylist untuk menyimpan dafatr kendaraan
    public void tambahKendaraan(Kendaraan kendaraan) {
        if (kendaraan != null) {
            daftarKendaraan.add(kendaraan);
        }
    }

    public void tampilkanDaftarKendaraan() {
        for (Kendaraan kendaraan : daftarKendaraan) {
            System.out.println(kendaraan.getInformasiPenyewaan());
        }
    }

    public static void main(String[] args) {
        Penyewaan aplikasi = new Penyewaan();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan jumlah kendaraan yang mau dipinjam:");
        int jumlah = scanner.nextInt();
        scanner.nextLine(); // consume newline
        
        System.out.println("Jumlah kendaraan yang akan dipinjam: " + jumlah);

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Daftar Peminjaman Kendaraan");
            System.out.println("Masukkan jenis kendaraan (Mobil, Motor, Sepeda, Becak):");
            String jenis = scanner.nextLine();
            System.out.println("Masukkan merek:");
            String merek = scanner.nextLine();
            System.out.println("Masukkan model:");
            String model = scanner.nextLine();
            System.out.println("Masukkan status (T untuk Tersedia, D untuk Disewakan):");
            char status = scanner.nextLine().charAt(0); //sama kaya list tapi baca e dimulai dari 0 (index) 
            System.out.println("Masukkan tahun:");
            int tahun = scanner.nextInt();
            scanner.nextLine(); // consume newline

            Kendaraan kendaraan = null;
            switch (jenis.toLowerCase()) { //untuk milih jenis kendaraan
                case "mobil": //case pilihan
                    kendaraan = new Mobil(merek, model, status, tahun);
                    break;
                case "motor":
                    kendaraan = new Motor(merek, model, status, tahun);
                    break;
                case "sepeda":
                    kendaraan = new Sepeda(merek, model, status, tahun);
                    break;
                case "Becak":
                    kendaraan = new Becak(merek, model, status, tahun);
                    break;
                default: //untuk kondisi yang salah 
                    System.out.println("Jenis kendaraan tidak valid.");
            }

            aplikasi.tambahKendaraan(kendaraan);
        }

        aplikasi.tampilkanDaftarKendaraan();
    }
}
 
            