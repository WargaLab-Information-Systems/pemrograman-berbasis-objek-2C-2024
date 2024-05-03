/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package konversi;

/**
 *
 * @author ASUS
 */
public class Panjang extends Konversi{
    public Panjang(double value) {
        super(value);
    }

    @Override
    public double konversi(String dari, String ke) {
        if (dari.equalsIgnoreCase("mm")) {
            if (ke.equalsIgnoreCase("cm")) {
                return value / 10;
            } else if (ke.equalsIgnoreCase("m")) {
                return value / 1000;
            } else if (ke.equalsIgnoreCase("km")) {
                return value / 1000000;
            } else if (ke.equalsIgnoreCase("mi")) {
                return value / 1609340;
            } else if (ke.equalsIgnoreCase("in")) {
                return value / 25.4;
            } else {
                return 0;
            }
        } else if (dari.equalsIgnoreCase("cm")) {
            if (ke.equalsIgnoreCase("mm")) {
                return value * 10;
            } else if (ke.equalsIgnoreCase("m")) {
                return value / 100;
            } else if (ke.equalsIgnoreCase("km")) {
                return value / 100000;
            } else if (ke.equalsIgnoreCase("mi")) {
                return value / 160934;
            } else if (ke.equalsIgnoreCase("in")) {
                return value / 2.54;
            } else {
                return 0;
            }
        } else if (dari.equalsIgnoreCase("m")) {
            if (ke.equalsIgnoreCase("mm")) {
                return value * 1000;
            } else if (ke.equalsIgnoreCase("cm")) {
                return value * 100;
            } else if (ke.equalsIgnoreCase("km")) {
                return value / 1000;
            } else if (ke.equalsIgnoreCase("mi")) {
                return value / 1609.34;
            } else if (ke.equalsIgnoreCase("in")) {
                return value / 0.0254;
            } else {
                return 0;
            }
        } else if (dari.equalsIgnoreCase("km")) {
            if (ke.equalsIgnoreCase("mm")) {
                return value * 1000000;
            } else if (ke.equalsIgnoreCase("cm")) {
                return value * 100000;
            } else if (ke.equalsIgnoreCase("m")) {
                return value * 1000;
            } else if (ke.equalsIgnoreCase("mi")) {
                return value / 1.60934;
            } else if (ke.equalsIgnoreCase("in")) {
                return value / 0.0000254;
            } else {
                return 0;
            }
        } else if (dari.equalsIgnoreCase("mi")) {
            if (ke.equalsIgnoreCase("mm")) {
                return value * 1609340;
            } else if (ke.equalsIgnoreCase("cm")) {
                return value * 160934;
            } else if (ke.equalsIgnoreCase("m")) {
                return value * 1609.34;
            } else if (ke.equalsIgnoreCase("km")) {
                return value * 1.60934;
            } else if (ke.equalsIgnoreCase("in")) {
                return value * 63360;
            } else {
                return 0;
            }
        } else if (dari.equalsIgnoreCase("in")) {
            if (ke.equalsIgnoreCase("mm")) {
                return value * 25.4;
            } else if (ke.equalsIgnoreCase("cm")) {
                return value * 2.54;
            } else if (ke.equalsIgnoreCase("m")) {
                return value * 0.0254;
            } else if (ke.equalsIgnoreCase("km")) {
                return value * 0.0000254;
            } else if (ke.equalsIgnoreCase("mi")) {
                return value / 63360;
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }
}
