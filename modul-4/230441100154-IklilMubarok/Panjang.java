
package konversi;


public class Panjang extends Konversi{
    public Panjang(double value) {
        super(value);
    }
    @Override
    public double KonversiSatuan (String SatuanAsal, String to ) {
        // Implement length conversion logic here
        if (SatuanAsal.equalsIgnoreCase("Meter")) {
            if (to.equalsIgnoreCase("Centimeter")) {
                return value * 100;
            } else if (to.equalsIgnoreCase("Inch")) {
                return value * 39.3701;
            }
        } else if (SatuanAsal.equalsIgnoreCase("Centimeter")) {
            if (to.equalsIgnoreCase("Meter")) {
                return value / 100;
            } else if (to.equalsIgnoreCase("Inch")) {
                return value / 2.54;
            }
        } else if (SatuanAsal.equalsIgnoreCase("Inch")) {
            if (to.equalsIgnoreCase("Meter")) {
                return value * 0.0254;
            } else if (to.equalsIgnoreCase("Centimeter")) {
                return value * 2.54;
            }
        }
        return 0; // Invalid conversion
    }
}

