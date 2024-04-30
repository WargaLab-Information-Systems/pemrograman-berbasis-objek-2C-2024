soal1
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pbo_praktikum1;
class manusia {
    String nama;
    int umur;
    String alamatku;
    
    public void berlari() {
        System.out.println( nama + " sedang berlari" );
    }
    
    public void berjalan() {
        System.out.println( nama + " sedang berlari" );
    }
}

public class PBO_Praktikum1 {
    public static void main(String[] args) {
        manusia orang = new manusia();
        orang.nama = "Hamdi";
        orang.umur = 19;
        orang.alamatku = "jalan Kartini";
        
        // Menampilkan data orang
        System.out.println("Nama: " + orang.nama);
        System.out.println("Umur: " + orang.umur);
        System.out.println("Alamat: " + orang.alamatku);
        orang.berjalan();
    }
}

soal 2
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pbo_praktikum1;

import java.util.Scanner;
import java.math.BigInteger;

class Mahasiswa {
    String nama;
    BigInteger nim;
    String jurusan;
    String alamat;
}

public class PBO_Praktikum2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mahasiswa orang1 = new Mahasiswa();
        
        // Meminta pengguna memasukkan data
        System.out.print("Masukkan nama : ");
        orang1.nama = scanner.nextLine();
        System.out.print("Masukkan nim : ");
        orang1.nim = new BigInteger(scanner.nextLine());
        System.out.print("Masukkan jurusan: ");
        orang1.jurusan = scanner.nextLine();
        System.out.print("Masukkan alamat : ");
        orang1.alamat = scanner.nextLine();
        
        // Menampilkan data mahasiswa yang dimasukkan
        System.out.println("\nData Mahasiswa:");
        System.out.println("Nama: " + orang1.nama);
        System.out.println("NIM: " + orang1.nim);
        System.out.println("Jurusan: " + orang1.jurusan);
        System.out.println("Alamat: " + orang1.alamat);
    }
}
