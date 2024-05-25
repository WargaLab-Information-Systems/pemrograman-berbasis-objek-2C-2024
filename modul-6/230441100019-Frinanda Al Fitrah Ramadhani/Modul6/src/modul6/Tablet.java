/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul6;

public class Tablet extends Gadget {
    public Tablet(String Merk, String Model){
        super(Merk, Model);
    }
    
    @Override
    public void display() {
        System.out.println();
        System.out.println(" -- Detail Tablet -- ");
        System.out.println("Merk  : "+Merk);
        System.out.println("Model : "+Model);
        super.ambilFoto();
        super.rekamVideo();
        super.kirimFile();
        super.terimaFile();
        super.koneksiPerangkat();
        super.cariJaringan();
        super.hubungkanJaringan();
        super.lupakanJaringan();
        super.ambilKoordinat();
        System.out.println();
    }
}
