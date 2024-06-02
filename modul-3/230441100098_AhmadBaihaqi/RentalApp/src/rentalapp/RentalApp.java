/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rentalapp;

import java.util.ArrayList;
import java.util.Scanner;

class Vehicle {
    protected String jenisKendaraan;
    protected String merek;
    protected String model;
    protected char status; 
    protected int tahunKendaraan;

    public Vehicle(String jenisKendaraan, String merek, String model, char status, int tahunKendaraan) {
        this.jenisKendaraan = jenisKendaraan;
        this.merek = merek;
        this.model = model;
        this.status = status;
        this.tahunKendaraan = tahunKendaraan;
    }

    @Override
    public String toString() {
        return jenisKendaraan + " | " + merek + " | " + model + " | " + status + " | " + tahunKendaraan;
    }
}

class Car extends Vehicle {
    public Car(String merek, String model, char status, int tahunKendaraan) {
        super("Mobil", merek, model, status, tahunKendaraan);
    }
}

class Motorcycle extends Vehicle {
    public Motorcycle(String merek, String model, char status, int tahunKendaraan) {
        super("Motor", merek, model, status, tahunKendaraan);
    }
}

public class RentalApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        System.out.print("Masukkan jumlah kendaraan: ");
        int jumlahKendaraan = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < jumlahKendaraan; i++) {
            System.out.println("Masukkan data kendaraan ke-" + (i + 1));
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
            scanner.nextLine(); 

            if (jenis.equalsIgnoreCase("Mobil")) {
                vehicles.add(new Car(merek, model, status, tahun));
            } else if (jenis.equalsIgnoreCase("Motor")) {
                vehicles.add(new Motorcycle(merek, model, status, tahun));
            } else {
                System.out.println("Jenis kendaraan tidak valid.");
            }
        }

        System.out.println("\nDaftar Kendaraan yang Telah Disewakan:");
        for (Vehicle vehicle : vehicles) {
            if (vehicle.status == 'D') {
                System.out.println(vehicle.toString());
            }
        }

        scanner.close();
    }
}
