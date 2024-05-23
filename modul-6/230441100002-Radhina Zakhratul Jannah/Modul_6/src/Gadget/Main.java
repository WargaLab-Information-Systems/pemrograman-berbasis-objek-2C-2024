package Gadget;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Masukkan pilihan Gadget");
            System.out.println("1. Smartphone");
            System.out.println("2. Tablet");
            System.out.println("3. Laptop");
            System.out.println("4. Keluar");
            System.out.print("Masukkan pilihan 1-4: ");
            int pilihan = input.nextInt();
            input.nextLine();

            if (pilihan == 4) {
                System.out.println("Keluar dari program.");
                break;
            }

            Gadget[] gadgets = new Gadget[2];

            if (pilihan == 1) {
                for (int i = 0; i < 2; i++) {
                    System.out.print("Masukkan merk Smartphone " + (i + 1) + ": ");
                    String merk = input.nextLine();
                    System.out.print("Masukkan model Smartphone " + (i + 1) + ": ");
                    String model = input.nextLine();
                    gadgets[i] = new Smartphone(merk, model);
                    System.out.println();
                }
            } else if (pilihan == 2) {
                for (int i = 0; i < 2; i++) {
                    System.out.print("Masukkan merk Tablet " + (i + 1) + ": ");
                    String merk = input.nextLine();
                    System.out.print("Masukkan model Tablet " + (i + 1) + ": ");
                    String model = input.nextLine();
                    gadgets[i] = new Tablet(merk, model);
                    System.out.println();
                }
            } else if (pilihan == 3) {
                for (int i = 0; i < 2; i++) {
                    System.out.print("Masukkan merk Laptop " + (i + 1) + ": ");
                    String merk = input.nextLine();
                    System.out.print("Masukkan model Laptop " + (i + 1) + ": ");
                    String model = input.nextLine();
                    gadgets[i] = new Laptop(merk, model);
                    System.out.println();
                }
            } else {
                System.out.println("Pilihan tidak valid!");
                continue;
            }

            System.out.println("========== Menampilkan informasi Gadget 1 dan 2 ==========");
            for (Gadget gadget : gadgets) {
                displayGadgetInfo(gadget);
            }
        }

        input.close();
    }
    
    static void displayGadgetInfo(Gadget gadget) {
        gadget.hasil();
        gadget.ambilFoto();
        gadget.rekamVideo();
        gadget.kirimFile();
        gadget.terimaFile();
        gadget.koneksiPerangkat();
        gadget.cariJaringan();
        gadget.hubungkanJaringan();
        gadget.lupakanJaringan();
        gadget.ambilKoordinat();
        System.out.println();
    }
    }
