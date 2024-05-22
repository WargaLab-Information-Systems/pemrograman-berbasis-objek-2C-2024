/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package convert_aplication;

/**
 *
 * @author HP
 */
public class Panjang extends Convert_aplication {
    public int Hasil(double angka) {
        int hasil = 0;
        
        double km = angka / 1000;
        double hm = angka / 100;
        double dam = angka / 10;
        double dm = angka * 10;
        double cm = angka * 100;
        double mm = angka * 1000;
        double mil = angka / 1609.344;
        double inci = angka * 39.37008;
        double yard = angka * 1.093613;
        double mil_laut = angka / 1852;
        double kaki = angka * 3.28084;

        System.out.println(angka + " meter sama dengan :");
        System.out.println(km + " km");
        System.out.println(hm + " hm");
        System.out.println(dam + " dam");
        System.out.println(dm + " dm");
        System.out.println(cm + " cm");
        System.out.println(mm + " mm");
        System.out.println(mil + " mil");
        System.out.println(inci + " inci");
        System.out.println(yard + " yard");
        System.out.println(mil_laut + " mil laut");
        System.out.println(kaki + " kaki");
        
        return hasil;
    }
}

