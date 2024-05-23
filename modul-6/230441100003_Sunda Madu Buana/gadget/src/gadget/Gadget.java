/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gadget;

abstract class Gadget {
    String merk;
    String model;
    
    Gadget(String merk, String model) {
        this.merk = merk;
        this.model = model;
    }
    abstract void hasil();
}