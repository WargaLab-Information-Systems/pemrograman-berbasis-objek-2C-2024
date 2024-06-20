
package menkonversi;


class panjang extends Menkonversi {
    public panjang(double masukkannilai ){
        super(masukkannilai);
    }

    @Override
    public void konversi() {
        double desimeter = masukkannilai/10;
        double meter = desimeter/10;
                double dekameter = meter/10;
                double kilometer = dekameter/100;
                
                System.out.println("Hasil konversi panjang sentimeter ke desimeter = "+ desimeter);
                System.out.println("Hasil konversi panjang desimeter ke meter ="+ meter);
                System.out.println("Hasil konversi panjang meter ke dekameter = "+dekameter);
                System.out.println("Hasil konversi panjang dekameter ke kilometer ="+ kilometer);
        }}
