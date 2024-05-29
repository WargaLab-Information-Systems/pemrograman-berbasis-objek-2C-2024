/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kendaraan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahKendaraan;

        System.out.print("Masukkan jumlah kendaraan : ");
        jumlahKendaraan = input.nextInt();

        Kendaraan[] daftarkendaraan = new Kendaraan[jumlahKendaraan];

        // Input data kendaraan
        for (int i = 0; i < jumlahKendaraan; i++) {
            System.out.println("\nKendaraan ke-" + (i + 1));
            System.out.print("Jenis Kendaraan (Mobil/Motor) : ");
            String jenis = input.next();
            System.out.print("Merek : ");
            String merek = input.next();
            System.out.print("Model : ");
            String model = input.next();
            System.out.print("Status (T/D) : ");
            char status = input.next().charAt(0); 
            System.out.print("Tahun Kendaraan : ");
            int tahun = input.nextInt();
            input.nextLine();

            if (jenis.equalsIgnoreCase("Mobil")) {
                daftarkendaraan[i] = new mobil(merek, model, status, tahun);
            } else if (jenis.equalsIgnoreCase("Motor")) {
                daftarkendaraan[i] = new motor(merek, model, status, tahun);
            } else {
                System.out.println("Jenis kendaraan tidak valid.");
                return;
            }
        }
        System.out.println("================================");
        System.out.println("\nDaftar Kendaraan :");
        for (Kendaraan kendaraan : daftarkendaraan) {
            kendaraan.info();
            if (kendaraan.getStatus() == 'T') {
                System.out.println("Status          : Tersedia");
            } else if (kendaraan.getStatus() == 'D') {
                System.out.println("Status          : Disewakan");
            }
        }
        System.out.println("================================");
    }
}
