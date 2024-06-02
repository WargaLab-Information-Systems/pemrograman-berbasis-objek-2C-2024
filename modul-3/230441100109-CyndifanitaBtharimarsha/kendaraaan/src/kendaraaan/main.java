/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kendaraaan;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah kendaraan yang akan diinput: ");
        int jumlahKendaraan = input.nextInt();

        Kendaraaan[] daftarKendaraan = new Kendaraaan[jumlahKendaraan];

        for (int i = 0; i < jumlahKendaraan; i++) {
            System.out.println("\nMasukkan data kendaraan ke-" + (i + 1));
            System.out.print("Jenis Kendaraan (Mobil/Motor): ");
            String jenis = input.next();
            System.out.print("Merek: ");
            String merek = input.next();
            System.out.print("Model: ");
            String model = input.next();
            System.out.print("Status (T = Tersedia, D = Disewakan): ");
            char status = input.next().charAt(0);
            System.out.print("Tahun Kendaraan: ");
            int tahun = input.nextInt();

            if (jenis.equalsIgnoreCase("Mobil")) {
                daftarKendaraan[i] = new mobil(merek, model, status, tahun);
            } else if (jenis.equalsIgnoreCase("Motor")) {
                daftarKendaraan[i] = new motor(merek, model, status, tahun);
            } else {
                System.out.println("Jenis kendaraan tidak valid.");
            }
        }

        System.out.println("\nDaftar Kendaraan yang Telah Disewakan:");
        for (Kendaraaan kendaraan : daftarKendaraan) {
            if (kendaraan != null && kendaraan.status == 'D') {
                System.out.println("Jenis: " + kendaraan.jenis + ", Merek: " + kendaraan.merek +
                        ", Model: " + kendaraan.model + ", Tahun: " + kendaraan.tahun);
            }
        }
    }
}