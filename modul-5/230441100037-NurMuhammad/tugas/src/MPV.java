public class MPV extends Mobil {
    String kelebihan ="Kapasitas Lebih Banyak";

    MPV(String merk, String model, int tahunProduksi) {
        super(merk, model, tahunProduksi);
    }   
    
    @Override
    void tampil(){
        System.out.println("Mobil MPV");
        super.tampil();
        System.out.println("Kelebihan     : " + kelebihan);
    }
}
