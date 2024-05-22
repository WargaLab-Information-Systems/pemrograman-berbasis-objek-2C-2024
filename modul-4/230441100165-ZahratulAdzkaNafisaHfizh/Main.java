/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package convert_aplication;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Pilihan Menu:");
        System.out.println("1. Konversi Suhu");
        System.out.println("2. Konversi Berat");
        System.out.println("3. Konversi Waktu");
        System.out.println("4. Konversi Panjang");
        System.out.print("Masukkan pilihan Anda: ");
        int pilihan = input.nextInt();
        
        switch (pilihan) {
            case 1:
                System.out.print("Masukkan suhu dalam Celcius: ");
                double suhu = input.nextDouble();
                Suhu suhuConverter = new Suhu();
                suhuConverter.Hasil(suhu);
                break;
            case 2:
                System.out.print("Masukkan berat dalam kg: ");
                double berat = input.nextDouble();
                Berat beratConverter = new Berat();
                beratConverter.Hasil(berat);
                break;
            case 3:
                System.out.print("Masukkan waktu dalam detik: ");
                double waktu = input.nextDouble();
                Waktu waktuConverter = new Waktu();
                waktuConverter.Hasil(waktu);
                break;
            case 4:
            System.out.print("Masukkan panjang dalam meter: ");
            double panjang = input.nextDouble();
            Panjang panjangConverter = new Panjang();
            panjangConverter.Hasil(panjang);
                break;
            default:
                System.out.println("Pilihan tidak valid");
        }
    }
}
