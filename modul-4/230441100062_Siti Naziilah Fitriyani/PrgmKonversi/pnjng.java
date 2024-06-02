/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coba;

/**
 *
 * @author Acer
 */
public class pnjng extends abs{
     public pnjng(double value, String fromUnit) {
        super(value, fromUnit);
    }

    @Override
    public double convertTo(String toUnit) {
        if (fromUnit.equalsIgnoreCase("M")) {
            if (toUnit.equalsIgnoreCase("KM")) {
                return value / 1000;
            } else if (toUnit.equalsIgnoreCase("CM")) {
                return value * 100;
            }
        } else if (fromUnit.equalsIgnoreCase("KM")) {
            if (toUnit.equalsIgnoreCase("M")) {
                return value * 1000;
            } else if (toUnit.equalsIgnoreCase("CM")) {
                return value * 100000;
            }
        } else if (fromUnit.equalsIgnoreCase("CM")) {
            if (toUnit.equalsIgnoreCase("M")) {
                return value / 100;
            } else if (toUnit.equalsIgnoreCase("KM")) {
                return value / 100000;
            } 
        }
         return 0;
    }
}
