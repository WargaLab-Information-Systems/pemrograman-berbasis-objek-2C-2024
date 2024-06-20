package gawai;

public class Laptop extends Gadget {
    public Laptop(String Merk, String Model) {
        super(Merk, Model);
    }

    @Override
    public void Display() {
        System.out.println("\nElektronik Laptop");
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