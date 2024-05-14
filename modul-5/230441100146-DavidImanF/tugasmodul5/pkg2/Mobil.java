package tugasmodul5.pkg2;

public class Mobil {
    String warna;
    public void setWarna(String warna) {
        this.warna = warna;
    }
    String Merk, Model;
    int TahunProduksi;
    public String getMerk() {
        return Merk;
    }
    public String getModel() {
        return Model;
    }
    public String getWarna() {
        return warna;
    }
    public int getTahunProduksi() {
        return TahunProduksi;
    }
    public Mobil(String merk, String model, int tahunProduksi) {
        this.Merk = merk;
        this.Model = model;
        this.TahunProduksi = tahunProduksi;
    }
    public void ShowFeature(){
            System.out.println("mobil memiliki beberapa fitur");
    }
    public void ShowFeature(String Warna){
        this.warna = Warna;
    }
}
