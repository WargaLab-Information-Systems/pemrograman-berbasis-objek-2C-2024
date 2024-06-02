/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package convert;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        Berat beratKonversi = new Berat();
        Suhu suhuKonversi = new Suhu();
        Panjang panjangKonversi = new Panjang();
        Waktu waktuKonversi = new Waktu();
        double angka;
        String tujuan;
        String asal;
        
        while (true) {
            System.out.println("======> Konversi satuan dari suhu, panjang, berat, dan waktu <=====");
            System.out.println("1. Suhu");
            System.out.println("2. Panjang");
            System.out.println("3. Berat");
            System.out.println("4. Waktu");
            System.out.println("5. Keluar");
            System.out.print("Masukkan Input(1/2/3/4/5):");
            String pilihAwal = inputUser.nextLine();
            
            switch (pilihAwal) {
                case "1":
                    do {
                        System.out.print("Masukkan angka:");
                        if (inputUser.hasNextDouble()) {
                            angka = inputUser.nextDouble();
                            inputUser.nextLine();
                        } else {
                            System.out.println("Masukkan angka yang valid!");
                            inputUser.nextLine(); // membersihkan karakter newline dari buffer
                            break;
                        }
                        System.out.println("---------------");
                        System.out.println("Celcius");
                        System.out.println("Fahrenheit");
                        System.out.println("Kelvin");
                        System.out.println("---------------");
                        System.out.print("Di konversi dari:");
                        asal = inputUser.nextLine();
                        System.out.print("di konversi ke:");
                        tujuan = inputUser.nextLine();
                        suhuKonversi.convert(asal, tujuan, angka);
                        System.out.print("lagi? (y/n): ");
                    } while (inputUser.nextLine().equalsIgnoreCase("y"));
                    break;

                case "2":
                    do {
                        System.out.print("Masukkan angka:");
                        if (inputUser.hasNextDouble()) {
                            angka = inputUser.nextDouble();
                            inputUser.nextLine();
                        } else {
                            System.out.println("Masukkan angka yang valid!");
                            inputUser.nextLine(); // membersihkan karakter newline dari buffer
                            break;
                        }
                        System.out.println("---------------");
                        System.out.println("Meter");
                        System.out.println("Centimeter");
                        System.out.println("Inci");
                        System.out.println("---------------");
                        System.out.print("Di konversi dari:");
                        asal = inputUser.nextLine();
                        System.out.print("di konversi ke:");
                        tujuan = inputUser.nextLine();
                        panjangKonversi.convert(asal, tujuan, angka);
                        System.out.print("lagi? (y/n): ");
                    } while (inputUser.nextLine().equalsIgnoreCase("y"));
                    break;

                case "3":
                    do {
                        System.out.print("Masukkan angka:");
                        if (inputUser.hasNextDouble()) {
                            angka = inputUser.nextDouble();
                            inputUser.nextLine();
                        } else {
                            System.out.println("Masukkan angka yang valid!");
                            inputUser.nextLine(); // membersihkan karakter newline dari buffer
                            break;
                        }
                        System.out.println("---------------");
                        System.out.println("Gram");
                        System.out.println("Pon");
                        System.out.println("Ons");
                        System.out.println("---------------");
                        System.out.print("Di konversi dari:");
                        asal = inputUser.nextLine();
                        System.out.print("di konversi ke:");
                        tujuan = inputUser.nextLine();
                        beratKonversi.convert(asal, tujuan, angka);
                        System.out.print("lagi? (y/n): ");
                    } while (inputUser.nextLine().equalsIgnoreCase("y"));
                    break;
                
                case "4":
                    do {
                        System.out.print("Masukkan angka:");
                        if (inputUser.hasNextDouble()) {
                            angka = inputUser.nextDouble();
                            inputUser.nextLine();
                        } else {
                            System.out.println("Masukkan angka yang valid!");
                            inputUser.nextLine(); // membersihkan karakter newline dari buffer
                            break;
                        }
                        System.out.println("---------------");
                        System.out.println("Detik");
                        System.out.println("Menit");
                        System.out.println("Jam");
                        System.out.println("---------------");
                        System.out.print("Di konversi dari:");
                        asal = inputUser.nextLine();
                        System.out.print("di konversi ke:");
                        tujuan = inputUser.nextLine();
                        waktuKonversi.convert(asal, tujuan, angka);
                        System.out.print("lagi? (y/n): ");
                    } while (inputUser.nextLine().equalsIgnoreCase("y"));
                    break;
                    
                case "5":
                    System.out.println("Program Selesai");
                    System.exit(0);
                    
                default:
                    System.out.println("Inputan anda salah");
            }
            inputUser.close();   }
    }
}
