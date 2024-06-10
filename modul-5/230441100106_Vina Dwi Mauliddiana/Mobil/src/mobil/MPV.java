/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mobil;

/**
 *
 * @author pinokio
 */
class MPV  extends Mobil {
     public MPV(String Merek, String Model, int TahunProduksi){
        super(Merek,Model,TahunProduksi);
    }

    @Override
    public void showFitur() {
        System.out.println("Fitur Keunggulan");
        System.out.println("1. Punya Ground Clearance Tinggi");
        System.out.println("2. Cocok untuk Berbagai Kondisi Jalan");
    }
}
