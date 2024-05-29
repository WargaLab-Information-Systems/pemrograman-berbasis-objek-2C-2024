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
    public double KonversiSatuan(String SatuanAsal, String to) {
        // Implement time conversion logic here
        if (SatuanAsal.equalsIgnoreCase("detik")) {
            if (to.equalsIgnoreCase("menit")) {
                return value / 60;
            } else if (to.equalsIgnoreCase("jam")) {
                return value / 3600;
            }
        } else if (SatuanAsal.equalsIgnoreCase("menit")) {
            if (to.equalsIgnoreCase("detik")) {
                return value * 60;
            } else if (to.equalsIgnoreCase("jam")) {
                return value / 60;
            }
        } else if (SatuanAsal.equalsIgnoreCase("jam")) {
            if (to.equalsIgnoreCase("detik")) {
                return value * 3600;
            } else if (to.equalsIgnoreCase("menit")) {
                return value * 60;
            }
        }
        return 0; // Invalid conversion
    }
}
