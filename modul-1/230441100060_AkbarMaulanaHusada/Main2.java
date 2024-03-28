/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PBOTugas1;
import java.util.Scanner;


/**
 *
 * @author Lenovo
 */

    class Mahasiswa {
    // Atribut
     String nama;
     int nim;
     String jurusan;
     String alamat;

    public Mahasiswa(String namasaya, String jurusan, String alamat, int nim) {
        nama = namasaya;
        this.nim = nim;
        this.jurusan = jurusan;
        this.alamat = alamat;
    }

    public void tampilkanData() {
        System.out.println();
        System.out.print("\\");
        System.out.println("\\========== DATA MAHASISWA ==========//");
        System.out.println("Nama         : " + nama);
        System.out.println("Jurusan/Prodi: " + jurusan);
        System.out.println("Alamat       : " + alamat);
        System.out.println("NIM          : " + nim);
        System.out.print("//====================================\\");
        System.out.print("\\");
    }
}


public class Main2 {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("\\");
            System.out.println("\\======= INPUT DATA MAHASISWA =======//");
            System.out.print("Nama Mahasiswa         : ");
            String nama = scanner.nextLine();
            System.out.print("Jurusan/Prodi Mahasiswa: ");
            String jurusan = scanner.nextLine();
            System.out.print("Alamat Mahasiswa       : ");
            String alamat = scanner.nextLine();
            System.out.print("NIM Mahasiswa          : ");
            scanner.nextLine();
            int nim = scanner.nextInt();

            Mahasiswa mahasiswa = new Mahasiswa(nama, jurusan, alamat, nim);

            mahasiswa.tampilkanData();
        }
    }
}
    
    

