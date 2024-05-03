/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manusia;

/**
 *
 * @author HP
 */
public class main {
    public static void main(String[] args) {

        Manusia manusia1 = new Manusia("Rikhan", 20, "Jl. Merdeka No. 354");
        Manusia manusia2 = new Manusia("ARBAI", 19, "Jl. Sudirman No. 313");
        

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
