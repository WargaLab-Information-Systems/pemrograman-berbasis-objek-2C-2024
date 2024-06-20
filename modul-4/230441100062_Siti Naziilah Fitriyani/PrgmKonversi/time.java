/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coba;

/**
 *
 * @author Acer
 */
public class time extends abs{
    public time(double value, String fromUnit) {
        super(value, fromUnit);
    }

    @Override
    public double convertTo(String toUnit) {
        if (fromUnit.equalsIgnoreCase("Dtk")) {
            if (toUnit.equalsIgnoreCase("Mnt")) {
                return value / 60;
            } else if (toUnit.equalsIgnoreCase("Jam")) {
                return value / 3600;
            }
        } else if (fromUnit.equalsIgnoreCase("Mnt")) {
            if (toUnit.equalsIgnoreCase("Dtk")) {
                return value * 60;
            } else if (toUnit.equalsIgnoreCase("Jam")) {
                return value / 60;
            }
        } else if (fromUnit.equalsIgnoreCase("Jam")) {
            if (toUnit.equalsIgnoreCase("Dtk")) {
                return value * 3600;
            } else if (toUnit.equalsIgnoreCase("Mnt")) {
                return value * 60;
            }
        }
        return 0;
    }
}
