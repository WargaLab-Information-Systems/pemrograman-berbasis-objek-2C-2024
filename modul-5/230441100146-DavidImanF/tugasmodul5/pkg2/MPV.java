package tugasmodul5.pkg2;

public class MPV extends Mobil {
    public MPV (String merk, String model,int tahunProduksi){  
        super(merk, model, tahunProduksi);
    }
    @Override
    public void ShowFeature(){
        System.out.println("Mobil jenis MPV memiliki feature yang dapat membawa banyak orang");
    }
    public void ShowFeature(String warna){
        System.out.println("Jenis Mobil MPV "+warna);
    }
}
