package Modul5Tugas2;

import java.util.Scanner;

public class Modul5Tugas2 {
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
        switch (tipeMobil) {
            case "MPV":
                mobil = new MPV(merk, model, tahunProduksi);
                break;
            case "SUV":
                mobil = new SUV(merk, model, tahunProduksi);
                break;
            case "Sport":
                mobil = new Sport(merk, model, tahunProduksi);
                break;
            case "Listrik":
                mobil = new Listrik(merk, model, tahunProduksi);
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
