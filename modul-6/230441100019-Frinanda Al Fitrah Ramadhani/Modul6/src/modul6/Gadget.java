/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul6;

/**
 *
 * @author EBC KOMPUTER
 */
public abstract class Gadget implements Kamera, Bluetooth, WIFI, GPS{
    String Merk;
    String Model;
    String status = "Aktif";
    
    public Gadget(String Merk, String Model){
        this.Merk = Merk;
        this.Model = Model;
    }
    
    public abstract void display();
    
    @Override
    public void ambilFoto(){
        System.out.println("Pengambilan Foto        : "+status+ " "+Merk);
    }
    @Override
    public void rekamVideo(){
        System.out.println("Perekaman Video         : "+status);
    }
    @Override
    public void kirimFile(){
        System.out.println("Pengiriman File         : "+status);
    }
    @Override
    public void terimaFile(){
        System.out.println("Penerimaan File         : "+status);
    }
    @Override
    public void koneksiPerangkat(){
        System.out.println("Pengkoneksian Perangkat : "+status);
    }
    @Override
    public void cariJaringan(){
        System.out.println("Pencarian Jaringan      : "+status);
    }
    @Override
    public void hubungkanJaringan(){
        System.out.println("Penghubungan Jaringan   : "+status);
    }
    @Override
    public void lupakanJaringan(){
        System.out.println("Melupakan Jaringan      : "+status);
    }
    @Override
    public void ambilKoordinat(){
        System.out.println("Pengambilan Koordinat   : "+status);
    }
}
