/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mahasiswa;

import java.util.Scanner;

public class Mahasiswa {
    //attribute
    private String nama;
    private String nim;
    private String jurusan;
    private String alamat;
    
    public Mahasiswa(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan data Mahasiswa : ");
        System.out.print("Nama : ");
        this.nama = scanner.nextLine();
        System.out.print("NIM : ");
        this.nim = scanner.nextLine();
        System.out.print("Jurusan : ");
        this.jurusan = scanner.nextLine();
        System.out.print("Alamat : ");
        this.alamat = scanner.nextLine();
        scanner.close();
    }
    //Method untuk menampilkan informasi mahasiswa
    public void tampilkaninfo(){
        System.out.println("Nama : " + nama);
        System.out.println("Nim : " + nim);
        System.out.println("Jurusan : " + jurusan);
        System.out.println("Alamat : " + alamat);
        
    }
    
}
