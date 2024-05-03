public class Mobil extends Kendaraan{
    private String jenis = "Mobil";

    public Mobil(String merek, String model, char status, int tahun) {
        super(merek, model, status, tahun);
    }

    @Override
    public void tampil() {
        System.out.println("Jenis Kendaraan : " + jenis);
        super.tampil();
    }
}
