/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mobil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pilih jenis mobil yang ingin ditampilkan:");
        System.out.println("1. MPV");
        System.out.println("2. SUV");
        System.out.println("3. Mobil Sport");
        System.out.println("4. Mobil Listrik");
        System.out.print("Masukkan pilihan (1/2/3/4): ");

        int choice = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Masukkan merk mobil: ");
        String merk = scanner.nextLine();
        System.out.print("Masukkan model mobil: ");
        String model = scanner.nextLine();
        System.out.print("Masukkan tahun produksi mobil: ");
        String tahunProduksi = scanner.nextLine();

        Mobil mobil = null;

        switch (choice) {
            case 1:
                mobil = new MPV(merk, model, tahunProduksi);
                break;
            case 2:
                mobil = new SUV(merk, model, tahunProduksi);
                break;
            case 3:
                mobil = new MobilSport(merk, model, tahunProduksi);
                break;
            case 4:
                mobil = new MobilListrik(merk, model, tahunProduksi);
                break;
            default:
                System.out.println("Pilihan tidak valid");
                System.exit(1);
        }

        if (mobil != null) {
            System.out.print("Apakah Anda ingin menambahkan informasi tambahan? : ");
            String addInfoChoice = scanner.nextLine();
            if (addInfoChoice.equalsIgnoreCase("ya")) {
                System.out.print("Masukkan informasi tambahan: ");
                String additionalInfo = scanner.nextLine();
                mobil.showFeature(additionalInfo); 
            } else {
                mobil.showFeature(); 
            }
        }
    }
}



