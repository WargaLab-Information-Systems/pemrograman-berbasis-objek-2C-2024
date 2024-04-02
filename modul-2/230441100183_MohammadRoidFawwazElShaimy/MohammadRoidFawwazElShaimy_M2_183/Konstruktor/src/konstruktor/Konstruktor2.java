/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package konstruktor;

public class Konstruktor2 {
    String nama;
    int nim;
    String prodi;
    String alamat;
    
    Konstruktor2(String nama, int nim, String prodi, String alamat){
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
        void showOutput(){
        System.out.println("Nama Saya "+nama);
        System.out.println("NIM Saya "+nim);
        System.out.println("Jurusan/Prodi Saya "+prodi);
        System.out.println("Alamat Saya "+alamat);
    }
    
    public static void main(String[] args) {
            Konstruktor2 ktr = new Konstruktor2("Roid Fawwaz",183,
                    "Sistem informasi", "Sumenep");
            ktr.showOutput();
            ktr.setNama("Roid Fawwaz");
            ktr.getNim();
            ktr.setProdi("Sistem Informasi");
            ktr.setAlamat("Sumenep");
                
    }
}
