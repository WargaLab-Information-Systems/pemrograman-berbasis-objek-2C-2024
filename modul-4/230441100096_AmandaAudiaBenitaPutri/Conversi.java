package conversi;
abstract class KonversiSatuan {
    protected double value;

    public KonversiSatuan(double value) {
        this.value = value;
    }

    public abstract double konversi(String SatuanAwal, String to);
}