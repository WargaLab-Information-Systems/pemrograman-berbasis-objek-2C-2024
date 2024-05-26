
package gadgett;

public class Laptop extends Gadgett{

    @Override
    public void tampilPilih(){
        System.out.println("Laptop : " + Merk + " Model : " + Model);
        ambilFoto();
        rekamVideo();
        kirimFile();
        terimaFile();
        cariJaringan();
        hubungkanJaringan();
        lupakanJaringan();
        ambilKoordinat();
    }
}
