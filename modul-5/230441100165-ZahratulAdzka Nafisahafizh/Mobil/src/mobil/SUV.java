/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mobil;

public class SUV extends Mobil {
    SUV(String merk,String model,int tahun){
        super(merk,model,tahun);
    }
    
    @Override
    void showfeature(){
        System.out.println("Kelebihan mobil :Kendaraan tahan medan berat");
    };
     void showfeature(String warna){
         System.out.println("warna mobil"+warna);
     }
}
