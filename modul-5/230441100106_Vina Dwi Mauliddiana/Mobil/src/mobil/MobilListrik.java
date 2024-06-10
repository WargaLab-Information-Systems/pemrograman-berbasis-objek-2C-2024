/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mobil;

/**
 *
 * @author pinokio
 */
class MobilListrik extends Mobil{
    public MobilListrik(String Merek, String Model, int TahunProduksi){
        super(Merek,Model,TahunProduksi);
    }

    @Override
    public void showFitur() {
        System.out.println("Fitur Keunggulan:");
        System.out.println("1. Pemakaian Energi Efisien:");
        System.out.println("2. Bebas Ganjil Genap:");
    }
}
