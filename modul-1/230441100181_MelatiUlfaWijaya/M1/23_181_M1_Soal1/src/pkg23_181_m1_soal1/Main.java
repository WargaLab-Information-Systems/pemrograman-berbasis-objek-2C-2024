/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg23_181_m1_soal1;


 
class manusia {

    String nama;
    int umur;
    String alamat;

    void berjalan(String kota) {
        String jalan= kota;
        System.out.println(nama+ " berjalan " +jalan);
    }

    void berlari(String sungai) {
        String lari = sungai;
        System.out.println(nama+" berlari "+lari);
    }
    
}
    
/**
 *
 * @author Lenovo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //mendeklarasikan objek manusia dengan atribut nama, umur, alamat
        manusia manusia = new manusia(); //menampilkan program yg sudah di input
        manusia.nama = "Melati";
        manusia.umur = 20;
        manusia.alamat = "Nganjuk";
        
        //memanggil method berjalan dan berlari pada objek manusia
        manusia.berjalan("Kota metro");
        manusia.berlari("melintasi sungai");
        
        //print output manusia
        System.out.println("Data diri :");
        System.out.println("Nama : "+manusia.nama);
        System.out.println("Umur : "+manusia.umur);
        System.out.println("Alamat : "+manusia.alamat);
        
    }
    
}
