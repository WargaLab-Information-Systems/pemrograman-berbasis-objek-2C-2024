public class MobilListrik extends Mobil{
    String kelebihan = "Mobil Lebih Hemat";

    MobilListrik(String merk, String model, int tahunProduksi) {
        super(merk, model, tahunProduksi);
    }   
    
    @Override
    void tampil(){
        System.out.println("Mobil Listrik");
        super.tampil();
        System.out.println("Kelebihan       : " + kelebihan);
    }
}
