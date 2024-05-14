public class SUV extends Mobil{
    String kelebihan ="Kemampuan Off-Road";

    SUV(String merk, String model, int tahunProduksi) {
        super(merk, model, tahunProduksi);
    }   
    
    @Override
    void tampil(){
        System.out.println("Mobil SUV");
        super.tampil();
        System.out.println("Kelebihan     : " + kelebihan);
    }
}

