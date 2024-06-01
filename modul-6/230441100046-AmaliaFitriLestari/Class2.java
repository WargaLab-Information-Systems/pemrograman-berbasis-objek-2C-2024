/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gadget;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Class2 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean isRunn = true;
    
    while (isRunn){
        List<Gadget> gadgets = new ArrayList<>();
        System.out.println("------MASUKKAN DATA GADGET------");
        System.out.print("Pilih jenis gadget yang ingin anda inputkan (1. Smarphone 2. Tablet, 3. Laptop): ");
        int jenis = scanner.nextInt();
        scanner.nextLine();
        switch (jenis) {
            case 1:
        // Input untuk Smartphone
                for (int i = 0; i < 2; i++) {
                    System.out.println("Masukkan data Smartphone ke-" + (i + 1) + ":");
                    System.out.print("Merek: ");
                    String merek = scanner.nextLine();
                    System.out.print("Model: ");
                    String model = scanner.nextLine();
                    gadgets.add(new smarphone(merek, model));
                }
                break;
            case 2:
            // Input untuk Tablet
                for (int i = 0; i < 2; i++) {
                    System.out.println("Masukkan data Tablet ke-" + (i + 1) + ":");
                    System.out.print("Merek: ");
                    String merek = scanner.nextLine();
                    System.out.print("Model: ");
                    String model = scanner.nextLine();
                    gadgets.add(new tablet(merek, model));
                }
                break;
            case 3:
            // Input untuk Laptop
                for (int i = 0; i < 2; i++) {
                    System.out.println("Masukkan data Laptop ke-" + (i + 1) + ":");
                    System.out.print("Merek: ");
                    String merek = scanner.nextLine();
                    System.out.print("Model: ");
                    String model = scanner.nextLine();
                    gadgets.add(new laptop(merek, model));
                }
                break;
            default:
                System.out.println("tidak ada pilihan yang sesuai");
        }
        // Tampilkan semua data gadget
        System.out.println("");
        System.out.println("===== Data Gadget =====");
        for (Gadget gadget : gadgets) {
            gadget.TampilkanData();
            gadget.AmbilFoto();
            gadget.RekamVidio();
            gadget.KirimFile();
            gadget.TerimaFile();
            gadget.KoneksiPerangkat();
            gadget.CariJaringan();
            gadget.HubungkanJaringan();
            gadget.LupakanJaringan();
            gadget.AmbilKoordinat();
            System.out.println("");
               
        }
        
    System.out.print("apakah anda masih ingin menginputkan data Gadget? (y/t)");
    String continueInput = scanner.nextLine();
    if (!continueInput.equalsIgnoreCase("y")){
//            menghentikan pengulangan
        isRunn = false; 
        System.out.println("terima kasih");
        }
    }
    scanner.close();
    }
}

