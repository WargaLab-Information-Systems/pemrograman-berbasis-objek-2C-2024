package oop;
import java.util.Scanner;

public class OOP {
    String nama ;
    int nim;
    String prodi;
    String alamat;
    
    OOP (String nama,int nim, String prodi,String alamat){
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.alamat = alamat;
    }
    void display(){
        System.out.println("NAMA :"+nama);
        System.out.println("NIM :"+nim);
        System.out.println("PRODI :"+prodi);
        System.out.println("ALAMAT :"+alamat);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan Nama : ");
        String nama = scanner.nextLine();
        
        
        System.out.println("Masukkan Prodi : ");
        String prodi = scanner.nextLine();
        
        System.out.println("Masukkan Alamat : ");
        String alamat = scanner.nextLine();
        
        System.out.println("Masukkan Nim : ");
       int nim = scanner.nextInt();
        
     OOP mhs = new OOP(nama, nim, prodi, alamat);
     mhs.display();
    }    
}
