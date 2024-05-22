package tugasmodul5.pkg2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nTipe Mobil (MPV, SUV, Sport, Listrik): ");
        String tipeMobil = scanner.nextLine();

        System.out.print("Merk Mobil: ");
        String merk = scanner.nextLine();

        System.out.print("Model Mobil: ");
        String model = scanner.nextLine();

        // scanner.nextLine();
        System.out.print("Warna Mobil : ");
        String warna = scanner.nextLine();
        
        System.out.print("Tahun Produksi: ");
        int tahunProduksi = scanner.nextInt();

        Mobil mobil;
        switch(tipeMobil.toUpperCase()) {
            case "MPV" :
                mobil = new MPV(merk, model, tahunProduksi);
                mobil.setWarna(warna);
                mobil.ShowFeature(warna);
                break;
            case "SUV" :
                mobil = new SUV(merk, model, tahunProduksi);
                mobil.setWarna(warna);
                mobil.ShowFeature(warna);
                break;
            case "SPORT" :
                mobil = new Mobil_Sport(merk, model, tahunProduksi);
                mobil.setWarna(warna);
                mobil.ShowFeature(warna);
                break;
            case "LISTRIK" :                
                mobil = new Mobil_Listrik(merk, model, tahunProduksi);
                mobil.setWarna(warna);
                mobil.ShowFeature(warna);
                break;
            default :
                System.out.println("Data mobil tidak ditemukan");
                mobil = null;  
        }

        System.out.println("\nInformasi Mobil\t:");
        System.out.println("Merk\t\t: " + mobil.getMerk());
        System.out.println("Model\t\t: " + mobil.getModel());

        System.out.println("Tahun Produksi\t: "+mobil.getTahunProduksi());
        System.out.println("Warna\t\t: " + mobil.getWarna());

        System.out.println("\nFitur Mobil\t:");
        mobil.ShowFeature();
        mobil.ShowFeature(warna);
        System.out.println("\n");
        scanner.close();
    }
}
