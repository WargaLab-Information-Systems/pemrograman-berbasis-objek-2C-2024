/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elektronik;

public class laptop extends gadget {
    public laptop(String Merk, String Model) {
        super(Merk, Model);
        
    }
    @Override
    public void Display() {
        System.out.println("\nElektronik laptop");
        System.out.println("Merk    : " + Merk);
        System.out.println("Model   : " + Model);
    }
    //kamera
    @Override
    public void ambilFoto(){
        System.out.println("laptop " + Merk + " dengan model " + Model + " memiliki fitur camera yang jelas");
    }
    @Override
    public void rekamVideo(){
        System.out.println("laptop " + Merk + " dengan model " + Model + " mampu Merekam Video hingga 2jam lebih");
    }
    //bluetooth
    @Override
    public void kirimFile(){
        System.out.println("laptop " + Merk + " dengan model " + Model + " bisa Mengirim File dalam jumlah banyak");
    }
    @Override
    public void terimaFile(){
        System.out.println("laptop " + Merk + " dengan model " + Model + " bisa Menerima File dalam jumlah banyak");
    }
    @Override
    public void konekPerangkat(){
        System.out.println("laptop " + Merk + " dengan model" + Model + " bisa Mengkoneksikan Perangkat apa saja");
    }
    //wifi
    @Override
    public void carijaringan(){
        System.out.println("laptop " + Merk + " dengan model " + Model + " bisa Mencari Jaringan dengan lancar");
    }
    @Override
    public void hubungkanjaringan(){
        System.out.println("laptop " + Merk + " dengan model " + Model + " bisa Menghubungkan Jaringan ke bebarapa perangkat");
    }
    @Override
    public void lupakanjaringan(){
        System.out.println("laptop " + Merk + " dengan mode l" + Model + " bisa Melupakan Jaringan");
    }
    //gps
    @Override
    public void ambilKoordinat(){
        System.out.println("laptop " + Merk + " dengan model " + Model + " Mengambil Koordinat yang akurat");
    }
}

