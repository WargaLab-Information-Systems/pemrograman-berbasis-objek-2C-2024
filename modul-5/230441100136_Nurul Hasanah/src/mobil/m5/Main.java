package mobil.m5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("=================== JENIS MOBIL ===================");
            System.out.println("1. Mobil MPV");
            System.out.println("2. Mobil SUV");
            System.out.println("3. Mobil Sport");
            System.out.println("4. Mobil Listrik");
            System.out.println("5. Keluar/Selesai");
            System.out.println(" ");
            System.out.print("Masukkan pilihan : ");
            int pilihan = scanner.nextInt();
                
        if (pilihan == 5){
                running = false; 
                break;
        }
        
        switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Merek Mobil MPV : ");
                    String merekMPV = scanner.next();
                    System.out.print("Masukkan Model Mobil MPV : ");
                    String modelMPV = scanner.next();
                    System.out.print("Masukkan Tahun Produksi Mobil : ");
                    int tahunMPV = scanner.nextInt();
                    System.out.println(" ");
                    System.out.println("----------------- INFORMASI MOBIL MPV -----------------");
                    MPV mpv = new MPV(merekMPV, modelMPV, tahunMPV);
                    mpv.showFeature();
                    mpv.showFeature("Mobil keluarga");   
                    mpv.showFeature(4);
                    break;
                case 2:
                    System.out.print("Masukkan Merek Mobil SUV : ");
                    String merekSUV = scanner.next();
                    System.out.print("Masukkan Model Mobil SUV : ");
                    String modelSUV = scanner.next();
                    System.out.print("Masukkan Tahun Produksi Mobil : ");
                    int tahunSUV = scanner.nextInt();
                    System.out.println(" ");
                    System.out.println("----------------- INFORMASI MOBIL SUV -----------------");
                    SUV suv = new SUV(merekSUV, modelSUV, tahunSUV);
                    suv.showFeature();
                    suv.showFeature(2);
                    break;
                case 3:
                    System.out.print("Masukkan Merek Mobil Sport : ");
                    String merekSport = scanner.next();
                    System.out.print("Masukkan Model Mobil Sport : ");
                    String modelSport = scanner.next();
                    System.out.print("Masukkan Tahun Produksi Mobil : ");
                    int tahunSport = scanner.nextInt();
                    System.out.println(" ");
                    System.out.println("----------------- INFORMASI MOBIL SPORT -----------------");
                    MobilSport mobilSport = new MobilSport(merekSport, modelSport, tahunSport);
                    mobilSport.showFeature();
                    mobilSport.showFeature(2562728);
                    break;
                case 4:
                    System.out.print("Masukkan Merek Mobil Listrik : ");
                    String merekListrik = scanner.next();
                    System.out.print("Masukkan Model Mobil Listrik : ");
                    String modelListrik = scanner.next();
                    System.out.print("Masukkan Tahun Produksi Mobil : ");
                    int tahunListrik = scanner.nextInt();
                    System.out.println(" ");
                    System.out.println("----------------- INFORMASI MOBIL LISTRIK -----------------");
                    MobilListrik mobilListrik = new MobilListrik(merekListrik, modelListrik, tahunListrik);
                    mobilListrik.showFeature();
                    mobilListrik.showFeature(7);
                    break;
                case 5:
                    running = false;
                    System.out.println("Program keluar/selesai.");
                    break;
                default:
                    System.out.println("Maaf, jenis kendaraan tidak ada. Pilihlah sesuai pilahan.");
                    break;
            }
        }
        scanner.close();
    }
    
}