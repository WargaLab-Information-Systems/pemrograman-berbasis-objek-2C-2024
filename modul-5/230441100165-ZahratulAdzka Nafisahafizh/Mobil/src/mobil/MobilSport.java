/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mobil;

public class MobilSport extends Mobil {
     MobilSport(String merk,String model,int tahun){
        super(merk,model,tahun);
    }
    @Override
    void showfeature(){
        System.out.println("Kelebihan mobil : Mampu digunakan dalam kecepatan tinggi");
    };
    void showfeature(String warna,int unit){
         System.out.println("warna mobil"+warna+"tersedia unit mobil: "+unit);
//         System.out.println("harga mobil"+harga);
//         
     }
}   

