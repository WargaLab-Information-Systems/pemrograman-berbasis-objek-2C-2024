/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package convert_aplication;

/**
 *
 * @author HP
 */
public class Suhu extends Convert_aplication{
     @Override
    public int Hasil(double angka){
        int hasil=0;
        double fahr = (9.0/5.0 * angka) + 32;
        double kelv = angka + 273.15;
        double ream = angka * (4.0/5.0) ;
        
        System.out.println(angka + " derajat Celcius = " + fahr + " derajat Fahrenheit");
        System.out.println(angka + " derajat Celcius = " + kelv + " derajat Kelvin");
        System.out.println(angka + " derajat Celcius = " + ream + " derajat Reamur");
        
        return hasil;
    }
    
}
