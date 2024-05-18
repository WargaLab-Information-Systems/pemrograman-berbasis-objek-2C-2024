/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugass1;
class manusia {
    String nama;
    int umur;
    String alamat;
    
    void berjalan() {
        
        System.out.println(nama +" sedang berjalan.");
        
    }

    void berlari() {
        System.out.println(nama +" sedang berlari.");
    }
}
public class Tugas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        manusia orang1 = new manusia();
        orang1.nama = "amalia";
        orang1.umur = 19;
        orang1.alamat = "lamongan";
        
        System.out.println( "Namaku adalah : "+orang1.nama);
        
        System.out.println( "umurku saat ini : "+orang1.umur +" tahun");
        System.out.println( "alamat ku : "+orang1.alamat);
        orang1.berjalan();
        orang1.berlari();
    }
    
}
