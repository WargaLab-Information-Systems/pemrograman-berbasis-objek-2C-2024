package tugasmodul5.pkg2;

public class SUV extends Mobil {
    public SUV (String merk, String model, int tahunProduksi){
        super(merk, model, tahunProduksi);
    }
    @Override
    public void ShowFeature(){
        System.out.println("Mobil jenis SUV memiliki feature yang dapat dikendarai di segala medan");
    }
    public void ShowFeature(String Warna){
        System.out.println("Jenis Mobil SUV "+warna);
    }
}
