
package menkonversi;


class berat extends Menkonversi {
    public berat(double masukkannilai){
        super(masukkannilai);
    }

    @Override
    public void konversi() {
                double hektogram = masukkannilai*10;
                double gram = hektogram*100;
                double sentigram = gram*100;
                double miligram = sentigram*10;
                System.out.println("Hasil konversi satuan berat kilogram ke hektogram = "+ hektogram);
                System.out.println("Hasil konversi satuan berat hektogram ke gram ="+ gram);
                System.out.println("Hasil konversi satuan berat gram ke sentigram ="+sentigram);
                System.out.println("Hasil konversi satuan berat sentigram ke miligram = "+miligram);
    }}