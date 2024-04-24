package mahasiswa;

//class scanner digunakan untuk membaca input dari pengguna
import java.util.Scanner;
class mahasiswa {
    String nama, nim, Jurusan, Alamat;
}

class BiodataMahasiswa{
    public static void main(String args[]){
        //digunakan untuk membuat sebuah object dari kelas scanner
        Scanner input = new Scanner(System.in);
        System.out.println("## PROGRAM JAVA BIODATA MAHASISWA ##");
        System.out.println("====================================");
        System.out.println();
        
        mahasiswa mhs = new mahasiswa ();
       
       
        System.out.print("Nama Mahasiswa : ");
        mhs.nama = input.nextLine();

        System.out.print("NIM : ");
        mhs.nim = input.nextLine();

        System.out.print("Jurusan/Prodi : ");
        mhs.Jurusan = input.nextLine();
        
        System.out.print("Alamat : ");
        mhs.Alamat = input.nextLine();

        System.out.println();
        
        System.out.println("# Data Mahasiswa #");
        System.out.println("==================");
        System.out.println("Nama Mahasiswa: " + mhs.nama);
        System.out.println("NIM : " + mhs.nim);
        System.out.println("Jurusan/Prodi : " + mhs.Jurusan);
        System.out.println("Alamat: " + mhs.Alamat);
        
    }
}
