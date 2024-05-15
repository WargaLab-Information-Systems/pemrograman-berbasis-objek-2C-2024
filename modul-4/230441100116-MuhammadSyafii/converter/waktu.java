package converter;


public class waktu extends Converter {
    @Override
    public double convert(double value, String fromUnit, String toUnit) {
        double result = 0;
        if (fromUnit.equalsIgnoreCase("second")) {
            if (toUnit.equalsIgnoreCase("minute")) {
                result = value / 60;
            } else if (toUnit.equalsIgnoreCase("hour")) {
                result = value / 3600;
            }
        } else if (fromUnit.equalsIgnoreCase("minute")) {
            if (toUnit.equalsIgnoreCase("second")) {
                result = value * 60;
            } else if (toUnit.equalsIgnoreCase("hour")) {
                result = value / 60;
            }
        } else if (fromUnit.equalsIgnoreCase("hour")) {
            if (toUnit.equalsIgnoreCase("second")) {
                result = value * 3600;
            } else if (toUnit.equalsIgnoreCase("minute")) {
                result = value * 60;
            }
        } else {
            System.out.println("errorr");
            System.exit(1);
        }
        return result;
    }
}

