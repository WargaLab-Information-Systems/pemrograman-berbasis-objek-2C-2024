/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package konversisatuan1;

/**
 *
 * @author USER
 */
public class berat extends KonversiSatuan1 {
    String dari;
    String ke;
    
    berat(String dari, String ke) {
        this.dari = dari;
        this.ke = ke;
    }
    
    @Override
    double konversi(double value){
        if (dari.equalsIgnoreCase("kg")) {
            if (ke.equalsIgnoreCase("g")) {
                return (value * 1000);
            } else if (ke.equalsIgnoreCase("mg")) {
                return (value * 1000000);
            }
        } 
        return 0;
    }
    
}
