/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul.pkg6;

/**
 *
 * @author Acer
 */
abstract class Gadget{
    String merek;
    String model;
    
    Gadget (String merek, String model){
        this.merek = merek;
        this.model = model;
    }
    
    public abstract void tampilkaninfo();
}
   
