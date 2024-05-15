package converter;

public class berat extends Converter {
    @Override
    public double convert(double value, String fromUnit, String toUnit) {
        double result = 0;

        if (fromUnit.equalsIgnoreCase("gram")) {
            if (toUnit.equalsIgnoreCase("kilogram")) {
                result = value / 1000;
            } else if (toUnit.equalsIgnoreCase("pound")) {
                result = value * 0.00220462;
            }
        }
     
        else if (fromUnit.equalsIgnoreCase("kilogram")) {
            if (toUnit.equalsIgnoreCase("gram")) {
                result = value * 1000;
            } else if (toUnit.equalsIgnoreCase("pound")) {
                result = value * 2.20462;
            }
        }
     
        else if (fromUnit.equalsIgnoreCase("pound")) {
            if (toUnit.equalsIgnoreCase("gram")) {
                result = value / 0.00220462;
            } else if (toUnit.equalsIgnoreCase("kilogram")) {
                result = value / 2.20462;
            }
        } else {
            System.out.println("error");
            System.exit(1);
        }

        return result;
    }
}
