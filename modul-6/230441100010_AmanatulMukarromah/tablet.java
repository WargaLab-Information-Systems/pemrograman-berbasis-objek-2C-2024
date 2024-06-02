/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elektronik;

public class tablet  extends gadget {
    public tablet (String Merk, String Model) {
        super(Merk, Model);
    }
    @Override
    public void Display() {
        System.out.println("\nElektronik tablet");
        System.out.println("Merk    : " + Merk);
        System.out.println("Model   : " + Model);
    }  
    //kamera
    @Override
    public void ambilFoto(){
        System.out.println("tablet " + Merk + " dengan model" + Model + " bisa Mengambil Foto");
    }
    @Override
    public void rekamVideo(){
        System.out.println("tablet " + Merk + " dengan model" + Model + " bisa Merekam Video");
    }
    @Override
    public void kirimFile(){
        System.out.println("tablet " + Merk + " dengan model" + Model + " bisa Mengirim File");
    }
    //bluetoth
    @Override
    public void terimaFile(){
        System.out.println("tablet " + Merk + " dengan model" + Model + " bisa Menerima File");
    }
    @Override
    public void konekPerangkat(){
        System.out.println("tablet " + Merk + " dengan model" + Model + " bisa Mengkoneksikan Perangkat");
    }
    //wifi
    @Override
    public void carijaringan(){
        System.out.println("tablet " + Merk + " dengan model" + Model + " bisa Mencari Jaringan");
    }
    @Override
    public void hubungkanjaringan(){
        System.out.println("tablet " + Merk + " dengan model" + Model + " bisa Menghubungkan Jaringan");
    }  
    @Override
    public void lupakanjaringan(){
        System.out.println("tablet " + Merk + " dengan model" + Model + " bisa Melupakan Jaringan");
    }
    //gps
    @Override
    public void ambilKoordinat(){
        System.out.println("tablet " + Merk + " dengan model" + Model + " bisa Mengambil Koordinat");
    }
    

}
