
package com.mycompany.main2;
import java.util.Scanner;

class data{
    String nama;
    String prodi;
    String alamat;
    int nim;
}

public class Main2 {     
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        data Data =new data();
        System.out.print("Masukkan Nama : ");
        Data.nama = scanner.nextLine();
        System.out.print("Masukkan Prodi : ");
        Data.prodi = scanner.nextLine();
        System.out.print("Masukkan Alamat : ");
        Data.alamat = scanner.nextLine();
        System.out.print("Masukkan NIM : ");
        Data.nim = scanner.nextInt();
        
        System.out.println(" ");
        System.out.println("Hasil Akhir :");
        System.out.println("nama : "+Data.nama);
        System.out.println("Prodi : "+Data.prodi);
        System.out.println("Alamat : "+Data.alamat);
        System.out.println("NIM : "+Data.nim);
    
    }

       
 }


