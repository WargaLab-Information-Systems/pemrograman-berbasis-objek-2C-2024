/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soal1;

/**
 *
 * @author ACER
 */
class Manusia{
    String nama;
    String umur;
    String alamat;
    
    void berjalan(){
        System.out.println(nama+ " Berjalann kaki sejauh 3 KM");
    }
    void berlari(){
        System.out.println(nama+ " Lomba lari marathon 5 km");
    }
}
public class Soal1 {
    
    public static void main(String [] args) {
        Manusia makhluk = new Manusia();
        makhluk.nama = "Akame";
        makhluk.umur = "15 tahun";
        makhluk.alamat = "isekai";
        
        System.out.println("the human name is : "+makhluk.nama);
        System.out.println("nih anak umurnya : "+makhluk.umur);
        System.out.println("kalau mau pulang masuk ke portal : "+makhluk.alamat);
        makhluk.berjalan();
        makhluk.berlari();  
    }
}
