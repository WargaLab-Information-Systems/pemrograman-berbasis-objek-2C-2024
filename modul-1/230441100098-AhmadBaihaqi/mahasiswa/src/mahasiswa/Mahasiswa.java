/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mahasiswa;

import java.util.Scanner;

public class Mahasiswa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan nama mahasiswa:");
        String nama = "";
        nama = scanner.nextLine();

        System.out.println("Masukkan NIM mahasiswa:");
        int nim;
        nim = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Masukkan jurusan/prodi mahasiswa:");
        String jurusan = "";
        jurusan = scanner.nextLine();

        System.out.println("Masukkan alamat mahasiswa:");
        String alamat = "";
        alamat = scanner.nextLine();
        
        System.out.println("\nData Mahasiswa:");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan/Prodi: " + jurusan);
        System.out.println("Alamat: " + alamat);
    }
    
}
