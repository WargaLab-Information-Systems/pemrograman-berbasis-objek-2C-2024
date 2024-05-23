package praktikummodul3;



import java.util.ArrayList;
import java.util.Scanner;

public class RentalKendaraan {
    private static ArrayList<Kendaraan> daftarKendaraan = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==========================");
       System.out.println("         WELLCOME         ");
       System.out.println("            TO            ");
       System.out.println("     vehicle RENTALLER    ");
       System.out.println("==========================");
        System.out.print("Masukkan jumlah data kendaraan: ");
        int jumlahData = scanner.nextInt();

        System.out.println("");
        // Input data kendaraan
        for (int i = 0; i < jumlahData; i++) {
            System.out.println("Data Kendaraan ke-" + (i + 1));
            System.out.println("-------------------------------");
            System.out.print("Jenis kendaraan (mobil/motor): ");
            String jenisKendaraan = scanner.next();

            System.out.print("Merek: ");
            String merek = scanner.next();

            System.out.print("Model: ");
            String model = scanner.next();

            System.out.print("Status (T/D): ");
            String status = scanner.next();

            System.out.print("Tahun kendaraan: ");
            int tahunKendaraan = scanner.nextInt();
            
            Kendaraan kend = new Kendaraan (jenisKendaraan, merek, model, status, tahunKendaraan);
            daftarKendaraan.add(kend);
        }
        
        System.out.println();
        System.out.println("===========================================");
        System.out.println("         Daftar Kendaraan");
        System.out.println("===========================================");
        System.out.println();
        for (Kendaraan kend : daftarKendaraan) {
            System.out.println("JenisKendaraan : " + kend.getJenisKendaraan());
            System.out.println("Merek : " + kend.getMerek());
            System.out.println("Model : " + kend.getModel());
            System.out.println("Status : " + kend.getStatus());
            System.out.println("Tahun Kendaraan : " + kend.getTahunKendaraan());
            System.out.println();
            System.out.println("===========================================");
        }

    }
}


