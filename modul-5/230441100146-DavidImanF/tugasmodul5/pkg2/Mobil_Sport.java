package tugasmodul5.pkg2;

public class Mobil_Sport extends Mobil {
    public Mobil_Sport (String merk, String model, int tahunProduksi){
        super(merk, model, tahunProduksi);
    }
    @Override
    public void ShowFeature(){
        System.out.println("Mobil Sport memiliki feature kecepatan tinggi");
    }
    public void ShowFeature(String Warna){
        System.out.println("Mobil jenis Sport memiliki warna "+Warna);
    }
}
