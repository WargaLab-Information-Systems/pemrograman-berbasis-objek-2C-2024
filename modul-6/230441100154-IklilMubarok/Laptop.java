
package gadgett;

public class Laptop extends Gadgett{

     public Laptop(String Merk, String Model) {
        super(Merk, Model);
    }
     
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
