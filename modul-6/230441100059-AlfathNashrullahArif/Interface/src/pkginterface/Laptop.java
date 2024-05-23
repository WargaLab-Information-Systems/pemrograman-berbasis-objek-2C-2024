/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkginterface;

/**
 *
 * @author ASUS
 */
public class Laptop extends Gadget {
    public Laptop(String Merk, String Model) {
        super(Merk, Model);
    }

    @Override
    public void Display() {
        System.out.println("\nElektornik Laptop");
        System.out.println("Merk    : " + Merk);
        System.out.println("Model   : " + Model);
        ambilFoto();
        ambilVideo();
        kirimFile();
        terimaFile();
        koneksiPerangkat();
        cariJaringan();
        hubungkanJaringan();
        lupakanJaringan();
        ambilKoordinat();
    }
}
