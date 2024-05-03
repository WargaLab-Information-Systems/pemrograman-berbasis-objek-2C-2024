/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package konversi;

/**
 *
 * @author ASUS
 */
abstract class Konversi {
    protected double value ;
    
    public Konversi(double value){
        this.value = value ; 
    }
    
    public abstract double KonversiSatuan(String SatuanAsal, String to); 
}
   