/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum1;

class Manusia {
    String nama;
    int umur;
    String asal;
    
    void berjalan () {
        System.out.println("Berjalan");
    }
    void berlari () {
        System.out.println("Berlari");
    }
}

public class Praktikum1 {
       
    public static void main(String[] args) {
        Manusia a = new Manusia();
        Manusia b = new Manusia();
        a.nama = "Ivan";
        a.umur = 19;
        a.asal = "Surabaya";
        b.nama = "Mad Dog";
        b.umur = 19;
        b.asal = "Roxwood";
        System.out.println("Nama :"+a.nama);
        System.out.println("Umur :"+a.umur);
        System.out.println("Asal :"+a.asal);
        a.berjalan();
        a.berlari();
        System.out.println("Nama :"+b.nama);
        System.out.println("Umur :"+b.umur);
        System.out.println("Asal :"+b.asal);
        b.berjalan();
        b.berlari();
    }
    
}