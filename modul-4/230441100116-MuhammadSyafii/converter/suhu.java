package converter;


public class suhu extends Converter {
    @Override
    public double convert(double value, String fromUnit, String toUnit) {
        double result = 0;
        if (fromUnit.equalsIgnoreCase("celsius")) {
            if (toUnit.equalsIgnoreCase("fahrenheit")) {
                result = (value * 9 / 5) + 32;
            } else if (toUnit.equalsIgnoreCase("kelvin")) {
                result = value + 273.15;
            }
        } else if (fromUnit.equalsIgnoreCase("fahrenheit")) {
            if (toUnit.equalsIgnoreCase("celsius")) {
                result = (value - 32) * 5 / 9;
            } else if (toUnit.equalsIgnoreCase("kelvin")) {
                result = (value + 459.67) * 5 / 9;
            }
        } else if (fromUnit.equalsIgnoreCase("kelvin")) {
            if (toUnit.equalsIgnoreCase("celsius")) {
                result = value - 273.15;
            } else if (toUnit.equalsIgnoreCase("fahrenheit")) {
                result = (value * 9 / 5) - 459.67;
            }
        } else {
            System.out.println("error");
            System.exit(1);
        }
        return result;
    }
}
