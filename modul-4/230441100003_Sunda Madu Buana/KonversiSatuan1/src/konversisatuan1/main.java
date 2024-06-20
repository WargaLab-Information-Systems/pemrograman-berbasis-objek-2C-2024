/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package konversisatuan1;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celcius;
        double panjang;
        double berat;
        double waktu;
        double hasilKonversi = 0;

//        konversi suhu
        suhu suhu1 = new suhu("C", "F");
        System.out.println("Masukkan nilai suhu : ");
        celcius = input.nextDouble(); 
        hasilKonversi = suhu1.konversi(celcius);
        System.out.println(celcius + " derajat Celsius = " + hasilKonversi + " derajat Fahrenheit");

        suhu suhu2 = new suhu("C", "R");
        hasilKonversi = suhu2.konversi(celcius);
        System.out.println(celcius + " derajat Celsius = " + hasilKonversi + " derajat Reamur");

        suhu suhu3 = new suhu("C", "K");
        hasilKonversi = suhu3.konversi(celcius);
        System.out.println(celcius + " derajat Celsius = " + hasilKonversi + " Kelvin");

//        konversi panjang
        System.out.println();
        System.out.println("Masukkan nilai satuan panjang : ");
        panjang = input.nextDouble();
        panjang panjang1 = new panjang("m", "cm");
        hasilKonversi = panjang1.konversi(panjang);
        System.out.println(panjang + " meter = " + hasilKonversi + " centimeter");

        panjang panjang2 = new panjang("m", "km");
        hasilKonversi = panjang2.konversi(panjang);
        System.out.println(panjang + " meter = " + hasilKonversi + " Kilometer");
        
//        konversi satuan berat
        System.out.println();
        System.out.println("Masukkan nilai satuan berat : ");
        berat = input.nextDouble();
        berat berat1 = new berat("kg", "g");
        hasilKonversi = berat1.konversi(berat);
        System.out.println(berat + " kilogram = " + hasilKonversi + " gram");
        
        berat berat2 = new berat("kg", "mg");
        hasilKonversi = berat2.konversi(berat);
        System.out.println(berat + " kilogram = " + hasilKonversi + " miligram");
        
//        konversi satuan waktu
        System.out.println();
        System.out.println("Masukkan nilai satuan waktu : ");
        waktu = input.nextDouble();
        waktu waktu1 = new waktu("h", "s");
        hasilKonversi = waktu1.konversi(waktu);
        System.out.println(waktu + " jam = " + hasilKonversi + " detik");
        
        waktu waktu3 = new waktu("h", "m");
        hasilKonversi = waktu3.konversi(waktu);
        System.out.println(waktu + " jam = " + hasilKonversi + " menit");
    }
}
