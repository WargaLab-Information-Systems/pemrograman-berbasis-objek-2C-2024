import java.util.ArrayList;
import java.util.Scanner;

// Parent class Vehicle
class Vehicle {
    String jenis;
    String merek;
    String model;
    char status;
    int tahun;

    public Vehicle(String jenis, String merek, String model, char status, int tahun) {
        this.jenis = jenis;
        this.merek = merek;
        this.model = model;
        this.status = status;
        this.tahun = tahun;
    }

    public String toString() {
        return "Jenis: " + jenis + ", Merek: " + merek + ", Model: " + model + ", Status: " + status + ", Tahun: " + tahun;
    }
}

// Child class Car
class Car extends Vehicle {
    public Car(String jenis, String merek, String model, char status, int tahun) {
        super(jenis, merek, model, status, tahun);
    }
}

// Child class Motorcycle
class Motorcycle extends Vehicle {
    public Motorcycle(String jenis, String merek, String model, char status, int tahun) {
        super(jenis, merek, model, status, tahun);
    }
}

public class RentalVehicle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        System.out.print("Masukkan jumlah kendaraan: ");
        int jumlahKendaraan = scanner.nextInt();
        scanner.nextLine(); // clear buffer

        for (int i = 0; i < jumlahKendaraan; i++) {
            System.out.println("Data Kendaraan ke-" + (i+1));
            System.out.print("Jenis Kendaraan (Mobil/Motor): ");
            String jenis = scanner.nextLine();
            System.out.print("Merek: ");
            String merek = scanner.nextLine();
            System.out.print("Model: ");
            String model = scanner.nextLine();
            System.out.print("Status (T/D): ");
            char status = scanner.nextLine().charAt(0);
            System.out.print("Tahun Kendaraan: ");
            int tahun = scanner.nextInt();
            scanner.nextLine(); // clear buffer

            if (jenis.equalsIgnoreCase("Mobil")) {
                vehicles.add(new Car(jenis, merek, model, status, tahun));
            } else if (jenis.equalsIgnoreCase("Motor")) {
                vehicles.add(new Motorcycle(jenis, merek, model, status, tahun));
            } else {
                System.out.println("Jenis kendaraan tidak valid.");
            }
        }

        // Menampilkan daftar kendaraan yang telah dimasukkan
        System.out.println("\nDaftar Kendaraan:");
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }

        scanner.close();
    }
}
