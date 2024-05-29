package penyewaan.kendaraan;

public class mobil extends PenyewaanKendaraan{
     String type = "Mobil keluarga";
     String muatan = "Kurang lebih 10 orang";
     String fasilitas = "AC mobil, Head unit, Jok dan Karpet bahan kulit";

    public mobil(String jenis, String merek, String model, char status, int tahun) {
        super(jenis, merek, model, status, tahun);
    }

    @Override
    public void display(){
        super.display();
            System.out.println(" ");
            System.out.println("-----INFORMASI TAMBAHAN-----");
            System.out.println("Type \t:" +this.type);
            System.out.println("Muatan \t:" +this.muatan);
            System.out.println("Fasilitas :" +this.fasilitas);
    }    
}