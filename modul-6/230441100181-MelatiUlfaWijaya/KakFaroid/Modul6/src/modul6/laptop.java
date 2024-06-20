/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul6;

public class laptop extends gadgett{
    public laptop(String merk, String model){
        super(merk, model);
    }

    @Override
    public void tampilkanSpek() {
        System.out.println("Spesifikasi laptop : ");
        System.out.println("merk : "+ getMerk());
        System.out.println("model : "+ getModel());
        System.out.println("Fitur - fitur laptop : ");
        carijaringan();
        hubungkanJaringan();
        lupakanJaringan();
        ambilKoordinat();
    }
        
    @Override
    public void carijaringan() {
        System.out.println("gunakan fitur cari wifi untuk mengakses internet");
    }

    @Override
    public void hubungkanJaringan() {
        System.out.println("hubungkan sinyal wifi");
    }

    @Override
    public void lupakanJaringan() {
        System.out.println("lupakan jaringan wifi untuk mengganti sinyal wifi");   
    }

    @Override
    public void ambilKoordinat() {
        System.out.println("gunakan gps untuk emngetahui keberadaan lapyop"); 
    }
    
//    private String So;
//    private String Ram;
//    private String layar;
//    private String cpu;
//    private String baterai;
//    
//    public laptop(String merk, String model){
//        super(merk, model);
//}
//    public void setSo(String So){
//        this.So=So;
//    }
//    public void setRam(String Ram){
//        this.Ram=Ram;
//    }
//    public void setLayar(String layar){
//        this.layar=layar;
//    }
//    public void setCpu(String cpu){
//        this.cpu=cpu;
//    }
//    public void setBaterai(String baterai){
//        this.baterai=baterai;
//    }
//    
//    public String getSo(){
//        return So;
//    }
//    public String getRam(){
//        return Ram;
//    }
//    public String getLayar(){
//        return layar;
//    }
//    public String getCpu(){
//        return cpu;
//    }
//    public String getBaterai(){
//        return baterai;
//    }
//    
//
//    @Override
//    public void tampilkanSpek() {
//        System.out.println("DAFTAR SPEKSIFIKASI LAPTOP : ");
//        System.out.println("Merk : "+ getMerk());
//        System.out.println("Model : "+getModel());
//        System.out.println("=> Sistem Operasi: " + getSo());
//        System.out.println("=> RAM: " + getRam());
//        System.out.println("=> Layar: " + getLayar());
//        System.out.println("=> Prosesor: " + getCpu());
//        System.out.println("=> Baterai: " + getBaterai());
//    }  

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
}



