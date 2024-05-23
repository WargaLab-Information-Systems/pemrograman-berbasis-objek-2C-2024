
package satuan;

class Waktu extends KonversiSatuan {
    public Waktu(double value) {
        super(value);
    }

    @Override
    public double konversi(String dari, String ke) {
        if (dari.equalsIgnoreCase("d")) {
            if (dari.equalsIgnoreCase("m")) {
                return value / 60;
            } else if (dari.equalsIgnoreCase("j")) {
                return value / 3600;
            } else if (dari.equalsIgnoreCase("h")) {
                return value / 86400;
            } else {
                return 0;
            }
        } else if (dari.equalsIgnoreCase("m")) {
            if (dari.equalsIgnoreCase("d")) {
                return value * 60;
            } else if (dari.equalsIgnoreCase("j")) {
                return value / 60;
            } else if (dari.equalsIgnoreCase("h")) {
                return value / 1440;
            } else {
                return 0;
            }
        } else if (dari.equalsIgnoreCase("j")) {
            if (dari.equalsIgnoreCase("d")) {
                return value * 3600;
            } else if (dari.equalsIgnoreCase("m")) {
                return value * 60;
            } else if (dari.equalsIgnoreCase("h")) {
                return value / 24;
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }
}
