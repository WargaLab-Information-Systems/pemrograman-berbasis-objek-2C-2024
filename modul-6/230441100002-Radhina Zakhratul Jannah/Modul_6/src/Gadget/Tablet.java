package Gadget;
public class Tablet extends Gadget implements Kamera, Bluetooth, WiFi, GPS{
    
    public Tablet(String merk, String model) {
        super(merk, model);
    }
    
    @Override
    public void ambilFoto() {
        System.out.println("Menangkap foto dengan menggunakan tablet " + Merk + " " + Model);
    }

    @Override
    public void rekamVideo() {
        System.out.println("Merekam video menggunakan tablet " + Merk + " " + Model);
    }

    @Override
    public void kirimFile() {
        System.out.println("Mengirim file bluetooth ke tablet " + Merk + " " + Model);
    }

    @Override
    public void terimaFile() {
        System.out.println("Menerima file dari bluetooth ke tablet " + Merk + " " + Model);
    }

    @Override
    public void koneksiPerangkat() {
        System.out.println("Menghubungkan perangkat dari bluetooth ke tablet " + Merk + " " + Model);
    }

    @Override
    public void cariJaringan() {
        System.out.println("Mencari jaringan WiFi menggunakan tablet " + Merk + " " + Model);
    }

    @Override
    public void hubungkanJaringan() {
        System.out.println("Menghubungkan jaringan WiFi dengan tablet " + Merk + " " + Model);
    }

    @Override
    public void lupakanJaringan() {
        System.out.println("Melupakan jaringan Wifi pada tablet " + Merk + " " + Model);
    }

    @Override
    public void ambilKoordinat() {
        System.out.println("Mengambil koordinat GPS menggunakan tablet " + Merk + " " + Model);
    }
    
    @Override
    public void hasil() {
        System.out.println("Merk Tablet : " + Merk);
        System.out.println("Model Tablet : " + Model);
    }
}
