/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package konversi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        
        while (true) {
            System.out.println("======> Konversi satuan dari suhu, panjang, berat, dan waktu <=====");
            System.out.println("1. Suhu");
            System.out.println("2. Panjang");
            System.out.println("3. Berat");
            System.out.println("4. Waktu");
            System.out.print("Masukkan Input(1/2/3/4):");
            String pilihAwal = inputUser.nextLine();
            double angka;
            String SatuanAsal;
            String to;
            double konversi;
            if (pilihAwal.equals("1")) { //Suhu
                while (true) {
                    System.out.print("Masukkan angka:");
                    angka = inputUser.nextDouble();
                    inputUser.nextLine();
                    System.out.println("---------------");
                    System.out.println("Celcius");
                    System.out.println("Fahrenheit");
                    System.out.println("Kelvin");
                    System.out.println("---------------");
                    System.out.print("Di konversi dari:");
                    SatuanAsal = inputUser.nextLine();
                    System.out.print("di konversi ke:");
                    to = inputUser.nextLine();
        
                    Suhu suhuKonversi = new Suhu(angka);
                
                    konversi = suhuKonversi.KonversiSatuan(SatuanAsal, to);
                    if (konversi != 0) {
                        break;
                    }
                    System.out.println("yang anda inputkan salah");
                }
                System.out.println(angka+SatuanAsal+" = "+konversi+to);
                String tanya;
                while (true) {
                    System.out.print("lagi? (y/n):");
                    tanya = inputUser.nextLine();
                    if (tanya.equals("n")) {
                        break;
                    } else if (tanya.equals("y")) {
                        break;
                    } else {
                        System.out.println("inputkan y atau n");
                    }
                }
                if (tanya.equals("n")) {
                    break;
                }
            } else if (pilihAwal.equals("2")) { //Panjang
                while (true) {
                    System.out.print("Masukkan angka:");
                    angka = inputUser.nextDouble();
                    inputUser.nextLine();
                    System.out.println("---------------");
                    System.out.println("Meter");
                    System.out.println("Centimeter");
                    System.out.println("Inci");
                    System.out.println("---------------");
                    System.out.print("Di konversi dari:");
                    SatuanAsal = inputUser.nextLine();
                    System.out.print("di konversi ke:");
                    to = inputUser.nextLine();
        
                    Panjang PanjangKonversi = new Panjang(angka);
                
                    konversi = PanjangKonversi.KonversiSatuan(SatuanAsal, to);
                    if (konversi != 0) {
                        break;
                    }
                    System.out.println("yang anda inputkan salah");
                }
                System.out.println(angka+SatuanAsal+" = "+konversi+to);
                String tanya;
                while (true) {
                    System.out.print("lagi? (y/n):");
                    tanya = inputUser.nextLine();
                    if (tanya.equals("n")) {
                        break;
                    } else if (tanya.equals("y")) {
                        break;
                    } else {
                        System.out.println("inputkan y atau n");
                    }
                }
                if (tanya.equals("n")) {
                    break;
                }
            } else if (pilihAwal.equals("3")) { //Berat
                while (true) {
                    System.out.print("Masukkan angka:");
                    angka = inputUser.nextDouble();
                    inputUser.nextLine();
                    System.out.println("---------------");
                    System.out.println("Ton");
                    System.out.println("Kilogram");
                    System.out.println("Gram");
                    System.out.println("---------------");
                    System.out.print("Di konversi dari:");
                    SatuanAsal = inputUser.nextLine();
                    System.out.print("di konversi ke:");
                    to = inputUser.nextLine();
        
                    Berat beratKonversi = new Berat(angka);
                
                    konversi = beratKonversi.KonversiSatuan(SatuanAsal, to);
                    if (konversi != 0) {
                        break;
                    }
                    System.out.println("yang anda inputkan salah");
                }
                System.out.println(angka+SatuanAsal+" = "+konversi+to);
                String tanya;
                while (true) {
                    System.out.print("lagi? (y/n):");
                    tanya = inputUser.nextLine();
                    if (tanya.equals("n")) {
                        break;
                    } else if (tanya.equals("y")) {
                        break;
                    } else {
                        System.out.println("inputkan y atau n");
                    }
                }
                if (tanya.equals("n")) {
                    break;
                }
            } else if (pilihAwal.equals("4")) { //Waktu
                while (true) {
                    System.out.print("Masukkan angka:");
                    angka = inputUser.nextDouble();
                    inputUser.nextLine();
                    System.out.println("---------------");
                    System.out.println("Detik");
                    System.out.println("Menit");
                    System.out.println("Jam");
                    System.out.println("---------------");
                    System.out.print("Di konversi dari:");
                    SatuanAsal = inputUser.nextLine();
                    System.out.print("di konversi ke:");
                    to = inputUser.nextLine();
        
                    Waktu waktuKonversi = new Waktu(angka);

                    konversi = waktuKonversi.KonversiSatuan(SatuanAsal, to);
                    if (konversi != 0) {
                        break;
                    }
                    System.out.println("yang anda inputkan salah");
                }
                System.out.println(angka+SatuanAsal+" = "+konversi+to);
                String tanya;
                while (true) {
                    System.out.print("lagi? (y/n):");
                    tanya = inputUser.nextLine();
                    if (tanya.equals("n")) {
                        break;
                    } else if (tanya.equals("y")) {
                        break;
                    } else {
                        System.out.println("inputkan y atau n");
                    }
                }
                if (tanya.equals("n")) {
                    break;
                }
            } else {
                System.out.println("inputan anda salah");
            }
        }
    }
}


