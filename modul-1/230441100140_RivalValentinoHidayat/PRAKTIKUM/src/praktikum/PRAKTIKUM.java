/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum;


class manusia {
    String nama;
    int umur;
    String alamat;
    
    void berjalan(){
        System.out.println("Berjalan santai");
    }
    void berlari(){
        System.out.println("Berlari cepat");
    }
}

public class PRAKTIKUM {
    public static void main(String[] args) {
        manusia orang = new manusia();
        orang.nama = "Cindy";
        orang.umur = 20;
        orang.alamat = "Telang";
        
        System.out.println("Dia adalah " + orang.nama);
        System.out.println("Dia umur " + orang.umur);
        System.out.println("Dia berasal dari kota " + orang.alamat);
        
        System.out.print(orang.nama + " pergi ke sekolah dengan ");
        orang.berjalan();
        System.out.print(orang.nama + " juga hobi ");
        orang.berlari();
    }
}

