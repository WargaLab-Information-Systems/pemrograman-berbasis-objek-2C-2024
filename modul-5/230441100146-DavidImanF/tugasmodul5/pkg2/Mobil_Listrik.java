package tugasmodul5.pkg2;

public class Mobil_Listrik extends Mobil {
    public Mobil_Listrik (String merk, String model, int tahunProduksi){
        super(merk, model, tahunProduksi);
    }
    @Override
    public void ShowFeature(){
        System.out.println("Mobil Lisrik penggeraknya menggunakan motor listrik");
    }
    public void ShowFeature(String Warna){
        System.out.println("Mobil jenis Listrik memiliki "+Warna);
    }
}
