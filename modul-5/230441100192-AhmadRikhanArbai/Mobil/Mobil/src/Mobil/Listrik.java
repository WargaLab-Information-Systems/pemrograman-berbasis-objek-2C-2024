package Mobil;

public class Listrik extends Mobil{
    public Listrik(String merek, String model, int tahun){
        super(merek, model, tahun);
     }


     void showfeature(String merek){
        System.out.println("Keahlian Dari Mobil Merek "+merek+" "+model+" "+tahun+" Adalah:");
        System.out.println("1. Ramah Lingkungan");
        System.out.println("2. Biaya Operasional Rendah");
        System.out.println("3. Kinerja Responsif");
        System.out.println("4. Pengisian Mudah");
        System.out.println("5. Perawatan yang Lebih Sederhana");
        System.out.println("6. Inovasi Teknologi");
        System.out.println("7. Kontribusi pada Kemandirian Energi");
        System.out.println();
    }
    void showfeature(){
        System.out.println("DESKRIPSI DARI MOBIL YANG ANDA PILIH:");
        System.out.println();
    }
    
}
