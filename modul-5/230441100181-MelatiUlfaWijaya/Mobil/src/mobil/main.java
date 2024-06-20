package mobil;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan pilihan Jenis mobil: ");
        System.out.println("- MPV");
        System.out.println("- SUV");
        System.out.println("- Mobil Sport");
        System.out.println("- Mobil Listrik");
        String jenisMobil = scanner.nextLine().toUpperCase();

        Mobil mobil = null;

//        double jarakTempuh=10;
        switch (jenisMobil) {
            case "MPV":
                System.out.println("Masukkan merk MPV: ");
                String merkMPV = scanner.nextLine();
                System.out.println("Masukkan model MPV: ");
                String modelMPV = scanner.nextLine();
                System.out.println("Masukkan tahun produksi MPV: ");
                int thnProduksiMPV = Integer.parseInt(scanner.nextLine());
                mobil = new MPV(merkMPV, modelMPV, thnProduksiMPV);
                mobil.showFeature(100);
                break;
            case "SUV":
                System.out.println("Masukkan merk SUV: ");
                String merkSUV = scanner.nextLine();
                System.out.println("Masukkan model SUV: ");
                String modelSUV = scanner.nextLine();
                System.out.println("Masukkan tahun produksi SUV: ");
                int thnProduksiSUV = Integer.parseInt(scanner.nextLine());
                mobil = new SUV(merkSUV, modelSUV, thnProduksiSUV);
                mobil.showFeature(90);
                break;
            case "MOBIL SPORT": // Diubah menjadi huruf besar semua untuk konsistensi
                System.out.println("Masukkan merk Mobil Sport: ");
                String merkMobilSport = scanner.nextLine();
                System.out.println("Masukkan model Mobil Sport: ");
                String modelMobilSport = scanner.nextLine();
                System.out.println("Masukkan tahun produksi Mobil Sport: ");
                int thnProduksiMobilSport = Integer.parseInt(scanner.nextLine());
                mobil = new MobilSport(merkMobilSport, modelMobilSport, thnProduksiMobilSport);
                mobil.showFeature(80);
                break;
            case "MOBIL LISTRIK": // Diubah menjadi huruf besar semua untuk konsistensi
                System.out.println("Masukkan merk Mobil Listrik: ");
                String merkMobilListrik = scanner.nextLine();
                System.out.println("Masukkan model Mobil Listrik: ");
                String modelMobilListrik = scanner.nextLine();
                System.out.println("Masukkan tahun produksi Mobil Listrik: ");
                int thnProduksiMobilListrik = Integer.parseInt(scanner.nextLine());
                mobil = new MobilListrik(merkMobilListrik, modelMobilListrik, thnProduksiMobilListrik);
                mobil.showFeature(95);
                break;
            default:
                System.out.println("Jenis mobil tidak ada!");
        }

        if (mobil != null) {
            System.out.println("\nKeterangan MOBIL: ");
            System.out.println("Merk: " + mobil.getMerk());
            System.out.println("Model: " + mobil.getModel());
            System.out.println("Tahun Produksi: " + mobil.getThnProduksi());
//            untuk manggil override
            mobil.showFeature();
        }
        
 

        scanner.close();
    }
}
