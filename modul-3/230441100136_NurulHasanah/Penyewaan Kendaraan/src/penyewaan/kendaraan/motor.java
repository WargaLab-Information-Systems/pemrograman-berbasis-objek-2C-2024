package penyewaan.kendaraan;

public class motor extends PenyewaanKendaraan{
    String type = "Bensin irit";
    String mesin = "500 cc";
    String fasilitas = "Surat kendaraan dan fasilitas motor lengkap";

    public motor(String jenis, String merek, String model, char status, int tahun) {
        super(jenis, merek, model, status, tahun);
    }
   
    @Override
    public void display(){
        super.display();
            System.out.println(" ");
            System.out.println("-----INFORMASI TAMBAHAN-----");
            System.out.println("Type \t:" + " "+this.type);
            System.out.println("Kapasitas :" + " "+this.mesin);
            System.out.println("Fasilitas :" + " "+this.fasilitas);
    }
}