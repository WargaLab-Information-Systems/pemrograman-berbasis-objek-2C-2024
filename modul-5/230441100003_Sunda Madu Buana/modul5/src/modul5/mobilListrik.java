/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul5;

public class mobilListrik extends Mobil {
    
    public mobilListrik(String merk, String model, int tahunProduksi) {
        super(merk, model, tahunProduksi);
    }
    
    @Override
    void showFeature(){
        System.out.println("kelebihan : memiliki torsi instan");
    }
}
