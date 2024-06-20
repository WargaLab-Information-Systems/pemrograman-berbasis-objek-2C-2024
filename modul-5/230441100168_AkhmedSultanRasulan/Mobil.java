/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mobil;

public class Mobil {
    String kategori;
    String merek;
    String model;
    int tahun;


    Mobil(String kategori, String merek, String model, int tahun){
    this.kategori = kategori;
    this.merek = merek;
    this.model = model;
    this.tahun = tahun;
    }
 
    void display(){
        System.out.println("KATEGORI      : " + this.kategori);
        System.out.println("MEREK         : " + this.merek);
        System.out.println("MODEL         : " +this.model);
        System.out.println("TAHUN         : " +this.tahun);
    }

    void display(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    

}

