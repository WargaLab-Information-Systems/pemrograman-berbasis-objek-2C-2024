/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul6;


public class Smartphone extends Gadget {
    public Smartphone(String merek, String model){
      super(merek, model);
    }
    
    @Override
    public void showInfo() {
        System.out.println("Smartphone - Merek: " + merek + ", Model: " + model);
    }
}