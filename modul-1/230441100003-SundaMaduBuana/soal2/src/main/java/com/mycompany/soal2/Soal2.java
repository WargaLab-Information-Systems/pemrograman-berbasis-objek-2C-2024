/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soal2;

/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class Soal2 {
Scanner Input = new Scanner(System.in);
        
        String nama;
        long NIM;
        String prodi;
        String alamat;
        
    void biodata(){
        System.out.println("Masukkan Nama : ");
        nama = Input.nextLine();
        System.out.println("Masukkan NIM : ");
        NIM = Input.nextLong();
        Input.nextLine();
        System.out.println("Masukkan Prodi :");
        prodi = Input.nextLine();
        System.out.println("Masukkan Alamat :");
        alamat = Input.nextLine();
    }
    void hasil(){
        System.out.println("==========================");
        System.out.println("Nama Mahasiswa : "+nama);
        System.out.println("NIM Mahasiswa : "+NIM);
        System.out.println("Prodi Mahasiswa : "+prodi);
        System.out.println("Alamat Mahasiswa : "+alamat); 
    }

    public static void main(String[] args) {
        Soal2 mhs = new Soal2();
        mhs.biodata();
        mhs.hasil();
    }
}
