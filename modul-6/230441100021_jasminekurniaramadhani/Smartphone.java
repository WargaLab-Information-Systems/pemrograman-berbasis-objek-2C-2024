
package gadgett;

public class Smartphone extends Gadgett{
    
    @Override
    public void tampilPilih(){
        System.out.println("Smartphone : " + Merk + " Model : " + Model);
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
