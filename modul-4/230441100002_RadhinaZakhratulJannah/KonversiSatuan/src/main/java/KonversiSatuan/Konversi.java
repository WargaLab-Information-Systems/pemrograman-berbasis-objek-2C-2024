package KonversiSatuan;
abstract class Konversi {
    protected double value;

    public Konversi(double value) {
        this.value = value;
    }
    public abstract double konversi(String dari, String ke);
}
