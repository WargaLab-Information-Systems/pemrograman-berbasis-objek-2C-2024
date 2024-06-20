
package menkonversi;

class waktu extends Menkonversi {
    public waktu(double  masukkannilai ){
        super(masukkannilai);
    }

    @Override
    public void konversi() {
        double jam = masukkannilai*24;
        double menit = jam*60;
        double detik = menit*60;
                System.out.println("Hasil konversi satuan waktu hari ke jam = "+ jam+"jam");
                System.out.println("Hasil konversi satuan waktu jam ke menit = "+menit+"menit");
                System.out.println("Hasil Konversi satuan waktu menit ke detik ="+detik+"detik");
    }}