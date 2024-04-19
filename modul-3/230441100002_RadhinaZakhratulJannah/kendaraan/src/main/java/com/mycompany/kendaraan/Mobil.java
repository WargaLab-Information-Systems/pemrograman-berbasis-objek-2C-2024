package com.mycompany.kendaraan;
public class Mobil extends Kendaraan {
   
    String fasilitas = "Mobil Beroda 4";
    
        Mobil(String merek, String model, char status, int tahunKendaraan){
        super("Mobil", merek, model, status, tahunKendaraan);
        }
        
    @Override
    void display(){
        super.display();
        System.out.println("Fasilitas    : "+this.fasilitas);
    }
}
