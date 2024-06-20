public class Mobil {
    String merk;
    String model;
    int tahunProduksi;
   
    Mobil(String merk, String model, int tahunProduksi){
        this.merk = merk;
        this.model = model;
        this.tahunProduksi = tahunProduksi;
    }

    void tampil(){
        System.out.println("Fitur Kendaraan:");
        System.out.println("Merk            : " + this.merk);
        System.out.println("Model           : " + this.model);
        System.out.println("Tahun Produksi  : " + this.tahunProduksi);
    }
}
