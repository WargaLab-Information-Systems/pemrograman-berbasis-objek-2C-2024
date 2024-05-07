
package apk3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Kendaraan {
    protected String jenis;
    protected String merk;
    protected String model;
    protected char status; //T=tersedia, D=disewakan
    protected int tahun;
    public Kendaraan(String jenis, String merk, String model,char status,int tahun) {
        this.jenis =jenis;
        this.merk =merk;
        this.model=model;
        this.status=status;
        this.tahun=tahun;
    }
    public String displayInfo(){
        return "Jenis: "+jenis+",Merk: "+merk+"Model :"+model+".Status :"+status+",Tahun :"+tahun;
    }    
}

class Mobil extends Kendaraan{
    public Mobil(String merek, String model, char status, int tahun) {
        super("Mobil", merek, model, status, tahun);
    }
}

class Motor extends Kendaraan {
    public Motor(String merek, String model, char status, int tahun) {
        super("Motor", merek, model, status, tahun);
    }
}

class Sepeda extends Kendaraan {
    public Sepeda(String merek, String model, char status, int tahun) {
        super("Sepeda", merek, model, status, tahun);
    }
}

public class Apk3 {
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
            char status = scanner.nextLine().charAt(0);
            System.out.print("Tahun kendaraan: ");
            int tahun = scanner.nextInt();
            scanner.nextLine(); // consume newline
            
            Kendaraan kendaraan;
            switch (jenis.toLowerCase()) {
                case "mobil":
                    kendaraan = new Mobil(merek, model, status, tahun);
                    break;
                case "motor":
                    kendaraan = new Motor(merek, model, status, tahun);
                    break;
                case "sepeda":
                    kendaraan = new Sepeda(merek, model, status, tahun);
                    break;
                default:
                    System.out.println("Jenis kendaraan tidak valid");
                    continue;
            }
            kendaraanList.add(kendaraan);
        }
        
        System.out.println("\nDaftar kendaraan yang disewakan:");
        for (Kendaraan kendaraan : kendaraanList) {
            if (kendaraan.status == 'D') {
                System.out.println(kendaraan.displayInfo());
            }
        }
    }
}

        
