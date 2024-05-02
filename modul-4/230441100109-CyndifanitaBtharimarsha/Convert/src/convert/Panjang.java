/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package convert;

/**
 *
 * @author ASUS
 */
public class Panjang extends Convert {
    public void convert(String asal, String tujuan, double nilai) {
        double meter = 0;
        double centimeter = 0;
        double inci = 0;

        if (asal.equalsIgnoreCase(tujuan)) {
            System.out.println("Tidak ada konversi yang perlu dilakukan. Satuan asal dan tujuan sama.");
            return;
        }

        if (asal.equalsIgnoreCase("meter") && tujuan.equalsIgnoreCase("centimeter")) {
            centimeter = nilai * 100;
            meter = nilai;
            inci = nilai * 39.3701;
        } else if (asal.equalsIgnoreCase("centimeter") && tujuan.equalsIgnoreCase("meter")) {
            meter = nilai / 100;
            centimeter = nilai;
            inci = nilai / 2.54;
        } else if (asal.equalsIgnoreCase("inci") && tujuan.equalsIgnoreCase("centimeter")) {
            centimeter = nilai * 2.54;
            meter = nilai / 39.3701;
            inci = nilai;
        } else if (asal.equalsIgnoreCase("meter") && tujuan.equalsIgnoreCase("inci")) {
            inci = nilai * 39.3701;
            centimeter = nilai * 100;
            meter = nilai;
        } else if (asal.equalsIgnoreCase("inci") && tujuan.equalsIgnoreCase("meter")) {
            meter = nilai / 39.3701;
            centimeter = nilai * 2.54;
            inci = nilai;
        } else if (asal.equalsIgnoreCase("centimeter") && tujuan.equalsIgnoreCase("inci")) {
            inci = nilai / 2.54;
            centimeter = nilai;
            meter = nilai / 100;
        }

        System.out.println("\n" + nilai + " " + asal + " sama dengan = " + meter + " meter atau " + centimeter + " centimeter atau " + inci + " inci");
    }
}