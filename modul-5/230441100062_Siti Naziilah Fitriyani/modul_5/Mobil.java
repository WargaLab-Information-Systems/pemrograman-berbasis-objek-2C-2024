/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul_5;

/**
 *
 * @author Acer
 */
public class Mobil {
    String merek;
    String model;
    int tahun;
    
    Mobil(String merek, String model, int tahun){
        this.merek = merek;
        this.model = model;
        this.tahun = tahun;
    }
    
    public void showFeature(){
        System.out.println(" Merk Mobil         : "+ merek);
        System.out.println(" Model Mobil        : "+ model);
        System.out.println(" Tahun produksi     : "+ tahun);
    }
}
