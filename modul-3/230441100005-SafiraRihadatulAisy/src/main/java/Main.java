import java.util.Scanner;

class Kendaraan {
    String jenis;
    String merek;
    String model;
    String status;
    int tahun;

    Kendaraan(String jenis, String merek, String model, String status, int tahun) {
        this.jenis = jenis;
        this.merek = merek;
        this.model = model;
        this.status = status;
        this.tahun = tahun;
    }
    void info() {
        System.out.println("Jenis: " + jenis);
        System.out.println("Merek: " + merek);
        System.out.println("Model: " + model);
        System.out.println("Status: " + status);
        System.out.println("Tahun: " + tahun);
    }
}

class KendaraanTersedia extends Kendaraan {
    KendaraanTersedia(String jenis, String merek, String model, int tahun) {
        super(jenis, merek, model, "Tersedia", tahun);
    }
}

class KendaraanSewa extends Kendaraan {
    KendaraanSewa(String jenis, String merek, String model, int tahun) {
        super(jenis, merek, model, "Disewakan", tahun);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah kendaraan yang akan dimasukkan: ");
        int jumlahKendaraan = scanner.nextInt();
        scanner.nextLine(); // Membersihkan buffer

        System.out.println("\nDaftar Kendaraan:");
        for (int i = 0; i < jumlahKendaraan; i++) {
            System.out.println("\nData Kendaraan ke-" + (i + 1) + ":");
            System.out.print("Jenis Kendaraan: ");
            String jenis = scanner.nextLine();
            System.out.print("Merek: ");
            String merek = scanner.nextLine();
            System.out.print("Model: ");
            String model = scanner.nextLine();
            System.out.print("Status (Tersedia/D): ");
            String status = scanner.nextLine(); 
            System.out.print("Tahun Kendaraan: ");
            int tahun = scanner.nextInt();
            scanner.nextLine();
            System.out.println("**********************************");

            Kendaraan kendaraan = new Kendaraan(jenis, merek, model, status, tahun);
            kendaraan.info();
        }
    }
} 
