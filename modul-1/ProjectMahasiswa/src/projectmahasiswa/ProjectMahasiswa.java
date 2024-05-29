package projectmahasiswa;
import java.util.Scanner;
//untuk membaca input dari pengguna

public class ProjectMahasiswa {
// mendefinisikan class projectmahasiswa
    public static void main(String[] args) {
        // method yang akan dijalankan
        System.out.println("Masukkan Data Diri : ");// menampilkan pesan ke penguna untuk memasukkan data diri
        Scanner mahasiswa = new Scanner(System.in);//membuat object scanner untuk membacamasukan dari pengguna
        String nama;// mendeklarasikan string variabel nama untuk menyimpan nama siswa
        int nim;//variabel nim untuk nyimpan nim siswa
        String prodi;
        String alamat;
        System.out.print("Masukkan nama: ");
        nama = mahasiswa.nextLine();//membaca input nama dari pengguna dan menyimpan ke variabel nama
        System.out.print("Masukkan nim: ");
        nim = mahasiswa.nextInt();
        mahasiswa.nextLine(); // Mengonsumsi newline yang tersisa setelah nextInt()
        System.out.print("Masukkan Prodi saat ini:");
        prodi = mahasiswa.nextLine();
        System.out.print("Masukkan alamat:");
        alamat = mahasiswa.nextLine();
        // menampilkan biodata
        System.out.println("Biodata anda");
        System.out.println("Nama : "+nama);
        System.out.println("NIM : "+nim);
        System.out.println("Jurusan : "+prodi);
        System.out.println("Alamat : "+alamat);
        
//        mahasiswa.close();
        //menutup object scanner pemindai yang telah dibuka untuk menghindari kebocoran sumber daya
    }
    
}
