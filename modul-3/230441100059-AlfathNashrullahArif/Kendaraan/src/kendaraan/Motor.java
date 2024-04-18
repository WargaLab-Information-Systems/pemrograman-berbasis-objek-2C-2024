/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kendaraan;

/**
 *
 * @author ASUS
 */
public class Motor extends Kendaraan {
    String fasilitas = "Minimun 150cc" ;
    
        Motor(String merek, String model, char status, int tahunKendaraan){
        super("Motor", merek, model, status, tahunKendaraan);
    }
    
    @Override
    void display(){
        super.display();
        System.out.println("Fasilitas    : "+this.fasilitas);
        }    
    }

