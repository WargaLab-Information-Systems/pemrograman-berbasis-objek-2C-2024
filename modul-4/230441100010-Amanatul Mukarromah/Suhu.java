/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversi;
class Suhu extends KonversiSatuan {
    public Suhu(double value) {
        super(value);
    }
    @Override
    public double konversi(String SatuanAwal, String to) {
        if (SatuanAwal.equalsIgnoreCase("C")) {
            if (to.equalsIgnoreCase("F")) {
                return (value * 9/5) + 32;
            } else if (to.equalsIgnoreCase("R")) {
                return (4 / 5 * value);
            } else if (to.equalsIgnoreCase("K")) {
                return (value + 273.15);
            } else {
                return 0;
            }
        } else if (SatuanAwal.equalsIgnoreCase("F")) {
            if (to.equalsIgnoreCase("C")) {
                return (value - 32) * 5/9;
            } else if (to.equalsIgnoreCase("R")) {
                return (value - 32) * 4/9;
            } else if (to.equalsIgnoreCase("K")) {
                return (value - 32) * 5/9 + 273.15;
            } else {
                return 0;
            }
        } else if (SatuanAwal.equalsIgnoreCase("R")) {
            if (to.equalsIgnoreCase("C")) {
                return value * 5/4;
            } else if (to.equalsIgnoreCase("F")) {
                return value * 9/4 + 32;
            } else if (to.equalsIgnoreCase("K")) {
                return value * 5/4 + 273.15;
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }
}

