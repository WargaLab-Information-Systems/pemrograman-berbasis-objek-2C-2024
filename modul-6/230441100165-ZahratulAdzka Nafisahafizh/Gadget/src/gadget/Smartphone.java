/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gadget;

public class Smartphone extends Gadget  implements bluethooth,wifi,gps,kamera {
    Smartphone(String Merk,String Model){
        super(Merk,Model);
    }

            
    void Merk() {
        System.out.println("Smartphone merek Anda adalah : ");
    }

   
    void Model() {
        System.out.println(" Model Smartphone : ");
    }
    
    
    void gadget(){
       System.out.println(" Smartphone merk "+Merk+"dengan  model"+Model);   
    }
    
    public void kirimFile() {
        System.out.println("Smartphone  Memiliki Fitur Dalam Mengirim File Yang Besar");
    }

   
    public void terimaFile() {
        System.out.println("Smartphone  Memiliki Fitur Dalam Menerima File Yang Sangat Cepat");
    }

    
    public void koneksiPerangkat() {
         System.out.println("Smartphone  Memiliki Fitur Dalam Menghubungkan Perangkat Ke Perangkat Yang lain Lumayan Cepat");
    }

    public void carijaringan() {
         System.out.println("Smartphone  Memiliki Fitur Mencari Sumber Wifi Yang Lumayan cepat");
    }

    
    public void hubungkanJaringan() {
        System.out.println("Smartphone  Memiliki Fitur Dalam Menghubungkan Jaringan Lumayan bagus");
    }
   
    
    public void lupakanJaringan() {
        System.out.println("Smartphone  Memiliki Fitur Melupakan Jaringan");
    }

    
    public void ambilKoordinat() {
        System.out.println("Smartphone bermerek  Memiliki Fitur Mencari Kordinat Yang Lumayan Akurat");
    }

    @Override
    public void ambilFoto() {
        System.out.println("Smartphone Memiliki Fitur Pengambilan Foto Yang  Bagus");
    }

    @Override
    public void rekamVideo() {
        System.out.println("Smartphone  Memiliki Fitur Pengambilan video Yang  Bagus");
    }
  }
   
    
     
    

