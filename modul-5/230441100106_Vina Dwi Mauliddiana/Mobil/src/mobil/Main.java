/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mobil;
import java.util.Scanner;
/**
 *
 * @author pinokio
 */

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String benar = "y";

        while (benar.equalsIgnoreCase("y")) {   //buat baca string
            System.out.println("Pilihlah Tipe Mobil: (SUV, Mobil Sport, MPV, Mobil Listrik): ");
            String mobilType = scanner.nextLine().toUpperCase(); // huruf besar-kecil

            Mobil mobil = null;
            switch (mobilType) {
                case "SUV":
                    System.out.println("Masukkan Merek Mobil SUV: ");
                    String MerekSUV = scanner.nextLine();
                    System.out.println("Masukkan Model Mobil SUV: ");
                    String ModelSUV = scanner.nextLine();
                    System.out.println("Masukkan Tahun Produksi Mobil SUV: ");
                    int TahunProduksiSUV = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character
                    mobil = new SUV(MerekSUV, ModelSUV, TahunProduksiSUV);
                    break;

                case "MOBIL SPORT": // Case-sensitive comparison for "Mobil Sport"
                    System.out.println("Masukkan Merek Mobil Sport: ");
                    String MerekMobilSport = scanner.nextLine();
                    System.out.println("Masukkan Model Mobil Sport: ");
                    String ModelMobilSport = scanner.nextLine();
                    System.out.println("Masukkan Tahun Produksi Mobil Sport: ");
                    int TahunProduksiMobilSport = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character
                    mobil = new MobilSport(MerekMobilSport, ModelMobilSport, TahunProduksiMobilSport);
                    break;

                case "MPV":
                    System.out.println("Masukkan Merek Mobil MPV: ");
                    String MerekMPV = scanner.nextLine();
                    System.out.println("Masukkan Model Mobil MPV: ");
                    String ModelMPV = scanner.nextLine();
                    System.out.println("Masukkan Tahun Produksi Mobil MPV: ");
                    int TahunProduksiMPV = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character
                    mobil = new MPV(MerekMPV, ModelMPV, TahunProduksiMPV);
                    break;

                case "MOBIL LISTRIK": // Case-sensitive comparison for "Mobil Listrik"
                    System.out.println("Masukkan Merek Mobil Listrik: ");
                    String MerekMobilListrik = scanner.nextLine();
                    System.out.println("Masukkan Model Mobil Listrik: ");
                    String ModelMobilListrik = scanner.nextLine();
                    System.out.println("Masukkan Tahun Produksi Mobil Listrik: ");
                    int TahunProduksiMobilListrik = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character
                    mobil = new MobilListrik(MerekMobilListrik, ModelMobilListrik, TahunProduksiMobilListrik);
                    break;

                default:
                    System.out.println("Tipe mobil tidak valid!");
                    break;
            }

            if (mobil != null) {
                System.out.println("\nInformasi Mobil:");
                System.out.println("Merek: " + mobil.getMerek());
                System.out.println("Model: " + mobil.getModel());
                System.out.println("Tahun Produksi: " + mobil.getTahunProduksi());
                mobil.showFitur(); // Call the showFitur() method of the created object
            }

            // menanyakan mau mengulang atau tidak
            System.out.println("\nIngin memasukkan informasi mobil lain? (y/n): ");
            benar = scanner.nextLine().toLowerCase(); // hurif besa-kecil
        }

        System.out.println("Terima kasih telah menggunakan program ini!");
        //scanner.close(); // 
    }
}




