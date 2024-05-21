package Gadget;

public class Tablet extends Gadget {
    String merk, model;

    Tablet(String merk, String model) {
        this.merk = merk;
        this.model = model;
    }
    void Merk(){
        System.out.println("Gadget Merek Anda : "+merk);
    }

    void Model(){
        System.out.println("Gadget Memiliki Model : "+model);
    }
    
  
    public void AmbilKordinat(){
        System.out.println("Tablet Mencari Kordinat Yang Lumayan Akurat");
    }

    public void AmbilFoto(){
        System.out.println("Tablet Pengambilan Foto Yang Lumayan Bagus");
    }

    public void AmbilVideo(){
        System.out.println("Tablet Pengambilan Video Yang Bagus");
    }

    public void CariJaringan(){
        System.out.println("Tablet Mencari Sumber Wifi Yang Lumayan cepat");
    }

    public void HubungkanJaringan(){
        System.out.println("Tablet Dalam Menghubungkan Jaringan Lumayan bagus");
    }

    public void LupkanJaringan(){
        System.out.println("Tablet Memiliki Fitur Melupakan Jaringan");
    }

    public void KirimFile(){
        System.out.println("Tablet Dalam Mengirim File Yang Besar");
    }

    public void TerimaFile(){
        System.out.println("Tablet Dalam Menerima File Yang Sangat Cepat");
    }

    public void KoneksiPerangkat(){
        System.out.println("Tablet Dalam Menghubungkan Perangkat Lumayan Cepat");
    }
}


