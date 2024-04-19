package com.mycompany.kendaraan;
public class Motor extends Kendaraan { 
    
    String fasilitas = "Motor Beroda 2";
    
        Motor(String merek, String model, char status, int tahunKendaraan){
        super("Mobil", merek, model, status, tahunKendaraan);
        }
        
    @Override
    void display(){
        super.display();
        System.out.println("Fasilitas    : "+this.fasilitas);
    }
}