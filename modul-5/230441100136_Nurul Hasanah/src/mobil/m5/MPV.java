package mobil.m5;

public class MPV extends MobilM5{
    String type = "Mobil keluarga";
    String fasilitas = "Find My Car, Geofencing, E-Care, dan lainnya";
    String kelebihan = "MPV hadir dalam desain yang lebih elegan serta fleksibel dan mudah dimodifikasi sesuai kebutuhan";
    String muatan = "Kurang lebih 8 orang";
    
    public MPV(String merk, String model, int tahun) {
        super(merk, model, tahun);
    }
    
    @Override
    void showFeature(){
        super.showFeature();
            System.out.println(" ");
            System.out.println("Type Mobil MPV : " +this.type);
            System.out.println("Fasilitas Mobil MPV : " +this.fasilitas);
            System.out.println("Kelebihan Mobil MPV : " +this.kelebihan);
            System.out.println("Muatan Mobil MPV : " +this.muatan);
    }
    
    void showFeature(String type){
        System.out.println("Type mobil mpv : " +type);
        System.out.println("Fasilitas Mobil MPV : " +this.fasilitas);
        System.out.println("Kelebihan Mobil MPV : " +this.kelebihan);
        System.out.println("Muatan Mobil MPV : " +this.muatan);
    }  
    
    void showFeature(int roda){
        System.out.println("Roda mobil ada :" +roda);
    }
}