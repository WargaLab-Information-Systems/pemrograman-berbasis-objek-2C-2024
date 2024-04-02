/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package konstruktor;

public class Konstruktor {
    static String universitas="Universitas Trunojoyo Madura";
    String[] ukm=new String[3];
    String nama;
    int nim;
    String prodi;
    String alamat;
    
    Konstruktor(String nama, int nim, String prodi, String alamat){
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.alamat = alamat;
        
    }
    void setNama(String nama){
        this.nama=nama;
    }
    int getNim(){
        return nim;
    }
    void setProdi(String Prodi){
        this.prodi=prodi;
    }
    void setAlamat(String alamat){
        this.alamat=alamat;
    }
    static void staticUniversitas(){
        System.out.println("Saya Kuliah di "+universitas);
    }
    void printUkm(String[] ukm){
        for (String ukm1 : ukm) {
            System.out.println("Saya mengikuti UKM " + ukm1);   
        }
    }
    
    void showOutput(){
        System.out.println("Nama Saya "+nama);
        System.out.println("NIM Saya "+nim);
        System.out.println("Jurusan/Prodi Saya "+prodi);
        System.out.println("Alamat Saya "+alamat);
    }
   
    
    public static void main(String[] args) {
        Konstruktor ktr = new Konstruktor("Roid Fawwaz", 183, 
                "Sistem informasi", "Sumenep");
//        System.out.println(ktr.nama);
//        System.out.println(ktr.nim);
//        System.out.println(ktr.prodi);
//        System.out.println(ktr.alamat);
          ktr.showOutput();
//          System.out.println(Konstruktor.universitas);
//          System.out.println(Konstruktor.ukm);
          Konstruktor.staticUniversitas();
          ktr.ukm[0] = "triple-c";
          ktr.ukm[1] = "tofatek";
          ktr.ukm[2] = "itc";
          ktr.printUkm(ktr.ukm);
          ktr.setNama("Roid Fawwaz");
            ktr.getNim();
            ktr.setProdi("Sistem Informasi");
            ktr.setAlamat("Sumenep");
    }
    
}
