/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gadget;

public class tablet extends Gadget implements kamera, bluetooth, wifi, GPS {

    public tablet(String merk, String model) {
        super(merk, model);
    }
    
    @Override
    public void ambilFoto() {
        System.out.println("Mengambil foto menggunakan tablet merk " + merk);
    }

    @Override
    public void rekamVideo() {
        System.out.println("Merekam video menggunakan tablet merk " + merk);
    }

    @Override
    public void kirimFile() {
        System.out.println("Mengirim file via bluetooth menggunakan tablet merk " + merk);
    }

    @Override
    public void terimaFile() {
        System.out.println("Menerima file via bluetooth menggunakan tablet merk " + merk);
    }

    @Override
    public void koneksiPerangkat() {
        System.out.println("Menghubungkan perangkat via bluetooth menggunakan tablet merk " + merk);
    }
    
    @Override
    public void cariJaringan() {
        System.out.println("Mencari jaringan wifi menggunakan tablet merk " + merk);
    }

    @Override
    public void hubungkanJaringan() {
        System.out.println("Menghubungkan jaringan wifi menggunakan tablet merk " + merk);
    }

    @Override
    public void lupakanJaringan() {
        System.out.println("Melupakan jaringan wifi menggunakan tablet merk " + merk);
    }

    @Override
    public void ambilKoordinat() {
        System.out.println("Mengambil titik koordinat GPS menggunakan tablet merk " + merk);
    }
    
    @Override
    void hasil() {
        System.out.println("Merk Tablet : " + merk);
        System.out.println("Model Tablet : " + model);
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
