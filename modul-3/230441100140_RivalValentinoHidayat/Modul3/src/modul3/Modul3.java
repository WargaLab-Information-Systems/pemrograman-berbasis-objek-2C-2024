/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul3;

import java.util.Scanner;

public class Modul3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan data kendaraan:");

        // Input data kendaraan Mobil
        Mobil mobil = inputMobil(scanner);

        // Input data kendaraan Motor
        Motor motor = inputMotor(scanner);

        // Menampilkan informasi kendaraan
        System.out.println("\nDaftar Kendaraan:");
        mobil.displayInfo();
        motor.displayInfo();
    }

    public static Mobil inputMobil(Scanner scanner) {
        System.out.println("\nKendaraan Mobil:");
        System.out.print("Merek: ");
        String merek = scanner.nextLine();
        System.out.print("Model: ");
        String model = scanner.nextLine();
        System.out.print("Status (T/Tersedia atau D/Disewakan): ");
        char status = scanner.next().charAt(0);
        System.out.print("Tahun Kendaraan: ");
        int tahun = scanner.nextInt();
        System.out.print("Jumlah Pintu: ");
        int pintu = scanner.nextInt();

        return new Mobil(merek, model, status, tahun, pintu);
    }

    public static Motor inputMotor(Scanner scanner) {
        System.out.println("\nKendaraan Motor:");
        System.out.print("Merek: ");
        String merek = scanner.nextLine();
        System.out.print("Model: ");
        String model = scanner.nextLine();
        System.out.print("Status (T/Tersedia atau D/Disewakan): ");
        char status = scanner.next().charAt(0);
        System.out.print("Tahun Kendaraan: ");
        int tahun = scanner.nextInt();
        System.out.print("Kapasitas Mesin (cc): ");
        int mesin = scanner.nextInt();

        return new Motor(merek, model, status, tahun, mesin);
    }
}

