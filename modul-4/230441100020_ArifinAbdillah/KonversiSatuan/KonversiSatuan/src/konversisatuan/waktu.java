/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package konversisatuan;


public class waktu extends KonversiSatuan{
    
    @Override
    double konversi(double nilai, String dariSatuan, String keSatuan) {
        
        if (dariSatuan.equalsIgnoreCase("menit") && keSatuan.equalsIgnoreCase("jam")) {
            return nilai / 60;
        }
        
        else if (dariSatuan.equalsIgnoreCase("jam") && keSatuan.equalsIgnoreCase("menit")) {
            return nilai * 60;
            
        } else {
           System.out.println("satuan waktu tidak valid");
            return nilai;
                   
        }
    }

}
