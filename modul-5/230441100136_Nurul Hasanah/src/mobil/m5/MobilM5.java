package mobil.m5;

public class MobilM5 {
    String merk, model;
    int tahun;
    
    MobilM5(String merk, String model, int tahun){
        this.merk = merk;
        this.model = model;
        this.tahun = tahun;
    }
    
    void showFeature() {
        System.out.println("Merk Mobil : " +merk);
        System.out.println("Model Mobil : " +model);
        System.out.println("Tahun Produksi : " +tahun);
    } 
    
   
}
