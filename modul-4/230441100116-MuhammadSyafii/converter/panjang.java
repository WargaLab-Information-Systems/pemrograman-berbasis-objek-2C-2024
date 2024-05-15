package converter;

public class panjang extends Converter {
    @Override
    public double convert(double value, String fromUnit, String toUnit) {
        double result = 0;

        if (fromUnit.equalsIgnoreCase("centimeter")) {
            if (toUnit.equalsIgnoreCase("meter")) {
                result = value / 100;
            } else if (toUnit.equalsIgnoreCase("kilometer")) {
                result = value / 100000;
            }
        } else if (fromUnit.equalsIgnoreCase("meter")) {
            if (toUnit.equalsIgnoreCase("centimeter")) {
                result = value * 100;
            } else if (toUnit.equalsIgnoreCase("kilometer")) {
                result = value / 1000;
            }
        } else if (fromUnit.equalsIgnoreCase("kilometer")) {
            if (toUnit.equalsIgnoreCase("meter")) {
                result = value * 1000;
            } else if (toUnit.equalsIgnoreCase("centimeter")) {
                result = value * 100000;
            }
        } else {
            System.out.println("Errorrrr");
            System.exit(1);
        }

        return result;
    }
}


