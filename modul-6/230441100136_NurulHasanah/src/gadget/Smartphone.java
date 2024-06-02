package gadget;

public class Smartphone extends Gadget implements Kamera, Bluetooth, Wifi, Gps{
    public Smartphone(String merk, String model) {
        super(merk, model);
    }

    @Override
    public void ambilFoto() {
        System.out.println("Smartphone dapat mengambil foto");
    }
    @Override
    public void rekamvideo() {
        System.out.println("Smartphone dapat merekam video");
    }

    @Override
    public void kirimFile() {
        System.out.println("Smartphone dapat mengirim file melalui bluetooth");
    }

    @Override
    public void terimaFile() {
        System.out.println("Smartphone dapat menerima file melalui bluetooth");
    }
    
    @Override
    public void koneksiPerangkat() {
        System.out.println("Dapat menghubungkan smartphone dengan bluetooth");
    }

    @Override
    public void cariJaringan() {
        System.out.println("Dapat mencari jaringan wifi pada smartphone");
    }

    @Override
    public void hubungkanJaringan() {
        System.out.println("Dapat menghubungkan jaringan wifi dengan smartphone");
    }

    @Override
    public void lupakanJaringan() {
        System.out.println("Lupakan jaringan wifi pada smartphoe");
    }

    @Override
    public void ambilKoordinat() {
        System.out.println("Smartphone dapat mengambil koordinat pad GPS");
    }
    
    @Override
    void gadget() {
        System.out.println("Smartphone merk " +this.merk +  " " + "dengan model " +this.model);
    }
    
}
