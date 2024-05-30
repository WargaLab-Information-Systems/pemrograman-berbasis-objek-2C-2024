
package gadgett;

public class Smartphone extends Gadgett{

    public Smartphone(String Merk, String Model) {
        super(Merk, Model);
    }
    
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
