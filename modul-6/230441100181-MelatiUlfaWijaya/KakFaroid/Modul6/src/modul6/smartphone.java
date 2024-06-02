/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul6;

/**
 *
 * @author Lenovo
 */
public class smartphone extends gadgett {
    public smartphone(String merk, String model){
        super(merk,model);
    }


    @Override
    public void tampilkanSpek() {
     System.out.println("merk : "+getMerk());
        System.out.println("model : "+getModel());
        System.out.println("Fitur - fitur smartphone : ");
//        System.out.println("=> kamera");
//        System.out.println("=> blutot");
//        System.out.println("=> wifi");
//        System.out.println("=> gpa");  
          ambilFoto();
          rekamVideo();
          kirimFile();
          terimaFile();
          koneksiPerangkat();
          carijaringan();
          hubungkanJaringan();
          lupakanJaringan();
          ambilKoordinat();
        
    }

    @Override
    public void ambilFoto() {
        System.out.println("gunakan kamera smartphone untuk mengambil foto");   
    }

    @Override
    public void rekamVideo() {
        System.out.println("video di rekam menggunkan kamera smartphone ");
    }

    @Override
    public void kirimFile() {
        System.out.println("bluetooth smartphoen digunakan untuk mengkirim file");
    }

    @Override
    public void terimaFile() {
        System.out.println("bluetooth smartphone untuk menerima file");
    }

    @Override
    public void koneksiPerangkat() {
       System.out.println("sambungkan bluetooth antar perangkat ");
    }


    @Override
    public void carijaringan() {
       System.out.println("cari sinyal wifi di smartphone");
    }
    
    @Override
    public void hubungkanJaringan() {
        System.out.println("wifi smartphone di hungakan ke jaringan wifi");   
    }

    @Override
    public void lupakanJaringan() {
        System.out.println("lupakan jaringan pada wifi smartphone");
    }

    @Override
    public void ambilKoordinat() {
         System.out.println("sesuaikan ttik koordinat gps smartphoen"); 
    }
}
