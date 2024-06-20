/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package konversisatuan;

import java.util.Scanner;

public class main {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan nilai:");
        double nilai = scanner.nextDouble();

        System.out.println("Masukkan satuan asal:");
        String dariSatuan = scanner.next();

        System.out.println("Masukkan satuan tujuan:");
        String keSatuan = scanner.next();
        
        KonversiSatuan konversisatuan ;

        
        if (dariSatuan.equals("C") || dariSatuan.equals("F") || keSatuan.equals("C") || keSatuan.equals("F")) {
            konversisatuan = new suhu();
        } 
        else if (dariSatuan.equalsIgnoreCase("C") || dariSatuan.equalsIgnoreCase("R") || keSatuan.equalsIgnoreCase("C") || keSatuan.equalsIgnoreCase("R")) {
            konversisatuan = new suhu();
        }
        else if (dariSatuan.equalsIgnoreCase("m") || dariSatuan.equalsIgnoreCase("cm") || keSatuan.equalsIgnoreCase("m") || keSatuan.equalsIgnoreCase("cm")) {
            konversisatuan = new panjang();
        }
        else if (dariSatuan.equalsIgnoreCase("kg") || dariSatuan.equalsIgnoreCase("ton") || keSatuan.equalsIgnoreCase("kg") || keSatuan.equalsIgnoreCase("ton")) {
            konversisatuan = new berat();
        }
        else if (dariSatuan.equalsIgnoreCase("menit") || dariSatuan.equalsIgnoreCase("jam") || keSatuan.equalsIgnoreCase("menit") || keSatuan.equalsIgnoreCase("jam")) {
            konversisatuan = new waktu();
        }
        else {
            System.out.println("satuan tidak valid");
            return;
        }

       
        double hasil = konversisatuan.konversi(nilai, dariSatuan, keSatuan);
        System.out.println("Konversi dari " + nilai + " " + dariSatuan + " ke " + keSatuan + ": " + hasil);

        scanner.close();
     }
}


