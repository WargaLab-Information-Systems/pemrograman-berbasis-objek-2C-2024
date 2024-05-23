/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul6;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Gadget> gadgets = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            System.out.println("Input data Laptop " + (i + 1) + ":");
            System.out.print("masukkan merek: ");
            String merek = scanner.nextLine();
            System.out.print("masukkan model: ");
            String model = scanner.nextLine();
            gadgets.add(new Laptop(merek, model));
        }

        for (int i = 0; i < 2; i++) {
            System.out.println("Input data Smartphone " + (i + 1) + ":");
            System.out.print("masukkan merek: ");
            String merek = scanner.nextLine();
            System.out.print("masukkan model: ");
            String model = scanner.nextLine();
            gadgets.add(new Smartphone(merek, model));
        }

        for (int i = 0; i < 2; i++) {
            System.out.println("Input data Tablet " + (i + 1) + ":");
            System.out.print("masukkan merek: ");
            String merek = scanner.nextLine();
            System.out.print("masukkan model: ");
            String model = scanner.nextLine();
            gadgets.add(new Tablet(merek, model));
        }

     
        for (Gadget gadget : gadgets) {
            System.out.println("\n Informasi Yang Telah Dimasukkan : ");
            gadget.showInfo();
            gadget.ambilFoto();
            gadget.rekamVideo();
            gadget.kirimFile();
            gadget.terimaFile();
            gadget.koneksiPerangkat();
            gadget.cariJaringan();
            gadget.hubungkanJaringan();
            gadget.lupakanJaringan();
            gadget.ambilKordinat();
            System.out.println("");
            System.out.println();
        }
    }
}