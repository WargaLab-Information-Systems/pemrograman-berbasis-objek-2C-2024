/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversi;
class Waktu extends KonversiSatuan {
    public Waktu(double value) {
        super(value);
    }

    @Override
    public double konversi(String SatuanAwal, String to) {
        if (SatuanAwal.equalsIgnoreCase("d")) {
            if (to.equalsIgnoreCase("m")) {
                return value / 60;
            } else if (to.equalsIgnoreCase("j")) {
                return value / 3600;
            } else if (to.equalsIgnoreCase("h")) {
                return value / 86400;
            } else {
                return 0;
            }
        } else if (SatuanAwal.equalsIgnoreCase("m")) {
            if (to.equalsIgnoreCase("d")) {
                return value * 60;
            } else if (to.equalsIgnoreCase("j")) {
                return value / 60;
            } else if (to.equalsIgnoreCase("h")) {
                return value / 1440;
            } else {
                return 0;
            }
        } else if (SatuanAwal.equalsIgnoreCase("j")) {
            if (to.equalsIgnoreCase("d")) {
                return value * 3600;
            } else if (to.equalsIgnoreCase("m")) {
                return value * 60;
            } else if (to.equalsIgnoreCase("h")) {
                return value / 24;
            } else {
                return 0;
            }
        } else if (SatuanAwal.equalsIgnoreCase("h")) {
            if (to.equalsIgnoreCase("d")) {
                return value * 86400;
            } else if (to.equalsIgnoreCase("m")) {
                return value * 1440;
            } else if (to.equalsIgnoreCase("j")) {
                return value * 24;
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }
}
