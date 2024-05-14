/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package konversisatuan;


public class berat extends KonversiSatuan{
    
     @Override
      double konversi(double nilai, String dariSatuan, String keSatuan) {
        
        if (dariSatuan.equalsIgnoreCase("kg") && keSatuan.equalsIgnoreCase("ton")) {
            return nilai / 1000; 
        }
        
        else if (dariSatuan.equalsIgnoreCase("ton") && keSatuan.equalsIgnoreCase("kg")) {
            return nilai * 1000; 
        } else {
            System.out.println("Satuan berat tidak valid");
            return nilai;
        }
    }
}


