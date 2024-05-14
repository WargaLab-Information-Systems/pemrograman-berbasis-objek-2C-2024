package modul5;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\n Pilih jenis mobil:");
        System.out.println("1. Mobil Sport");
        System.out.println("2. MPV");
        System.out.println("3. SUV");
        System.out.println("4. Mobil Listrik");
        System.out.print("Pilihan Anda (1-4): ");
        int pilihan = scanner.nextInt();

        Mobil mobil;
        if (pilihan == 1) {
            mobil = new MobilSport();
        } else if (pilihan == 2) {
            mobil = new MPV();
        } else if (pilihan == 3) {
            mobil = new SUV();
        } else if (pilihan == 4) {
            mobil = new MobilListrik();
        } else {
            System.out.println("Pilihan tidak valid!");
            return;
        }

        System.out.print("Masukkan merk mobil: ");
        String merk = scanner.next();
        System.out.print("Masukkan model mobil: ");
        String model = scanner.next();
        System.out.print("Masukkan tahun produksi: ");
        int tahun = scanner.nextInt();
        
        mobil.merk = merk;
        mobil.model = model;
        mobil.tahun = tahun;

        System.out.println("\n Informasi Mobil:");
        System.out.println("Merk: " + mobil.merk);
        System.out.println("Model: " + mobil.model);
        System.out.println("Tahun Produksi: " + mobil.tahun);

        mobil.ShowFeature();
    }
}