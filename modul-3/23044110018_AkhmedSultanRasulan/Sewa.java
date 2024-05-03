/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sewa;
import java.util.Scanner;


class Kendaraan {
    protected String jenis;
    protected String merek;
    protected String model;
    protected String status;
    protected int tahun;

    public Kendaraan(String jenis, String merek, String model, String status, int tahun) {
        this.jenis = jenis;
        this.merek = merek;
        this.model = model;
        this.status = status;
        this.tahun = tahun;
    }

    public String displayInfo() {
        String statuskdr;
           if ( status.equalsIgnoreCase("T")){
            statuskdr ="Tersedia"; 
           }else if(status.equalsIgnoreCase("D")){
            statuskdr ="Disewakan";
           }else {
            statuskdr ="Status tidak valid";
           }
        System.out.println("Jenis: " + jenis);
        System.out.println("Merek: " + merek);
        System.out.println("Model: " + model);
        System.out.println("Status: " + statuskdr);
        System.out.println("Tahun: " + tahun);
        return null;
    }
}

class Mobil extends Kendaraan {
    public Mobil(String merek, String model, String status, int tahun) {
        super("Mobil", merek, model, status, tahun);
    }
}

class Motor extends Kendaraan {
    public Motor(String merek, String model, String status, int tahun) {
        super("Motor", merek, model, status, tahun);
    }
}

public class Sewa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah kendaraan: ");
        int n = scanner.nextInt();
        scanner.nextLine();  

        Kendaraan[] kendaraanArray = new Kendaraan[n]; 

        for (int i = 0; i < n; i++) {
            System.out.println("Data Kendaraan ke-" + (i+1));
            System.out.print("Jenis Kendaraan (Mobil/Motor): ");
            String jenis = scanner.nextLine();
            System.out.print("Merek: ");
            String merek = scanner.nextLine();
            System.out.print("Model: ");
            String model = scanner.nextLine();
            System.out.print("Status (T/Tersedia, D/Disewakan): ");
            String status = scanner.nextLine();     
            System.out.print("Tahun: ");
            int tahun = scanner.nextInt();
            scanner.nextLine();  

            if (jenis.equalsIgnoreCase("mobil")) {
                kendaraanArray[i] = new Mobil(merek, model, status, tahun);
            } else if (jenis.equalsIgnoreCase("motor")) {
                kendaraanArray[i] = new Motor(merek, model, status, tahun);
            } else {
                System.out.println("Jenis kendaraan tidak valid.");
            }
        }

        System.out.println("Daftar Kendaraan yang Disewakan:");
        for (Kendaraan kendaraan : kendaraanArray) 
                System.out.println(kendaraan.displayInfo());
            
        }
    }
