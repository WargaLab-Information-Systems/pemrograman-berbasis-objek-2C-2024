public class Smartphone extends Gadget{

    public String jenisGadget = "Smartphone";

    Smartphone() {
        super.jenisGadget = this.jenisGadget;
    }
    
    // Kamera
    @Override
    public void ambilFoto(){
        super.ambilFoto();
    }
    @Override
    public void rekamVideo(){
        super.rekamVideo();
    }

    // Bluetooth
    @Override
    public void kirimFile(Gadget ke){
        super.kirimFile(ke);
    }
    @Override
    public void terimaFile(Gadget dari){
        super.terimaFile(dari);
    }
    @Override
    public void koneksiPerangkat(Gadget ke){
        super.koneksiPerangkat(ke);
    }

    // Wifi
    @Override
    public void cariJaringan(){
        super.cariJaringan();
    }
    @Override
    public void hubungkanJaringan(){
        super.hubungkanJaringan();
    }
    @Override
    public void lupakanJaringan(){
        super.lupakanJaringan();
    }

    // GPS
    @Override
    public void ambilKoordinat(){
        super.ambilKoordinat();
    }
}
