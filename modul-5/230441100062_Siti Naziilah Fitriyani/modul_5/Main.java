/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul_5;
import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\nPilih jenis mobil:");
        System.out.println("1. MPV");
        System.out.println("2. SUV");
        System.out.println("3. Mobil Sport");
        System.out.println("4. Mobil Listrik");
        System.out.print("Masukkan pilihan: ");
        int pilihan = scanner.nextInt();
        scanner.nextLine();
                
        System.out.print("Masukkan merek mobil: ");
        String merek = scanner.nextLine();
        
        System.out.print("Masukkan model mobil: ");
        String model = scanner.nextLine();
        
        System.out.print("Masukkan tahun produksi: ");
        int tahun = scanner.nextInt();

        Mobil mobil;
        switch (pilihan) {
            case 1:
                mobil = new MPV(merek, model, tahun);
                break;
            case 2:
                mobil = new SUV(merek, model, tahun);
                break;
            case 3:
                mobil = new MobilSport(merek, model, tahun);
                break;
            case 4:
                mobil = new MobilListrik(merek, model, tahun);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                return;
        }

        System.out.println(" ");
        System.out.println("========Fitur Mobil :=======");
        mobil.showFeature();
    }
    
}
