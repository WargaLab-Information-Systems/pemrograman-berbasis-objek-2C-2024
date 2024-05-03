/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.konversi;

/**
 *
 * @author safira rihadatul a
 */
public class Waktu extends Konversi {
    public Waktu(double value) {
        super(value);
    }

    @Override
    public double konversi(String dari, String ke) {
        if (dari.equalsIgnoreCase("d")) {
            if (ke.equalsIgnoreCase("m")) {
                return value * 24 * 60;
            } else if (ke.equalsIgnoreCase("j")) {
                return value * 24 * 3600;
            } else if (ke.equalsIgnoreCase("h")) {
                return value * 24;
            } else {
                return 0;
            }
        } else if (dari.equalsIgnoreCase("m")) {
            if (ke.equalsIgnoreCase("d")) {
                return value / (24 * 60);
            } else if (ke.equalsIgnoreCase("j")) {
                return value * 60;
            } else if (ke.equalsIgnoreCase("h")) {
                return value / 60;
            } else {
                return 0;
            }
        } else if (dari.equalsIgnoreCase("j")) {
            if (ke.equalsIgnoreCase("d")) {
                return value / (24 * 3600);
            } else if (ke.equalsIgnoreCase("m")) {
                return value / 60;
            } else if (ke.equalsIgnoreCase("h")) {
                return value / 3600;
            } else {
                return 0;
            }
        } else if (dari.equalsIgnoreCase("h")) {
            if (ke.equalsIgnoreCase("d")) {
                return value / 24;
            } else if (ke.equalsIgnoreCase("m")) {
                return value * 60;
            } else if (ke.equalsIgnoreCase("j")) {
                return value * 3600;
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }
}
