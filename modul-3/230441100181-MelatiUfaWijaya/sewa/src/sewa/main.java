/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sewa;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        systm in untuk membaca program dibwah
        kendaraan[] ketkendaraan = null;
        System.out.print("Inputkan jumlah kendaraan : ");
        int jumlahKendaraan = input.nextInt();
        ketkendaraan = new kendaraan[jumlahKendaraan];
        for (int i = 0; i < jumlahKendaraan; i++) {
            System.out.println("\nMasukkan kendaraan ke-" + (i + 1));
            System.out.print("Macam Kendaraan (Mobil/Motor): ");
            String macam = input.next();
            System.out.print("Nama Merek : ");
            String merek = input.next();
            System.out.print("Model : ");
            String model = input.next();
//            membuat kategori
            char status;
            do{
                System.out.print("Status(T=Tersedia, D=Disewakan: )");
                status = input.next().charAt(0);
                if (status !='T' && status !='D'){
                    System.out.println("Tidak valid. Masukkan Kembali 'T'atau'D'");
                }
            } while (status !='T'&& status !='D');
            System.out.print("Tahun kendaraan: ");
            
            int tahun = input.nextInt();
            if (macam.equalsIgnoreCase("Mobil")) {
//                mengatur huruf kapital
                ketkendaraan[i] = new mobil(merek, model, status, tahun);
//                ketkendaraan[i]= new kendaraan("mobil", "toyota", "supra", 'd', 1995);
            } else if (macam.equalsIgnoreCase("Motor")) {
                ketkendaraan[i] = new motor(merek, model, status, tahun);
            } else {
                System.out.println("Jenis kendaraan tidak valid.");
            }
        }
        System.out.println("\nDaftar Kendaraan yang Telah Disewakan:");
        for (kendaraan kendaraan : ketkendaraan) {
            if (kendaraan != null && kendaraan.status == 'D') {
                System.out.println("Jenis : " + kendaraan.macam) ;
                System.out.println("Merek : " + kendaraan.namamerek);
                System.out.println("Status: Disewakan");
                System.out.println("Model : " + kendaraan.model);
                System.out.println("Tahun : " + kendaraan.thn);
                System.out.println("");
            }
            if (kendaraan != null && kendaraan.status == 'T') {
                System.out.println("Jenis : " + kendaraan.macam) ;
                System.out.println("Merek : " + kendaraan.namamerek);
                System.out.println("Status: Tersedia");
                System.out.println("Model : " + kendaraan.model);
                System.out.println("Tahun : " + kendaraan.thn);
            }
        }
    }
}
        


    


