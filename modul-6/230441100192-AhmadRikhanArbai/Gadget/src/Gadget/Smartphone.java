package Gadget;

public class Smartphone extends Gadget {
    String merk, model;

    Smartphone(String merk, String model) {
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
        System.out.println("Smartphone Mencari Kordinat Yang Lumayan Akurat");
    }

    public void AmbilFoto(){
        System.out.println("Smartphone Pengambilan Foto Yang Lumayan Bagus");
    }

    public void AmbilVideo(){
        System.out.println("Smartphone Pengambilan Video Yang Bagus");
    }

    public void CariJaringan(){
        System.out.println("Smartphone Mencari Sumber Wifi Yang Lumayan cepat");
    }

    public void HubungkanJaringan(){
        System.out.println("Smartphone Dalam Menghubungkan Jaringan Lumayan bagus");
    }

    public void LupkanJaringan(){
        System.out.println("Smartphone Memiliki Fitur Melupakan Jaringan");
    }

    public void KirimFile(){
        System.out.println("Smartphone Dalam Mengirim File Yang Besar");
    }

    public void TerimaFile(){
        System.out.println("Smartphone Dalam Menerima File Yang Sangat Cepat");
    }

    public void KoneksiPerangkat(){
        System.out.println("Smartphone Dalam Menghubungkan Perangkat Lumayan Cepat");
    }
}
