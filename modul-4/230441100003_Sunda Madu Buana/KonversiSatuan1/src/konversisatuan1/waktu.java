/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package konversisatuan1;

/**
 *
 * @author USER
 */
public class waktu extends KonversiSatuan1 {
    String dari;
    String ke;
    
    waktu(String dari, String ke) {
        this.dari = dari;
        this.ke = ke;
    }
    
    @Override
    double konversi(double value){
        if (dari.equalsIgnoreCase("h")) {
            if (ke.equalsIgnoreCase("s")) {
                return (value * 3600);
            } else if (ke.equalsIgnoreCase("m")) {
                return (value * 60);
            }
        } 
        return 0;
    }
    
}
