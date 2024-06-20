class Kendaraan {
    protected String merek;
    protected String model;
    protected char status;
    protected int tahun;

    public Kendaraan(String merek, String model, char status, int tahun) {
        this.merek = merek;
        this.model = model;
        this.status = status;
        this.tahun = tahun;
    }

    public String displayInfo() {
        String statusStr;
        if (status == 'T') {
            statusStr = "Status: Tersedia, ";
        } else if (status == 'D') {
            statusStr = "Status: Disewakan, ";
        } else {
            statusStr = "Status: tidak valid, ";
        }
        return "Merek: " + merek + ", Model: " + model + ", " + statusStr + "Tahun: " + tahun;
    }
}