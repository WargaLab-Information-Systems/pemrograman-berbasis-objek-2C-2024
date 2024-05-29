package tugaspraktikummodul1no2;
import java.util.Scanner;

class biodata {
    String nama;
    String nim;
    String prodi;
    String alamat;
}
public class TugasPraktikumModul1No2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
         biodata bio = new biodata();
        System.out.print("Masukkan Nama : ");
        bio.nama = scanner.nextLine();
        System.out.print("Masukkan NIM : ");
        bio.nim = scanner.nextLine();
        System.out.print("Masukkan Prodi : ");
        bio.prodi = scanner.nextLine();
        System.out.print("Masukkan Alamat : ");
        bio.alamat = scanner.nextLine();
        
        System.out.println(" ");
        System.out.println("Berikut Data Yang Telah Diinputkan");
        System.out.println("nama = "+bio.nama);
        System.out.println("nim = "+bio.nim);
        System.out.println("prodi = "+bio.prodi);
        System.out.println("alamat = "+bio.alamat);
    }
}