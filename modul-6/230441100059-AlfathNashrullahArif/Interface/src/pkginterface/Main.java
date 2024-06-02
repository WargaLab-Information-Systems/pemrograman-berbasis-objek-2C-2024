/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkginterface;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean ulang = true ;

        while (ulang) {
            while (true) {
            System.out.println("\nPilih Jenis barang elektronik");
            System.out.println("1. Smartphone");
            System.out.println("2. Laptop");
            System.out.println("3. Tablet");
            System.out.print("Nomer tipe     : ");
            int pilihan = input.nextInt();
            input.nextLine();  // Membersihkan buffer newline setelah nextInt()

            System.out.print("Masukkan Merk pertama : ");
            String merk = input.nextLine();
            System.out.print("Masukkan Model pertama: ");
            String model = input.nextLine();
            
            System.out.print("Masukkan Merk kedua : ");
            String merk2 = input.nextLine();
            System.out.print("Masukkan Model kedua: ");
            String model2 = input.nextLine();

            Gadget gadget = null;

            if (pilihan == 1) {
                gadget = new Smartphone(merk, model);
                Smartphone gadget2 = new Smartphone(merk2, model2);
                gadget.Display();
                gadget2.Display();
                break;
            } else if (pilihan == 2) {
                gadget = new Laptop(merk, model);
                Laptop gadget2 = new Laptop(merk2, model2);
                gadget.Display();
                gadget2.Display();
                break;
            } else if (pilihan == 3) {
                gadget = new Tablet(merk, model);
                Tablet gadget2 = new Tablet(merk2, model2);
                gadget.Display();
                gadget2.Display();
                break;
            } else {
                System.out.println("\nPilihan tidak dikenal !");
                System.out.println("Masukkan dengan benar !");
            }

            } 
            while (true) {
                System.out.print("\nMau input lagi tidak? (y / t)");
                String tanya = input.nextLine();
                if (tanya.equalsIgnoreCase("y")) {
                    break;
                }
                else if (tanya.equalsIgnoreCase("t")) {
                    System.out.println("Program Selesai...");
                    ulang = false;
                    break;
                } else {
                    System.out.println("Input tidak valid..!");
                }
                }
        }
    }
}
