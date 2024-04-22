/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.modul3;

/**
 *
 * @author LENOVO
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Modul3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Kendaraan> kendaraans = new ArrayList<>();

        System.out.print("Berapa banyak kendaraan yang ingin Anda masukkan? ");
        int jumlah = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan data untuk kendaraan ke-" + (i + 1) + ":");
            System.out.print("Jenis Kendaraan  : ");
            String jenis = scanner.nextLine();
            System.out.print("Merek: ");
            String merek = scanner.nextLine();
            System.out.print("Model : ");
            String model = scanner.nextLine();
            System.out.print("Status (T untuk Tersedia, D untuk Disewakan): ");
            char status = scanner.nextLine().charAt(0);
            System.out.print("Tahun Kendaraan : ");
            int tahun = Integer.parseInt(scanner.nextLine());
            System.out.println();

            kendaraans.add(new Kendaraan(jenis, merek, model, status, tahun));
            System.out.println(); // Menambahkan baris kosong setelah setiap kendaraan
        }

        System.out.println("\nInformasi Penyewaan Kendaraan:");
        for (Kendaraan kendaraan : kendaraans) {
            kendaraan.displayInfo();
            System.out.println(); // Menambahkan baris kosong setelah setiap entri kendaraan
        }
    }
}




