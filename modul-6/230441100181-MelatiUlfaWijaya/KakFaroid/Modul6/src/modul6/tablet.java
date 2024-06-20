/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul6;

/**
 *
 * @author Lenovo
 */
public class tablet extends gadgett {
    public tablet(String merk, String model){
        super(merk, model);
    }

 

    @Override
    public void tampilkanSpek() {
        System.out.println("Spesifikasi tablet : ");
        System.out.println("merk : "+ getMerk());
        System.out.println("model : "+ getModel());
        System.out.println("Fitur - fitur tablet : ");
//        System.out.println("=> wifi");
//        System.out.println("=> gps");
        carijaringan();
        hubungkanJaringan();
        lupakanJaringan();
        ambilKoordinat();
    }
    @Override
    public void carijaringan() {
        System.out.println("gunakan wifi tablet untuk mencari jaringan ");
    }
    @Override
    public void hubungkanJaringan() {
        System.out.println("hubungkan jarinagn wifi tablet");
    }
    @Override
    public void lupakanJaringan() {
        System.out.println("lupakan jaringan di eifi tablet");
    }
    @Override
    public void ambilKoordinat() {
        System.out.println("sesuaikan titik koordinat gps di tablet");
    }

    
    @Override
    public void ambilFoto() {
        System.out.println("gunakan kamera smartphone untuk mengambil foto");   
    }

    @Override
    public void rekamVideo() {
        System.out.println("video di rekam menggunkan kamera smartphone ");
    }

    @Override
    public void kirimFile() {
        System.out.println("bluetooth smartphoen digunakan untuk mengkirim file");
    }

    @Override
    public void terimaFile() {
        System.out.println("bluetooth smartphone untuk menerima file");
    }

    @Override
    public void koneksiPerangkat() {
       System.out.println("sambungkan bluetooth antar perangkat ");
    }
    
    
}
