/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mahasiswa;
//scanner untuk membaca inputan
import java.util.Scanner;

/**
 *
 * @author SMK_BIM
 */
public class Mahasiswa {
    String nama,nim,prodi,alamat;
 
    public static void main(String[] args){
//membuat object baru
        Scanner sc = new Scanner(System.in);
        Mahasiswa mhs = new Mahasiswa();
       
         
          
        
//mengakses informasi atribut
        System.out.print("Masukkan Nama = ");
        mhs.nama= sc.nextLine(); 
        System.out.print("Masukkan Nim = ");
        mhs.nim= sc.nextLine();
        System.out.print("Masukkan Prodi = ");
        mhs.prodi= sc.nextLine(); 
        System.out.print("Masukkan Alamat= ");
        mhs.alamat= sc.nextLine(); 


        System.out.println("Nama Anda= " + mhs.nama);
        System.out.println("NIM Anda= " + mhs.nim);
        System.out.println("Prodi Anda= " +mhs. prodi);
        System.out.println("Alamat Anda= " +mhs. alamat);
     }
}