/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mobil;

/**
 *
 * @author pinokio
 */
 class MobilSport extends Mobil{
   public MobilSport(String Merek, String Model, int TahunProduksi){
        super(Merek,Model,TahunProduksi);
    } 

    @Override
    public void showFitur() {
        System.out.println("Fitur Keuggulan:");
        System.out.println("1. Memiliki kecepatan yang tinggi:");
        System.out.println("2. Kapasitas penumpang banyak:");
        }
}
