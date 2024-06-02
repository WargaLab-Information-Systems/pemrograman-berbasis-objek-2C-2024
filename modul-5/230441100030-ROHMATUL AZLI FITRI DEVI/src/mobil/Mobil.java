package mobil;


public class Mobil {
    String merek;
    String model;
    int tahunProduksi;
    
    public Mobil(String merek, String model, int tahunProduksi) {
        this.merek = merek;
        this.model = model;
        this.tahunProduksi = tahunProduksi;
    }

    public String getMerek() {
        return merek;
    }
    public String getModel() {
        return model;
    }
    public int getTahunProduksi() {
        return tahunProduksi;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setTahunProduksi(int tahun) {
        this.tahunProduksi = tahun;
    }
    
    public void showFeature() {
        System.out.println("Merek           : " + merek        );
        System.out.println("Model           : " + model        );
        System.out.println("TahunProduksi   : " + tahunProduksi);
    }
}



//get=mengakses nilai dalam atribut set = mengubah
