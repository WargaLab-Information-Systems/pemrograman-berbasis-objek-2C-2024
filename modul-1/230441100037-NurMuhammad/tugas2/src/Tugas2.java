import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) throws Exception {
        
        Scanner inputUser = new Scanner(System.in);
        Mahasiswa mhs1 = new Mahasiswa();

        // isi data
        System.out.println("Silahkan di isi datanya");
        System.out.print("Nama : ");
        mhs1.isiNama(inputUser.nextLine());
        System.out.print("NIM : ");
        mhs1.isiNim(inputUser.nextLong());
        inputUser.nextLine();
        System.out.print("Prodi : ");
        mhs1.isiProdi(inputUser.nextLine());
        System.out.print("Alamat : ");
        mhs1.isiAlamat(inputUser.nextLine());
        
        mhs1.tampilData();
    }
}
