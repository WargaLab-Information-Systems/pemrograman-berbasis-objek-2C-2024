/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kendaraan;
import java.util.Scanner; 
public class Kendaraan {  
        String jnskdr ;
        String merek ;
        String model ;
        char status ;
        String tahun ;
        
    public Kendaraan(String jnskdr, String merek , String model,char status, String tahun ){
        this.jnskdr = jnskdr  ;
        this.merek = merek  ;
        this.model = model  ;
        this.status = status  ;
        this.tahun = tahun  ;
    }
          
    public void display (){
        System.out.println("\n DATA KENDARAAN");
        System.out.println("Jenis kendaraan :"+jnskdr);
        System.out.println("Merek kendaraan :"+merek);
        System.out.println("Model kendaraan :"+model);
        System.out.println("Status kendaraan : "+status);
        System.out.println("Tahun kendaraan :"+tahun);       
        System.out.println("");

        }
}


