/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package konversisatuan;

public class suhu extends KonversiSatuan{
    
     @Override
     double konversi(double nilai, String dariSatuan, String keSatuan) {
        
        if (dariSatuan.equalsIgnoreCase("C") && keSatuan.equalsIgnoreCase("F")) {
            return nilai * 9 / 5 + 32;
        }
        
        else if (dariSatuan.equalsIgnoreCase("F") && keSatuan.equalsIgnoreCase("C")) {
            return (nilai - 32) * 5 / 9;
        }
        
        else if (dariSatuan.equalsIgnoreCase("C") && keSatuan.equalsIgnoreCase("R")) {
            return (4 / 5 * nilai);
        }
        else if (dariSatuan.equalsIgnoreCase("R") && keSatuan.equalsIgnoreCase("C")) {
            return nilai * 5 / 4;
        }
        else {
            System.out.println("satuan suhu tidak valid");
            return nilai;
                   
        }
    }
}


