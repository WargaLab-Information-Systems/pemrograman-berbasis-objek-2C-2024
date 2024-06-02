package mobil.m5;

public class MobilListrik extends MobilM5{
    String type = "Mobil keluarga";
    String fasilitas = "BEV(Battery Electric Vehicle) dan PHEV (Plug-in Hybrid Electric Vehicle)";
    String kelebihan = "Ramah lingkungan karena tidak menghasilkan emisi yang dapat mempengaruhi polusi";
    String muatan = "Kurang lebih 7 orang";
    
    public MobilListrik(String merk, String model, int tahun) {
        super(merk, model, tahun);
    }
    
    @Override
    void showFeature(){
        super.showFeature();
            System.out.println(" ");
            System.out.println("Tipe Mobil Listrik : " +this.type);
            System.out.println("Fasilitas Mobil Listrik : " +this.fasilitas);
            System.out.println("Kelebihan Mobil Listrik : " +this.kelebihan);
            System.out.println("Muatan Mobil Listrik : " +this.muatan);
    }
    
    void showFeature(int kapasitas){
        System.out.println("Kapasitas Baterai Mobil Listrik : " +kapasitas);
    }
    
}
