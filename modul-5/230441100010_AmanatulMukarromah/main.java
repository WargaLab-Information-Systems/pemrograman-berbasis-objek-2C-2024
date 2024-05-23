/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mobil;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n=====KENDARAAN=====\n");
            System.out.println("1. suv");
            System.out.println("2. mvp");
            System.out.println("3. mobilsport");
            System.out.println("4. mobillistrik");
            System.out.print("Masukkan tipe mobil pilihan anda\n(suv/mvp/mobilsport/mobillistrik): ");
            String pilihAwal = scanner.nextLine();
            String merk, model;
            int tahunProduksi;
            Mobil mobil;
            if (pilihAwal.equalsIgnoreCase("suv")) {
                System.out.println("\nMasukkan data untuk SUV:");
                System.out.print("Merk: ");
                merk = scanner.nextLine();
                System.out.print("Model: ");
                model = scanner.nextLine();
                System.out.print("Tahun Produksi: ");
                tahunProduksi = scanner.nextInt();
                scanner.nextLine(); 
                mobil = new suv(merk, model, tahunProduksi);
                mobil.ShowFeature();
                suv SUV = new suv(merk, model, tahunProduksi);
                SUV.ShowFeature("hijau");
            } else if (pilihAwal.equalsIgnoreCase("mvp")) {
                System.out.println("\nMasukkan data untuk MVP:");
                System.out.print("Merk: ");
                merk = scanner.nextLine();
                System.out.print("Model: ");
                model = scanner.nextLine();
                System.out.print("Tahun Produksi: ");
                tahunProduksi = scanner.nextInt();
                scanner.nextLine(); 
                mobil = new mvp(merk, model, tahunProduksi);
                mobil.ShowFeature();
                mvp MVP = new mvp(merk, model, tahunProduksi);
                MVP.ShowFeature("merah");
            } else if (pilihAwal.equalsIgnoreCase("mobilsport")) {
                System.out.println("\nMasukkan data untuk Mobil Sport:");
                System.out.print("Merk: ");
                merk = scanner.nextLine();
                System.out.print("Model: ");
                model = scanner.nextLine();
                System.out.print("Tahun Produksi: ");
                tahunProduksi = scanner.nextInt();
                scanner.nextLine();
                mobil = new mobilsport(merk, model, tahunProduksi); 
                mobil.ShowFeature();
                mobilsport SPORT = new mobilsport(merk, model, tahunProduksi); 
                SPORT.ShowFeature("hitam");
            } else if (pilihAwal.equalsIgnoreCase("mobillistrik")) {
                System.out.println("\nMasukkan data untuk Mobil Listrik:");
                System.out.print("Merk: ");
                merk = scanner.nextLine();
                System.out.print("Model: ");
                model = scanner.nextLine();
                System.out.print("Tahun Produksi: ");
                tahunProduksi = scanner.nextInt();
                scanner.nextLine(); 
                mobil = new mobillistrik(merk, model, tahunProduksi);
                mobil.ShowFeature();
                mobillistrik LISTRIK = new mobillistrik(merk, model, tahunProduksi);
                LISTRIK.ShowFeature("putih");
            } else {
                System.out.println("Pilihan tidak valid.");
                continue;
            }
            
            System.out.print("\nApakah Anda ingin melanjutkan? (y/t): ");
            String tanya = scanner.nextLine();
            if (!tanya.equalsIgnoreCase("y")) {
                break; 
            }
        }
        scanner.close();
    }
}