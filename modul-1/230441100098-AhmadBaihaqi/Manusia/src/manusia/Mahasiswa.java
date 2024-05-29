/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manusia;

import java.util.Scanner;

class Mahasiswa {
    String nama;
    int nim;
    String jurusan;
    String alamat;

    void inputInfo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan nama mahasiswa:");
        nama = scanner.nextLine();

        System.out.println("Masukkan NIM mahasiswa:");
        nim = scanner.nextLine();

        System.out.println("Masukkan jurusan/prodi mahasiswa:");
        jurusan = scanner.nextLine();

        System.out.println("Masukkan alamat mahasiswa:");
        alamat = scanner.nextLine();
    }

    void displayInfo() {
        System.out.println("\nData Mahasiswa:");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan/Prodi: " + jurusan);
        System.out.println("Alamat: " + alamat);
    }
}

public class Mahasiswa {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.inputInfo();
        mahasiswa.displayInfo();
    }
}
