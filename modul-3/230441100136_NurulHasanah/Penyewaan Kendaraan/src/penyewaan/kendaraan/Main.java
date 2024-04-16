package penyewaan.kendaraan;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("==========PENYEWAAN KENDARAAN==========");
        System.out.print("Jumlah kendaraan yang akan disewa: ");
        int jumlahKendaraan = scanner.nextInt();
        scanner.nextLine(); 
        
        PenyewaanKendaraan[] kendaraan = new PenyewaanKendaraan[jumlahKendaraan]; 
        
        for (int i = 0; i < jumlahKendaraan; i++) {
            System.out.println("\nData kendaraan ke-" + (i + 1));
            System.out.print("Jenis kendaraan (Mobil/Motor/Sepeda): ");
            String jenisKendaraan = scanner.nextLine();
            String merek, model;
            char status;
            int tahun;
            
            if (jenisKendaraan.equalsIgnoreCase("mobil")) {
                System.out.print("Merek mobil \t: ");
                merek = scanner.nextLine();
                System.out.print("Model mobil \t: ");
                model = scanner.nextLine();
                System.out.print("Status mobil \t: ");
                status = scanner.next().charAt(0);
                System.out.print("Tahun mobil \t: ");
                tahun = scanner.nextInt();

                kendaraan[i] = new mobil(jenisKendaraan, merek, model, status, tahun);
            } else if (jenisKendaraan.equalsIgnoreCase("motor")) {
                System.out.print("Merek motor: ");
                merek = scanner.nextLine();
                System.out.print("Model motor: ");
                model = scanner.nextLine();
                System.out.print("Status motor: ");
                status = scanner.next().charAt(0);
                System.out.print("Tahun motor: ");
                tahun = scanner.nextInt();

                kendaraan[i] = new motor(jenisKendaraan, merek, model, status, tahun);
            } else if (jenisKendaraan.equalsIgnoreCase("sepeda")) {
                System.out.print("Merek sepeda: ");
                merek = scanner.nextLine();
                System.out.print("Model sepeda: ");
                model = scanner.nextLine();
                System.out.print("Status sepeda: ");
                status = scanner.next().charAt(0);
                System.out.print("Tahun sepeda: ");
                tahun = scanner.nextInt();

                kendaraan[i] = new sepeda(jenisKendaraan, merek, model, status, tahun);
            } else {
                System.out.println("Maaf, jenis kendaraan tidak ada. Pilihlah sesuai pilahan.");
                i--; 
            }
            scanner.nextLine(); 
        }

        System.out.println("\n=================DATA KENDARAAN YANG DISEWA=================");
        for (int i = 0; i < jumlahKendaraan; i++) {
            System.out.println("\nKendaraan ke-" + (i + 1));
            kendaraan[i].display();
            System.out.println(" ");
            System.out.println("=============================================================");
        }
    }
}