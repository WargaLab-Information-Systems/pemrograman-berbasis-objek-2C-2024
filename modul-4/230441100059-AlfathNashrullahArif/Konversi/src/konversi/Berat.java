/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package konversi;

/**
 *
 * @author ASUS
 */
public class Berat extends Konversi {
    public Berat(double value) {
        super(value);
    }

    @Override
    public double konversi(String dari, String ke) {
        if (dari.equalsIgnoreCase("mg")) {
            if (ke.equalsIgnoreCase("g")) {
                return value / 1000;
            } else if (ke.equalsIgnoreCase("kg")) {
                return value / 1000000;
            } else if (ke.equalsIgnoreCase("ton")) {
                return value / 1000000000;
            } else {
                return 0;
            }
        } else if (dari.equalsIgnoreCase("g")) {
            if (ke.equalsIgnoreCase("mg")) {
                return value * 1000;
            } else if (ke.equalsIgnoreCase("kg")) {
                return value / 1000;
            } else if (ke.equalsIgnoreCase("ton")) {
                return value / 1000000;
            } else {
                return 0;
            }
        } else if (dari.equalsIgnoreCase("kg")) {
            if (ke.equalsIgnoreCase("g")) {
                return value * 1000;
            } else if (ke.equalsIgnoreCase("mg")) {
                return value * 1000000;
            } else if (ke.equalsIgnoreCase("ton")) {
                return value / 1000;
            } else {
                return 0;
            }
        } else if (dari.equalsIgnoreCase("ton")) {
            if (ke.equalsIgnoreCase("g")) {
                return value * 1000000;
            } else if (ke.equalsIgnoreCase("mg")) {
                return value * 1000000000;
            } else if (ke.equalsIgnoreCase("kg")) {
                return value * 1000;
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }
}

