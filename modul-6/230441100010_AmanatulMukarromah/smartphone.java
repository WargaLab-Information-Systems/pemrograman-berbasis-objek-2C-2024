/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elektronik;

public class smartphone extends gadget {
    public smartphone(String Merk, String Model) {
        super(Merk, Model);
    }
    //kamera
    @Override
    public void ambilFoto(){
       System.out.println("smartphone " + Merk + " dengan model " + Model + " memiliki fitur kamera dengan hasil Foto yang jernih ");
    }
    @Override
    public void rekamVideo(){
        System.out.println("smartphone " + Merk + " dengan model " + Model + " dapat Merekam Video tnpa retak");
    }
    //bluetooth
    @Override
    public void kirimFile(){
        System.out.println("smartphone " + Merk + " dengan model " + Model + " dapat Mengirim File");
    }
    @Override
    public void terimaFile(){
        System.out.println("smartphone " + Merk + " dengan model " + Model + " dapat Menerima File");
    }
    @Override
    public void konekPerangkat(){
        System.out.println("smartphone " + Merk + " dengan model " + Model + " Mengkoneksikan Perangkat");
    }
    //wifi
    @Override
    public void carijaringan(){
        System.out.println("smartphone " + Merk + " dengan model "  + Model + " Mencari Jaringan");
    }
    @Override
    public void hubungkanjaringan(){
        System.out.println("smartphone " + Merk + " dengan model "  + Model + " Menghubungkan Jaringan ke perangkat lain");
    }
    @Override
    public void lupakanjaringan(){
        System.out.println("smartphone " + Merk + " dengan model "  + Model + " memutus Jaringan");
    }
    //gps
    @Override
    public void ambilKoordinat(){
        System.out.println("smartphone " + Merk + " dengan model "  + Model + " Mengambil Koordinat lumayan akurat");
    }
    @Override
    public void Display() {
        System.out.println("\nElektronik Smartphone");
        System.out.println("Merk    : " + Merk);
        System.out.println("Model   : " + Model);
    }

    
   
}
