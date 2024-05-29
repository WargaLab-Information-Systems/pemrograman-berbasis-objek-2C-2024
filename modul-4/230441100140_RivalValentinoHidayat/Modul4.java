/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.modul4;

import java.util.Scanner;

public class Modul4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Converter converter;
        converter = new Converter() {
            @Override
            public float converter(float value) {
                throw new UnsupportedOperationException("Not supported yet."); 
            }
        };

        System.out.println("Silakan pilih jenis konversi:");
        System.out.println("1. Celsius ke Fahrenheit");
        System.out.println("2. Meter ke Kilometer");
        System.out.println("3. Kilogram ke Pound");
        System.out.println("4. Jam ke Menit");

        System.out.print("Masukkan pilihan Anda (1-4): ");
        int pilihan = scanner.nextInt();

        System.out.print("Masukkan nilai yang akan dikonversi: ");
        float nilai = scanner.nextFloat();

        // Memilih konverter sesuai pilihan
        if (pilihan == 1) {
            converter = new suhu();
        } else if (pilihan == 2) {
            converter = new api();
        } else if (pilihan == 3) {
            converter = new tanah();
        } else if (pilihan == 4) {
            converter = new angin();
        } else {
            System.out.println("Pilihan tidak valid. Menggunakan konverter standar.");
        }

        // Melakukan konversi.
        System.out.println("Nilai dikonversi: " + converter.converter(nilai));

        scanner.close();
    }
}









