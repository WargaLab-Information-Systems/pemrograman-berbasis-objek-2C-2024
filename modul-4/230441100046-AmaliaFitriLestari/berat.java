/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package konfersi;
    // Implementasi konversi berat
public class berat extends Konfersi {
    public berat(String name) {
        super(name);
    }

    public double convert(double value) {
        // Implementasi konversi berat
        // Misalnya dari Gram ke Kilogram
        return value / 1000;
    }
}
