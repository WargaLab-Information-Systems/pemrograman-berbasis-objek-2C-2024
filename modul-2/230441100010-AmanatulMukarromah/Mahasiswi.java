/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mahasiswi;


public class Mahasiswi {

    String nama;
    int NIM;
    String jurusan;
    String prodi;
    String alamat;
    
    Mahasiswi(String nama, int nim, String jurusan, String prodi, String alamat) {
        this.nama = nama;
        NIM = nim ;
        this.jurusan = jurusan;
        this.prodi = prodi;
        this.alamat = alamat;
    }
    
    // Getter dan Setter untuk nama
    String getNama() {
        return nama;
    }

    void setNama(String nama) {
        this.nama = nama;
    }

    // Getter dan Setter untuk nim
    int getNim() {
        return NIM;
    }

    void setNim( int nim) {
        NIM = nim ;
    }
    
    // Getter dan Setter untuk jurusan
    String getjurusan() {
        return jurusan;
    }

    void setjurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    // Getter dan Setter untuk prodi
    String getprodi() {
        return prodi;
    }

    void setprodi(String prodi) {
        this.prodi = prodi;
    }

    // Getter dan Setter untuk alamat
    String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public static void main(String[] args) {
        // Membuat objek Mahasiswa
        Mahasiswi mahasiswi1 = new Mahasiswi("Amanatul Mukarromah",10, "Teknik Informatika", "Sistem Informasi", "Jl. kencur, keleyan socah");
        
        System.out.println("Nama        : " + mahasiswi1.getNama());
        System.out.println("NIM         : " + mahasiswi1.getNim());
        System.out.println("jurusan     : " + mahasiswi1.getjurusan());
        System.out.println("Prodi       : " + mahasiswi1.getprodi());
        System.out.println("Alamat      : " + mahasiswi1.getAlamat());  
    }
}
