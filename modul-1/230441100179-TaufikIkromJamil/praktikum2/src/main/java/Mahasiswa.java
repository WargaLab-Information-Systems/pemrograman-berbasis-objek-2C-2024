
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TAUFIK IKROM JAMIL
 */
public class Mahasiswa {
    String nama;
    int nim;
    String prodi;
    String alamat;
    
    void datamahasiswa(){
        System.out.println("nama:" +nama);
        System.out.println("nim:" +nim);
        System.out.println("prodi:" +prodi);
        System.out.println("alamat:" +alamat);
        
    }
    
    public static void main(String[] args){ 
    Scanner identitas =new Scanner (System.in);
    
    Mahasiswa mahasiswa=new Mahasiswa();
    
    System.out.println("masukkan nama:");
    mahasiswa.nama = identitas.nextLine();
    
    System.out.println("masukkan nim:");
    mahasiswa.nim = identitas.nextInt();
    identitas.nextLine();
        
        
    System.out.println("masukkan prodi:");
    mahasiswa.prodi = identitas.nextLine();
    
    System.out.println("masukkan alamat:");
    mahasiswa.alamat  = identitas.nextLine();
    
    System.out.println("\nbiodata diri");
    mahasiswa.datamahasiswa();
    
    identitas.close();
    
    
//     System.out.println("nama:" +nama);
//     System.out.println("nim:" +nim);
//     System.out.println("prodi:" +prodi);
//     System.out.println("alamat:" +alamat);
    }
}
