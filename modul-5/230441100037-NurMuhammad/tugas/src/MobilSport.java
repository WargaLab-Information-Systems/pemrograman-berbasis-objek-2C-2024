public class MobilSport extends Mobil {
    String kelebihan ="Mobil sangat kencang";

    MobilSport(String merk, String model, int tahunProduksi) {
        super(merk, model, tahunProduksi);
    }   
    
    @Override
    void tampil(){
        System.out.println("Mobil Sport");
        super.tampil();
        System.out.println("Kelebihan     : " + kelebihan);
    }
}
