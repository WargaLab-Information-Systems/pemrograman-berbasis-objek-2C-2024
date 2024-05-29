package inputpengguna;
import java.util.Scanner;
    class Mahasiswa{
        String nama;
        String prodi;
        String alamat;
        int nim;
    } 
public class Inputpengguna {
    public static void main(String[] args) {
       Mahasiswa mhs = new Mahasiswa();
       Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan Nama : ");
        mhs.nama =scanner.nextLine();
        System.out.println("Masukkan Prodi : ");
        mhs.prodi = scanner.nextLine();
        System.out.println("Masukkan Alamat : ");
        mhs.alamat = scanner.nextLine();
        System.out.println("Masukkan NIM : ");
        mhs.nim = scanner.nextInt();
            
        System.out.println("Nama: "+mhs.nama);
        System.out.println("NIM: "+mhs.nim);
        System.out.println("Prodi: "+mhs.prodi );
        System.out.println("Alamat: "+mhs.alamat);

    }
    
}
