package Mobil;

public class MPV extends Mobil {
     public MPV(String merek, String model, int tahun){
        super(merek, model, tahun);
     }


     void showfeature(String merek){
        System.out.println("Keahlian Dari Mobil Merek "+merek+" "+model+" "+tahun+" Adalah:");
        System.out.println("1. Kapasitas penumpang lebih banyak");
        System.out.println("2. Nyaman dipakai berkendara di berbagai medan");
        System.out.println("3. Fitur keamanan yang lengkap");
        System.out.println("4. Harga yang kompetitif");
        System.out.println();
    }
    void showfeature(){
        System.out.println("DESKRIPSI DARI MOBIL YANG ANDA PILIH:");
        System.out.println();
    }
    
}
