/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal1;

/**
 *
 * @author IBUCOMP
 */
public class Mahasiswa {
    String nama;
    String nim;
    String prodi;
    String alamat;
    
    Mahasiswa(String nama, String nim, String prodi, String alamat){
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.alamat = alamat;
    }
    
    void setNama(String nama){
        this.nama = nama;
    }
    String getNama(){
        return nama;
    }
    
    void setNim(String nim){
        this.nim = nim;
    }
    String getNim(){
        return nim;
    }
    
    void setProdi(String prodi){
        this.prodi = prodi;
    }
    String getProdi(){
        return prodi;
    }
    
    void setAlamat(String alamat){
        this.alamat = alamat;
    }
    String getAlamat(){
        return alamat;
    }
    
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("Frinanda Al Fitrah Ramadhani", "230441100019", "Sistem Informasi", "Sumenep");
        System.out.println("\n == Profil Mahasiswa ==");
        System.out.println("Nama          : " +mhs.getNama());
        System.out.println("NIM           : " +mhs.getNim());
        System.out.println("Jurusan/Prodi : " +mhs.getProdi());
        System.out.println("Alamat        : " +mhs.getAlamat());
    }
    
}
