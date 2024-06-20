/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul4;

/**
 *
 * @author EBC KOMPUTER
 */
public class Panjang extends Konversi{
    
    public Panjang(double nilai, String dari, String menjadi) {
        super(nilai, dari, menjadi);
    }
    
    @Override
    public double konversi(){
        double hasil = 0.0;
        if(dari.equalsIgnoreCase("Cm") && menjadi.equalsIgnoreCase("M")){
            return nilai / 100;
        } else if(dari.equalsIgnoreCase("M") && menjadi.equalsIgnoreCase("Cm")){
            return nilai * 100;
        } else {
            System.out.println("Satuan Panjang tidak ada!");
        }
        return hasil;
    }
}
