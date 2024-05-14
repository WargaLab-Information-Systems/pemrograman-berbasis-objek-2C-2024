/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mobil;

/**
 *
 * @author safira rihadatul a
 */
public class MobilListrik extends Mobil {
    String kelebihan = "Emisi Rendah dan Hemat Energi";

    MobilListrik(String Merk, String Model, int TahunProduksi){
        super(Merk, Model, TahunProduksi);
    }

    @Override
    void Display(){
        super.Display();
        System.out.println("Kelebihan       : "+ this.kelebihan);
    }
}