/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

class Mahasiswa {
    
    String nama;
    String nim;
    String jurusan;
    String alamat;


    public void inputData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama: ");
        nama = input.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = input.nextLine();
        System.out.print("Masukkan Jurusan/Prodi: ");
        jurusan = input.nextLine();
        System.out.print("Masukkan Alamat: ");
        alamat = input.nextLine();
    }

    public void displayData() {
        System.out.println("\nData Mahasiswa:");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan/Prodi: " + jurusan);
        System.out.println("Alamat: " + alamat);
    }
}

public class PRAKTIKUM2 {
    public static void main(String[] args) {
        
        Mahasiswa mhs = new Mahasiswa();
        
        mhs.inputData();
        
        mhs.displayData();
    }
}
