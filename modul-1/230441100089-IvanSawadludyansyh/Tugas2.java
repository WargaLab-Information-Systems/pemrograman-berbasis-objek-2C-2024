/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum1;

import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Masukkan Nama : ");
        String nama = input.next();
        System.out.println("Masukkan NIM : ");
        String nim = input.next();
        System.out.println("Masukkan Prodi : ");
        String prodi = input.next();
        System.out.println("Masukkan Alamat : ");
        String alamat = input.next();
        

        System.out.println("NAMA : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("PRODI : " + prodi);
        System.out.println("ALAMAT : " + alamat);
    }
}