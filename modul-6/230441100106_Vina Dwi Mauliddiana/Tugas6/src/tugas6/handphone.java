
package tugas6;


public class handphone extends gadget implements kamera, bluetooth, wifi, gps {
//gadget menurunkan di handphone, kemudian di turunkan lagi di wifi, 
    public handphone(String merk, String model) {
        super(merk, model);
    }

    @Override
    public void tampilkanSpesifikasi() {
        System.out.println("Spesifikasi Handphone:");
        System.out.println("Merk: " + getMerk());
        System.out.println("Model: " + getModel());
        System.out.println("Fitur:");
        System.out.println("- Kamera");
        System.out.println("- Bluetooth");
        System.out.println("- WiFi");
        System.out.println("- GPS"); 
    }

    @Override
    public void ambilfoto() {
        System.out.println("Ambil foto dengan kamera Handphone");
    }

    @Override
    public void rekamVideo() {
        System.out.println("Rekam video dengan kamera Handphone");
    }

    @Override
    public void kirimFile() {
        System.out.println("Kirim file via bluetooth Handphone.");
    }

    @Override
    public void terimaFile() {
        System.out.println("Terima file via bluetooth Handphone.");
    }

    @Override
    public void koneksiPerangkat() {
         System.out.println("Terima file via bluetooth Handphone.");
    }

    @Override
    public void cariJaringan() {
        System.out.println("Cari jaringan WIFI Handphone.");
    }

    @Override
    public void hubungkanJaringan() {
        System.out.println("Hubungkan jaringan WIFI Handphone");
    }

    @Override
    public void lupakanJaringan() {
        System.out.println("Lupakan jeringan WIFI Handphone.");
    }

    @Override
    public void ambilKoordinat() {
        System.out.println("Ambil koordinat GPS Handphone.");
    }
    
}

