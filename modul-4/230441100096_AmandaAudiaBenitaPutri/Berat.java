package conversi;
class Berat extends KonversiSatuan {
    public Berat(double value) {
        super(value); //memanggil atribut parent class
    }

    @Override
    public double konversi(String SatuanAwal, String to) {
        if (SatuanAwal.equalsIgnoreCase("mg")) {
            if (to.equalsIgnoreCase("g")) {
                return value / 1000;
            } else if (to.equalsIgnoreCase("kg")) {
                return value / 1000000;
            } else if (to.equalsIgnoreCase("ton")) {
                return value / 1000000000;
            } else {
                return 0;
            }
        } else if (SatuanAwal.equalsIgnoreCase("g")) {
            if (to.equalsIgnoreCase("mg")) {
                return value * 1000;
            } else if (to.equalsIgnoreCase("kg")) {
                return value / 1000;
            } else if (to.equalsIgnoreCase("ton")) {
                return value / 1000000;
            } else {
                return 0;
            }
        } else if (SatuanAwal.equalsIgnoreCase("kg")) {
            if (to.equalsIgnoreCase("g")) {
                return value * 1000;
            } else if (to.equalsIgnoreCase("mg")) {
                return value * 1000000;
            } else if (to.equalsIgnoreCase("ton")) {
                return value / 1000;
            } else {
                return 0;
            }
        } else if (SatuanAwal.equalsIgnoreCase("ton")) {
            if (to.equalsIgnoreCase("g")) {
                return value * 1000000;
            } else if (to.equalsIgnoreCase("mg")) {
                return value * 1000000000;
            } else if (to.equalsIgnoreCase("kg")) {
                return value * 1000;
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }
}