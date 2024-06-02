/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mobil;

/**
 *
 * @author EBC KOMPUTER
 */
public class MPV extends Mobil{
    String type = "MPV";
    
    public MPV(String mrek, String model, int tahun_produksi) {
        super(mrek, model, tahun_produksi);
    }
    
    void ShowFeature(){
        System.out.println();
        System.out.println(" -- Tipe Mobil "+type+" -- ");
        super.ShowFeature();
        System.out.println("Kemampuan      : Kapasitas penumpang banyak");
    }
}
