
package modul1_no2;

import java.util.Scanner;

class Mahasiswa {
    // Atribut
    String nama;
    int nim;
    String jurusan;
    String alamat;

   
    public void input() {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Nama : ");
        nama = input.nextLine();
        
        System.out.print("Masukkan NIM : ");
        nim = Integer.parseInt(input.nextLine());
        
        System.out.print("Masukkan Jurusan/Prodi : ");
        jurusan = input.nextLine();
        
        System.out.print("Masukkan Alamat : ");
        alamat = input.nextLine();
    }
    
    public void print() {
        System.out.println("\nData Mahasiswa:");
        System.out.println("Nama: " +nama);
        System.out.println("NIM: " +nim);
        System.out.println("Jurusan/Prodi: " +jurusan);
        System.out.println("Alamat: " +alamat);
    }
}

public class Modul1_no2 {

    
    public static void main(String[] args) {
       
         Mahasiswa mahasiswa = new Mahasiswa();
        
       
        mahasiswa.input();
        
        
        mahasiswa.print();
        
    }
}
    

