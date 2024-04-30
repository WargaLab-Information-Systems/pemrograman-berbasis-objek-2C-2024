import java.util.Scanner;

public class Modul3PraktikumPBOTerpisah {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah kendaraan: ");
        int n = scanner.nextInt();
        scanner.nextLine();  // Membersihkan karakter newline dari buffer

        Kendaraan[] daftarkendaraan = new Kendaraan[n]; 

        for (int i = 0; i < n; i++) {
            System.out.println("Data Kendaraan ke-" + (i+1));
            System.out.print("Jenis Kendaraan (Mobil/Motor): ");
            String jenis = scanner.nextLine();
            System.out.print("Merek: ");
            String merek = scanner.nextLine();
            System.out.print("Model: ");
            String model = scanner.nextLine();
            System.out.print("Status (T/Tersedia, D/Disewakan): ");
            char status = scanner.nextLine().charAt(0);
            System.out.print("Tahun: ");
            int tahun = scanner.nextInt();
            scanner.nextLine();  // Membersihkan karakter newline dari buffer

            if (jenis.equalsIgnoreCase("mobil")) {
                daftarkendaraan[i] = new Mobil(merek, model, status, tahun);
            } else if (jenis.equalsIgnoreCase("motor")) {
                daftarkendaraan[i] = new Motor(merek, model, status, tahun);
            } else {
                System.out.println("Jenis kendaraan tidak valid.");
            }
        }

       for (Kendaraan kendaraan : daftarkendaraan) {
            if (kendaraan != null) {
                System.out.println(kendaraan.displayInfo());
            }
        }
    }
}