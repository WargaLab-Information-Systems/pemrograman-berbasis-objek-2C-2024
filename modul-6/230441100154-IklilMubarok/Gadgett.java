
package gadgett;


public abstract class Gadgett implements Kamera,Bluetooth,Wifi,GPS{

    public String Merk,Model;
    public Gadgett (String merk, String model){
    this.Merk=merk;
    this.Model=model;
    }


    public void setMerk(String merk) {
        Merk = merk;
    }

    public void setModel(String model) {
        Model = model;
    }
    
    public abstract void tampilPilih();

    @Override
    public void ambilFoto(){
        System.out.println("   ");
        System.out.println("Mengambil foto dari -> " + Model + " " + Merk);
    }

    @Override
    public void rekamVideo(){
        System.out.println("Merekam video dari -> " + Model + " " + Merk);
    }

    @Override
    public void kirimFile(){
        System.out.println("Mengirim file dari -> " + Model  + " " + Merk);
    }

    @Override
    public void terimaFile(){
        System.out.println("Menerima file dari -> " + Model + " " + Merk);
    }

    @Override
    public void cariJaringan(){
        System.out.println("Mencari jaringan dari -> " + Model + " " + Merk);
    }

    @Override
    public void hubungkanJaringan(){
        System.out.println("Menghubungkan jaringan dari -> " + Model + " " + Merk);
    }
    
    @Override
    public void lupakanJaringan(){
        System.out.println("Melupakan jaringan dari -> " + Model + " " + Merk);
    }

    @Override
    public void ambilKoordinat(){
        System.out.println("Mengambil koordinat dari -> " + Model + " " + Merk);
    }


    }
    
