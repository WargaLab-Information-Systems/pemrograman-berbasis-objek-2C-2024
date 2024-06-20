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
    public double KonversiSatuan (String SatuanAsal, String to ) {
        // Implement weight conversion logic here
        if (SatuanAsal.equalsIgnoreCase("Ton")) {
            if (to.equalsIgnoreCase("Kilogram")) {
                return value * 1000;
            } else if (to.equalsIgnoreCase("Pound")) {
                return value * 1000000;
            }
        } else if (SatuanAsal.equalsIgnoreCase("Kilogram")) {
            if (to.equalsIgnoreCase("Gram")) {
                return value * 1000;
            } else if (to.equalsIgnoreCase("ton")) {
                return value / 1000;
            }  
        } else if (SatuanAsal.equalsIgnoreCase("Gram")) {
            if (to.equalsIgnoreCase("Kilogram")) {
                return value / 1000;
            } else if (to.equalsIgnoreCase("Ton")) {
                return value / 1000000;
            }
        }
        return 0; // Invalid conversion
    }
}

