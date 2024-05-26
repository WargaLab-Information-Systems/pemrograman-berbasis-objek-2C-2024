package MODUL_6;

public class GADGET {

String pilih;
String merek;
String model;

//KONSTRUKTOR KERANGKA UNTUK SEMUA KELAS TURUNANNYA
GADGET(String pilih, String merek, String model){
    this.pilih = pilih;
    this.merek = merek;
    this.model = model;
}
//METHOD UNTUK SEMUA KELAS TURUNANNYA   
    void showfeature(){
        System.out.println("TIPE GADGET     : " + this.pilih);
        System.out.println("MEREK           : " + this.merek);
        System.out.println("MODEL           : " +this.model);
    }
}



interface Kamera {
    void ambilFoto();
    void rekamVideo();
}

interface Bluetooth {
    void kirimFile();
    void terimaFile();
    void koneksiPerangkat();
}

interface WiFi {
    void cariJaringan();
    void hubunganJaringan();
    void lupakanJaringan();
}

interface GPS {
    void ambilKoordinat();
}


