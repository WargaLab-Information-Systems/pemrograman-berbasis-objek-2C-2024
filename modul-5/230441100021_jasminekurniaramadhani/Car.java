/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package car;

/**
 *
 * @author Lenovo
 */
public class Car {
String merk, model;
    int tahunProduksi;

    void setAtribute(String merk, String model, int tahunProduksi){
        this.merk = merk;
        this.model = model;
        this.tahunProduksi = tahunProduksi;
    } 

    void showFeature(){
        System.out.println("Kelebihan dari mobil ini.");
    }
       void display(){
        System.out.println("\nMerk           : " + merk);
        System.out.println("Model          : " + model);
        System.out.println("Tahun Produksi : " + tahunProduksi);
    }
    
    void display(String info){
       System.out.println("\njenis mobil: " + info);
       
    }
    void display(int tempuh){
        System.out.println("\nTotal jarak tempuh: " + tempuh + " km");
       
    }
        
}
 