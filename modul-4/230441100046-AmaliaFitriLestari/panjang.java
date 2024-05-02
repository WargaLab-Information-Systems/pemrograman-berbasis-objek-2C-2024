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

    public double convert(double value) {
        // Implementasi konversi panjang
        // Misalnya dari Meter ke Kilometer
        return value / 1000;
    }
}

