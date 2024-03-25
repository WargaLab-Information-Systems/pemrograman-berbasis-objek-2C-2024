/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas2;
import java.util.Scanner;
class Profile {
    String nama;
    String nim;
    String prodi;
    String alamat;
}

public class Tugas2 {


    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        Profile mhs = new Profile ();
        System.out.println("Nama : ");
        String nam = input.nextLine();
        mhs.nama = nam;
        System.out.println("Nim : ");
        String nrp = input.nextLine();
        mhs.nim = nrp;
        System.out.println("Prodi : ");
        String prd = input.next();
        mhs.prodi = prd;
        System.out.println("Alamat : ");
        String asal = input.next();
        mhs.alamat = asal;
        
        System.out.println("Nama :"+mhs.nama);
        System.out.println("Nim :"+mhs.nim);
        System.out.println("Prodi :"+mhs.prodi);
        System.out.println("Alamat :"+mhs.alamat);
    }
    
}
