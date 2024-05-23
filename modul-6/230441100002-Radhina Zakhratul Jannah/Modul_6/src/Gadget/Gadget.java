package Gadget;
public abstract class Gadget{
    protected String Merk;
    protected String Model;
    
    public Gadget(String Merk, String Model) {
        this.Merk = Merk;
        this.Model = Model;
    }
    
    abstract void ambilFoto();
    abstract void rekamVideo();
    abstract void kirimFile();
    abstract void terimaFile();
    abstract void koneksiPerangkat();
    abstract void cariJaringan();
    abstract void hubungkanJaringan();
    abstract void lupakanJaringan();
    abstract void ambilKoordinat();
    
    void hasil(){
        System.out.println();
    }
}