/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mod5;

import java.util.Scanner;

class Mobil {
    String merk;
    String model;
    String tipeMobil;
    int tahunProduksi;

    // Overload untuk konstruktor
    public Mobil(String merk, String model, int tahunProduksi, String tipeMobil) {
        this.merk = merk;
        this.model = model;
        this.tahunProduksi = tahunProduksi;
        this.tipeMobil = tipeMobil;
    }

    public void showFeature() {
        System.out.println("\nInformasi mobil:");
        System.out.println("Merk: " + merk);
        System.out.println("Model: " + model);
        System.out.println("Tipe: " + tipeMobil);
        System.out.println("Tahun Produksi: " + tahunProduksi);
    }

    void showFeature(int i) {
        System.out.println("Biaya mobil ini " + i);
        
    }

    void showFeature(String terbaru) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 }

class Listrik extends Mobil {
    public Listrik(String merk, String model, int tahunProduksi, String tipeMobil) {
        super(merk, model, tahunProduksi, tipeMobil);
    }

    @Override
    public void showFeature() {
        super.showFeature();
        System.out.println("Keunggulan: Ramah lingkungan");
    }
    public void showFeature(int biaya) {
        System.out.println("Biaya mobil ini " + biaya);
}
}

class MPV extends Mobil {
    public MPV(String merk, String model, int tahunProduksi, String tipeMobil) {
        super(merk, model, tahunProduksi, tipeMobil);
    }

    @Override
    public void showFeature() {
        super.showFeature();
        System.out.println("Keunggulan: Multi guna");
    }
    public void showFeature(String luas) {
        super.showFeature();
        System.out.println("muatannya " + luas);
}
}

class SUV extends Mobil {
    public SUV(String merk, String model, int tahunProduksi, String tipeMobil) {
        super(merk, model, tahunProduksi, tipeMobil);
    }

    @Override
    public void showFeature() {
        super.showFeature();
        System.out.println("Keunggulan: Kemampuan off-road");
    }
    public void showFeature(String keren) {
        super.showFeature();
        System.out.println("mobil ini " + keren);
}
}

class Sport extends Mobil {
    public Sport(String merk, String model, int tahunProduksi, String tipeMobil) {
        super(merk, model, tahunProduksi, tipeMobil);
    }

    @Override
    public void showFeature() {
        super.showFeature();
        System.out.println("Keunggulan: Kencang dan sporty");
    }
    public void showFeature(String terbaru) {
        super.showFeature();
        System.out.println("Mobil keluaran " + terbaru);
}
}
public class Mod5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan merk mobil:");
        String merk = scanner.nextLine();

        System.out.println("Masukkan model mobil:");
        String model = scanner.nextLine();
        
        System.out.println("Masukkan tipe mobil (MPV/SUV/Sport/Listrik):");
        String tipeMobil = scanner.nextLine();
       
        System.out.println("Masukkan tahun produksi mobil:");
        int tahunProduksi = scanner.nextInt();

        Mobil mobil;
        switch (tipeMobil) { //menentukan tipe mobil berdasarkan input
            case "MPV":
                mobil = new MPV(merk, model, tahunProduksi, tipeMobil);
                mobil.showFeature();
                break;
            case "SUV":
                mobil = new SUV(merk, model, tahunProduksi, tipeMobil);
                mobil.showFeature(merk);
                break;
            case "Sport":
                mobil = new Sport(merk, model, tahunProduksi, tipeMobil);
                mobil.showFeature("terbaru");
                break;
            case "Listrik":
                mobil = new Listrik(merk, model, tahunProduksi, tipeMobil);
                mobil.showFeature(500000);
                break;
            default:
                System.out.println("Tipe mobil tidak valid.");
                scanner.close();
                return;
        }
        mobil.showFeature();
        scanner.close();
    }
}


