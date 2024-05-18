
package Modul1;

import java.util.Scanner;

public class tugasNo2 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner (System.in);
        
        String Nama;
        String NIM;
        String Jurusan;
        String Alamat;
        
        System.out.println();
        System.out.println("------------------------------");
        System.out.println(" SILAHKAN MASUKKAN DATA DIRI");
        System.out.println("------------------------------");
        
        System.out.println("Nama       : ");
        Nama = scan.nextLine();
        
        System.out.println("NIM       : ");
        NIM = scan.nextLine();
        
        System.out.println("Jurusan/Prodi : ");
        Jurusan = scan.nextLine();
        
        System.out.println("Alamat     : ");
        Alamat = scan.nextLine();
        
        System.out.println();
        System.out.println("--------------------------------------------");
        System.out.println("                 DATA MAHASISWA          ");
        System.out.println("--------------------------------------------");
        System.out.println("1. NAMA MAHASISWA    : " + Nama);
        System.out.println("2. NIM               : " + NIM);
        System.out.println("3. JURUSAN/PRODI     : " + Jurusan);
        System.out.println("4. ALAMAT            : " + Alamat);
        
    }
    
}
