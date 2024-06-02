/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gadget;

public class Tablet extends Gadget  implements  bluethooth,wifi,gps,kamera {
    Tablet(String Merk,String Model){
        super(Merk,Model);
    }

            
    void Merk() {
        System.out.println("tablet merek Anda adalah : ");
    }

   
    void Model() {
        System.out.println(" Model tablet : ");
    }
    
    
    @Override
    void gadget(){
       System.out.println(" tablet merk "+Merk+"dengan  model"+Model);   
    }

    
    @Override
    public void kirimFile() {
        System.out.println("tablet  Memiliki Fitur Dalam Mengirim File Yang Besar");
    }

   
    @Override
    public void terimaFile() {
        System.out.println("tablet  Memiliki Fitur Dalam Menerima File Yang Sangat Cepat");
    }

    
    @Override
    public void koneksiPerangkat() {
         System.out.println("tablet  Memiliki Fitur Dalam Menghubungkan Perangkat Ke Perangkat Yang lain Lumayan Cepat");
    }

    @Override
    public void carijaringan() {
         System.out.println("tablet  Memiliki Fitur Mencari Sumber Wifi Yang Lumayan cepat");
    }

    
    @Override
    public void hubungkanJaringan() {
        System.out.println("tablet  Memiliki Fitur Dalam Menghubungkan Jaringan Lumayan bagus");
    }
   
    
    @Override
    public void lupakanJaringan() {
        System.out.println("tablet  Memiliki Fitur Melupakan Jaringan");
    }

    
    @Override
    public void ambilKoordinat() {
        System.out.println("tablet bermerek  Memiliki Fitur Mencari Kordinat Yang Lumayan Akurat");
    }

    @Override
    public void ambilFoto() {
        System.out.println("tablet Memiliki Fitur Pengambilan Foto Yang  Bagus");
    }

    @Override
    public void rekamVideo() {
        System.out.println("tablet  Memiliki Fitur Pengambilan video Yang  Bagus");
    }
    }
     
    

