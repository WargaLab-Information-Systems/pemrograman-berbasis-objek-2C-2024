package MODUL5;

public class MOBIL {

String pilih;
String merek;
String model;
int tahun;

//KONSTRUKTOR KERANGKA UNTUK SEMUA KELAS TURUNANNYA
MOBIL(String pilih, String merek, String model, int tahun){
    this.pilih = pilih;
    this.merek = merek;
    this.model = model;
    this.tahun = tahun;
}
//METHOD UNTUK SEMUA KELAS TURUNANNYA   
    void showfeature(){
        System.out.println("TIPE MOBIL    : " + this.pilih);
        System.out.println("MEREK         : " + this.merek);
        System.out.println("MODEL         : " +this.model);
        System.out.println("TAHUN         : " +this.tahun);
    }
}

