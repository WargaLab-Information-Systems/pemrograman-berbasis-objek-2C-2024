/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package convert;

/**
 *
 * @author ASUS
 */
public class Suhu extends Convert {
    public void convert(String asal, String tujuan, double angka) {
        double hasil = 0;

        if (asal.equalsIgnoreCase(tujuan)) {
            System.out.println("Tidak ada konversi yang perlu dilakukan. Satuan asal dan tujuan sama.");
            return;
        }

        if (asal.equalsIgnoreCase("celcius") && tujuan.equalsIgnoreCase("fahrenheit")) {
            hasil = (9.0 / 5.0 * angka) + 32;
            System.out.println(angka + " derajat Celcius = " + hasil + " derajat Fahrenheit");
        } else if (asal.equalsIgnoreCase("celcius") && tujuan.equalsIgnoreCase("kelvin")) {
            hasil = angka + 273.15;
            System.out.println(angka + " derajat Celcius = " + hasil + " derajat Kelvin");
        } else if (asal.equalsIgnoreCase("celcius") && tujuan.equalsIgnoreCase("reamur")) {
            hasil = angka * (4.0 / 5.0);
            System.out.println(angka + " derajat Celcius = " + hasil + " derajat Reamur");
        } else if (asal.equalsIgnoreCase("fahrenheit") && tujuan.equalsIgnoreCase("celcius")) {
            hasil = (5.0 / 9.0 * (angka - 32));
            System.out.println(angka + " derajat Fahrenheit = " + hasil + " derajat Celcius");
        } else if (asal.equalsIgnoreCase("fahrenheit") && tujuan.equalsIgnoreCase("kelvin")) {
            hasil = (5.0 / 9.0 * (angka - 32) + 273.15);
            System.out.println(angka + " derajat Fahrenheit = " + hasil + " derajat Kelvin");
        } else if (asal.equalsIgnoreCase("fahrenheit") && tujuan.equalsIgnoreCase("reamur")) {
            hasil = (4.0 / 9.0 * (angka - 32));
            System.out.println(angka + " derajat Fahrenheit = " + hasil + " derajat Reamur");
        } else if (asal.equalsIgnoreCase("kelvin") && tujuan.equalsIgnoreCase("celcius")) {
            hasil = angka - 273.15;
            System.out.println(angka + " derajat Kelvin = " + hasil + " derajat Celcius");
        } else if (asal.equalsIgnoreCase("kelvin") && tujuan.equalsIgnoreCase("fahrenheit")) {
            hasil = (9.0 / 5.0 * (angka - 273.15) + 32);
            System.out.println(angka + " derajat Kelvin = " + hasil + " derajat Fahrenheit");
        } else if (asal.equalsIgnoreCase("kelvin") && tujuan.equalsIgnoreCase("reamur")) {
            hasil = ((angka - 273.15) * 4.0 / 5.0);
            System.out.println(angka + " derajat Kelvin = " + hasil + " derajat Reamur");
        } else if (asal.equalsIgnoreCase("reamur") && tujuan.equalsIgnoreCase("celcius")) {
            hasil = angka * 5.0 / 4.0;
            System.out.println(angka + " derajat Reamur = " + hasil + " derajat Celcius");
        } else if (asal.equalsIgnoreCase("reamur") && tujuan.equalsIgnoreCase("fahrenheit")) {
            hasil = (9.0 / 4.0 * angka) + 32;
            System.out.println(angka + " derajat Reamur = " + hasil + " derajat Fahrenheit");
        } else if (asal.equalsIgnoreCase("reamur") && tujuan.equalsIgnoreCase("kelvin")) {
            hasil = (5.0 / 4.0 * angka) + 273.15;
            System.out.println(angka + " derajat Reamur = " + hasil + " derajat Kelvin");
        } else {
            System.out.println("Konversi tidak valid.");
        }
    }
}
