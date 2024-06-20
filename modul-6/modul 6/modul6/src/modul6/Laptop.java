/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul6;


public class Laptop extends Gadget {
    
    public Laptop(String merek, String model){
      super(merek, model);
    }
    
    @Override
    public void showInfo() {
        System.out.println("Laptop - Merek: " + merek + ", Model: " + model);
    }
}

