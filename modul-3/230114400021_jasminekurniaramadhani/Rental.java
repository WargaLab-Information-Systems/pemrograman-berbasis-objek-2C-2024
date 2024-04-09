import java.util.ArrayList;
import java.util.Scanner;

// Parent class
class Rental {
    protected String jenis;
    protected String merek;
    protected String model;
    protected String status;
    protected int tahun;

    public Rental (String jenis, String merek, String model, String status, int tahun) {
        this.jenis = jenis;
        this.merek = merek;
        this.model = model;
        this.status = status;
        this.tahun = tahun;
    }

    public void displayInfo() {
        System.out.println("Jenis Kendaraan: " + jenis);
        System.out.println("Merek: " + merek);
        System.out.println("Model: " + model);
        System.out.println("Status: " + status);
        System.out.println("Tahun Kendaraan: " + tahun);
    }
}

// Child class Car
class Car extends Rental {
    public Car(String merek, String model, String status, int tahun) {
        super("Mobil", merek, model, status, tahun);
    }
}

// Child class Motorcycle
class Motorcycle extends Rental {
    public Motorcycle(String merek, String model, String status, int tahun) {
        super("Motor", merek, model, status, tahun);
    }
}

// Child class Bicycle
class Bicycle extends Rental {
    public Bicycle(String merek, String model, String status, int tahun) {
        super("Sepeda", merek, model, status, tahun);
    }
}

