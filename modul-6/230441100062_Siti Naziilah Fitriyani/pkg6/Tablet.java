/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul.pkg6;

/**
 *
 * @author Acer
 */
public class Tablet extends Gadget implements Kamera, Bluetooth, Wifi, GPS{
    public Tablet (String merk, String model) {
        super(merk, model);
    }

    @Override
    public void tampilkaninfo() {
        System.out.println(" ");
        System.out.println("===========================  TABLET  =========================");
        System.out.println("-------------------------- Fitur Gadget ----------------------");
        System.out.println(" Merek Smartphone      : "+ merek);
        System.out.println(" Model Smartphone      : "+ model);
        System.out.println(" ");
    }

    @Override
    public void ambilFoto() {
        System.out.println(" -------------------------- Fitur Gadget ----------------------");
        System.out.println("   • Tablet dapat digunakan untuk mengambil gambar");
    }

    @Override
    public void rekamVideo() {
        System.out.println("   • Tablet dapat digunakan untuk merekam");
    }

    @Override
    public void kirimFile() {
        System.out.println("   • Tablet dapat mengirim file");
    }

    @Override
    public void terimaFile() {
        System.out.println("   • Tablet dapat menerima file");
    }

    @Override
    public void koneksiPerangkat() {
        System.out.println("   • Tablet dapat dihubungkan ke perangkat lain melalui bluetooth");
    }

    @Override
    public void cariJaringan() {
        System.out.println("   • Tablet dapat mencari jaringan wifi");
    }

    @Override
    public void hubungkanJaringan() {
        System.out.println("   • Tablet dapat dihubungkan ke jaringan wifi");
    }

    @Override
    public void lupakanJaringan() {
        System.out.println("   • Tablet dapat melupakan jaringan wifi");
    }

    @Override
    public void ambilKoordinat() {
        System.out.println("   • Tablet dapat mengambil koordinat dari GPS");
        System.out.println("=================================================================");
    }
}
