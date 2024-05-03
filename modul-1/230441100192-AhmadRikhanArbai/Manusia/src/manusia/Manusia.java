/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manusia;

/**
 *
 * @author HP
 */
public class Manusia {
     String namaa ;
     String Alamatt ;
     int Umurr ;
    
    public void berjalan() {
        System.out.println(namaa + " sedang berjalan.");
    }
    

    public void berlari() {
        System.out.println(namaa + " sedang berlari.");
    }
    public static void main(String[] args) {

        Manusia manusia1 = new Manusia();
        Manusia manusia2 = new Manusia();
        manusia1.namaa= "rehan";
        manusia1.Umurr=19;
        manusia1.Alamatt="telang";
        manusia2.namaa= "abai";
        manusia2.Umurr=20;
        manusia2.Alamatt="kamal";
        

        manusia1.berjalan();
        manusia2.berlari();
        

        System.out.println("Informasi Manusia 1:");
        System.out.println("Nama: " + manusia1.namaa);
        System.out.println("Umur: " + manusia1.Umurr);
        System.out.println("Alamat: " + manusia1.Alamatt);
        
        System.out.println("\nInformasi Manusia 2:");
        System.out.println("Nama: " + manusia2.namaa);
        System.out.println("Umur: " + manusia2.Umurr);
        System.out.println("Alamat: " + manusia2.Alamatt);
    }

}

