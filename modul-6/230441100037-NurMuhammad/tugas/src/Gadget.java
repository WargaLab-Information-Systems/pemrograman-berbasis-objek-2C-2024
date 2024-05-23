import interfaces.Kamera;
import interfaces.Bluetooth;
import interfaces.Wifi;
import interfaces.GPS;

public abstract class Gadget implements Kamera,Bluetooth,Wifi,GPS{

    public String merk, model, jenisGadget;

    public void setMerk(String merk) {
        this.merk = merk;
    }
    public void setModel(String model) {
        this.model = model;
    }

    // Kamera
    @Override
    public void ambilFoto(){
        System.out.println("Jenis Gadget  : " + jenisGadget);
        System.out.println("Merk          : " + merk);
        System.out.println("Model         : " + model);
        System.out.println("Mengambil foto");
    }
    @Override
    public void rekamVideo(){
        System.out.println("Jenis Gadget  : " + jenisGadget);
        System.out.println("Merk          : " + merk);
        System.out.println("Model         : " + model);
        System.out.println("Merekam video");
    }

    // Bluetooth
    @Override
    public void kirimFile() {}
    public void kirimFile(Gadget ke){
        System.out.println("Jenis Gadget  : " + jenisGadget);
        System.out.println("Merk          : " + merk);
        System.out.println("Model         : " + model);
        System.out.println("Mengirim file");
    }
    @Override
    public void terimaFile() {}
    public void terimaFile(Gadget dari){
        System.out.println("Jenis Gadget  : " + jenisGadget);
        System.out.println("Merk          : " + merk);
        System.out.println("Model         : " + model);
        System.out.println("Menerima file dari");
    }
    @Override
    public void koneksiPerangkat() {}
    public void koneksiPerangkat(Gadget ke){
        System.out.println("Jenis Gadget  : " + jenisGadget);
        System.out.println("Merk          : " + merk);
        System.out.println("Model         : " + model);
        System.out.println("Menghubungkan koneksi perangkat");
    }

    // Wifi
    @Override
    public void cariJaringan(){
        System.out.println("Jenis Gadget  : " + jenisGadget);
        System.out.println("Merk          : " + merk);
        System.out.println("Model         : " + model);
        System.out.println("Mencari jaringan");
    }
    @Override
    public void hubungkanJaringan(){
        System.out.println("Jenis Gadget  : " + jenisGadget);
        System.out.println("Merk          : " + merk);
        System.out.println("Model         : " + model);
        System.out.println("Menghubungkan jaringan");
    }
    @Override
    public void lupakanJaringan(){
        System.out.println("Jenis Gadget  : " + jenisGadget);
        System.out.println("Merk          : " + merk);
        System.out.println("Model         : " + model);
        System.out.println("Melupakan jaringan");
    }

    // GPS
    @Override
    public void ambilKoordinat(){
        System.out.println("Jenis Gadget  : " + jenisGadget);
        System.out.println("Merk          : " + merk);
        System.out.println("Model         : " + model);
        System.out.println("Mengambil koordinat");
    }
}