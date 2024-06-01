/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mobil;

class MPV extends Mobil{
    public MPV(String merk, String model, int tahunProduksi) {
        super(merk, model, tahunProduksi);
    }

    @Override
    public void showFeature() {
        System.out.println("Mobil MPV dengan merek :" + merk + " , model:" + model + " dan tahun " + tahunProduksi + " keuntungannya yakni cocok untuk keluarga besar.");
    }
}    

