/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul6;

public abstract class Gadget implements Kamera, bluetooth, wifi, gps{
    String merek;
    String model;
    
     public Gadget (String merek, String model){
        this.merek = merek;
        this.model = model;
    }
    
    public abstract void showInfo();
    
    @Override
    public void ambilFoto(){
        System.out.println("Mengambil Foto Dari " + merek + " " + model );
    }
    public void rekamVideo(){
        System.out.println("Merekam Video Dari " + merek + " " + model );
    }
    public void kirimFile(){
        System.out.println("Mengirim File Dari " + merek + " " + model );
    }
    public void terimaFile(){
        System.out.println("Menerima File Dari " + merek + " " + model );
    }
    public void koneksiPerangkat(){
        System.out.println("Mengkoneksikan Perangkat Dari " + merek + " " + model );
    }
    public void cariJaringan(){
        System.out.println("Mengcari Jaringan Dari " + merek + " " + model );
    }
    public void hubungkanJaringan(){
        System.out.println("Menghubungkan Jaringan Dari " + merek + " " + model );
    }
    public void lupakanJaringan(){
        System.out.println("Melupakan Jaringan Dari " + merek + " " + model );
    }
    public void ambilKordinat(){
        System.out.println("Mengambil Korfinat Dari " + merek + " " + model );
    }
}
