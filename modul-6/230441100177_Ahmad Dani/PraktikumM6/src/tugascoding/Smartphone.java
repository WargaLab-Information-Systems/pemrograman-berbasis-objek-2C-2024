package tugascoding;

class Smartphone extends Gadget {

    public Smartphone(String merk, String model) {
        super.Merk = merk;
        super.Model = model;
    }
    

    @Override
    public void ambilFoto() {
        System.out.println("Smartphone " + super.Merk + " Ambil Foto");
    }

    @Override
    public void rekamVideo() {
        System.out.println("Smartphone " + super.Merk + " Rekam Foto");
    }

    @Override
    public void kirimFile() {
        System.out.println("Smartphone " + super.Merk + " Kirim File");
    }

    @Override
    public void terimaFile() {
        System.out.println("Smartphone " + super.Merk + " Terima File");
    }

    @Override
    public void koneksiPerangkat() {
        System.out.println("Smartphone " + super.Merk + " Mengkoneksikan Perangkat Blutooth");
    }
    
    @Override
    public void cariJaringan() {
        System.out.println("Smartphone " + super.Merk + " Mencari Jaringan Wifi");
    }

    @Override
    public void hubungkanJaringan() {
        System.out.println("Smartphone " + super.Merk + " Menghubungkan ke jaringan WiFi");
    }

    @Override
    public void lupakanJaringan() {
        System.out.println("Smartphone " + super.Merk + " Melupakan dia, eh Maksudnya Melupakan Jaringan WiFi");
    }

    @Override
    public void ambilKoordinat() {
        System.out.println("Smartphone " + super.Merk + " Ambil Koordinat Gps");
    }

    @Override
     void displayInfo() {
        System.out.println("\nSpesifikasi Smartphone");
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