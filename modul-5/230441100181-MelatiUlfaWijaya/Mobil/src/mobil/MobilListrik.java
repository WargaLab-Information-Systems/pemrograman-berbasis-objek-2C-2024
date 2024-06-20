/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mobil;

public class MobilListrik extends Mobil{
    public MobilListrik(String merk, String model, int thnProduksi){
        super(merk,model,thnProduksi);
    }
    
    public void showFeature(){
        System.out.println("Fitur khusus : ");
        System.out.println("=> Suara yang halus");
        System.out.println("=> kendaraan bertenaga listrik");
        System.out.println("=> mengurangi polusi udara");
    }
    public void showFeature(double jarakTempuh){
        System.out.println("Jarak Tempuh mobil "+jarakTempuh);
//        System.out.println("menmapilkan jangkuan baterai  ");
    }
}
