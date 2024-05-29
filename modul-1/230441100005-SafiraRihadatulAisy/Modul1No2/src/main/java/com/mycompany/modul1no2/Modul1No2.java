package com.mycompany.modul1no2;
import java.util.Scanner;
public class Modul1No2 {
    int nim;
    String nama,prodi,alamat,fakultas;
    Scanner input = new Scanner(System.in);
    
    
    void biodata(){
        System.out.println("Nama mahasiswa:");
        nama = input.nextLine();
        System.out.println("Nim mahasiswa:");
        nim = input.nextInt();
        input.nextLine();
        System.out.println("Fakultas mahasiswa:");
        fakultas = input.nextLine();
        System.out.println("Prodi mahasiswa:");
        prodi = input.nextLine();
        System.out.println("Alamat mahasiswa:");
        alamat = input.nextLine();
    }
    void hasil(){
        System.out.println("-----------------------------");
        System.out.println("Nama mahasiswa: " + nama);
        System.out.println("Nim mahasiswa: " + nim);
        System.out.println("Fakultas mahasiswa: " + fakultas);
        System.out.println("Prodi mahasiswa: " + prodi);
        System.out.println("Alamat mahasiswa: " + alamat);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Modul1No2 mahasiswa = new Modul1No2();
        mahasiswa.biodata();
        mahasiswa.hasil();
    } 

    private void nextLine() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}