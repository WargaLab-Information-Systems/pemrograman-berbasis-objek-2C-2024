/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.pkg1;

class manusia {
    String nama;
    String umur;
    String alamat;
}


/**
 *
 * @author User
 */
public class TUGAS1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        manusia manusia1 = new manusia ();
        manusia1.nama = "Nurul Hasanah";
        manusia1.umur = "19 Tahun";
        manusia1.alamat = "Jl. Kh. Ach Marzuki, Bangkalan";
        System.out.println("Nama \t:" +manusia1.nama);
        System.out.println("Umur \t:" +manusia1.umur);
        System.out.println("Alamat \t:" +manusia1.alamat);
        System.out.println("Saya sedang berjalan lalu berlari");
        
    }
    
}
