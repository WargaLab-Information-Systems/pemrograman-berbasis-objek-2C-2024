/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package konfersi;
    // Implementasi konversi waktu
public class waktu extends Konfersi {
    public waktu(String name) {
        super(name);
        }
    
    @Override
    public double convert(double value) {
        // Implementasi konversi waktu
        // Misalnya dari detik ke menit 
        
        if (getName().equalsIgnoreCase("detik")){
           return ( value / 60); 
//           menit ke jam
        }else if (getName().equalsIgnoreCase("menit")){
           return (value / 60 );   
        }else {
            System.out.println("satuan tidak valid");
            return 0;
    }
}
}

