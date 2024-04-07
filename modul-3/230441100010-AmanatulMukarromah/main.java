
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kendaraan;

import java.util.Scanner;

public class main {
public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int jumlahKendaraan;

         System.out.print("Masukkan jumlah kendaraan yang akan di input: ");
         jumlahKendaraan = input.nextInt();

         Kendaraan[] daftarKendaraan = new Kendaraan[jumlahKendaraan];

         // Memasukkan data kendaraan
         for (int i = 0; i < jumlahKendaraan; i++) {
             System.out.println("\nMasukkan data kendaraan ke-" + (i + 1));
             System.out.print("Jenis Kendaraan (Mobil/Motor): ");
             String jenis = input.next();
             System.out.print("Merek: ");
             String merek = input.next();
             System.out.print("Model: ");
             String model = input.next();
             System.out.print("Status (Tersedia/Disewakan): ");
             char status = input.next().charAt(0);
             System.out.print("Tahun: ");
             int tahun = input.nextInt();

             if (jenis.equalsIgnoreCase("Mobil")) {
                 daftarKendaraan[i] = new mobil(merek, model, status, tahun);
             } else if (jenis.equalsIgnoreCase("Motor")) {
                 daftarKendaraan[i] = new motor(merek, model, status, tahun);
             } else {
                 System.out.println("Jenis kendaraan tidak valid.");
                 i--;
             }
         }

         // Menampilkan informasi kendaraan yang telah dimasukkan
        System.out.println("\nDaftar Kendaraan:");
        for (Kendaraan kendaraan : daftarKendaraan) {
            kendaraan.display();
        }
    }
}


