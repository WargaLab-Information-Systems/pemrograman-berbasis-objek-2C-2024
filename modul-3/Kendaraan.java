package RentalMobilNew;

public class Kendaraan {
    private String merek;
    private String model;
    private char status; // T untuk Tersedia, D untuk Disewakan
    private int tahun;

    
    public Kendaraan(String merek, String model, char status, int tahun) {
        this.merek = merek;
        this.model = model;
        this.status = status;
        this.tahun = tahun;
    }

    public String getMerek() {
        return merek;
    }
    public String getModel() {
        return model;
    }
    public char getStatus() {
        return status;
    }
    public int getTahun() {
        return tahun;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setStatus(char status) {
        this.status = status;
    }
    public void setTahun(int tahun) {
        this.tahun = tahun;
    }
    
    public void tampil() {
        System.out.println("Merek           : " + merek);
        System.out.println("Model           : " + model);
        System.out.println("Status          : " + (status == 't' ? "Tersedia" : "Disewakan"));
        System.out.println("Tahun           : " + tahun);
    }
}

