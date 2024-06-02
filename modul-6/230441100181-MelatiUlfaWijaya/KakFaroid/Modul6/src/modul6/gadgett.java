/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul6;

/**
 *
 * @author Lenovo
 */
public abstract class gadgett implements kamera, bluetooth, wifi, gps{
    private String merk;
    private String model;
    public gadgett (String merk, String model){
        this.merk=merk;
        this.model=model;
    }
    public String getMerk(){
    return merk;
    }
    public String getModel(){
        return model;
    }
    public abstract void tampilkanSpek();
}
