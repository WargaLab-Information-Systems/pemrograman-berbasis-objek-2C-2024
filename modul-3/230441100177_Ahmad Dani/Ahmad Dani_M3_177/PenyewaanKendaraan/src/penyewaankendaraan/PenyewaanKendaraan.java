package penyewaankendaraan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Kendaraan {
    protected String jenis, merk, model, status; //T=tersedia, D=disewakan
    protected int tahun;
    
    public Kendaraan(String jenis, String merk, String model,String status,int tahun) {
        this.jenis =jenis;
        this.merk =merk;
        this.model=model;
        this.status=status;
        this.tahun=tahun;
    }
    
    public void displayInfo(){
        System.out.println("Jenis \t: " + jenis);
        System.out.println("Merk \t: " + merk);
        System.out.println("Model \t: " + model);
        System.out.println("Tahun \t: " + tahun);
        System.out.println("Tahun \t: " + status);
        System.out.println("");
    } 
    
}

class Mobil extends Kendaraan{
    public Mobil(String merek, String model, String status, int tahun) {
        super("Mobil", merek, model, status, tahun);
    }
}

class Motor extends Kendaraan {
    public Motor(String merek, String model, String status, int tahun) {
        super("Motor", merek, model, status, tahun);
    }
}

class Sepeda extends Kendaraan {
    public Sepeda(String merek, String model, String status, int tahun) {
        super("Sepeda", merek, model, status, tahun);
    }
}


public class PenyewaanKendaraan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        List<Kendaraan> kendaraanList = new ArrayList<>();
    
        System.out.print("Masukkan jumlah kendaraan: ");
        int jumlahKendaraan = scanner.nextInt();
        scanner.nextLine(); // consume newline
        
        for (int i = 0; i < jumlahKendaraan; i++) {
            System.out.print("Jenis kendaraan (mobil/motor/sepeda): ");

            String jenis = scanner.nextLine();
            System.out.print("Merek kendaraan: ");
            String merek = scanner.nextLine();
            System.out.print("Model kendaraan: ");
            String model = scanner.nextLine();
            
            System.out.print("Status kendaraan (T/D): ");
            String status = scanner.nextLine();
            if (status.equalsIgnoreCase("D")) {
                status = "Disewakan";
            }else if(status.equalsIgnoreCase("T")) {
                status = "Tersedia";
            }else {
                status = "Status yang anda pilih salah!";
            }
            
            System.out.print("Tahun kendaraan: ");
            int tahun = scanner.nextInt();
            scanner.nextLine(); // consume newline
            System.out.println("----------------------------");
            
            switch (jenis.toLowerCase()) {
                case "mobil":
                    kendaraanList.add(new Mobil(merek, model, status, tahun));
                    break;
                case "motor":
                    kendaraanList.add(new Motor(merek, model, status, tahun));
                    break;
                case "sepeda":
                    kendaraanList.add(new Sepeda(merek, model, status, tahun));
                    break;
                default:
                    System.out.println("Jenis kendaraan tidak valid");
                    break;
            }
            
        }
        System.out.println("\nDaftar kendaraan yang disewakan:");
        System.out.println("==================================");
        for (Kendaraan kendaraan : kendaraanList) {
            kendaraan.displayInfo();
        }
    }
    
}
