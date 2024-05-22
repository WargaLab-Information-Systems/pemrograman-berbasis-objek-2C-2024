/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul6;


public class Tablet extends Gadget {
   public Tablet(String merek, String model){
      super(merek, model);
    }
    
    @Override
    public void showInfo() {
        System.out.println("Tablet - Merek: " + merek + ", Model: " + model);
    }
}
