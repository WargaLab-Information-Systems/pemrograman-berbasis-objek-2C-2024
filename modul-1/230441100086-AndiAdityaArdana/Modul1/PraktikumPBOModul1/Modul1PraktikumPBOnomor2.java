/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul1.praktikumpbo.nomor1;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Modul1PraktikumPBOnomor2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);
        System.out.println("## PROGRAM JAVA BIODATA MAHASISWA ##");
        System.out.println("====================================");
        System.out.println();

        String nama, nim, Jurusan, Alamat;
        System.out.print("Nama Mahasiswa : ");
        nama = input.nextLine();

        System.out.print("NIM : ");
        nim = input.nextLine();

        System.out.print("Jurusan/Prodi : ");
        Jurusan = input.nextLine();
        System.out.print("Alamat : ");
        Alamat = input.nextLine();

        System.out.println();

        System.out.println("# Data Mahasiswa #");
        System.out.println("==================");
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Jurusan/Prodi : " + Jurusan);
        System.out.println("Alamat: " + Alamat);
        
    }
}
        // TODO code application logic here
    
    

