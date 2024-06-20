/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mobil;

public class SUV extends Mobil{
    public SUV(String merk, String model, int thnProduksi){
        super(merk,model,thnProduksi);
    }
   
    public void showFeature(){
        System.out.println("Fitur khusus : ");
        System.out.println("=> Lebih efesiensi akomodasi barang bawaan");
        System.out.println("=> Electric Parking Brakeg");
        System.out.println("=> rem anti terkunci");
        System.out.println("=> kontrol stabilitas elektronik");
        System.out.println("=> sistem pencegahan tabrakan");
    }
    public void showFeature(double jarakTempuh){
        System.out.println("Jarak Tempuh mobil "+jarakTempuh + "km");
//        System.out.println("Ground clearance yang tinggi dan sistem penggerak roda (4WD/AWD) ");
    }
    
}
