package gadget;

public abstract class Gadget implements Kamera, Wifi, Bluetooth, Gps{
    String merk;
    String model;
    
    Gadget(String merk, String model){
        this.merk = merk;
        this.model = model;
    }
    
    abstract void gadget();
}