/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penyewaan;
import java.util.Scanner;

public class Main {
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Kendaraan[] daftarKendaraan = null;
        System.out.print("Masukkan jumlah kendaraan yang akan diinput: ");
        int jumlahKendaraan = input.nextInt();
        daftarKendaraan = new Kendaraan[jumlahKendaraan];
        for (int i = 0; i < jumlahKendaraan; i++) {
            System.out.println("\nMasukkan data kendaraan ke-" + (i + 1));
            System.out.print("Jenis Kendaraan (Mobil/Motor): ");
            String jenis = input.next();
            System.out.print("Merek: ");
            String merek = input.next();
            System.out.print("Model: ");
            String model = input.next();
            char status;
            do{
                System.out.print("Status(T=Tersedia, D=Disewakan: )");
                status = input.next().charAt(0);
                if (status !='T' && status !='D'){
                    System.out.println("Status tidak valid.Harap masukkan 'T'atau'D'");
                }
            } while (status !='T'&& status !='D');
            System.out.print("Tahun kendaraan: ");
            int tahun = input.nextInt();
            if (jenis.equalsIgnoreCase("Mobil")) {
                daftarKendaraan[i] = new Mobil(merek, model, status, tahun);
            } else if (jenis.equalsIgnoreCase("Motor")) {
                daftarKendaraan[i] = new Motor(merek, model, status, tahun);
            } else {
                System.out.println("Jenis kendaraan tidak valid.");
            }
        }
        System.out.println("\nDaftar Kendaraan yang Telah Disewakan:");
        for (Kendaraan kendaraan : daftarKendaraan) {
            if (kendaraan != null && kendaraan.status == 'D') {
                System.out.println("Jenis: " + kendaraan.jenis + ", Merek: " + kendaraan.merek +
                        ", Model: " + kendaraan.model + ", Tahun: " + kendaraan.tahun);
            }
        }
    }
}

