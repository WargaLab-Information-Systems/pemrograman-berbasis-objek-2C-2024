/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gadget;

/**
 *
 * @author LENOVO
 */
public class Smartphone extends Gadget {
    public Smartphone(String merk, String model) {
        super(merk, model);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Smartphone:");
        System.out.println("================================");
        System.out.println("Merk: " + getMerk());
        System.out.println("Model: " + getModel());
        System.out.println();
    }
}
