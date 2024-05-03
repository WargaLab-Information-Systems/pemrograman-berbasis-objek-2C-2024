/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kendaraan;

/**
 *
 * @author ASUS
 */
public class Mobil extends Kendaraan{
    String fasilitas = "Mobil Ber - AC";
    
        Mobil(String merek, String model, char status, int tahunKendaraan){
        super("Mobil", merek, model, status, tahunKendaraan);
        }
        
    @Override
    void display(){
        super.display();
        System.out.println("Fasilitas    : "+this.fasilitas);
        }
    }
    

