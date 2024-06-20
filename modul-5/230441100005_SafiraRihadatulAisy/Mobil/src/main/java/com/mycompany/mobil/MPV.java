/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mobil;

/**
 *
 * @author safira rihadatul a
 */
public class MPV extends Mobil{
    String kelebihan = "Kapasitas Penumpang Besar dan Ekonomis";

    MPV(String Merk, String Model, int TahunProduksi){
        super(Merk, Model, TahunProduksi);
    }

    @Override
    void Display(){//menampilkan
        super.Display();//untuk mengambil sifat
        System.out.println("Kelebihan       : "+ this.kelebihan);
    }
}