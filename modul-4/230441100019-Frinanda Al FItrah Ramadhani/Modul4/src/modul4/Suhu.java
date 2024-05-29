/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul4;

/**
 *
 * @author EBC KOMPUTER
 */
public class Suhu extends Konversi{

    public Suhu(double nilai, String dari, String menjadi) {
        super(nilai, dari, menjadi);
    }
    
    @Override
    public double konversi(){
        double hasil = 0.0;
        if(dari.equalsIgnoreCase("C")){
            if(menjadi.equalsIgnoreCase("F")){
                return (nilai * 9 / 5) + 32;
            } else if(menjadi.equalsIgnoreCase("K")){
                return nilai + 273.15;
            } else if(menjadi.equalsIgnoreCase("R")){
                return nilai * 4.0 / 5.0;
            } else{
                System.out.println("Satuan suhu tujuan salah!");
            }
        } else if(dari.equalsIgnoreCase("F")){
            if(menjadi.equalsIgnoreCase("C")){
                return (5.0/9.0) * (nilai - 32);
            } else if(menjadi.equalsIgnoreCase("K")){
                return (nilai - 32) * 5.0 / 9.0 + 273.15;
            } else if(menjadi.equalsIgnoreCase("R")){
                return (nilai - 32) * 4.0 / 9.0;
            } else{
                System.out.println("Satuan suhu tujuan salah!");
            }   
        } else if(dari.equalsIgnoreCase("K")){
            if(menjadi.equalsIgnoreCase("C")){
                return nilai - 273.15;
            } else if(menjadi.equalsIgnoreCase("F")){
                return (nilai - 273.15) * 9.0 / 5.0 + 32;
            } else if(menjadi.equalsIgnoreCase("R")){
                return (nilai - 273.15) * 4.0 / 5.0;
            } else{
                System.out.println("Satuan suhu tujuan salah!");
            }   
        } else if(dari.equalsIgnoreCase("R")){
            if(menjadi.equalsIgnoreCase("C")){
                return nilai * 5.0 / 4.0;
            } else if(menjadi.equalsIgnoreCase("F")){
                return (nilai * 5.0 / 4.0) * 9.0 / 5.0 + 32;
            } else if(menjadi.equalsIgnoreCase("K")){
                return nilai * 5.0 / 4.0 + 273.15;
            } else{
                System.out.println("Satuan suhu tujuan salah!");
            }   
        } else {
            System.out.println("Satuan Suhu Tidak Ada!");
        }
        return hasil;
    }
}
