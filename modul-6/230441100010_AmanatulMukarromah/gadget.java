/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elektronik;

public abstract class gadget implements kamera, bluetooth, wifi, gps {
    String Merk, Model;

    public gadget(String Merk, String Model) {
        this.Merk = Merk;
        this.Model = Model;
    }

    public abstract void Display();
}

    
