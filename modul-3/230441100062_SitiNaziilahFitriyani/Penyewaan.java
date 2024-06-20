/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul3_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Penyewaan {

    public static void main(String[] args) {
        // TODO code application logic here
         List<Kendaraan> kendaraan = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("----------Data Penyewaan---------");
        System.out.println("Masukkan jumlah kendaraan yang akan disewa: ");
        int x = scanner.nextInt();

        for (int i = 0; i < x; i++) {
            System.out.println("Masukkan jenis kendaraan (1. Mobil, 2. Motor, 3. Sepeda): ");
            int jenisKendaraan = scanner.nextInt();

            switch (jenisKendaraan) {
                case 1:
                    System.out.println("Masukkan merek kendaraan: ");
                    String carBrand = scanner.next();
                    System.out.println("Masukkan model kendaraan: ");
                    String carModel = scanner.next();
                    System.out.println("Masukkan status kendaraan (T = Tersedia, D = Disewakan): ");
                    String carStatus = scanner.next();
                    System.out.println("Masukkan tahun kendaraan: (2019, 2020, 2021, 2022, 2023)");
                    int carYear = scanner.nextInt();
                    kendaraan.add(new Mobil(carBrand, carModel, carStatus, carYear));
                    break;
                case 2:
                    System.out.println("Masukkan merek kendaraan: ");
                    String motorBrand = scanner.next();
                    System.out.println("Masukkan model kendaraan: ");
                    String motorModel = scanner.next();
                    System.out.println("Masukkan status kendaraan (T = Tersedia, D = Disewakan): ");
                    String motorStatus = scanner.next();
                    System.out.println("Masukkan tahun kendaraan: (2019, 2020, 2021, 2022, 2023)");
                    int motorYear = scanner.nextInt();
                    kendaraan.add(new Motor(motorBrand, motorModel, motorStatus, motorYear));
                    break;
                case 3:
                    System.out.println("Masukkan merek kendaraan: ");
                    String bicycleBrand = scanner.next();
                    System.out.println("Masukkan model kendaraan: ");
                    String bicycleModel = scanner.next();
                    System.out.println("Masukkan status kendaraan (T = Tersedia, D = Disewakan): ");
                    String bicycleStatus = scanner.next();
                    System.out.println("Masukkan tahun kendaraan: (2019, 2020, 2021, 2022, 2023)");
                    int bicycleYear = scanner.nextInt();
                    kendaraan.add(new Sepeda(bicycleBrand, bicycleModel, bicycleStatus, bicycleYear));
                    break;
                default:
                    System.out.println("Jenis kendaraan tidak ditemukan.");
            }
        }

        System.out.println("");
        System.out.println("-----Daftar kendaraan yang telah disewakan:----- ");
        for (Kendaraan transportasi : kendaraan) {
            if (transportasi.getStatus().equals("D")) {
                System.out.println(transportasi);
            }
        }

        scanner.close();
    }
    }
    
