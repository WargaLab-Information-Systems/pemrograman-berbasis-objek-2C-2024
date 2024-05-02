/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package convert;

/**
 *
 * @author ASUS
 */

public class Berat extends Convert {
    public void convert(String asal, String tujuan, double nilai) {
        double gram = 0;
        double pon = 0;
        double ons = 0;

        if (asal.equalsIgnoreCase(tujuan)) {
            System.out.println("Tidak ada konversi yang perlu dilakukan. Satuan asal dan tujuan sama.");
            return;
        }

        if (asal.equalsIgnoreCase("gram") && tujuan.equalsIgnoreCase("pon")) {
            pon = nilai / 500;
            ons = nilai / 100;
            gram = nilai;
        } else if (asal.equalsIgnoreCase("pon") && tujuan.equalsIgnoreCase("gram")) {
            gram = nilai * 500;
            pon = nilai;
            ons = nilai * 5;
        } else if (asal.equalsIgnoreCase("ons") && tujuan.equalsIgnoreCase("gram")) {
            gram = nilai * 100;
            pon = nilai / 5;
            ons = nilai;
        } else if (asal.equalsIgnoreCase("gram") && tujuan.equalsIgnoreCase("ons")) {
            ons = nilai / 100;
            pon = nilai / 5;
            gram = nilai;
        } else if (asal.equalsIgnoreCase("ons") && tujuan.equalsIgnoreCase("pon")) {
            pon = nilai / 5;
            gram = nilai * 100;
            ons = nilai;
        } else if (asal.equalsIgnoreCase("pon") && tujuan.equalsIgnoreCase("ons")) {
            ons = nilai * 5;
            gram = nilai * 500;
            pon = nilai;
        }

        System.out.println("\n" + nilai + " " + asal + " sama dengan = " + pon + " pon atau " + ons + " ons atau " + gram + " gram");
    }
}