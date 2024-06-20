import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        ArrayList<Mobil> daftarMobil = new ArrayList<>();

        while (true) {
            System.out.println("1. Mobil Listrik");
            System.out.println("2. Mobil Sport");
            System.out.println("3. Mobil MPV");
            System.out.println("4. Mobil SUV");
            System.out.print("Tampilkan: ");
            String pilih = inputUser.nextLine();

            if (pilih.equals("1") || pilih.equals("2") || pilih.equals("3") || pilih.equals("4")) {
                int tahunProduksi = 0;

                System.out.print("Merek :");
                String merek = inputUser.nextLine();

                System.out.print("Model :");
                String model = inputUser.nextLine();

                while (true) {
                    System.out.print("Tahun Produksi :");
                    String tahun = inputUser.nextLine();
                    try {
                        tahunProduksi = Integer.parseInt(tahun);
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Masukkan tidak valid. Pastikan Anda memasukkan angka.");
                    }
                }

                Mobil mobil;
                if (pilih.equals("1")) {
                    mobil = new MobilListrik(merek, model, tahunProduksi);
                } else if (pilih.equals("2")) {
                    mobil = new MobilSport(merek, model, tahunProduksi);
                } else if (pilih.equals("3")) {
                    mobil = new MPV(merek, model, tahunProduksi);
                } else {
                    mobil = new SUV(merek, model, tahunProduksi);
                }

                daftarMobil.add(mobil);
                int nomer = 0;
                System.out.println("Daftar Mobil:");
                for (Mobil data : daftarMobil) {
                    nomer++;
                    System.out.println(nomer + ".");
                    data.tampil();
                }

                String tanya;
                while (true) {
                    System.out.print("Lagi? (y/n)");
                    tanya = inputUser.nextLine();
                    if (tanya.equals("n")) {
                        break;
                    } else if (tanya.equals("y")) {
                        break;
                    } else {
                        System.out.println("inputkan y atau n");
                    }
                }
                if (tanya.equals("n")) {
                    break;
                }

            } else {
                System.out.println("Inputkan dengan benar");
            }
        }

        int nomer = 0;
        System.out.println("<==================== END PROGRAM ====================>");
        System.out.println("Daftar Mobil:");
        for (Mobil data : daftarMobil) {
            nomer++;
            System.out.println(nomer + ".");
            data.tampil();
        }
    }
}
