package gawai;

public class Tablet extends Gadget {
    public Tablet(String Merk, String Model) {
        super(Merk, Model);
    }

    @Override
    public void Display() {
        System.out.println("\nElektronik Tablet");
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
