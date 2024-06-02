/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gadget;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Pilih jenis gadget yang ingin ditampilkan:");
            System.out.println("1. Smartphone");
            System.out.println("2. Tablet");
            System.out.println("3. Laptop");
            System.out.print("Masukkan pilihan (1/2/3): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Masukkan merk gadget: ");
            String merk = scanner.nextLine();
            System.out.print("Masukkan model gadget: ");
            String model = scanner.nextLine();

            Gadget gadget;
            switch (choice) {
                case 1:
                    gadget = new Smartphone(merk, model);
                    break;
                case 2:
                    gadget = new Tablet(merk, model);
                    break;
                case 3:
                    gadget = new Laptop(merk, model);
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    continue; 
            }

            gadget.tampilkanInfo();

            System.out.println("Fitur tambahan:");
            System.out.println("================================");
            System.out.println("Kamera");
            gadget.ambilFoto();
            gadget.rekamVideo();
            System.out.println("================================");
            System.out.println("Bluetooth");
            gadget.kirimFile();
            gadget.terimaFile();
            gadget.koneksiPerangkat();
            System.out.println("================================");
            System.out.println("WiFi");
            gadget.cariJaringan();
            gadget.hubungkanJaringan();
            gadget.lupakanJaringan();
            System.out.println("================================");
            System.out.println("GPS");
            gadget.ambilKordinat();
            System.out.println("================================");

            System.out.println("Apakah Anda ingin memilih gadget lain? (ya/tidak)");
            String response = scanner.nextLine();
            if (!response.equalsIgnoreCase("ya")) {
                System.out.println("Terima kasih! Program selesai.");
                break; 
            }
        }
    }
}

