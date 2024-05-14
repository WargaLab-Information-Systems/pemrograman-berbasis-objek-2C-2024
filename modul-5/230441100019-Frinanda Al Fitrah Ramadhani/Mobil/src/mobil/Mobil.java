/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mobil;

/**
 *
 * @author EBC KOMPUTER
 */
public class Mobil {
    String merk, model;
    int tahun_produksi;
    
    Mobil(String merk, String model, int tahun_produksi){
        this.merk = merk;
        this.model = model;
        this.tahun_produksi = tahun_produksi;
    } 
    
    void ShowFeature(){
        System.out.println("Merk           : "+this.merk);
        System.out.println("Model          : "+this.model);
        System.out.println("Tahun Produksi : "+this.tahun_produksi);
    }
}
