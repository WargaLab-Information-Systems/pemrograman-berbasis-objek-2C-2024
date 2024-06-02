/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coba;

/**
 *
 * @author Acer
 */
public class brt extends abs{
    public brt(double value, String fromUnit) {
        super(value, fromUnit);
    }

    @Override
    public double convertTo(String toUnit) {
        if (fromUnit.equalsIgnoreCase("KG")) {
            if (toUnit.equalsIgnoreCase("G")) {
                return value * 1000;
            } 
        } else if (fromUnit.equalsIgnoreCase("G")) {
            if (toUnit.equalsIgnoreCase("KG")) {
                return value / 1000;
            } 
        }
        return 0;
    }
}
