/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mobil;
class Mobilsport extends Mobil {
    public Mobilsport(String merk, String model, int tahunProduksi) {
        super(merk, model, tahunProduksi);
    }

    @Override
    public void showFeature() {
        System.out.println("Mobil Sport dengan merek :" + merk + " ,model:" + model + " dan tahun: " + tahunProduksi + " keuntungannya yakni memiliki kecepatan tinggi.");
    }
}


