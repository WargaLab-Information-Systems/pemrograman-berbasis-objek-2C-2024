/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikumno1;

class manusia{
    String nama;
    String umur;
    String alamat;
    
    void bergerak() {
        System.out.println( nama + " " + "berjalan");
    }
    
    void berlari() {
        System.out.println( nama + " " + "berlari");
    }
}
public class PraktikumNo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        manusia mans = new manusia ();
        mans.nama = " Azli";
        mans.umur = "19 Tahun";
        mans.alamat = "Sidayu-Gresik";
                
        
        System.out.println("Nama saya :"+mans.nama);
        System.out.println("saya berumur :"+mans.umur);
        System.out.println("Alamat saya di :"+mans.alamat);
        System.out.println("Saat ini Azli sedang :");
        mans.bergerak();
        mans.berlari( );
    }
    
}
