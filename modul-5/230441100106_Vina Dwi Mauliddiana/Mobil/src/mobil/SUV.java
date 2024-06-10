/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mobil;

/**
 *
 * @author pinokio
 */
class SUV extends Mobil {
     public SUV(String Merek, String Model, int TahunProduksi){
        super(Merek,Model,TahunProduksi);
    }

    @Override
    public void showFitur() {
        System.out.println("Fitur Keunggulan:");
        System.out.println("1. Kemampuan off-road");
        System.out.println("2. Kuat di Berbagai Medan");
    }
}

