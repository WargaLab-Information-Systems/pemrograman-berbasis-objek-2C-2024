/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul.pkg6;

/**
 *
 * @author Acer
 */
public class Smartphone extends Gadget implements Kamera, Bluetooth, Wifi, GPS{
    public Smartphone(String merk, String model) {
        super(merk, model);
    }

    @Override
    public void tampilkaninfo() {
        System.out.println(" ");
        System.out.println("==========================  SMARTPHONE  =======================");
        System.out.println(" -------------------------- Fitur Gadget ----------------------");
        System.out.println(" Merek Smartphone      : "+ merek);
        System.out.println(" Model Smartphone      : "+ model);
        System.out.println(" ");
    }

    @Override
    public void ambilFoto() {
        System.out.println(" -------------------------- Fitur Gadget ----------------------");
        System.out.println("   • Smartphone dapat digunakan untuk mengambil gambar");
    }

    @Override
    public void rekamVideo() {
        System.out.println("   • Smartphone dapat digunakan untuk merekam");
    }

    @Override
    public void kirimFile() {
        System.out.println("   • Smartphone dapat mengirim file");
    }

    @Override
    public void terimaFile() {
        System.out.println("   • Smartphone dapat menerima file");
    }

    @Override
    public void koneksiPerangkat() {
        System.out.println("   • Smartphone dapat dihubungkan ke perangkat lain melalui bluetooth");
    }

    @Override
    public void cariJaringan() {
        System.out.println("   • Smartphone dapat mencari jaringan wifi");
    }

    @Override
    public void hubungkanJaringan() {
        System.out.println("   • Smartphone dapat dihubungkan ke jaringan wifi");
    }

    @Override
    public void lupakanJaringan() {
        System.out.println("   • Smartphone dapat melupakan jaringan wifi");
    }

    @Override
    public void ambilKoordinat() {
        System.out.println("   • Smartphone dapat mengambil koordinat dari GPS");
        System.out.println("=================================================================");
    }
}
