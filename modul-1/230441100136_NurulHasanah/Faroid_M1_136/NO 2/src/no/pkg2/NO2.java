package no.pkg2;
import java.util.Scanner;

class mahasiswa {
    String nama;
    int nim;
    String prodi;
    String alamat;
}
public class NO2 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        mahasiswa manusia1 = new mahasiswa ();
//     
        System.out.print("Masukkan Nama \t: ");
        manusia1.nama = input.nextLine();
        
        System.out.print("Masukkan NIM \t: ");
        manusia1.nim = input.nextInt();
        input.nextLine();
        
        System.out.print("Masukkan Prodi \t: ");
        manusia1.prodi = input.nextLine();

        System.out.print("Masukkan Alamat : ");
        manusia1.alamat = input.nextLine();

        System.out.println("====================");
        System.out.println("Nama \t:" + manusia1.nama);
        System.out.println("NIM \t:" + manusia1.nim);
        System.out.println("Prodi \t:" + manusia1.prodi);
        System.out.println("Alamat \t:" + manusia1.alamat);
    }
    
}
