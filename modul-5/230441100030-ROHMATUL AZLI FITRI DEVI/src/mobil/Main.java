
package mobil;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Mobil> daftarMobil = new ArrayList<>();

        System.out.println("==============================");
        System.out.println("           WELCOME           ");
        System.out.println("              TO              ");
        System.out.println("          DUNIA MOBIL         ");
        System.out.println("==============================");
        System.out.print("Masukkan jumlah data kendaraan: ");
        int jumlahData = scanner.nextInt();

        for (int i = 0; i < jumlahData; i++) {
            System.out.println("Data Kendaraan ke-" + (i + 1));
            System.out.println("-------------------------------");
            System.out.print("Jenis kendaraan (MobilListrik/Suv/Mpv/MobilSport): ");
            String jenisKendaraan = scanner.next();

            System.out.print("Merek: ");
            String merek = scanner.next();

            System.out.print("Model: ");
            String model = scanner.next();

            System.out.print("Tahun Produksi: ");
            int tahunProduksi = scanner.nextInt();

            Mobil kendaraan;
            switch (jenisKendaraan.toLowerCase()) {
                case "mobillistrik":
                    kendaraan = new MobilListrik(merek, model, tahunProduksi);
                    break;
                case "suv":
                    kendaraan = new Suv(merek, model, tahunProduksi);
                    break;
                case "mpv":
                    kendaraan = new Mpv(merek, model, tahunProduksi);
                    break;
                case "mobilsport":
                    kendaraan = new MobilSport(merek, model, tahunProduksi);
                    break;
                default:
                    System.out.println("Jenis kendaraan tidak valid!");
                    continue; 
            }

            daftarMobil.add(kendaraan);
        }

        System.out.println();
        System.out.println("===========================================");
        System.out.println("         Daftar Kendaraan");
        System.out.println("===========================================");
        System.out.println();
        for (Mobil kend : daftarMobil) {
            System.out.println("Merek : " + kend.getMerek());
            System.out.println("Model : " + kend.getModel());
            System.out.println("Tahun Produksi : " + kend.getTahunProduksi());
//            System.out.println("Fitur : ");
            kend.showFeature();
            System.out.println("===========================================");
        }
    }
}