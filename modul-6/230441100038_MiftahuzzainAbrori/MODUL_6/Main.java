package MODUL_6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner objek = new Scanner(System.in);

        System.out.print("GADGET (1. SMARTPHONE / 2. TABLET / 3. LAPTOP ) = ");
        String pilih = objek.next();

        System.out.println("");

        GADGET konver;

        if (pilih.equals("1")) {
            for (int i = 0; i < 2; i++) {
                System.out.print("MEREK = ");
                String merek = objek.next();
                System.out.print("MODEL = ");
                String model = objek.next();
                konver = new Smartphone(pilih, merek, model);
                konver.showfeature();
                ((Smartphone) konver).ambilFoto();
                ((Smartphone) konver).rekamVideo();
                ((Smartphone) konver).kirimFile();
                ((Smartphone) konver).terimaFile();
                ((Smartphone) konver).koneksiPerangkat();
                ((Smartphone) konver).cariJaringan();
                ((Smartphone) konver).hubunganJaringan();
                ((Smartphone) konver).lupakanJaringan();
                ((Smartphone) konver).ambilKoordinat();
                System.out.println("");
            }
        } else if (pilih.equalsIgnoreCase("2")) {
            for (int i = 0; i < 2; i++) {
                System.out.print("MEREK = ");
                String merek = objek.next();
                System.out.print("MODEL = ");
                String model = objek.next();
                konver = new Tablete(pilih, merek, model);
                konver.showfeature();
                ((Tablete) konver).ambilFoto();
                ((Tablete) konver).rekamVideo();
                ((Tablete) konver).kirimFile();
                ((Tablete) konver).terimaFile();
                ((Tablete) konver).koneksiPerangkat();
                ((Tablete) konver).cariJaringan();
                ((Tablete) konver).hubunganJaringan();
                ((Tablete) konver).lupakanJaringan();
                ((Tablete) konver).ambilKoordinat();
                System.out.println("");
            }
        } else if (pilih.equalsIgnoreCase("3")) {
            for (int i = 0; i < 2; i++) {
                System.out.print("MEREK = ");
                String merek = objek.next();
                System.out.print("MODEL = ");
                String model = objek.next();
                konver = new Laptop(pilih, merek, model);
                konver.showfeature();
                ((Laptop) konver).ambilFoto();
                ((Laptop) konver).rekamVideo();
                ((Laptop) konver).kirimFile();
                ((Laptop) konver).terimaFile();
                ((Laptop) konver).koneksiPerangkat();
                ((Laptop) konver).cariJaringan();
                ((Laptop) konver).hubunganJaringan();
                ((Laptop) konver).lupakanJaringan();
                ((Laptop) konver).ambilKoordinat();
                System.out.println("");
            }
        }
    }
}