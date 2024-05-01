/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */ 
package com.mycompany.konversi;

/**
 *
 * @author safira rihadatul a
 */
abstract class Konversi {
    protected double value;

    //constructor
    public Konversi(double value) {
        this.value = value;
    }

    public abstract double konversi(String dari, String ke);
}
   