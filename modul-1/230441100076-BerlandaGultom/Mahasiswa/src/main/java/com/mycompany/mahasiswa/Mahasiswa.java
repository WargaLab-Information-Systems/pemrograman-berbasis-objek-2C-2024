/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mahasiswa;
import java.util.Scanner;//membaca inputan user

/**
 *
 * @author Moriya
 */
public class Mahasiswa {
//method yang akan dijalankan
    public static void main(String[] args) {
        System.out.println("Masukkan Data Anda");
        Scanner a = new Scanner(System.in);
        String nama;
        int nim;
        String jurusan;
        String alamat;
        System.out.println("Masukkan nama :");
        nama = a.nextLine();
        System.out.println("Masukkan nim :");
        nim = a.nextInt();
        a.nextLine();
        System.out.println("Masukkan prodi/jurusan :");
        jurusan = a.nextLine();
        System.out.println("Masukkan alamat :");
        alamat = a.nextLine();
        
        System.out.println("Data Diri");
        System.out.println("Nama     :"+nama);
        System.out.println("NIM      :"+nim);
        System.out.println("Jurusan  :"+jurusan);
        System.out.println("Alamat   :"+alamat);
        
    }   
}
