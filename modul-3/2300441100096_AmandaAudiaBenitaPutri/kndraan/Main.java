
package Kndraan;

import java.util.Scanner;


public class Main {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        int jumlahKendaraan;

        System.out.print("Masukkan jumlah kendaraan: ");
        jumlahKendaraan = scanner.nextInt();

        Kndraan[] daftarkendaraan = new Kndraan[jumlahKendaraan];

        for (int i = 0; i < jumlahKendaraan; i++) {
            System.out.println("\nKendaraan ke-" + (i + 1));
            System.out.print("Jenis Kendaraan (Mobil/Motor): ");
            String jenis = scanner.next(); 
            System.out.print("Merk: ");
            String merek = scanner.next();
            System.out.print("Model: ");
            String model = scanner.next();
            System.out.print("Status (T/D): ");
            char status = scanner.next().charAt(0);
            System.out.print("Tahun Kendaraan: ");
            int tahun = scanner.nextInt();
            scanner.nextLine(); 

            if (jenis.equalsIgnoreCase("mobil")) {
                daftarkendaraan[i] = new Mobil(merek, model, status,tahun);
            } else if (jenis.equalsIgnoreCase("motor")) {  
                daftarkendaraan[i] = new Motor(merek, model, status, tahun);
            } else {
                System.out.println("Jenis kendaraan tidak valid.");
                return;
            }
        }

        System.out.println("\nDaftar Kendaraan:");
        for (Kndraan kendaraan : daftarkendaraan) {
            kendaraan.display();
            if (kendaraan.getstatus() == 'T'){
                System.out.println("Status      : Tersedia");
            } else if (kendaraan.getstatus() == 'D'){
                System.out.println("Status      : Disewakan");
            } 
            
        }
    } 
}
