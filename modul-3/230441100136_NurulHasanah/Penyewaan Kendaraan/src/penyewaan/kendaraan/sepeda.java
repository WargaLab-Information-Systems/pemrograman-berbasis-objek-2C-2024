package penyewaan.kendaraan;

public class sepeda extends PenyewaanKendaraan{
    String type = "Sepeda gunung";
    String fasilitas = "Lengkap dengan alat pelindung diri";

    public sepeda(String jenis, String merek, String model, char status, int tahun) {
        super(jenis, merek, model, status, tahun);
    }

    
    @Override
    public void display(){
        super.display();
            System.out.println(" ");
            System.out.println("-----INFORMASI TAMBAHAN-----");
            System.out.println("Type  \t:" + " "+this.type);
            System.out.println("Fasilitas :" + " "+this.fasilitas);
    }
    
}