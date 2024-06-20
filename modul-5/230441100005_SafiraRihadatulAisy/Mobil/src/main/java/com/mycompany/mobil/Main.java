/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mobil;
import java.util.Scanner;
/**
 *
 * @author safira rihadatul a
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\nMasukkan Data Mobil");
            System.out.println("----- Tipe -----");
            System.out.println("1. MPV");
            System.out.println("2. SUV");
            System.out.println("3. Mobil Sport");
            System.out.println("4. Mobil Listrik");
            System.out.print("Nomer tipe     : ");
            String Tipe = input.nextLine();
            System.out.print("Merk           : ");
            String Merk = input.nextLine();
            System.out.print("Model          : ");
            String Model = input.nextLine();
            System.out.print("Tahun Produksi : ");
            int TahunProduksi = input.nextInt();

            Mobil mobil;
            if (Tipe.equals("1")) {
                mobil = new MPV(Merk, Model, TahunProduksi);
            } else if (Tipe.equals("2")) {
                mobil = new SUV(Merk, Model, TahunProduksi);
            } else if (Tipe.equals("3")) {
                mobil = new MobilSport(Merk, Model, TahunProduksi);
            } else if (Tipe.equals("4")) {
                mobil = new MobilListrik(Merk, Model, TahunProduksi);
            } else {
                System.out.println("Jenis mobil tidak valid.");
                continue; 
            }

            mobil.Display();
            mobil.Feature();
  
            System.out.print("Lagi? (y/n): ");
            String tanya = input.next();
            if (tanya.equalsIgnoreCase("n")) {
                break; 
            }
            input.nextLine(); 
        }

        input.close(); 
    }
}