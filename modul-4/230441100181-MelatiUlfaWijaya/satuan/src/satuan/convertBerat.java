/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package satuan;

/**
 *
 * @author Lenovo
 */
public class convertBerat extends Satuan{
    
    convertBerat(double nilai, String satuanAsli,String satuanTujuan){
        super(nilai, satuanAsli, satuanTujuan);
    }
    
    @Override
    public double Conversikan(){
        if(satuanAsli.equalsIgnoreCase("Ons") && satuanTujuan.equalsIgnoreCase("Gram")){
            return nilai* 28.25;    
        }else if (satuanAsli.equalsIgnoreCase("Ons") && satuanTujuan.equalsIgnoreCase("Kilogram")){
            return nilai / 35.274;
        }else if (satuanAsli.equalsIgnoreCase("Gram") && satuanTujuan.equalsIgnoreCase("Ons")){
            return nilai / 28.35;
        }else if (satuanAsli.equalsIgnoreCase("Gram") && satuanTujuan.equalsIgnoreCase("Kilogram")){
            return ( nilai - 273.15) / 1000;
        }else if (satuanAsli.equalsIgnoreCase("Kilogram") && satuanTujuan.equalsIgnoreCase("Ons")){
            return nilai * 35.274;
        }else if (satuanAsli.equalsIgnoreCase("Kilogram" )&& satuanTujuan.equalsIgnoreCase("Gram")){
            return nilai  *1000;
        }
        return 0;
    }
    
    
}
