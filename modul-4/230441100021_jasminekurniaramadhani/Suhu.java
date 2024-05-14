/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package konversi;

/**
 *
 * @author ASUS
 */
public class Suhu extends Konversi {
     public Suhu(double value) {
        super(value);
    }
    @Override
    public double KonversiSatuan (String SatuanAsal, String to ) {
        // Implement temperature conversion logic here
        if (SatuanAsal.equalsIgnoreCase("Celsius")) {
            if (to.equalsIgnoreCase("Fahrenheit")) {
                return (value * 9 / 5) + 32;
            } else if (to.equalsIgnoreCase("Kelvin")) {
                return value + 273.15;
            }
        } else if (SatuanAsal.equalsIgnoreCase("Fahrenheit")) {
            if (to.equalsIgnoreCase("Celsius")) {
                return (value - 32) * 5 / 9;
            } else if (to.equalsIgnoreCase("Kelvin")) {
                return (value + 459.67) * 5 / 9;
            }
        } else if (SatuanAsal.equalsIgnoreCase("Kelvin")) {
            if (to.equalsIgnoreCase("Celsius")) {
                return value - 273.15;
            } else if (to.equalsIgnoreCase("Fahrenheit")) {
                return (value * 9 / 5) - 459.67;
            }
        }
        return 0; // Invalid conversion
    }
}

