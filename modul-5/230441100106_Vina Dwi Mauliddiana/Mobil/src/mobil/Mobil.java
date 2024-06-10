/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mobil;

/**
 *
 * @author pinokio
 */
abstract class Mobil {
    //atribut
    String Merek;
    String Model;
    int TahunProduksi;
    
    //constructor
    public Mobil( String Merek, String Model, int TahunProduksi){
        this.Merek= Merek;
        this.Model= Model;
        this.TahunProduksi = TahunProduksi;
    }
    
    public void setMerek(String Merek){
        this.Merek= Merek;
    }
    
    public String getMerek(){
         return Merek;
    }
    
    public void setModel(String Model){
        this.Model=Model;
    }
    
    public String getModel(){
        return Model;
    }
    
    public void setTahunProduksi(int TahunProduksi){
        this.TahunProduksi=TahunProduksi;
    }
   
    public int getTahunProduksi(){
        return TahunProduksi;
    }
    
    //method menampilkan fitur mobil
    public abstract void showFitur();
    
   
    }


