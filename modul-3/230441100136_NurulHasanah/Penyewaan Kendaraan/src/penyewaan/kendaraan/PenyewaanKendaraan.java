package penyewaan.kendaraan;

public class PenyewaanKendaraan {
    String jenis, merek, model;
    char status;
    int tahun;
    
    PenyewaanKendaraan(String jenis, String merek, String model, char status, int tahun){
        this.jenis = jenis;
        this.merek = merek;
        this.model = model;
        this.status = status;
        this.tahun = tahun;
    }
 
    public void display() {
        System.out.println("Jenis Kendaraan: " + jenis);
        System.out.println("Merek \t: " + merek);
        System.out.println("Model \t: " + model);
        System.out.print("Status \t: ");
        if (status == 'T'){
            System.out.println("Tersedia");
        }
        else if (status == 'D'){
            System.out.println("Disewakan");
        }
        System.out.println("Tahun Kendaraan: " + tahun);
    }
}