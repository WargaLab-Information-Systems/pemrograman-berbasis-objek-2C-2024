/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mobil;

public class MobilListrik extends Mobil {
    MobilListrik(String merk,String model,int tahun){
        super(merk,model,tahun);
    }
    @Override
     void showfeature(){
        System.out.println("Kelebihan mobil : Ramah lingkungan tidak menghasilkan emisi gas " );
    };
     void showfeature(String hargabeli){
         System.out.println("harga mobil listrik sekarang:"+hargabeli);
     }
}   
