/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package konversisatuan1;

/**
 *
 * @author USER
 */
public class suhu extends KonversiSatuan1 {
    String dari;
    String ke;
    
    suhu(String dari, String ke) {
        this.dari = dari;
        this.ke = ke;
    }
    
    @Override
    double konversi(double value){
        if (dari.equalsIgnoreCase("C")) {
            if (ke.equalsIgnoreCase("F")) {
                return (value * 9.0/5) + 32;
            } else if (ke.equalsIgnoreCase("R")) {
                return (4.0/5 * value);
            } else if (ke.equalsIgnoreCase("K")) {
                return (value + 273.15);
            }
        }
        return 0;
    }
}
 