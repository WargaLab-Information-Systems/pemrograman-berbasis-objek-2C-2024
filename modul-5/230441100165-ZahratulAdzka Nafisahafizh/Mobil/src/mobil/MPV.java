/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mobil;


public class MPV extends Mobil{
    MPV(String merk,String model,int tahun){
        super(merk,model,tahun);
    }
    
    @Override
     void showfeature(){
        System.out.println("kelebihan: kapasitas penumpang lebih banyak");
    };
     void showfeature(String kecepatan){
         System.out.println("kecepatan mobil"+kecepatan);
     }
}
