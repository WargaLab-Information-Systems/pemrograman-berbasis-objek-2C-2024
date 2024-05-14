/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumpbo;

/**
 *
 * @author IBUCOMP
 */
public class manusia {
    String nama;
    int umur;
    String alamat;
    
    void berlari(){
        System.out.println(nama+ " sedang berlari");
    }
    void berjalan(){
        System.out.println(nama+ " sedang berjalan");
    }
    
    public static void main(String[] args) {
        manusia fulan = new manusia();
        fulan.nama = "Fulan";
        fulan.umur = 20;
        fulan.alamat = "Indonesia";
        System.out.println("Nama    : " +fulan.nama);
        System.out.println("Umur    : " +fulan.umur);
        System.out.println("Alamat  : " +fulan.alamat);
        fulan.berlari();
        System.out.println("");
        
        manusia fulani = new manusia();
        fulani.nama = "Fulani";
        fulani.umur = 18;
        fulani.alamat = "Malaysia";
        System.out.println("Nama    : " +fulani.nama);
        System.out.println("Umur    : " +fulani.umur);
        System.out.println("Alamat  : " +fulani.alamat);
        fulani.berjalan();
        System.out.println("");
        
        manusia fulano = new manusia();
        fulano.nama = "Fulano";
        fulano.umur = 30;
        fulano.alamat = "Bekasi";
        System.out.println("Nama    : " +fulano.nama);
        System.out.println("Umur    : " +fulano.umur);
        System.out.println("Alamat  : " +fulano.alamat);
        fulano.berlari();
        System.out.println("");
    }
    
}
