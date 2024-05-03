/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kendaraan;


import java.util.Scanner;


public class App {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        int jumlahKendaraan;

        System.out.print("Masukkan jumlah kendaraan: ");
        jumlahKendaraan = scanner.nextInt();

        Kendaraan[] daftarkendaraan = new Kendaraan[jumlahKendaraan];

        for (int i = 0; i < jumlahKendaraan; i++) {
            System.out.println("\nKendaraan ke-" + (i + 1));
            System.out.print("Jenis Kendaraan (Mobil/Motor): ");
            String jenis = scanner.next().toLowerCase(); 
            System.out.print("Merek: ");
            String merek = scanner.next();
            System.out.print("Model: ");
            String model = scanner.next();
            System.out.print("Status (T/D): ");
            char status = scanner.next().charAt(0);
            System.out.print("Tahun Kendaraan: ");
            int tahun = scanner.nextInt();
            scanner.nextLine(); 

            if (jenis.equals("mobil")) {
                daftarkendaraan[i] = new Mobil(merek, model, status,tahun);
            } else if (jenis.equals("motor")) { 
                daftarkendaraan[i] = new Motor(merek, model, status, tahun);
            } else {
                System.out.println("Jenis kendaraan tidak valid.");
                return;
            }
        }

        System.out.println("\nDaftar Kendaraan:");
        for (Kendaraan kendaraan : daftarkendaraan) {
            kendaraan.display();
        }
    }
}