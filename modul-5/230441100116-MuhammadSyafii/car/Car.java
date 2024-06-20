
package car;

import java.util.Scanner;

public class Car {     
    public static void main(String[] args) {         
       Scanner input = new Scanner(System.in);
        boolean ulang = true;
        while (ulang) {
            while (true) {
                System.out.println("\nMasukkan Data Mobil");
                System.out.print("Merk           : ");
                String Merk = input.nextLine();
                System.out.println("----- Tipe -----");
                System.out.println("1. MPV");
                System.out.println("2. SUV");
                System.out.println("3. Mobil Sport");
                System.out.println("4. Mobil Listrik");
                System.out.print("Nomer tipe     : ");
                String Tipe = input.nextLine();
                System.out.print("Model          : ");
                String Model = input.nextLine();
                System.out.print("Tahun Produksi : ");
                int TahunProduksi = input.nextInt();
                input.nextLine();

                if (Tipe.equalsIgnoreCase("1")) {
                    Mobil mobil = new MPV(Merk, Model, TahunProduksi);
                    mobil.Display();
                    mobil.Feature();
                    break;
                } else if (Tipe.equalsIgnoreCase("2")) {
                    Mobil mobil = new SUV(Merk, Model, TahunProduksi);
                    mobil.Display();
                    mobil.Feature();
                    break;
                } else if (Tipe.equalsIgnoreCase("3")) {
                    Mobil mobil = new MobilSport(Merk, Model, TahunProduksi);
                    mobil.Display();
                    mobil.Feature();
                    break;
                } else if (Tipe.equalsIgnoreCase("4")) {
                    Mobil mobil = new MobilListrik(Merk, Model, TahunProduksi);
                    mobil.Display();
                    mobil.Feature();
                    break;
                } else {
                    System.out.println("Jenis mobil tidak valid..!");
                }
            }
            
            while (true) {
                System.out.print("Mau input lagi tidak? (y / n)");
                String tanya = input.nextLine();
                if (tanya.equalsIgnoreCase("y")) {
                    break;
                }
                else if (tanya.equalsIgnoreCase("n")) {
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