package gawai;

import java.util.Scanner;

public class Gawai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean ulang = true;

        while (ulang) {
            while (true) {
                System.out.println("\nPilih jenis tipe dibawah");
                System.out.println("1. Smartphone");
                System.out.println("2. Laptop");
                System.out.println("3. Tablet");
                System.out.print("Nomer tipe     : ");
                int pilihan = input.nextInt();
                input.nextLine();  

                if (pilihan < 1 || pilihan > 3) {
                    System.out.println("\nPilih yang ada woi!");
                    System.out.println("Masukkan nomor tipe (1, 2, atau 3)!");
                    continue; 
                }

                System.out.print("Masukkan Merk pertama : ");
                String merk = input.nextLine();
                System.out.print("Masukkan Model pertama: ");
                String model = input.nextLine();
                
                System.out.println("");
                
                System.out.print("Masukkan Merk kedua : ");
                String merk2 = input.nextLine();
                System.out.print("Masukkan Model kedua: ");
                String model2 = input.nextLine();
               
                System.out.println("");
                
                System.out.print("Masukkan Merk ketiga : ");
                String merk3 = input.nextLine();
                System.out.print("Masukkan Model ketiga: ");
                String model3 = input.nextLine();

                
                if (pilihan == 1) {
                    Smartphone gadget1 = new Smartphone(merk, model);
                    Smartphone gadget2 = new Smartphone(merk2, model2);
                    Smartphone gadget3 = new Smartphone(merk3, model3);
                    gadget1.Display();
                    gadget2.Display();
                    gadget3.Display();
                } else if (pilihan == 2) {
                    Laptop gadget1 = new Laptop(merk, model);
                    Laptop gadget2 = new Laptop(merk2, model2);
                    Laptop gadget3 = new Laptop(merk3, model3);
                    gadget1.Display();
                    gadget2.Display();
                    gadget3.Display();
                } else if (pilihan == 3) {
                    Tablet gadget1 = new Tablet(merk, model);
                    Tablet gadget2 = new Tablet(merk2, model2);
                    Tablet gadget3 = new Tablet(merk3, model3);
                    gadget1.Display();
                    gadget2.Display();
                    gadget3.Display();
                }
                break; 
            } 

            while (true) {
                System.out.print("\nInput lagi? (y / t) ");
                String tanya = input.nextLine();
                if (tanya.equalsIgnoreCase("y")) {
                    break;
                } else if (tanya.equalsIgnoreCase("t")) {
                    System.out.println("Program berhenti...");
                    ulang = false;
                    break;
                } else {
                    System.out.println("Input seng bener!");
                }
            }
        }
        input.close();
    }
}