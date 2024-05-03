/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package tugass2;
import java.util.Scanner; 
class Tugass2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long nim;
        Scanner mahasiswa = new Scanner(System.in);
    
        System.out.print("Masukkan nama mahasiswa: ");
        String nama = mahasiswa.nextLine();
        
        System.out.print("Masukkan NIM mahasiswa: ");
        nim = mahasiswa.nextLong();
        mahasiswa.nextLine();
        
        System.out.print("Masukkan jurusan/prodi mahasiswa: ");
        String jurusan = mahasiswa.nextLine();

        System.out.print("Masukkan alamat mahasiswa: ");
        String alamat = mahasiswa.nextLine();
        
        
        System.out.print(" ");
        // Menampilkan informasi mahasiswa
        System.out.println("\nInformasi Mahasiswa:");
        System.out.println( "Nama : "+nama);
        System.out.println( "Nim : "+nim);
        System.out.println( "Jurusan : "+jurusan);
        System.out.println( "Alamat : "+alamat);
    }   
}
