package modul4;

public abstract class KonversiSatuan {
    protected double nilai;
    protected String satuanAsal;
    protected String satuanBenar;
    
    public KonversiSatuan(double nilai, String satuanAsal, String satuanBenar) {
        this.nilai = nilai;
        this.satuanAsal = satuanAsal;
        this.satuanBenar = satuanBenar;
    }
    
    abstract double konversi();

    public void tampilkanHasil() {
        System.out.println(" ");
        System.out.println("********************* HASIL ********************");
        System.out.println("Hasil konversi satuannya adalah" + " " + konversi() + " " + satuanBenar);
        System.out.println(" ");
    } 
}