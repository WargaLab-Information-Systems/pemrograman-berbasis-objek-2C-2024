/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kendaraan;
public class motor extends Kendaraan {
    String type = "manual" ;
    String owner = "amna" ;
    motor(String merek, String model, char status, int tahunKendaraan){
        super("Motor", merek, model, status, tahunKendaraan);
    }
    
    @Override
    void display() {
        super.display();
        System.out.println("type transmis   : "+this.type);
        System.out.println("owner           : "+this.owner);
    }
}

