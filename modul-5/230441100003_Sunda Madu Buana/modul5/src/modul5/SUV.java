/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul5;

public class SUV extends Mobil {
    
    public SUV(String merk, String model, int tahunProduksi) {
        super(merk, model, tahunProduksi);
    }
    
    @Override
    void showFeature(){
        System.out.println("kelebihan : Body kokoh dan desain sporty");
    }
}
