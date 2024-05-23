/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interface_modul6;

/**
 *
 * @author safira rihadatul a
 */
public class Smartphone extends Gadget {
    public Smartphone(String Merk, String Model) {
        super(Merk, Model);
    }

    @Override
    public void Display() {
        System.out.println("\nElektronik Smartphone");
        System.out.println("Merk    : " + Merk);
        System.out.println("Model   : " + Model);
        ambilFoto();
        rekamVideo();
        kirimFile();
        terimaFile();
        koneksiPerangkat();
        cariJaringan();
        hubungkanJaringan();
        lupakanJaringan();
        ambilKoordinat();
    }
}
