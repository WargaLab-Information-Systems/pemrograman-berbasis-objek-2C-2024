/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kendaraan;
public class mobil extends Kendaraan {
    String type = "matic";
    String owner = "amna" ;
    mobil(String merek, String model, char status, int tahun) {
        super("Mobil", merek, model, status, tahun);
    }
    
    @Override
    void display() {
        super.display();
        System.out.println("type transmisi  : "+this.type);
        System.out.println("owner           : "+this.owner);
        
    }
}
