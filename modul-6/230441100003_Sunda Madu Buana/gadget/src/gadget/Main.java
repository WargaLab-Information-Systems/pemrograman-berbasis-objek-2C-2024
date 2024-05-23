/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gadget;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan pilihan Gadget");
        System.out.println("1. Smartphone");
        System.out.println("2. Tablet");
        System.out.println("3. Laptop");
        System.out.println();
        System.out.println("Masukkan pilihan 1-3 : ");
        int pilihan = input.nextInt();
        input.nextLine();

        Gadget gadget;
        
        if (pilihan == 1) {
            System.out.println("Masukkan dua data smartphone");
            for (int i = 0; i < 2; i++) {
                System.out.println();
                System.out.println("Data Smartrphone ke - " + (i + 1));
                System.out.println("Masukkan Merk : ");
                String merk = input.nextLine();
                System.out.println("Masukkan Model : ");
                String model = input.nextLine();
                Gadget smartphone1 = new Smartphone(merk, model);
                System.out.println();
                System.out.println("Hasil Data : ");
                smartphone1.hasil();
            }
        } else if (pilihan == 2) {
            System.out.println("Masukkan dua data tablet");
            for (int i = 0; i < 2; i++) {
                System.out.println();
                System.out.println("Data Tablet ke - " + (i + 1));
                System.out.println("Masukkan Merk : ");
                String merk = input.nextLine();
                System.out.println("Masukkan Model : ");
                String model = input.nextLine();
                Gadget tablet1 = new tablet(merk, model);
                System.out.println();
                System.out.println("Hasil Data : ");
                tablet1.hasil();
            }
        } else if (pilihan == 3) {
            System.out.println("Masukkan dua data laptop");
            for (int i = 0; i < 2; i++) {
                System.out.println();
                System.out.println("Data Laptop ke - " + (i + 1));
                System.out.println("Masukkan Merk : ");
                String merk = input.nextLine();
                System.out.println("Masukkan Model : ");
                String model = input.nextLine();
                Gadget laptop1 = new laptop(merk, model);
                System.out.println();
                System.out.println("Hasil Data : ");
                laptop1.hasil();
            }
        } else {
            System.out.println("Pilihan tidak tersedia");
            input.close();
        }
    }
}
