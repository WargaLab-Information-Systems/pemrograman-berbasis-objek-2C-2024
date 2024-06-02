/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mobil;

/**
 *
 * @author Lenovo
 */
public abstract class Mobil {

    String merk, model;
    int thnProduksi;
//    construktor
    Mobil(String merk, String model, int thnproduksi){
        this.merk=merk;
        this.model=model;
        this.thnProduksi=thnproduksi;
    }
//    getset
   public String getMerk(){
       return merk;
   }
   public void setMerk(String merk){
       this.merk=merk;
   }
   public String getModel(){
       return model;
   }
   public void setModel(String model){
       this.model=model;
   }
   public int getThnProduksi(){
       return thnProduksi;
   }
   public void setThnProduksi(){
       this.thnProduksi=thnProduksi;
   }
   //    method abstrak menampilkan fitur umum mobil
    public abstract void showFeature(double jaraktempuh );

    void showFeature() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
