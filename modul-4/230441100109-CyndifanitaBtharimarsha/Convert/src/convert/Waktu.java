/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package convert;

/**
 *
 * @author ASUS
 */

public class Waktu extends Convert {
    public void convert(String asal, String tujuan, double nilai) {
        double jam = 0;
        double menit = 0;
        double detik = 0;

        if (asal.equalsIgnoreCase(tujuan)) {
            System.out.println("Tidak ada konversi yang perlu dilakukan. Satuan asal dan tujuan sama.");
            return;
        }

        if (asal.equalsIgnoreCase("jam") && tujuan.equalsIgnoreCase("menit")) {
            menit = nilai * 60;
            jam = nilai;
            detik = nilai * 3600;
        } else if (asal.equalsIgnoreCase("menit") && tujuan.equalsIgnoreCase("jam")) {
            jam = nilai / 60;
            menit = nilai;
            detik = nilai * 60;
        } else if (asal.equalsIgnoreCase("detik") && tujuan.equalsIgnoreCase("menit")) {
            menit = nilai / 60;
            jam = nilai / 3600;
            detik = nilai;
        } else if (asal.equalsIgnoreCase("jam") && tujuan.equalsIgnoreCase("detik")) {
            detik = nilai * 3600;
            menit = nilai * 60;
            jam = nilai;
        } else if (asal.equalsIgnoreCase("detik") && tujuan.equalsIgnoreCase("jam")) {
            jam = nilai / 3600;
            menit = nilai / 60;
            detik = nilai;
        } else if (asal.equalsIgnoreCase("menit") && tujuan.equalsIgnoreCase("detik")) {
            detik = nilai * 60;
            jam = nilai / 60 / 60;
            menit = nilai;
        }
        System.out.println("\n" + nilai + " " + asal + " sama dengan = " + jam + " jam atau " + menit + " menit atau " + detik + " detik");
    }
}
