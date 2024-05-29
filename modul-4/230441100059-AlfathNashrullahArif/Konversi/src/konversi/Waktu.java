/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package konversi;

/**
 *
 * @author ASUS
 */
public class Waktu extends Konversi {
    public Waktu(double value) {
        super(value);
    }

    @Override
    public double konversi(String dari, String ke) {
        if (dari.equalsIgnoreCase("d")) {
            if (dari.equalsIgnoreCase("m")) {
                return value / 60;
            } else if (dari.equalsIgnoreCase("j")) {
                return value / 3600;
            } else if (dari.equalsIgnoreCase("h")) {
                return value / 86400;
            } else {
                return 0;
            }
        } else if (dari.equalsIgnoreCase("m")) {
            if (dari.equalsIgnoreCase("d")) {
                return value * 60;
            } else if (dari.equalsIgnoreCase("j")) {
                return value / 60;
            } else if (dari.equalsIgnoreCase("h")) {
                return value / 1440;
            } else {
                return 0;
            }
        } else if (dari.equalsIgnoreCase("j")) {
            if (dari.equalsIgnoreCase("d")) {
                return value * 3600;
            } else if (dari.equalsIgnoreCase("m")) {
                return value * 60;
            } else if (dari.equalsIgnoreCase("h")) {
                return value / 24;
            } else {
                return 0;
            }
        } else if (dari.equalsIgnoreCase("h")) {
            if (dari.equalsIgnoreCase("d")) {
                return value * 86400;
            } else if (dari.equalsIgnoreCase("m")) {
                return value * 1440;
            } else if (dari.equalsIgnoreCase("j")) {
                return value * 24;
            } else {
                return 0;
            }
        } 
            return 0;
        }
    }


