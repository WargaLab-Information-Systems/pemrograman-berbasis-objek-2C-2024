package Gadget;

import java.util.Scanner;

public class Mainn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input for Smartphones
        Gadget[] gadget = new Gadget[6];
            System.out.print("Masukan Merk Smartphone " + (1) + " Anda :");
            String merk = input.nextLine();
            System.out.print("Masukan Model Smartphone " + (1) + " Anda :");
            String model = input.nextLine();
            gadget[0] = new Smartphone(merk, model);
            System.out.print("Masukan Merk Smartphone " + (2) + " Anda :");
            merk = input.nextLine();
            System.out.print("Masukan Model Smartphone " + (2) + " Anda :");
            model = input.nextLine();
            gadget[1] = new Smartphone(merk, model);

        // Input for Tablets
            System.out.print("Masukan Merk Tablet " + (1) + " Anda :");
            merk = input.nextLine();
            System.out.print("Masukan Model Tablet " + (1) + " Anda :");
            model = input.nextLine();
            gadget[2] = new Tablet(merk, model);
            System.out.print("Masukan Merk Tablet " + (2) + " Anda :");
            merk = input.nextLine();
            System.out.print("Masukan Model Tablet " + (2) + " Anda :");
            model = input.nextLine();
            gadget[3] = new Tablet(merk, model);
        

        // Input for Laptops
            System.out.print("Masukan Merk Laptop " + (1) + " Anda :");
            merk = input.nextLine();
            System.out.print("Masukan Model Laptop " + (1) + " Anda :");
            model = input.nextLine();
            gadget[4] = new Laptop(merk, model);
            System.out.print("Masukan Merk Laptop " + (2) + " Anda :");
            merk = input.nextLine();
            System.out.print("Masukan Model Laptop " + (2) + " Anda :");
            model = input.nextLine();
            gadget[5] = new Laptop(merk, model);
        

        input.close();

        for (int i = 0; i < gadget.length; i++) {
            System.out.println("===========================================================");
            System.out.println("Gadget:");
            gadget[i].Model();
            gadget[i].Merk();
            System.out.println();
            System.out.println("Spesifikasi Kamera ");
            gadget[i].AmbilFoto();
            gadget[i].AmbilVideo();
            System.out.println();
            System.out.println("Spesifikasi GPS ");
            gadget[i].AmbilKordinat();
            System.out.println();
            System.out.println("Spesifikasi Bluetooth");
            gadget[i].KirimFile();
            gadget[i].TerimaFile();
            gadget[i].KoneksiPerangkat();
            System.out.println();
            System.out.println("Spesifikasi Wifi ");
            gadget[i].CariJaringan();
            gadget[i].HubungkanJaringan();
            gadget[i].LupkanJaringan();
            System.out.println();
            System.out.println("===========================================================");
        }
    }
}
