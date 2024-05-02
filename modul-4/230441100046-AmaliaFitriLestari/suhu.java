/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package konfersi;
public class suhu extends Konfersi {
    public suhu(String name) {
        super(name);
    }

    public double convert(double value) {
        // Implementasi konversi suhu
        // Misalnya dari Celsius ke Fahrenheit
        return (value * 9/5) + 32;
    }
}






    
}
