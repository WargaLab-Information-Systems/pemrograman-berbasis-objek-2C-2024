/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sewa;

/**
 *
 * @author Lenovo
 */
public class kendaraan {
    String macam;
    String namamerek;
    String model;
    char status;
//  tipe data 1 karakter/hrf , str sekumpulan 
    int thn;
    
    public kendaraan(String macam, String namamerek, String model, char status, int thn){
        this.macam = macam;
        this.namamerek = namamerek;
        this.model = model;
        this.status = status;
        this.thn = thn;
    }
    
    public void displayKet(){
        System.out.println("kendaraan ini bermerek : "+namamerek);
    }
    
//    get menampilkn hsl
    public String getmacam(){
        return macam;
    }
    
    public String getnamamerek(){
        return namamerek;
    }
    
    public String getModel() {
        return model;
    }

    public char getStatus() {
        return status;
    }

    public int getthn() {
         return thn ;
}
}
    
    

