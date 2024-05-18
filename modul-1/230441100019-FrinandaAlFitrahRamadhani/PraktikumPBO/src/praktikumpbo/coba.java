/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumpbo;

class Mobil {
    String merk;
    String warna;
    
    void bergerak(){
        System.out.println("ngeng");
    }
}

/**
 *
 * @author IBUCOMP
 */
public class coba {
    public static void main(String[]args){
        Mobil mobil = new Mobil();
        mobil.merk = "pajero";
        mobil.warna = "merah";     
        System.out.println("mobilku" +mobil.merk);
        System.out.println(mobil.merk+ "berjalan dengan suara");
        mobil.bergerak();
        
        
    }
}
