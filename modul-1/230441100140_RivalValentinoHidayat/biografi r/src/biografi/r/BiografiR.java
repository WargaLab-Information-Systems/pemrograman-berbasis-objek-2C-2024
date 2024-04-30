/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biografi.r;

class biografi{
    String nama;
    String asal;
    String alamat;
    String sekolah;
    

        
}


/**
 *
 * @author LENOVO
 */
public class BiografiR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        biografi saya = new biografi();
        saya.nama ="Rival Valentino Hidayat";
        saya.asal="madura";
        saya.alamat="jrengik";
        saya.sekolah="smp 1torjun";
        System.out.println("halo nama saya"+saya.nama+"saya dari"+saya.alamat+"saya alamat"+saya.asal+"asal saya");
                
    }
    
}
