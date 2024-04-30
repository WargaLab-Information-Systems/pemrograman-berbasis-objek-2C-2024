/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumpbo;

/**
 *
 * @author IBUCOMP
 */
import java.util.Scanner;

class mahasiswa {
    String nama;
    long nim;
    String prodi;
    String alamat;
    
    public mahasiswa(String nama, long nim, String prodi, String alamat){
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.alamat = alamat;
    }
    
    public void profil(){
        System.out.println("Nama            : " +nama);
        System.out.println("NIM             : " +nim);
        System.out.println("Jurusan/Prodi   : " +prodi);
        System.out.println("Alamat          : " +alamat);
    }
}
public class main{   
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan Nama           : ");
        String nama = input.nextLine();
        
        System.out.println("Masukkan NIM            : ");
        long nim = input.nextLong();
        input.nextLine();
        
        System.out.println("Masukkan Jurusan/Prodi  : ");
        String prodi = input.nextLine();
        
        System.out.println("Masukkan Alamat         : ");
        String alamat = input.nextLine();
        
        mahasiswa mahasiswa1 = new mahasiswa(nama, nim, prodi, alamat);
        System.out.println("\n == Profil Mahasiswa ==");
        mahasiswa1.profil();
        
        input.close();
    }
}
