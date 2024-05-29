/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kendaraan;


public class motor extends Kendaraan {
    String type = "Motor remot" ;
    
        motor(String merek, String model, char status, int tahun){
        super("Motor", merek, model, status, tahun);
    }
    
    @Override
    void info(){
        super.info();
        System.out.println("Type            : "+this.type);
        }    
    }