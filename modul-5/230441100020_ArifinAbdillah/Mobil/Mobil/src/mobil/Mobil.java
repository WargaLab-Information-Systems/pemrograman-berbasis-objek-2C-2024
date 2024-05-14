/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mobil;


public class Mobil {
    String merk;
    String model;
    int TahunProduksi;
   
    Mobil(String merk, String model, int TahunProduksi){
        this.merk=merk;
        this.model=model;
        this.TahunProduksi=TahunProduksi;
    }
    void showfeature(){
        System.out.println("\nFitur Kendaraan   :");
        System.out.println("Merk              : "+this.merk);
        System.out.println("Model             : "+this.model);
        System.out.println("Tahun Produksi    : "+this.TahunProduksi);
    }
}
