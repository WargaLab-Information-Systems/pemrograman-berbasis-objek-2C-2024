/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Rental;

/**
 *
 * @author HP
 */
import java.util.ArrayList;
import java.util.Scanner;

// Parent class
public class rental {
    String jenis;
    String merek;
    String model;
    String status;
    int tahun;

    public rental (String jenis, String merek, String model, String status, int tahun) {
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

// Child class Bicycle



