package KonversiSatuan;
public class Suhu extends Konversi {
    public Suhu(double value) {
        super(value);
    }
    @Override
    public double konversi(String dari, String ke) {
        if (dari.equalsIgnoreCase("C")) {
            if (ke.equalsIgnoreCase("F")) {
                return (value * 9/5) + 32;
            } else if (ke.equalsIgnoreCase("R")) {
                return  ( 4/5.0 * value);
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
        } else if (dari.equalsIgnoreCase("K")){
            if (ke.equalsIgnoreCase("C")){
                return value - 273 ;
            } else if (ke.equalsIgnoreCase("F")){
                return ((value - 273) * 9/5) + 32;
            } else if (ke.equalsIgnoreCase("R")){
                return (value - 273) * 4/5 ;
            }
        }
          return 0;
        }
}