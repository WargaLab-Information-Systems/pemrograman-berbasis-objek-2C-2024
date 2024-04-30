package praktikum;
import java.util.Scanner;
class Mahasiswa {
    String nama, prodi, alamat, nim;
    public void tampilkanInformasi() {
        System.out.println("Nama \t: " + nama);
        System.out.println("NIM \t: " + nim);
        System.out.println("Prodi \t: " + prodi);
        System.out.println("Alamat \t: " + alamat);
    }
}
public class Soal2P1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Mahasiswa mhs = new Mahasiswa();
        System.out.print("Nama Mahasiswa: ");
        mhs.nama = keyboard.nextLine(); 
        System.out.print("Nim Mahasiswa: ");
        mhs.nim = keyboard.nextLine();
        
        System.out.print("Prodi Mahasiswa: ");
        mhs.prodi = keyboard.nextLine();
        
        System.out.print("Alamat Mahasiswa: ");
        mhs.alamat = keyboard.nextLine();
 
        System.out.println("\nData Mahasiswa yang diinputkan");
        System.out.println("================");
        mhs.tampilkanInformasi();
    }
}
