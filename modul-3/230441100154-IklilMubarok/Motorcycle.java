
package Rental;


public class Motorcycle extends Vehicle {
    public Motorcycle(String merek, String model, String status, int tahun) {
        super("Motor", merek, model, status, tahun);
    }
    
    public void gas() {
        System.out.println("");
}
    
    
    @Override
    public void displayInfo() {
        System.out.println("");
    }
    
    
}

//extends digunakan untuk menunjukkan bahwa suatu kelas (kelas anak) 
//mewarisi sifat dan perilaku dari kelas lain (kelas induk atau superclass).
