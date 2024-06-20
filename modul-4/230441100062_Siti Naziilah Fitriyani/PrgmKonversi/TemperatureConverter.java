/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coba;

/**
 *
 * @author Acer
 */
public class TemperatureConverter extends abs{
    public TemperatureConverter(double value, String fromUnit) {
        super(value, fromUnit);
    }

    @Override
    public double convertTo(String toUnit) {
        if (fromUnit.equalsIgnoreCase("C")) {
            if (toUnit.equalsIgnoreCase("F")) {
                return (value * 9 / 5) + 32;
            } else if (toUnit.equalsIgnoreCase("K")) {
                return value + 273.15;
            }
        } else if (fromUnit.equalsIgnoreCase("F")) {
            if (toUnit.equalsIgnoreCase("C")) {
                return (value - 32) * 5 / 9;
            } else if (toUnit.equalsIgnoreCase("K")) {
                return (value - 32) * 5 / 9 + 273.15;
            }
        } else if (fromUnit.equalsIgnoreCase("K")) {
            if (toUnit.equalsIgnoreCase("C")) {
                return value - 273.15;
            } else if (toUnit.equalsIgnoreCase("F")) {
                return (value - 273.15) * 9 / 5 + 32;
            }
        }
        return 0;
    }
}
