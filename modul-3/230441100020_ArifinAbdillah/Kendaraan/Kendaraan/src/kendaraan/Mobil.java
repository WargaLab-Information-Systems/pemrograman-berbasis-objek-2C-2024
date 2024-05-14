/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kendaraan;

public class Mobil extends Kendaraan{
        String fasilitas = "mobil tidak ada ac";
        
        Mobil(String merek, String model, char status, int tahun){
        super("Mobil", merek, model, status, tahun);
    }
    
    @Override
    void display(){
         super.display();
            System.out.println("mobil tidak ber ac");
    }
   
    
    
}
