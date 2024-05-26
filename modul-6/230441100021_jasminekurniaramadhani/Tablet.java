
package gadgett;

public class Tablet extends Gadgett{

    @Override
    public void tampilPilih(){
        System.out.println("Tablet : " + Merk + " Model : " + Model);
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