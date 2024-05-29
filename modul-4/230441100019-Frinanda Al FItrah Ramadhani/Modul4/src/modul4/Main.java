/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("S = Suhu/P = Panjang/B = Berat/W = Waktu");
            System.out.println("Masukkan Satuan : ");
            String satuan = input.nextLine();
            if(satuan.equalsIgnoreCase("S")){
                System.out.println("C = Celcius/F = Farenheit/K = Kelvin/R = Reamur");
                System.out.println("Masukkan satuan suhu asal : ");
                String dari = input.nextLine();

                System.out.println("Masukkan satuan suhu tujuan : ");
                String menjadi = input.nextLine();

                System.out.println("Masukkan angka : ");
                double nilai = input.nextDouble();

                Konversi konversi1 = new Suhu(nilai, dari, menjadi);
                double hasil = konversi1.konversi();
                System.out.println("Hasil konversi " + hasil + " derajat");
            } else if(satuan.equalsIgnoreCase("P")){
                System.out.println("Cm = Centimeter/M = Meter");
                System.out.println("Masukkan satuan panjang asal : ");
                String dari = input.nextLine();

                System.out.println("Masukkan satuan panjang tujuan : ");
                String menjadi = input.nextLine();

                System.out.println("Masukkan angka : ");
                double nilai = input.nextDouble();

                Konversi konversi1 = new Panjang(nilai, dari, menjadi);
                double hasil = konversi1.konversi();
                System.out.println("Hasil konversi "+ hasil + " " + menjadi);
            } else if(satuan.equalsIgnoreCase("B")){
                System.out.println("G = Gram/Kg = Kilogram");
                System.out.println("Masukkan satuan berat asal : ");
                String dari = input.nextLine();

                System.out.println("Masukkan satuan berat tujuan : ");
                String menjadi = input.nextLine();

                System.out.println("Masukkan angka : ");
                double nilai = input.nextDouble();

                Konversi konversi1 = new Berat(nilai, dari, menjadi);
                double hasil = konversi1.konversi();
                System.out.println("Hasil konversi "+ hasil + " " + menjadi);
            } else if(satuan.equalsIgnoreCase("W")){
                System.out.println("M = Menit/J = Jam");
                System.out.println("Masukkan satuan waktu asal : ");
                String dari = input.nextLine();

                System.out.println("Masukkan satuan waktu tujuan : ");
                String menjadi = input.nextLine();

                System.out.println("Masukkan angka : ");
                double nilai = input.nextDouble();

                Konversi konversi1 = new Waktu(nilai, dari, menjadi);
                double hasil = konversi1.konversi();
                System.out.println("Hasil konversi "+ hasil + " " + menjadi);
            } else {
                System.out.println("Satuan tidak ada!");
            }
            
            System.out.println("Apakah ingin melakukan konversi lagi?");
            input.nextLine();
            System.out.println("Y = Yes/N = No : ");
            String tanya = input.nextLine();
            if (tanya.equalsIgnoreCase("N")) break; 
        }  
    }
}
