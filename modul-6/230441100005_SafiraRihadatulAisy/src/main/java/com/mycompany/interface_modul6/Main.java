/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interface_modul6;
import java.util.Scanner;
/**
 *
 * @author safira rihadatul a
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nPilih Jenis barang elektronik");
            System.out.println("1. Smartphone");
            System.out.println("2. Tablet");
            System.out.println("3. Laptop");
            System.out.println("4. Keluar");
            System.out.print("Nomor tipe: ");
            int pilihan = input.nextInt();
            input.nextLine();

            if (pilihan == 4) {
                System.out.println("Program Selesai...");
                break;
            }

            if (pilihan >= 1 && pilihan <= 3) {
                System.out.print("Masukkan Merk pertama: ");
                String merk = input.nextLine();
                System.out.print("Masukkan Model pertama: ");
                String model = input.nextLine();

                System.out.print("Masukkan Merk kedua: ");
                String merk2 = input.nextLine();
                System.out.print("Masukkan Model kedua: ");
                String model2 = input.nextLine();

                Gadget gadget1 = null;
                Gadget gadget2 = null;

                if (pilihan == 1) {
                    gadget1 = new Smartphone(merk, model);
                    gadget2 = new Smartphone(merk2, model2);
                } else if (pilihan == 2) {
                    gadget1 = new Tablet(merk, model);
                    gadget2 = new Tablet(merk2, model2);
                } else if (pilihan == 3) {
                    gadget1 = new Laptop(merk, model);
                    gadget2 = new Laptop(merk2, model2);
                }

                gadget1.Display();
                gadget2.Display();
            } else {
                System.out.println("\nPilihan tidak valid!");
            }
        }

        input.close();
    }
}