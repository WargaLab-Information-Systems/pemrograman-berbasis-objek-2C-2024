package gadget;

public class Tablet extends Gadget implements Kamera, Bluetooth, Wifi, Gps{
    public Tablet(String merk, String model) {
        super(merk, model);
    }

    @Override
    public void ambilFoto() {
        System.out.println("Tablet dapat mengambil foto");
    }

    @Override
    public void rekamvideo() {
        System.out.println("Tablet dapat merekam video");
    }

    @Override
    public void kirimFile() {
        System.out.println("Tablet dapat mengirim file melalui bluetooth");
    }

    @Override
    public void terimaFile() {
        System.out.println("Tablet dapat menerima file melalui bluetooth");
    }

    @Override
    public void koneksiPerangkat() {
        System.out.println("Dapat menghubungkan tablet dengan bluetooth");
    }

    @Override
    public void cariJaringan() {
        System.out.println("Dapat mencari jaringan wifi pada tablet");
    }

    @Override
    public void hubungkanJaringan() {
        System.out.println("Dapat menghubungkan jaringan wifi dengan tablet");
    }

    @Override
    public void lupakanJaringan() {
        System.out.println("Lupakan jaringan wifi pada tablet");
    }

    @Override
    public void ambilKoordinat() {
        System.out.println("Tablet dapat mengambil koordinat pad GPS");
    }
    
    @Override
    void gadget() {
        System.out.println("Tablet merk " +this.merk +  " " + "dengan model " +this.model);
    }

    
}
