package Gadget;
public class Laptop extends Gadget implements Kamera, Bluetooth, WiFi, GPS{
    
    public Laptop(String Merk, String Model) {
        super(Merk, Model);
    }
    @Override
    public void ambilFoto() {
        System.out.println("Menangkap foto menggunakan laptop " + Merk + " " + Model);
    }
    @Override
    public void rekamVideo() {
        System.out.println("Merekam video menggunakan laptop " + Merk + " " + Model);
    }
    @Override
    public void kirimFile() {
        System.out.println("Mengirim file bluetooth ke laptop " + Merk + " " + Model);
    }
    @Override
    public void terimaFile() {
        System.out.println("Menerima file dari bluetooth ke laptop " + Merk + " " + Model);
    }
    @Override
    public void koneksiPerangkat() {
        System.out.println("Menghubungkan perangkat dari bluetooth ke laptop " + Merk + " " + Model);
    }
    @Override
    public void cariJaringan() {
        System.out.println("Mencari jaringan WiFi menggunakan laptop " + Merk + " " + Model);
    }
    @Override
    public void hubungkanJaringan() {
        System.out.println("Menghubungkan jaringan WiFi dengan laptop " + Merk + " " + Model);
    }
    @Override
    public void lupakanJaringan() {
        System.out.println("Melupakan jaringan Wifi pada laptop " + Merk + " " + Model);
    }
    @Override
    public void ambilKoordinat() {
        System.out.println("Mengambil koordinat GPS menggunakan laptop " + Merk + " " + Model);
    }
    @Override
    public void hasil() {
        System.out.println("Merk Laptop : " + Merk);
        System.out.println("Model Laptop : " + Model);
    }
}