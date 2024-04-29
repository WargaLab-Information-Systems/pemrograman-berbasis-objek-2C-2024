
package apk3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Kendaraan {
    //agar dapat diakses kelas turunannya. tp tidak di luar package
    protected String jenis;
    protected String merk;
    protected String model;
    protected char status; //T=tersedia, D=disewakan
    protected int tahun;
    //constructor
    public Kendaraan(String jenis, String merk, String model,char status,int tahun) {
        this.jenis=jenis;
        this.merk =merk;
        this.model=model;
        this.status=status;
        this.tahun=tahun;
    }
    public String displayInfo(){
        return "Jenis: "+ jenis+"\nMerk: "+ merk+"\nModel :"+ model+"\n"+"Tahun :"+tahun; 
    }    
}
//class turunan
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
            //
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
        
        System.out.println("\nDaftar kendaraan disewakan :");
        for (Kendaraan kendaraan : kendaraanList) {
            if (kendaraan.status == 'D') {
                System.out.println(kendaraan .displayInfo());
                System.out.println("Status = Disewakan");
            }
        }
                
        System.out.println("\nDaftar kendaraan Tersedia :");  
        for (Kendaraan kendaraan : kendaraanList) {
            if (kendaraan.status == 'T') {
                System.out.println(kendaraan.displayInfo());
                System.out.println("Status = Tersedia");
                    
                }
            } 
    }
}

        
