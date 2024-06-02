package mobil.m5;

public class MobilSport extends MobilM5{
    String type = "Mobil dengan performa yang tinggi";
    String kelebihan = "Desain yang menawan, Teknologi Canggih, dan Mampu digunakan dalam kecepatan tinggi";
    
    public MobilSport(String merk, String model, int tahun) {
        super(merk, model, tahun);
    }
    
    @Override
    void showFeature(){
        super.showFeature();
            System.out.println(" ");
            System.out.println("Tipe Mobil Sport : " +this.type);
            System.out.println("Kelebihan Mobil Sport : " +this.kelebihan);
    } 
    
    void showFeature(int kecepatan){
        System.out.println("Kecepatan Maksimal Mobil :"+ +kecepatan+ "km/j");
    }
}