/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kendaraan;

public class Kendaraan {
    String jenis ;
    String merek ;
    String model ;
    char status ;
    int tahun ;
    
    Kendaraan(String jenis, String merek, String model, char status, int tahun){
        this.jenis = jenis ;
        this.merek = merek ; 
        this.model = model ;
        this.status = status ;
        this.tahun = tahun ; 
    }
        
    void info(){
        System.out.println("\nInformasi Kendaraan :");
        System.out.println("Jenis Kendaraan : "+this.jenis);
        System.out.println("Merk            : "+this.merek);
        System.out.println("Model           : "+this.model);
        System.out.println("Tahun Kendaraan : "+this.tahun);
    }
    
    char getStatus(){
        return status ;
    }
}