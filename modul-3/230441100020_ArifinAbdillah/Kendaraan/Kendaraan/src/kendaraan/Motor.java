/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kendaraan;

public class Motor extends Kendaraan {
      String fasilitas = "hemat bensin";
      
    Motor(String merek, String model, char status, int tahun){
        super("Motor", merek, model, status, tahun);
    }
    
    @Override
    void display(){
        super.display();
        System.out.println("motor ini hemat bensin");
    }
    
}


