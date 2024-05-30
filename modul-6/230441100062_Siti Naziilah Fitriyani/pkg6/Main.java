/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul.pkg6;
import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        String lanjut = null;

        do {
            System.out.println("\nPilih jenis gadget :");
            System.out.println("1. Smartphone");
            System.out.println("2. Tablet");
            System.out.println("3. Laptop");
            System.out.print("Masukkan pilihan: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();
            
            Gadget gadget;
            switch (pilihan) {
                case 1:
                    for (int i = 0; i < 3; i++) {
                        System.out.println(" ");
                        System.out.print("Masukkan merek Smartphone: ");
                        String merek = scanner.nextLine();
                        System.out.print("Masukkan model Smartphone: ");
                        String model = scanner.nextLine();
                        Smartphone smartphone = new Smartphone(merek, model);
                        smartphone.tampilkaninfo();
                        smartphone.ambilFoto();
                        smartphone.rekamVideo();
                        smartphone.kirimFile();
                        smartphone.terimaFile();
                        smartphone.koneksiPerangkat();
                        smartphone.cariJaringan();
                        smartphone.hubungkanJaringan();
                        smartphone.lupakanJaringan();
                        smartphone.ambilKoordinat();
                        System.out.println(" ");
                    }
                    break;
                case 2:
                    for (int i = 0; i < 2; i++) {
                        System.out.println(" ");
                        System.out.print("Masukkan merek Tablet: ");
                        String merek = scanner.nextLine();
                        System.out.print("Masukkan model Tablet: ");
                        String model = scanner.nextLine();
                        Tablet tablet = new Tablet(merek, model);
                        tablet.tampilkaninfo();
                        tablet.ambilFoto();
                        tablet.rekamVideo();
                        tablet.kirimFile();
                        tablet.terimaFile();
                        tablet.koneksiPerangkat();
                        tablet.cariJaringan();
                        tablet.hubungkanJaringan();
                        tablet.lupakanJaringan();
                        tablet.ambilKoordinat();
                        System.out.println(" ");
                    }
                    break;
                case 3:
                    for (int i = 0; i < 2; i++) {
                        System.out.println(" ");
                        System.out.print("Masukkan merek Laptop: ");
                        String merek = scanner.nextLine();
                        System.out.print("Masukkan model Laptop: ");
                        String model = scanner.nextLine();
                        Laptop laptop = new Laptop(merek, model);
                        laptop.tampilkaninfo();
                        laptop.ambilFoto();
                        laptop.rekamVideo();
                        laptop.kirimFile();
                        laptop.terimaFile();
                        laptop.koneksiPerangkat();
                        laptop.cariJaringan();
                        laptop.hubungkanJaringan();
                        laptop.lupakanJaringan();
                        laptop.ambilKoordinat();
                        System.out.println(" ");
                    }
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    continue;
            }

            System.out.println(" ");
            System.out.println("Apakah Anda ingin memasukkan data gadget lain? (ya/tidak):");
            lanjut = scanner.nextLine();
        } while (lanjut.equalsIgnoreCase("ya"));

        scanner.close();
    }
}