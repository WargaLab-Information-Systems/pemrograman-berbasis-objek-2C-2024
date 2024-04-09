/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kendaraan;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah kendaraan : ");
        int jumlahKendaraan = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < jumlahKendaraan; i++) {
            System.out.println("\nData Kendaraan ke-" + (i + 1) + ":");
            System.out.print("Jenis Kendaraan : ");
            String jenis = scanner.nextLine();
            System.out.print("Merek : ");
            String merek = scanner.nextLine();
            System.out.print("Model : ");
            String model = scanner.nextLine();
            System.out.print("Status (Tersedia/Disewakan) : ");
            String status = scanner.nextLine();
            System.out.print("Tahun Kendaraan : ");
            int tahun = scanner.nextInt();;
            scanner.nextLine();

            Kendaraan kendaraan1 = new Kendaraan(jenis, merek, model, status, tahun);
            System.out.println();
            System.out.println("Hasil Inputan : ");
            kendaraan1.info();
            System.out.println("======================================");
        }
    }
}
