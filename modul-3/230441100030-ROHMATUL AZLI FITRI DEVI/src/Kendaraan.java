
public class Kendaraan {
    private String jenisKendaraan;
    private String merek;
    private String model;
    private String status;
    private int tahunKendaraan;

    public Kendaraan(String jenisKendaraan, String merek, String model, String status, int tahunKendaraan) {
        this.jenisKendaraan = jenisKendaraan;
        this.merek = merek;
        this.model = model;
        this.status = status;
        this.tahunKendaraan = tahunKendaraan;
    }

    // Getter dan setter untuk semua atribut

    public String getJenisKendaraan() {
        return jenisKendaraan;
    }

    public void setJenisKendaraan(String jenisKendaraan) {
        this.jenisKendaraan = jenisKendaraan;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTahunKendaraan() {
        return tahunKendaraan;
    }

    public void setTahunKendaraan(int tahunKendaraan) {
        this.tahunKendaraan = tahunKendaraan;
    }

    @Override
    public String toString() {
        return "Kendaraan{" +
                "jenisKendaraan='" + jenisKendaraan + '\'' +
                ", merek='" + merek + '\'' +
                ", model='" + model + '\'' +
                ", status='" + status + '\'' +
                ", tahunKendaraan=" + tahunKendaraan +
                '}';
    }
}

    
