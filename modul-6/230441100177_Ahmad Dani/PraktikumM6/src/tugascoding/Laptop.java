package tugascoding;

class Laptop extends Gadget {

    public Laptop(String merk, String model) {
        super.Merk = merk;
        super.Model = model;
    }
    
    @Override
    public void ambilFoto() {
        System.out.println("Laptop " + super.Merk + " Bisa Ambil Foto"); 
    }

    @Override
    public void rekamVideo() {
        System.out.println("Laptop " + super.Merk + " Bisa Rekam Video");
    }

    @Override
    public void kirimFile() {
        System.out.println("Laptop " + super.Merk + " Bisa Kirim File");
    }

    @Override
    public void terimaFile() {
        System.out.println("Laptop " + super.Merk + " Bisa Terima File");
    }

    @Override
    public void koneksiPerangkat() {
        System.out.println("Laptop " + super.Merk + " Bisa Koneksi Perangkat dengan Bluetooth");
    }

    @Override
    public void cariJaringan() {
        System.out.println("Laptop " + super.Merk + " Bisa mencari jaringan WiFi");
    }

    @Override
    public void hubungkanJaringan() {
        System.out.println("Laptop " + super.Merk + " Bisa terhubung ke jaringan WiFi");
    }

    @Override
    public void lupakanJaringan() {
        System.out.println("Laptop " + super.Merk + " Bisa Melupkan dia, eh Maksudnya melupkan Jaringan WiFi");
    }

    @Override
    public void ambilKoordinat() {
        System.out.println("Laptop " + super.Merk + " Bisa Ambil Koordinat Gps");
    }
    
    @Override
     void displayInfo() {
        System.out.println("\nSpesifikasi Laptop");
        System.out.println("Merk \t: " + super.Merk);
        System.out.println("Model \t: " + super.Model + "\n");
        System.out.println("Fitur Kamera \t: ");
        this.ambilFoto();
        this.rekamVideo();
        System.out.println("\nFitur Bluetooth \t: ");
        this.kirimFile();
        this.terimaFile();
        this.koneksiPerangkat();
        System.out.println("\nFitur WiFi \t: ");
        this.cariJaringan();
        this.hubungkanJaringan();
        this.lupakanJaringan();
        System.out.println("\nFitur Gps \t: ");
        this.ambilKoordinat();
        System.out.println("--------------------");
    }

}
