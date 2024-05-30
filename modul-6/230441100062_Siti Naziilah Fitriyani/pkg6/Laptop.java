/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul.pkg6;

/**
 *
 * @author Acer
 */
public class Laptop extends Gadget implements Kamera, Bluetooth, Wifi, GPS{
    public Laptop(String merk, String model) {
        super(merk, model);
    }

    @Override
    public void tampilkaninfo() {
        System.out.println(" ");
        System.out.println("============================  LAPTOP  =========================");
        System.out.println(" -------------------------- Info Gadget -----------------------");
        System.out.println(" Merek Smartphone      : "+ merek);
        System.out.println(" Model Smartphone      : "+ model);
        System.out.println(" ");
    }

    @Override
    public void ambilFoto() {
        System.out.println(" -------------------------- Fitur Gadget ----------------------");
        System.out.println("   • Laptop dapat digunakan untuk mengambil gambar");
    }

    @Override
    public void rekamVideo() {
        System.out.println("   • Laptop dapat digunakan untuk merekam");
    }

    @Override
    public void kirimFile() {
        System.out.println("   • Laptop dapat mengirim file");
    }

    @Override
    public void terimaFile() {
        System.out.println("   • Laptop dapat menerima file");
    }

    @Override
    public void koneksiPerangkat() {
        System.out.println("   • Laptop dapat dihubungkan ke perangkat lain melalui bluetooth");
    }

    @Override
    public void cariJaringan() {
        System.out.println("   • Laptop dapat mencari jaringan wifi");
    }

    @Override
    public void hubungkanJaringan() {
        System.out.println("   • Laptop dapat dihubungkan ke jaringan wifi");
    }

    @Override
    public void lupakanJaringan() {
        System.out.println("   • Laptop dapat melupakan jaringan wifi");
    }

    @Override
    public void ambilKoordinat() {
        System.out.println("   • Laptop dapat mengambil koordinat dari GPS");
        System.out.println("=================================================================");
    }
}
