package Mobil;

public class Sport extends Mobil{
    public Sport(String merek, String model, int tahun){
        super(merek, model, tahun);
     }


     void showfeature(String merek){
        System.out.println("Keahlian Dari Mobil Merek "+merek+" "+model+" "+tahun+" Adalah:");
        System.out.println("1. Performa Tinggi");
        System.out.println("2. Desain Aerodinamis");
        System.out.println("3. Teknologi Canggih");
        System.out.println("4. Material Ringan");
        System.out.println("5. Pengalaman Berkendara yang Memuaskan");
        System.out.println("6. Tampilan Menarik");
        System.out.println();
    }
    void showfeature(){
        System.out.println("DESKRIPSI DARI MOBIL YANG ANDA PILIH:");
        System.out.println();
    }
}
