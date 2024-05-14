/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coba;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class Coba {

    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);
         double value = 0;
         boolean input;
         
        do {
            System.out.println("Enter the value : ");
            input = scanner.hasNextDouble();
            if (input){
                value = scanner.nextDouble();
            }else {
                System.out.println("nilai tidak valid. silahkan masukkan angka");
                scanner.next();
            }
        }while (!input);

        System.out.println("Enter the original unit :");
        System.out.println(" • C (celcius)/F (fahreinheit)/K (kelvin) untuk Suhu");
        System.out.println(" • M (meter)/KM (kilometer)/CM (centimeter) untuk Panjang");
        System.out.println(" • KG (kilogram)/G (gram) untuk Berat");
        System.out.println(" • Dtk (detik)/mnt (menit)/Jam untuk Waktu");
        String fromUnit = scanner.next();

        System.out.println("Enter the target unit: ");
        System.out.println(" • C/f/k  untuk Suhu");
        System.out.println(" • Km/m/cm  untuk Panjang");
        System.out.println(" • KG/G  untuk Berat");
        System.out.println(" • dtk/mnt/Jam  untuk Waktu");
        String toUnit = scanner.next();
        abs converter = null;

        if (fromUnit.equalsIgnoreCase("C") || fromUnit.equalsIgnoreCase("F") || fromUnit.equalsIgnoreCase("K")) {
            converter = new TemperatureConverter(value, fromUnit);
        } else if (fromUnit.equalsIgnoreCase("M") || fromUnit.equalsIgnoreCase("KM") || fromUnit.equalsIgnoreCase("CM")) {
            converter = new pnjng(value, fromUnit);
        } else if (fromUnit.equalsIgnoreCase("KG") || fromUnit.equalsIgnoreCase("G")) {
            converter = new brt(value, fromUnit);
        } else if (fromUnit.equalsIgnoreCase("Dtk") || fromUnit.equalsIgnoreCase("Mnt") || fromUnit.equalsIgnoreCase("Jam")) {
            converter = new time(value, fromUnit);
        }

        if (converter != null) {
            double result = converter.convertTo(toUnit);
            System.out.println("Result: " + result + " " + toUnit);
        } else {
            System.out.println("Invalid unit");
        }

        scanner.close();
    }
}

