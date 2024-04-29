
package Rental;


import java.util.ArrayList;
import java.util.Scanner;

// Parent class
public class Vehicle {
    String jenis;
    String merek;
    String model;
    String status;
    int tahun;

    public Vehicle (String jenis, String merek, String model, String status, int tahun) {
        this.jenis = jenis;
        this.merek = merek;
        this.model = model;
        this.status = status;
        this.tahun = tahun;
    }

    public void displayInfo() {
        System.out.println("Jenis Kendaraan : " + jenis);
        System.out.println("Merek : " + merek);
        System.out.println("Model : " + model);
        System.out.println("Status : " + status);
        System.out.println("Tahun Kendaraan : " + tahun);
    }
}

// Child class Bicycle


