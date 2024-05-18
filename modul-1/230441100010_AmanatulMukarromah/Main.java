/*andi
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datamahasiswa;
import java.util.Scanner; // mengimpor kelas Scanner untuk membaca input dari berbagai sumber
public class Main { // ekseskuisi untuk memanggil class manusia yg telah didefisikan
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan Nama Mahasiswa: ");
        String nama = input.nextLine(); //nextline untuk membaca input teks yang dimasukkan oleh pengguna
        System.out.print("Masukkan NIM Mahasiswa: ");
        String nim = input.nextLine();
        System.out.print("Masukkan Jurusan/Prodi Mahasiswa: ");
        String jurusan = input.nextLine();
        System.out.print("Masukkan Alamat Mahasiswa: ");
        String alamat = input.nextLine();

        // Membuat objek Mahasiswa
        Datamahasiswa mahasiswa = new Datamahasiswa(nama, nim, jurusan, alamat);

        // Menampilkan informasi mahasiswa
        System.out.println("\nData Mahasiswa:");
        mahasiswa.Info();
    }
    
}
