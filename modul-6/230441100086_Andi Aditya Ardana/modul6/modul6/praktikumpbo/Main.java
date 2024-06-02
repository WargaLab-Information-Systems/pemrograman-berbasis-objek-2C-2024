// Main.java
package modul6.praktikumpbo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di Program Input Gadget!");
        System.out.println("=======================================");

        int maxSize = 3; // Jumlah maksimum gadget yang dapat diinputkan
        Gadget[] gadgets = new Gadget[maxSize];
        int count = 0;

        while (count < maxSize) {
            System.out.println("Pilih jenis gadget untuk diinputkan:");
            System.out.println("1. Smartphone");
            System.out.println("2. Tablet");
            System.out.println("3. Laptop");
            System.out.println("4. Selesai");
            System.out.print("Inputkan Disini: ");

            int choice;
            try {
                choice = scanner.nextInt();
                scanner.nextLine(); // Mengonsumsi karakter newline setelah nextInt
            } catch (Exception e) {
                System.out.println("Pilihan tidak valid. Silakan masukkan angka 1-4.");
                scanner.nextLine(); // Mengonsumsi karakter newline yang tersisa
                continue;
            }

            if (choice == 4) {
                System.out.println("=======================================");
                System.out.println("TIDAK ADA DATA");
                System.out.println("=======================================");
                break;
            }

            System.out.print("Masukkan merk: ");
            String merk = scanner.nextLine();
            System.out.print("Masukkan model: ");
            String model = scanner.nextLine();

            switch (choice) {
                case 1:
                    gadgets[count] = new Smartphone(merk, model);
                    break;
                case 2:
                    gadgets[count] = new Tablet(merk, model);
                    break;
                case 3:
                    gadgets[count] = new Laptop(merk, model);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    continue;
            }

            count++;

            System.out.println("Apakah Anda ingin menginputkan lagi? (ya/tidak)");
            String ulang = scanner.nextLine();
            if (!ulang.equalsIgnoreCase("ya")) {
                break;
            }

            System.out.println("=======================================");
        }

        displayData(gadgets, count);
    }

    private static void displayData(Gadget[] gadgets, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("=======================================");
            System.out.println("Data Gadget yang Diinputkan:");
            System.out.println("=======================================");
            System.out.println("Merk: " + gadgets[i].merk);
            System.out.println("Model: " + gadgets[i].model);
            System.out.println("---------------------------------------");
            gadgets[i].ambilFoto();
            gadgets[i].rekamVideo();
            gadgets[i].kirimFile();
            gadgets[i].terimaFile();
            gadgets[i].koneksiPerangkat();
            gadgets[i].cariJaringan();
            gadgets[i].hubungkanJaringan();
            gadgets[i].lupakanJaringan();
            gadgets[i].ambilKoordinat();
            System.out.println("=======================================");
        }

        System.out.println("Terima kasih telah menggunakan program ini!");
    }
}
