/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gadget;

public class Smartphone extends Gadget implements kamera, bluetooth, wifi, GPS {

    public Smartphone(String merk, String model) {
        super(merk, model);
    }
    
    @Override
    public void ambilFoto() {
        System.out.println("Mengambil foto dengan smartphone " + merk);
    }

    @Override
    public void rekamVideo() {
        System.out.println("Mengambil video dengan smartphone " + merk);
    }

    @Override
    public void kirimFile() {
        System.out.println("Mengirim file dengan smartphone via bluetooth " + merk);
    }

    @Override
    public void terimaFile() {
        System.out.println("Menerima file dengan smartphone via bluetooth " + merk);
    }

    @Override
    public void koneksiPerangkat() {
        System.out.println("Menghubungkan perangkat dengan smartphone via Bluetooth " + merk);
    }

    @Override
    public void cariJaringan() {
        System.out.println("Mencari jaringan wifi dengan smartphone " + merk);
    }

    @Override
    public void hubungkanJaringan() {
        System.out.println("Menghubungkan jaringan wifi dengan smartphone " + merk);
    }

    @Override
    public void lupakanJaringan() {
        System.out.println("Melupakan jaringan wifi dengan smartphone " + merk);
    }

    @Override
    public void ambilKoordinat() {
        System.out.println("Mengambil koordinat GPS menggunakan smartphone " + merk);
    }

    @Override
    void hasil() {
        System.out.println("Merk Smartphone : " + merk);
        System.out.println("Model Smartphone : " + model);
        ambilFoto();
        rekamVideo();
        kirimFile();
        terimaFile();
        koneksiPerangkat();
        cariJaringan();
        hubungkanJaringan();
        lupakanJaringan();
        ambilKoordinat();
    } 
}
