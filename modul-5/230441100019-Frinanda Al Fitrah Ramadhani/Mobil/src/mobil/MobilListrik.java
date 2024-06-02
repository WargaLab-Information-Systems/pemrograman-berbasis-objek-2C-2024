/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mobil;

/**
 *
 * @author EBC KOMPUTER
 */
public class MobilListrik extends Mobil {
    String type = "Mobil Listrik";
    
    public MobilListrik(String mrek, String model, int tahun_produksi) {
        super(mrek, model, tahun_produksi);
    }
    
    void ShowFeature(){
        System.out.println();
        System.out.println(" -- Tipe Mobil "+type+" -- ");
        super.ShowFeature();
        System.out.println("Kelebihan      : Menggunakan energi listrik");
    }
}
