/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul4;

/**
 *
 * @author EBC KOMPUTER
 */
public abstract class Konversi {
    double nilai;
    String dari;
    String menjadi;
    
    Konversi(double nilai, String dari, String menjadi){
        this.nilai = nilai;
        this.dari = dari;
        this.menjadi = menjadi;
    }
    
    public abstract double konversi();
}
