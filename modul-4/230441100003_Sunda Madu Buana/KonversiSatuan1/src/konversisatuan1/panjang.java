/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package konversisatuan1;

/**
 *
 * @author USER
 */
public class panjang extends KonversiSatuan1 {
    String dari;
    String ke;
    
    panjang(String dari, String ke) {
        this.dari = dari;
        this.ke = ke;
    }
    @Override
    double konversi(double value){
        if (dari.equalsIgnoreCase("m")) {
            if (ke.equalsIgnoreCase("cm")) {
                return (value * 100);
            } else if (ke.equalsIgnoreCase("km")) {
                return (value / 1000);
            }
        } 
        return 0;
    }
}
