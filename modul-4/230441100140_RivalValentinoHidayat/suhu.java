/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// Suhu.java
package com.mycompany.modul4;

public class suhu extends Converter {
    @Override
    public float converter(float celsius) {
        return (celsius * 9.0f / 5.0f) + 32;
    }
}

