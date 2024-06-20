/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversi;

class Panjang extends KonversiSatuan {
    public Panjang(double value) {
        super(value);
    }

    @Override
    public double konversi(String SatuanAwal, String to) {
        if (SatuanAwal.equalsIgnoreCase("mm")) {
            if (to.equalsIgnoreCase("cm")) {
                return value / 10;
            } else if (to.equalsIgnoreCase("m")) {
                return value / 1000;
            } else if (to.equalsIgnoreCase("km")) {
                return value / 1000000;
            } else if (to.equalsIgnoreCase("mi")) {
                return value / 1609340;
            } else if (to.equalsIgnoreCase("in")) {
                return value / 25.4;
            } else {
                return 0;
            }
        } else if (SatuanAwal.equalsIgnoreCase("cm")) {
            if (to.equalsIgnoreCase("mm")) {
                return value * 10;
            } else if (to.equalsIgnoreCase("m")) {
                return value / 100;
            } else if (to.equalsIgnoreCase("km")) {
                return value / 100000;
            } else if (to.equalsIgnoreCase("mi")) {
                return value / 160934;
            } else if (to.equalsIgnoreCase("in")) {
                return value / 2.54;
            } else {
                return 0;
            }
        } else if (SatuanAwal.equalsIgnoreCase("m")) {
            if (to.equalsIgnoreCase("mm")) {
                return value * 1000;
            } else if (to.equalsIgnoreCase("cm")) {
                return value * 100;
            } else if (to.equalsIgnoreCase("km")) {
                return value / 1000;
            } else if (to.equalsIgnoreCase("mi")) {
                return value / 1609.34;
            } else if (to.equalsIgnoreCase("in")) {
                return value / 0.0254;
            } else {
                return 0;
            }
        } else if (SatuanAwal.equalsIgnoreCase("km")) {
            if (to.equalsIgnoreCase("mm")) {
                return value * 1000000;
            } else if (to.equalsIgnoreCase("cm")) {
                return value * 100000;
            } else if (to.equalsIgnoreCase("m")) {
                return value * 1000;
            } else if (to.equalsIgnoreCase("mi")) {
                return value / 1.60934;
            } else if (to.equalsIgnoreCase("in")) {
                return value / 0.0000254;
            } else {
                return 0;
            }
        } else if (SatuanAwal.equalsIgnoreCase("mi")) {
            if (to.equalsIgnoreCase("mm")) {
                return value * 1609340;
            } else if (to.equalsIgnoreCase("cm")) {
                return value * 160934;
            } else if (to.equalsIgnoreCase("m")) {
                return value * 1609.34;
            } else if (to.equalsIgnoreCase("km")) {
                return value * 1.60934;
            } else if (to.equalsIgnoreCase("in")) {
                return value * 63360;
            } else {
                return 0;
            }
        } else if (SatuanAwal.equalsIgnoreCase("in")) {
            if (to.equalsIgnoreCase("mm")) {
                return value * 25.4;
            } else if (to.equalsIgnoreCase("cm")) {
                return value * 2.54;
            } else if (to.equalsIgnoreCase("m")) {
                return value * 0.0254;
            } else if (to.equalsIgnoreCase("km")) {
                return value * 0.0000254;
            } else if (to.equalsIgnoreCase("ml")) {
                return value / 63360;
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }
}
