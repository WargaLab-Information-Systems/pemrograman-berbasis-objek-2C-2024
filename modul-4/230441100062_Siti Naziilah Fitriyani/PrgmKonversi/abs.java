/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coba;

/**
 *
 * @author Acer
 */
public abstract class abs {
    double value;
    String fromUnit;

    public abs(double value, String fromUnit) {
        this.value = value;
        this.fromUnit = fromUnit;
    }

    public abstract double convertTo(String toUnit);
}

