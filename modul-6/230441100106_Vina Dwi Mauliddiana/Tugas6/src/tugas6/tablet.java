/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas6;




public class tablet extends gadget implements wifi, gps {

    public tablet(String merk, String model) {
        super(merk, model);
    }

    @Override
    public void tampilkanSpesifikasi() {
        System.out.println("Spesifikasi tablet:");
        System.out.println("Merk: " + getMerk());
        System.out.println("Model: " + getModel());
        System.out.println("Fitur:");
        System.out.println("- WiFi");
        System.out.println("- GPS");
    }

    @Override
    public void cariJaringan() {
        System.out.println("Cari jaringan Wifi iPad.");
    }

    @Override
    public void hubungkanJaringan() {
        System.out.println("Hubungkan jaringan Wifi iPad.");
    }

    @Override
    public void lupakanJaringan() {
        System.out.println("Lupakan jaringan Wifi iPad.");
    }

    @Override
    public void ambilKoordinat() {
        System.out.println("Ambil koordinat GPS iPad.");
    }
    
}
