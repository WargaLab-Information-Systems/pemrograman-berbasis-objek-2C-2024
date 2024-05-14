/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.modul1no1;

class manusia{
        String nama;
        String umur;
        String alamat;
        
        void berjalan(){
            System.out.println(nama + " sedang berjalan");
                }
        void berlari(){
            System.out.println(nama + " juga berlari tadi pagi");
                }
}
/**
 *
 * @author safira rihadatul a
 */
public class Modul1No1 {

    public static void main(String[] args) {
        manusia orang = new manusia();
        orang.nama = "catur";
        orang.umur = "19 tahun";
        orang.alamat = "demangan";
        
        System.out.println("dia bernama:"+orang.nama);
        System.out.println("orang ini berumur:"+orang.umur);
        System.out.println("dia tinggal di:"+orang.alamat);
        orang.berjalan();
        orang.berlari();
    }
}

