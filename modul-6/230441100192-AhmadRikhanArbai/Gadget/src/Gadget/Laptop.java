package Gadget;

public class Laptop extends Gadget {
    String merk, model;

    Laptop(String merk, String model) {
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
        System.out.println("Laptop Mencari Kordinat Yang Lumayan Akurat");
    }

    public void AmbilFoto(){
        System.out.println("Laptop Pengambilan Foto Yang Lumayan Bagus");
    }

    public void AmbilVideo(){
        System.out.println("Laptop Pengambilan Video Yang Bagus");
    }

    public void CariJaringan(){
        System.out.println("Laptop Mencari Sumber Wifi Yang Lumayan cepat");
    }

    public void HubungkanJaringan(){
        System.out.println("Laptop Dalam Menghubungkan Jaringan Lumayan bagus");
    }

    public void LupkanJaringan(){
        System.out.println("Laptop Memiliki Fitur Melupakan Jaringan");
    }

    public void KirimFile(){
        System.out.println("Laptop Dalam Mengirim File Yang Besar");
    }

    public void TerimaFile(){
        System.out.println("Laptop Dalam Menerima File Yang Sangat Cepat");
    }

    public void KoneksiPerangkat(){
        System.out.println("Laptop Dalam Menghubungkan Perangkat Lumayan Cepat");
    }
    
}
