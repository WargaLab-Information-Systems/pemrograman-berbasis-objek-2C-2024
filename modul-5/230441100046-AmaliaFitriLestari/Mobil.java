/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mobil;

class Mobil {
    String merk;
    String model;
    int tahunProduksi;

    public Mobil(String merk, String model, int tahunProduksi) {
        this.merk = merk;
        this.model = model;
        this.tahunProduksi = tahunProduksi;
    }

    public void showFeature() {
        System.out.println("Mobil dengan merek" + merk + " ,model " + model + " dan tahun " + tahunProduksi + " memiliki fitur umum.");
    }
}
