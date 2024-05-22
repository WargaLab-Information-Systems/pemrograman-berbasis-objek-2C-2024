package modul4;

import java.util.Scanner;

public class Modul4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println(" ");
            System.out.println("=================== KONVERSI SATUAN ===================");
            System.out.println("1. Suhu");
            System.out.println("2. Panjang");
            System.out.println("3. Berat");
            System.out.println("4. Waktu");
            System.out.println("5. Keluar/Selesai");
            System.out.println(" ");
            System.out.print("Masukkan pilihan \t:\t");
            int pilihan = scanner.nextInt();
                
        if (pilihan == 5){
                running = false; 
                break;
        }
        
        System.out.print("Masukkan satuan asal \t:\t ");
        String satuanAsal = scanner.next();
        System.out.print("Masukkan satuan tujuan \t:\t ");
        String satuanTujuan = scanner.next();
        System.out.print("Masukkan nilai       \t:\t ");
        double nilai = scanner.nextDouble();

        KonversiSatuan konversi;
        if (satuanAsal.equalsIgnoreCase("Celsius") || satuanAsal.equalsIgnoreCase("Fahrenheit") ||
            satuanAsal.equalsIgnoreCase("Kelvin") || satuanAsal.equalsIgnoreCase("Reamur")) {
            konversi = new Suhu(nilai, satuanAsal, satuanTujuan);
          
        
        }else if (satuanAsal.equalsIgnoreCase("Kilometer") || satuanAsal.equalsIgnoreCase("Hektometer") ||
                   satuanAsal.equalsIgnoreCase("Dekameter") || satuanAsal.equalsIgnoreCase("Meter") ||
                   satuanAsal.equalsIgnoreCase("Desimeter") || satuanAsal.equalsIgnoreCase("Centimeter") || 
                   satuanAsal.equalsIgnoreCase("Milimeter")) {
            konversi = new Panjang(nilai, satuanAsal, satuanTujuan);
        
        }else if (satuanAsal.equalsIgnoreCase("Kilogram") || satuanAsal.equalsIgnoreCase("Hektogram") ||
                   satuanAsal.equalsIgnoreCase("Dekagram") || satuanAsal.equalsIgnoreCase("Gram") ||
                   satuanAsal.equalsIgnoreCase("Desigram") || satuanAsal.equalsIgnoreCase("Centigram") || 
                   satuanAsal.equalsIgnoreCase("Miligram")) {
            konversi = new Berat(nilai, satuanAsal, satuanTujuan);
        
        }else if (satuanAsal.equalsIgnoreCase("Hari") || satuanAsal.equalsIgnoreCase("Jam") ||
                   satuanAsal.equalsIgnoreCase("Menit") || satuanAsal.equalsIgnoreCase("Detik")) {
            konversi = new Waktu(nilai, satuanAsal, satuanTujuan);
        } else {
            System.out.println("Satuan yang dimasukkan salah.");
            return;
        }
        
        
        konversi.tampilkanHasil();
    }
        
    }
}