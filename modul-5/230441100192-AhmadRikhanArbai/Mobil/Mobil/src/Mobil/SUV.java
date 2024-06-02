package Mobil;

public class SUV extends Mobil {
    public SUV(String merek, String model, int tahun){
        super(merek, model, tahun);
     }

     void showfeature(String merek){
        System.out.println("Keahlian Dari Mobil Merek "+merek+" "+model+" "+tahun+" Adalah:");
        System.out.println("1. Kuat di Berbagai Medan");
        System.out.println("2. Kenyamanan Bagi Penumpang");
        System.out.println("3. Bodi Kokoh dan Desain Sporty");
        System.out.println("4. Lebih Efisien untuk Membawa Banyak Barang");
        System.out.println("5. Mesin Mobil Berkualitas");
        System.out.println();
    }
    void showfeature(){
        System.out.println("DESKRIPSI DARI MOBIL YANG ANDA PILIH:");
        System.out.println();
    }
}
