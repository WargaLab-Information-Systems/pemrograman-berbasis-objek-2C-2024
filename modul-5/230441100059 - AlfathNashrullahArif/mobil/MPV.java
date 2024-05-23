package mobil;

public class MPV extends Mobil{
    String kelebihan = "Harga terjangkau";

    MPV(String Merk, String Model, int TahunProduksi){
        super(Merk, Model, TahunProduksi);
    }

    @Override
    void Display(){
        super.Display();
        System.out.println("Kelebihan       : "+ this.kelebihan);
    }
}
