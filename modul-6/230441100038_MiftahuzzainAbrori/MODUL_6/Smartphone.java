package MODUL_6;

    
//PEWARISAN DARI SUP CLASS TERHADAP SUB CLASS
public class Smartphone extends GADGET implements Kamera, Bluetooth, WiFi, GPS{
    
    String camera       = "Memiliki Fitur Mengambil foto 32-64 PX";
    String film         = "Memiliki Fitur Merekam Vidio 230-1000 HD";
    String kirim        = "Bisa Mengirim File Menggunakan Bluetooth";
    String terima       = "Bisa Menerima File Menggunakan Bluetooth";
    String perangkat    = "Bisa Terhubung Dengan Perangkat Lain";
    String Jaringan     = "Memiliki Fitur Mencarian Jaringan Wifi Terdekat";
    String wifi         = "Dapat Terhubung Dengan Wifi Terdekat";
    String lupakan      = "Memiliki Fitur Penghapus Jaringan";
    String kordinat     = "123.354.77.09";        
    
    Smartphone(String pilih, String merek, String model){
        super(pilih,merek,model);
    }

//OVERRIDING
    @Override
    void showfeature(){
        super.showfeature();
    }
    
    @Override
    public void ambilFoto() {
        System.out.println(merek    + " Dengan Model " + model + " " + this.camera);
    }

    @Override
    public void rekamVideo() {
        System.out.println(merek    + " Dengan Model " + model + " " + this.film);
    }

    @Override
    public void kirimFile() {
        System.out.println(merek    + " Dengan Model " + model + " " + this.kirim);
    }

    @Override
    public void terimaFile() {
        System.out.println(merek    + " Dengan Model " + model + " " + this.terima);
    }

    @Override
    public void koneksiPerangkat() {
        System.out.println(merek    + " Dengan Model " + model + " " + this.perangkat);
    }

    @Override
    public void cariJaringan() {
        System.out.println(merek    + " Dengan Model " + model + " " + this.Jaringan);
    }

    @Override
    public void hubunganJaringan() {
        System.out.println(merek    + " Dengan Model " + model + " " + this.wifi);
    }

    @Override
    public void lupakanJaringan() {
        System.out.println(merek    + " Dengan Model " + model + " " + this.lupakan);
    }

    @Override
    public void ambilKoordinat() {
        System.out.println(this.kordinat + " Adalah Kordinat Dari " + merek    + " Dengan Model " + model);
    }

}