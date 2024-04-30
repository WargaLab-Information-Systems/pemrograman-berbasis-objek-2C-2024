/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package konfersi;

public class suhu extends Konfersi {
    public suhu(String name) {
        super(name);
    }
    
    @Override
    public double convert(double value) {
        // Implementasi konversi suhu
        //  dari Celsius ke fahrenheit
        if (getName().equalsIgnoreCase("celcius")){
           return (value * 9/5 )+32 ;   
//          fahrenheit ke reamur
        }else if (getName().equalsIgnoreCase("fahrenheit")){
           return (value - 32 ) * 4/9 ;    
//           reamur ke kelvin
        }else if (getName().equalsIgnoreCase("reamur")){
           return (value + 273.15) * 5/9 ;   
//           dari celcius ke reamur 

        }else if (getName().equalsIgnoreCase("celciusToReamur")){
           return ( value ) * 4/5 ; 
           
        }else {
            System.out.println("satuan tidak valid");
            return 0;
    }
} 
}
