/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package convert_aplication;

/**
 *
 * @author HP
 */
public class Waktu extends Convert_aplication {
    @Override
    public int Hasil(double angka) {
        int hasil = 0;
        int  menit;
        double jam, sisal, sisa2;

        jam = angka / 3600;
        sisal = angka % 3600;

        menit = (int) sisal / 60;
        sisa2 = sisal % 60;

        System.out.println(angka + " detik = " + jam + " jam");
        System.out.println(menit + " menit dan " + sisa2 + " detik");

        return hasil;
    }
}

