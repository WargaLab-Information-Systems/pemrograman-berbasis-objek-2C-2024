import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner inputUser = new Scanner(System.in);

        while(true) {
            String jenisKendaraan;
            while (true) {
                System.out.print("Jenis Kendaraan (motor/mobil): ");
                jenisKendaraan = inputUser.nextLine();
                if(jenisKendaraan.equals("motor")) {
                    break;
                } else if(jenisKendaraan.equals("mobil")) {
                    break;
                } else {
                    System.out.println("Masukkan input 'motor' atau 'mobil'");
                }
            }
            System.out.print("Merek: ");
            String merek = inputUser.nextLine();
            System.out.print("Model: ");
            String model = inputUser.nextLine();
            char status;
            while(true) {
                System.out.print("Status Tersedia/Disewa(t/d): ");
                status = inputUser.next().charAt(0);
                if(status == 't') {
                    break;
                } else if(status == 'd') {
                    break;
                } else {
                    System.out.println("Ketik 't' atau 'd'");
                }
            }
            
            System.out.print("Tahun Kendaraan: ");
            int tahun = inputUser.nextInt();
            inputUser.nextLine();

            if(jenisKendaraan.equals("motor")) {
                Motor motor = new Motor(merek, model, status, tahun);
                motor.tampil();
            } else if(jenisKendaraan.equals("mobil")) {
                Mobil mobil = new Mobil(merek, model, status, tahun);
                mobil.tampil();
            }

            String tanya;
            while (true) {
                System.out.print("Apakah Anda ingin memasukkan data lagi? (y/n):");
                tanya = inputUser.nextLine();
                if (tanya.equals("n")) {
                    break;
                } else if (tanya.equals("y")) {
                    break;
                } else {
                    System.out.println("masukkan input y atau n");
                }
            }
            if (tanya.equals("n")) {
                break;
            }
        }
    }
}
