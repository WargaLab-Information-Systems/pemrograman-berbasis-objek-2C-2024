/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul4;

/**
 *
 * @author EBC KOMPUTER
 */
public class Waktu extends Konversi{
    
    public Waktu(double nilai, String dari, String menjadi) {
        super(nilai, dari, menjadi);
    }
    
    @Override
    public double konversi(){
        double hasil = 0.0;
        if(dari.equalsIgnoreCase("M") && menjadi.equalsIgnoreCase("J")){
            return nilai / 60;
        } else if(dari.equalsIgnoreCase("J") && menjadi.equalsIgnoreCase("M")){
            return nilai * 60;
        } else {
            System.out.println("Satuan Waktu tidak ada!");
        }
        return hasil;
    }
}
