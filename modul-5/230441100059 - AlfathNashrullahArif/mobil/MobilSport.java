package mobil;

public class MobilSport extends Mobil {
    String kelebihan = "Cepat dan body sporty";

    MobilSport(String Merk, String Model, int TahunProduksi){
        super(Merk, Model, TahunProduksi);
    }

    @Override
    void Display(){
        super.Display();
        System.out.println("Kelebihan       : "+ this.kelebihan);
    }
}

