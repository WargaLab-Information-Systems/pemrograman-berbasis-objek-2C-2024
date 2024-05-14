/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mahasiswa;

/**
 *
 * @author HP
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Masukkan Nama Mahasiswa:");
        String nama = scanner.nextLine();

        System.out.println("Masukkan NIM Mahasiswa:");
        String nim = scanner.nextLine();

        System.out.println("Masukkan Jurusan/Prodi Mahasiswa:");
        String jurusan = scanner.nextLine();

        System.out.println("Masukkan Alamat Mahasiswa:");
        String alamat = scanner.nextLine();


        Mahasiswa mahasiswa = new Mahasiswa(nama, nim, jurusan, alamat);

 
        System.out.println("\nInformasi Mahasiswa:");
        mahasiswa.Biodata();

        scanner.close();
    }
}

