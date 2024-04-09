package penyewaan_kendaraan;
import java.util.Scanner;

/**
 *
 * author HP
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Kendaraan[] daftarKendaraan = null;
        int jumlahKendaraan = 0;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Masukkan data kendaraan");
            System.out.println("2. Lihat daftar kendaraan yang disewakan");
            System.out.println("3. Keluar");
            System.out.print("Pilihan: ");
            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan jumlah kendaraan yang akan diinput: ");
                    jumlahKendaraan = input.nextInt();
                    daftarKendaraan = new Kendaraan[jumlahKendaraan];
                    for (int i = 0; i < jumlahKendaraan; i++) {
                        System.out.println("\nMasukkan data kendaraan ke-" + (i + 1));
                        System.out.print("Jenis Kendaraan (Mobil/Motor): ");
                        String jenis = input.next();
                        System.out.print("Merek: ");
                        String merek = input.next();
                        System.out.print("Model: ");
                        String model = input.next();
                        char status ;
                        do {
                            System.out.print("Status (T = Tersedia, D = Disewakan): ");
                            status = input.next().charAt(0);
                            if (status != 'T' && status != 'D') {
                                System.out.println("Status tidak valid. Harap masukkan 'T' atau 'D'.");
                            }
                        } while (status != 'T' && status != 'D'); 
                        System.out.print("Tahun Kendaraan: ");
                        int tahun = input.nextInt();
                        if (jenis.equalsIgnoreCase("Mobil")) {
                            daftarKendaraan[i] = new Mobil(merek, model, status, tahun);
                        } else if (jenis.equalsIgnoreCase("Motor")) {
                            daftarKendaraan[i] = new Motor(merek, model, status, tahun);
                        } else {
                            System.out.println("Jenis kendaraan tidak valid.");
                            i--; 
                        }
                    }
                    break;
                case 2:
                    System.out.println("\nDaftar Kendaraan yang Telah Disewakan:");
                    if (jumlahKendaraan == 0) {
                        System.out.println("Belum ada kendaraan yang disewakan.");
                    } else {
                        boolean adaKendaraan = false;
                        for (int i = 0; i < jumlahKendaraan; i++) {
                            if (daftarKendaraan[i] != null && daftarKendaraan[i].status == 'D') {
                                System.out.println("Data kendaraan ke-" + (i + 1));
                                System.out.println("Jenis: " + daftarKendaraan[i].jenis);
                                System.out.println("Merek: " + daftarKendaraan[i].merek);
                                System.out.println("Model: " + daftarKendaraan[i].model);
                                System.out.println("Status: " + daftarKendaraan[i].status);
                                System.out.println("Tahun: " + daftarKendaraan[i].tahun);
                                adaKendaraan = true;
                            }
                        }
                        if (!adaKendaraan) {
                            System.out.println("Tidak ada kendaraan yang disewakan.");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Terima kasih!");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
