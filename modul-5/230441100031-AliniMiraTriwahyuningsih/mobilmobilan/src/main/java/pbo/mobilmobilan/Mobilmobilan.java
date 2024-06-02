package pbo.mobilmobilan;
import java.util.Scanner;

class Mobil {
    String merek, model;
    int tahunproduksi;

    Mobil(String merek, String model, int tahunproduksi) {
        this.merek = merek;
        this.model = model;
        this.tahunproduksi = tahunproduksi;
    }

    public void showFeature() {
        System.out.println("Merek :" + merek);
        System.out.println(" model :" + model);
        System.out.print("Tahun Produksi : " + tahunproduksi);
    }
}

class mpv extends Mobil {
    String kelebihan = "1. kapasitas penumpang lebih banyak \n2. Nyaman dipakai berkendara di berbagai medan \n3. Fitur Keamanan yang lengkap";

    public mpv(String merek, String model, int tahunproduksi) {
        super(merek, model, tahunproduksi);
    }

    
    
    @Override
    public void showFeature() {
        super.showFeature();
        System.out.println(" ");
        System.out.println("=Kelebihan Mobil=");
        System.out.println(this.kelebihan);
    }
}

class suv extends Mobil {
    String kelebihan = "1. kuat diberbagai medan \n2. Lebih Aman dan Nyaman \n3. Bisa menampung banyak barang";

    public suv(String merek, String model, int tahunproduksi) {
        super(merek, model, tahunproduksi);

    }

    @Override
    public void showFeature() {
        super.showFeature();
        System.out.println(" ");
        System.out.println("=Kelebihan Mobil=");
        System.out.println(this.kelebihan);
    }
}

class mobilsport extends Mobil {
    String kelebihan = "1. Mampu digunakan menggunakan kecepatan tinggi \n2. Interiornya Luas";

    public mobilsport(String merek, String model, int tahunproduksi) {
        super(merek, model, tahunproduksi);
    }

    @Override
    public void showFeature() {
        super.showFeature();
        System.out.println(" ");
        System.out.println("=Kelebihan Mobil=");
        System.out.println(this.kelebihan);
    }
}

class mobillistrik extends Mobil {
    String kelebihan = "1. Ramah lingkungan \n2. Pemakaian energi efisien \n3. Pajak sangat menarik";

    public mobillistrik(String merek, String model, int tahunproduksi) {
        super(merek, model, tahunproduksi);
    }

    @Override
    public void showFeature() {
        super.showFeature();
        System.out.println(" ");
        System.out.println("=Kelebihan Mobil=");
        System.out.println(this.kelebihan);
    }
}

public class Mobilmobilan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Jumlah mobil yang ingin dilihat (1/2/3/4)=");
        int urutanMobilke = scanner.nextInt();
        scanner.nextLine();

        Mobil[] mobil = new Mobil[urutanMobilke];

        for (int n = 0; n < urutanMobilke; n++) {
            System.out.println("\nData kendaraan yang ke-" + (n + 1));
            System.out.print("===Merek mobil===\n (suv/mpv/mobil listrik/mobil sport):");
            String merekmobil = scanner.nextLine();
            String model;
            int tahunproduksi;

            if (merekmobil.equalsIgnoreCase("mpv")) {
                System.out.print("Model mobil : ");
                model = scanner.nextLine();
                System.out.print("Tahun Produksi mobil : ");
                tahunproduksi = scanner.nextInt();

                mobil[n] = new mpv(merekmobil, model, tahunproduksi);
            } else if (merekmobil.equalsIgnoreCase("suv")) {
                System.out.print("Model mobil : ");
                model = scanner.nextLine();
                System.out.print("Tahun Produksi mobil : ");
                tahunproduksi = scanner.nextInt();

                mobil[n] = new suv(merekmobil, model, tahunproduksi);
            } else if (merekmobil.equalsIgnoreCase("mobil sport")) {
                System.out.print("Model mobil : ");
                model = scanner.nextLine();
                System.out.print("Tahun Produksi mobil : ");
                tahunproduksi = scanner.nextInt();

                mobil[n] = new mobilsport(merekmobil, model, tahunproduksi);
            } else if (merekmobil.equalsIgnoreCase("mobil listrik")) {
                System.out.print("Model mobil : ");
                model = scanner.nextLine();
                System.out.print("Tahun Produksi mobil : ");
                tahunproduksi = scanner.nextInt();

                mobil[n] = new mobillistrik(merekmobil, model, tahunproduksi);
            } else {
                System.out.println("pilih yang ada di pilihan");
                n--;
            }
            scanner.nextLine();
            System.out.println("\nMobil ke-" + (n + 1));
            mobil[n].showFeature();
            System.out.println(" ");
            System.out.println("==============================");

        }

    }

}