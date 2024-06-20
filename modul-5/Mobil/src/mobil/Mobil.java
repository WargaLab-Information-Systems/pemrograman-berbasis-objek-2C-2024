/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mobil;

class Mobil {
    String merk;
    String model;
    String tahunProduksi;

    public Mobil(String merk, String model, String tahunProduksi) {
        this.merk = merk;
        this.model = model;
        this.tahunProduksi = tahunProduksi;
    }

    public void showFeature() {
        System.out.println("Mobil " + merk + " " + model + " tahun " + tahunProduksi);
    }

    public void evaluate() {
    }
}