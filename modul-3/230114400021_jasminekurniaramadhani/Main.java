package Rental;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Rental> vehicles = new ArrayList<>();

        System.out.println("Masukkan data kendaraan");

        // Input data kendaraan
        System.out.print("Jumlah kendaraan yang akan dimasukkan: ");
        int jumlahKendaraan = scanner.nextInt();
        scanner.nextLine(); // Membuang newline karakter

        for (int i = 0; i < jumlahKendaraan; i++) {
            System.out.println("\nData kendaraan ke-" + (i + 1));
            System.out.print("Jenis Kendaraan (Mobil/Motor/Sepeda): ");
            String jenis = scanner.nextLine();
            System.out.print("Merek: ");
            String merek = scanner.nextLine();
            System.out.print("Model: ");
            String model = scanner.nextLine();
            System.out.print("Status (Tersedia/Disewa): ");
            String status = scanner.nextLine();
            System.out.print("Tahun Kendaraan: ");
            int tahun = scanner.nextInt();
            scanner.nextLine(); // Membuang newline karakter setelah nextInt

            Rental rental;
            if (jenis.equalsIgnoreCase("Mobil")) {
                rental = new Car(merek, model, status, tahun);
            } else if (jenis.equalsIgnoreCase("Motor")) {
                rental = new Motorcycle(merek, model, status, tahun);
            } else if (jenis.equalsIgnoreCase("Sepeda")) {
                rental = new Bicycle(merek, model, status, tahun);
            } else {
                System.out.println("Jenis kendaraan tidak valid.");
                continue;
            }

            vehicles.add(rental);
        }

        // Menampilkan daftar kendaraan yang telah disewakan
        System.out.println("\nDaftar kendaraan yang telah disewakan:");
        for (int i = 0; i < vehicles.size(); i++) {
            System.out.println("\nKendaraan ke-" + (i + 1));
            vehicles.get(i).displayInfo();
        }

        scanner.close();
    }
}
