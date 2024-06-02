
package satuan;

class Panjang extends KonversiSatuan {
    public Panjang(double value) {
        super(value);
    }

    @Override
    public double konversi(String dari, String ke) {
        if (dari.equalsIgnoreCase("mm")) {
            if (ke.equalsIgnoreCase("cm")) {
                return value / 10;
            } else if (ke.equalsIgnoreCase("m")) {
                return value / 1000;
            } else if (ke.equalsIgnoreCase("km")) {
                return value / 1000000;
            } else if (ke.equalsIgnoreCase("mi")) {
                return value / 1609340;
            } else if (ke.equalsIgnoreCase("in")) {
                return value / 25.4;
            } else {
                return 0;
            }
        } else if (dari.equalsIgnoreCase("km")) {
            if (ke.equalsIgnoreCase("mm")) {
                return value * 1000000;
            } else if (ke.equalsIgnoreCase("cm")) {
                return value * 100000;
            } else if (ke.equalsIgnoreCase("m")) {
                return value * 1000;
            } else if (ke.equalsIgnoreCase("mi")) {
                return value / 1.60934;
            } else if (ke.equalsIgnoreCase("in")) {
                return value / 0.0000254;
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }
}
