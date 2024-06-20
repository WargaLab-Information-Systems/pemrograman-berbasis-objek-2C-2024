/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mahasiswa;
//imporrt untuk mengakses modul(snanner)
import java.util.Scanner;

public class Mahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //menyimpan inputan didalam objek baru (sc) dengan system in untuk menginputnya 
        Scanner sc = new Scanner (System.in);
        String nama,prodi,alamat;
        long nim;
        
        
        //menampilkan nama yg mau diinputkan
        System.out.print("masukan nama :");
        nama= sc.nextLine();
        
         //menampilkan nim yg mau diinputkan      
        System.out.print("Masukan Nim  :");
        nim= sc.nextLong();
        sc.nextLine();
        
        
         //menampilkan prodi yg mau diinputkan   
        System.out.print("Masukan Prodi  :");
        prodi= sc.nextLine();
        
        
        //menampilkan alamat yg mau diinputkan
        System.out.print("Masukan Alamat :");
        alamat= sc.nextLine();
        
        
        System.out.println("BIODATA");
        System.out.println("Nama   :"+nama);
        System.out.println("NIM    :"+nim);
        System.out.println("prodi  :"+prodi);
        System.out.println("Alamat  :"+alamat);  
    }
    
}
