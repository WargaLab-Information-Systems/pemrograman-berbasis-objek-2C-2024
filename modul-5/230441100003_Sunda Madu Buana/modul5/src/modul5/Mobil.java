/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul5;

public class Mobil {

    String merk;
    String model;
    int tahunProduksi;
    
    Mobil(String merk, String model, int tahunProduksi){
        this.merk = merk;
        this.model = model;
        this.tahunProduksi = tahunProduksi;
    }
    
    void showFeature(){
        System.out.println("Ini Mobil");
    }
}
