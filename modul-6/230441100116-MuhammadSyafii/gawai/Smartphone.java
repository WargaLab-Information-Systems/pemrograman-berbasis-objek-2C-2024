package gawai;

public class Smartphone extends Gadget {
    public Smartphone(String Merk, String Model) {
        super(Merk, Model);
    }

    @Override
    public void Display() {
        System.out.println("\nElektronik Smartphone");
        System.out.println("Merk    : " + Merk);
        System.out.println("Model   : " + Model);
        ambilFoto();
        ambilVideo();
        kirimFile();
        terimaFile();
        koneksiPerangkat();
        cariJaringan();
        hubungkanJaringan();
        lupakanJaringan();
        ambilKoordinat();
    }
}
