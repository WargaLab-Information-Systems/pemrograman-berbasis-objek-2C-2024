
package penyewaan.kendaraan;


public class mobil extends PenyewaanKendaraan {
    String type = "Avansa";
    String penumpang = "6 orang";
    String dapat= "Ac, kursi empuk";

    public mobil(String jenis, String merek, String model, char status, int tahun) {
        super(jenis, merek, model, status, tahun);
    }
    @Override
    public void display(){
        super.display();
        System.out.println(" ");
        System.out.println("==INFORMASI MOBIL==");
        System.out.println("type :" + this.type);
        System.out.println("Penumpang :" + this.penumpang);
        System.out.println("Mendapatkan :" + this.dapat);
}}