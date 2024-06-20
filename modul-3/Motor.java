package RentalMobilNew;

public class Motor extends Kendaraan {
    private String jenis = "Motor";

    public Motor(String merek, String model, char status, int tahun) {
        super(merek, model, status, tahun);
    }

    @Override
    public void tampil() {
        System.out.println("Jenis Kendaraan : " + jenis);
        super.tampil();
    }
}
