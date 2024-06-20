/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package konversisatuan;

public class panjang extends KonversiSatuan {
    
     @Override
        double konversi(double nilai, String dariSatuan, String keSatuan) {
        
        if (dariSatuan.equalsIgnoreCase("m") && keSatuan.equalsIgnoreCase("cm")) {
            return nilai * 100;
        }
        
        else if (dariSatuan.equalsIgnoreCase("cm") && keSatuan.equalsIgnoreCase("m")) {
            return nilai / 100;
            
        } else {
            System.out.println("satuan panjang tidak valid");
            return nilai;
                   
        }
    }

}
