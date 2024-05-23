package Gadget;
public class Smartphone extends Gadget implements Kamera, Bluetooth, WiFi, GPS{
    
    public Smartphone(String Merk, String Model) {
        super(Merk, Model);
    }
    @Override
    public void ambilFoto() {
        System.out.println("Menangkap foto menggunakan smartphone " + Merk + " " + Model);
    }
    @Override
    public void rekamVideo() {
        System.out.println("Merekam video menggunakan smartphone " + Merk + " " + Model);
    }
    @Override
    public void kirimFile() {
        System.out.println("Mengirim file bluetooth ke smartphone " + Merk + " " + Model);
    }
    @Override
    public void terimaFile() {
        System.out.println("Menerima file dari bluetooth ke smartphone " + Merk + " " + Model);
    }
    @Override
    public void koneksiPerangkat() {
        System.out.println("Menghubungkan perangkat dari bluetooth ke smartphone " + Merk + " " + Model);
    }
    @Override
    public void cariJaringan() {
        System.out.println("Mencari jaringan WiFi menggunakan smartphone " + Merk + " " + Model);
    }
    @Override
    public void hubungkanJaringan() {
        System.out.println("Menghubungkan jaringan WiFi dengan smartphone " + Merk + " " + Model);
    }
    @Override
    public void lupakanJaringan() {
        System.out.println("Melupakan jaringan Wifi pada smartphone " + Merk + " " + Model);
    }
    @Override
    public void ambilKoordinat() {
        System.out.println("Mengambil koordinat GPS menggunakan smartphone " + Merk + " " + Model);
    }    
    @Override
    public void hasil() {
        System.out.println("Merk Smartphone : " + Merk);
        System.out.println("Model Smartphone : " + Model);
        
    }
}