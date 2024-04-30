/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package konfersi;
    // Implementasi konversi panjang
public class panjang extends Konfersi {
    public panjang(String name) {
        super(name);
    }
    @Override
    public double convert(double value) {
        // Implementasi konversi panjang
        // Misalnya dari centimeter ke meter
        if (getName().equalsIgnoreCase("centimeter")){
           return ( value / 100); 
//           meter ke kilometer
        }else if (getName().equalsIgnoreCase("meter")){
           return (value / 1000 ) ;    
        }else {
            System.out.println("satuan tidak valid");
            return 0;
        }
    }
}

