/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mobil;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
         Scanner inputUser = new Scanner(System.in);
          while (true) {
            System.out.println("1. Mobil MPV");
            System.out.println("2. Mobil SUV");
            System.out.println("3. Mobil Sport");
            System.out.println("4. Mobil Listrik");
            System.out.print("PILIH: ");
            String pilih = inputUser.nextLine();

            if (pilih.equals("1")) {
                System.out.print("Merek :");
                String merek = inputUser.nextLine();
                System.out.print("Model :");
                String model = inputUser.nextLine();
                System.out.print("Tahun Produksi :");
                int TahunProduksi = inputUser.nextInt();
                inputUser.nextLine();
                Mobil mobil = new MPV(merek, model, TahunProduksi);
                mobil.showfeature();
                
                System.out.print("Lagi? (y/n)   : ");
                String tanya = inputUser.nextLine();
                if (tanya.equalsIgnoreCase("n")) {
                    break;
                }
            } else if (pilih.equals("2")) {
                System.out.print("Merek :");
                String merek = inputUser.nextLine();
                System.out.print("Model :");
                String model = inputUser.nextLine();
                System.out.print("Tahun Produksi :");
                int TahunProduksi = inputUser.nextInt();
                inputUser.nextLine();
                Mobil mobil = new SUV(merek, model, TahunProduksi);
                mobil.showfeature();
                 
                System.out.print("Lagi? (y/n)   : ");
                String tanya = inputUser.nextLine();
                if (tanya.equalsIgnoreCase("n")) {
                    break;
                }
            } else if (pilih.equals("3")) {
                System.out.print("Merek :");
                String merek = inputUser.nextLine();
                System.out.print("Model :");
                String model = inputUser.nextLine();
                System.out.print("Tahun Produksi :");
                int TahunProduksi = inputUser.nextInt();
                inputUser.nextLine();
                Mobil mobil = new MobilSport(merek, model, TahunProduksi);
                mobil.showfeature();
                
                System.out.print("Lagi? (y/n)   : ");
                String tanya = inputUser.nextLine();
                if (tanya.equalsIgnoreCase("n")) {
                    break;
                }
            } else if (pilih.equals("4")) {
                System.out.print("Merek :");
                String merek = inputUser.nextLine();
                System.out.print("Model :");
                String model = inputUser.nextLine();
                System.out.print("Tahun Produksi :");
                int TahunProduksi = inputUser.nextInt();
                inputUser.nextLine();
                Mobil mobil = new MobilListrik(merek, model, TahunProduksi);
                mobil.showfeature();
                
                System.out.print("Lagi? (y/n)   : ");
                String tanya = inputUser.nextLine();
                if (tanya.equalsIgnoreCase("n")) {
                    break;
                }
            } else {
                System.out.println("inputkan dengan benar");
            }
        }
    }
}  