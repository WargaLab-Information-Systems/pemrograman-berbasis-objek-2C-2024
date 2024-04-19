package com.mycompany.kendaraan;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        int jumlahKendaraan;

        System.out.print("Masukkan jumlah kendaraan: ");
        jumlahKendaraan = scanner.nextInt();

        Kendaraan[] daftarkendaraan = new Kendaraan[jumlahKendaraan];

        // Input data kendaraan
        for (int i = 0; i < jumlahKendaraan; i++) {
            System.out.println("\nKendaraan ke-" + (i + 1));
            System.out.print("Jenis Kendaraan (Mobil/Motor): ");
            String jenis = scanner.next(); 
            System.out.print("Merek: ");
            String merek = scanner.next();
            System.out.print("Model: ");
            String model = scanner.next();
            System.out.print("Status (T/D): ");
            char status = scanner.next().charAt(0);
            System.out.print("Tahun Kendaraan: ");
            int tahun = scanner.nextInt();
            scanner.nextLine(); 

            if (jenis.equals("Mobil")) {
                daftarkendaraan[i] = new Mobil(merek, model, status,tahun);
            } else if (jenis.equals("Motor")) { 
                daftarkendaraan[i] = new Motor(merek, model, status, tahun);
            } else {
                System.out.println("Jenis kendaraan tidak valid.");
                return;
            }
        }
        
        // Menampilkan informasi kendaraan yang telah dimasukkan
        System.out.println("\nDaftar Kendaraan:");
        for (Kendaraan kendaraan : daftarkendaraan) {
            kendaraan.display();
            if (kendaraan.getStatus() == 'T') {
                System.out.println("Status          : Tersedia");
            } else if (kendaraan.getStatus() == 'D') {
                System.out.println("Status          : Disewakan");
            }
        }
    }
}