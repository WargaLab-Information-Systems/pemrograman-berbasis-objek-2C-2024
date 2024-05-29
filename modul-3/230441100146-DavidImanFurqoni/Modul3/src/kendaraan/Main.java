package kendaraan;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<kendaraan> daftarKendaraan = new ArrayList<>();
    
    public static void main(String[] args) {
        System.out.print("masukkan jumlah kendaraan : ");
        int jumlahKendaraan = scanner.nextInt();
        
        for (int i = 0; i<jumlahKendaraan; i++) {
            
            System.out.print("Status kendaraan (T/D): ");
            String statusInput = scanner.next();
            String status = null;
            if (statusInput.equalsIgnoreCase("T")) {
                status = "Tersedia";
            } else if (statusInput.equalsIgnoreCase("D")) {
                status = "Disewakan";
            } else {
                System.out.println("Inputkan (T) untuk kendaraan yang tersedia atau (D) untuk kendaraan yang disewakan  ");
            }
            
            System.out.print("Jenis kendaraan (Mobil/Motor): ");
            String jenis = scanner.next();  
            System.out.print("Merk kendaraan: ");
            String merk = scanner.next();
            System.out.print("Model kendaraan: ");
            String model = scanner.next();
            System.out.print("Tahun kendaraan: ");
            int tahunKendaraan = scanner.nextInt();
            System.out.println("=================");

            if (jenis.equalsIgnoreCase("Mobil")) {
                daftarKendaraan.add(new Mobil(jenis, merk, model, status, tahunKendaraan)); 
            } 
            else if (jenis.equalsIgnoreCase("Motor")) {
                daftarKendaraan.add(new Motor(jenis, merk, model, status, tahunKendaraan)); 
            }
        }
        statusKendaraan();
    }

    static void statusKendaraan() {
        System.out.println("Daftar Kendaraan Rent or Parkir :");
        for (kendaraan kendaraan : daftarKendaraan) {
            System.out.println(kendaraan);
            System.out.println("=================");
        }
    }
}
