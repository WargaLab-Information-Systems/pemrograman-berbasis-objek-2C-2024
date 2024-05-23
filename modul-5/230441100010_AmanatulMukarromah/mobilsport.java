/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mobil;
public class mobilsport extends Mobil {
    public mobilsport(String merk, String model, int tahunProduksi) {
        super(merk, model, tahunProduksi);
    }
    @Override
    public void ShowFeature() {
        super.ShowFeature();
        System.out.println("kemampuan lebih Kencang");
    }
    public void ShowFeature(String warna){
        System.out.println("berwarna " + warna);
    }
}



