/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul4;

/**
 *
 * @author EBC KOMPUTER
 */
public class Berat extends Konversi{

    public Berat(double nilai, String dari, String menjadi) {
        super(nilai, dari, menjadi);
    }
    
    @Override
    public double konversi(){
        double hasil = 0.0;
        if(dari.equalsIgnoreCase("G") && menjadi.equalsIgnoreCase("Kg")){
            return nilai / 1000;
        } else if(dari.equalsIgnoreCase("Kg") && menjadi.equalsIgnoreCase("G")){
            return nilai * 1000;
        } else {
            System.out.println("Satuan Berat tidak ada!");
        }
        return hasil;
    }
}
