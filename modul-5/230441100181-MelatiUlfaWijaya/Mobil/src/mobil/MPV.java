/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mobil;

//Mobil multi-purpose vehicle
public class MPV extends Mobil{
    public MPV(String merk, String model, int thnProduksi){
        super(merk,model,thnProduksi);
    }
    public void showFeature(){
        System.out.println("Fitur khusus : ");
        System.out.println("=> Lega");
        System.out.println("=> Kapasistas penumpang lebih banyak");
        System.out.println("=> Kuat digunakan di berbagai medan");
        
    }
//    method overload
    public void showFeature(double jarakTempuh){
        System.out.println("Jarak Tempuh Mobil "+jarakTempuh +"km");
//        System.out.println("mesin yang bertenaga dan hemat bahan bakar ");
  
    }
}