/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package satuan;

/**
 *
 * @author Lenovo
 */
public class convertSuhu extends Satuan{
    
    convertSuhu(double nilai, String satuanAsli,String satuanTujuan){
        super(nilai, satuanAsli, satuanTujuan);
    }
    
    @Override
    public double Conversikan(){
        if(satuanAsli.equalsIgnoreCase("Celsius") && satuanTujuan.equalsIgnoreCase("Kelvin")){
            return nilai+273.15;    
        }else if (satuanAsli.equalsIgnoreCase("Celsius") && satuanTujuan.equalsIgnoreCase("Fahrenh")){
            return nilai * 9/5 + 32;
        }else if (satuanAsli.equalsIgnoreCase("Kelvin") && satuanTujuan.equalsIgnoreCase("Celsius")){
            return nilai -273.15;
        }else if (satuanAsli.equalsIgnoreCase("Kelvin") && satuanTujuan.equalsIgnoreCase("Fahrenh")){
            return ( nilai - 273.15) * 9/5 + 32;
        }else if (satuanAsli.equalsIgnoreCase("Fahrenh") && satuanTujuan.equalsIgnoreCase("Celsius")){
            return nilai -32 * 9 / 5;
        }else if (satuanAsli.equalsIgnoreCase("Fahrenh" )&& satuanTujuan.equalsIgnoreCase("Kelvin")){
            return nilai  -32 * 5/9 + 273.15;
        }
        return 0;
    }
    
    
}
