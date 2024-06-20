
package satuan;

class Suhu extends KonversiSatuan {
    public Suhu(double value) {
        super(value);
    }

    @Override
    public double konversi(String dari, String ke) {
        if (dari.equalsIgnoreCase("C")) {
            if (ke.equalsIgnoreCase("F")) {
                return (value * 9/5) + 32;
            } else if (ke.equalsIgnoreCase("R")) {
                return (4 / 5 * value);
            } else if (ke.equalsIgnoreCase("K")) {
                return (value + 273.15);
            } else {
                return 0;
            }
        } else if (dari.equalsIgnoreCase("F")) {
            if (ke.equalsIgnoreCase("C")) {
                return (value - 32) * 5/9;
            } else if (ke.equalsIgnoreCase("R")) {
                return (value - 32) * 4/9;
            } else if (ke.equalsIgnoreCase("K")) {
                return (value - 32) * 5/9 + 273.15;
            } else {
                return 0;
            }
        } else if (dari.equalsIgnoreCase("R")) {
            if (ke.equalsIgnoreCase("C")) {
                return value * 5/4;
            } else if (ke.equalsIgnoreCase("F")) {
                return value * 9/4 + 32;
            } else if (ke.equalsIgnoreCase("K")) {
                return value * 5/4 + 273.15;
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }
}
