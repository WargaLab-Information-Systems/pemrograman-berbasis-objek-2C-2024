/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package satuan;

/**
 *
 * @author Lenovo
 */
public class convertPanjang extends Satuan{
    
    convertPanjang(double nilai, String satuanAsli,String satuanTujuan){
        super(nilai, satuanAsli, satuanTujuan);
    }
    
    @Override
    public double Conversikan(){
        if(satuanAsli.equalsIgnoreCase("Centimeter") && satuanTujuan.equalsIgnoreCase("Meter")){
            return nilai/  100;    
        }else if (satuanAsli.equalsIgnoreCase("Centimeter") && satuanTujuan.equalsIgnoreCase("Kilometer")){
            return nilai * 100000;
        }else if (satuanAsli.equalsIgnoreCase("Meter") && satuanTujuan.equalsIgnoreCase("Centimeter")){
            return nilai *  100;
        }else if (satuanAsli.equalsIgnoreCase("Meter") && satuanTujuan.equalsIgnoreCase("Kilometer")){
            return  nilai * 1000;
        }else if (satuanAsli.equalsIgnoreCase("Kilometer") && satuanTujuan.equalsIgnoreCase("Centimeter")){
            return nilai / 100000;
        }else if (satuanAsli.equalsIgnoreCase("Kilometer" )&& satuanTujuan.equalsIgnoreCase("Kilometer")){
            return nilai  / 1000;
        }
        return 0;
    }
    
    
}
