/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kendaraan;

/**
 *
 * @author ASUS
 */
public class Kendaraan {
    String jenisKendaraan ;
    String merek ;
    String model ;
    char status ;
    int tahunKendaraan ;
    
    Kendaraan(String jenisKendaraan, String merek, String model, char status, int tahunKendaraan){
        this.jenisKendaraan = jenisKendaraan ;
        this.merek = merek ; 
        this.model = model ;
        this.status = status ;
        this.tahunKendaraan = tahunKendaraan ; 
    }
    
    void display(){
        System.out.println("\nInformasi Kendaraan:");
        System.out.println("Jenis Kendaraan : "+this.jenisKendaraan);
        System.out.println("Merk            : "+this.merek);
        System.out.println("Model           : "+this.model);
        System.out.println("Status          : "+this.status);
        System.out.println("Tahun Kendaraan : "+this.tahunKendaraan);
    }
}
