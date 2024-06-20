/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package satuan;

/**
 *
 * @author Lenovo
 */
public class convertWaktu extends Satuan{
    
    convertWaktu(double nilai, String satuanAsli,String satuanTujuan){
        super(nilai, satuanAsli, satuanTujuan);
    }
    
    @Override
    public double Conversikan(){
        if(satuanAsli.equalsIgnoreCase("Detik") && satuanTujuan.equalsIgnoreCase("Menit")){
            return nilai / 60;    
        }else if (satuanAsli.equalsIgnoreCase("Detik") && satuanTujuan.equalsIgnoreCase("Jam")){
            return nilai / 3600;
        }else if (satuanAsli.equalsIgnoreCase("Menit") && satuanTujuan.equalsIgnoreCase("Detik")){
            return nilai * 60;
        }else if (satuanAsli.equalsIgnoreCase("Menit") && satuanTujuan.equalsIgnoreCase("Jam")){
            return  nilai / 60;
        }else if (satuanAsli.equalsIgnoreCase("Jam") && satuanTujuan.equalsIgnoreCase("Detik")){
            return nilai * 3600;
        }else if (satuanAsli.equalsIgnoreCase("jam" )&& satuanTujuan.equalsIgnoreCase("Menit")){
            return nilai  * 60;
        }
        return 0;
    }
    
    
}
