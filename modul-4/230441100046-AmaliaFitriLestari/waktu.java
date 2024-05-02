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
    
    public double convert(double value) {
        // Implementasi konversi waktu
        // Misalnya dari Detik ke Menit
        return value / 60;
    }
}


