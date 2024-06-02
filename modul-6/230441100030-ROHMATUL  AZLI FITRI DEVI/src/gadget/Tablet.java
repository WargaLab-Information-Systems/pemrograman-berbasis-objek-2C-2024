
package gadget;

public class Tablet extends Gadget{

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