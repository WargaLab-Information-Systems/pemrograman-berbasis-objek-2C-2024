package mobil.m5;

public class SUV extends MobilM5{
    String type = "Mobil penumpang dengan bodi kokoh";
    String fasilitas = "Kapasitas mesin yang besar, interior yang luas, fitur yang canggih";
    String kelebihan = "Dirancang dengan model yang terlihat lebih tangguh dan kokoh serta kuat diberbagai medan";
    String muatan = "Kurang lebih 6 orang";
    
    public SUV(String merk, String model, int tahun) {
        super(merk, model, tahun);
    }
    
    @Override
    void showFeature(){
        super.showFeature();
            System.out.println(" ");
            System.out.println("Type Mobil SUV : " +this.type);
            System.out.println("Fasilitas Mobil SUV : " +this.fasilitas);
            System.out.println("Kelebihan Mobil SUV : " +this.kelebihan);
            System.out.println("Muatan Mobil SUV : " +this.muatan);
    }
    
    void showFeature(int penggerak){
        System.out.println("Mobil ini berpenggerak 4x" +penggerak);
    }
    
}
