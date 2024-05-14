/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg23_181_m1_soal2;
import java.util.Scanner;
//untuk membaca input e user



public class Main {
    String nama,prodi,alamat;
    int nim,smt;
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("^^^Inputkan Data Diri Mahasiswa^^^");
        //ouput untuk user memasukkan data
        Scanner input = new java.util.Scanner(System.in);
            Main mhs = new Main();
                mhs.nama="Melati";
                mhs.nim=181;
                mhs.prodi="SI";
                mhs.smt=1;
                mhs.alamat="Nganjuk";
                
        //objek scanner mhs, gunanya untuk membaca inputan dari user
         
        System.out.print("Masukkan nama mahasiswa : ");
//        String nama;
        mhs.nama = input.nextLine();
        
        System.out.print("Ketikkan NIM dengan benar : ");
//        int nim;
        mhs.nim = input.nextInt();
        
        input.nextLine(); // Mengonsumsi newline yang tersisa setelah nextInt()
        
        System.out.print("Prodi Mahasiswa : ");
//        String prodi;
        mhs.prodi = input.nextLine();
        
        
        System.out.print("Mahasiswa Semester : ");
//        int smt ;
        mhs.smt = input.nextInt();
        
        input.nextLine(); // Mengonsumsi newline yang tersisa setelah nextInt()
        
        System.out.print("Alamat Mahasiswa dengan lengkap : ");
//        String alamat;
        mhs.alamat = input.nextLine();
    
        //buat menyimpan mulai dari variabel nama, nim, jurusan, dan alamat
        //nexLine buat masukkan tipe data string dan menyimpan ke variabel nama, jurusan, dan alamat
        //nextInt buat masukkan tipe data int dan menyimpan ke variabel nim
        
        //menampilkan Data Mahasiswa
        System.out.println("***Data Mahasiswa Terbaru 2024****");
        System.out.println("Nama Mahasiswa : "+mhs.nama);
        System.out.println("NIM : "+mhs.nim);
        System.out.println("Program Studi : "+mhs.prodi);
        System.out.println("Semester : "+mhs.smt);
        System.out.println("Alamat lengkap : "+mhs.alamat);
    }
    
}
