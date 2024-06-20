/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul5;

public class mobilSport extends Mobil {
    
    public mobilSport(String merk, String model, int tahunProduksi) {
        super(merk, model, tahunProduksi);
    }
    
    @Override
    void showFeature(){
        System.out.println("kelebihan : stabilitas pada kecepatan tinggi");
    }
}
