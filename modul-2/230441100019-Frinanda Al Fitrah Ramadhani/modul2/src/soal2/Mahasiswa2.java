/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal2;

/**
 *
 * @author IBUCOMP
 */
public class Mahasiswa2 {
    String nama;
    String nim;
    String prodi;
    String alamat;
    static String univ;
    String ukm;
    
    Mahasiswa2(String nama, String nim, String prodi, String alamat){
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

    void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    String getAlamat(){
        return alamat;
    }

    static void setUniv(String univ) {
        Mahasiswa2.univ = univ;
    }
    static String getUniv() {
        return univ;
    }

    void setUkm(String ukm) {
        this.ukm = ukm;
    }   
    String getUkm(){
        return ukm;
    }
    void showUkm(){
        System.out.println("UKM           : -ITC \n\t        -TOFATEK \n\t        -KAMUS");       
    }
    
    public static void main(String[] args) {
        Mahasiswa2.setUniv("Universitas Trunojoyo Madura");
        Mahasiswa2 mhs = new Mahasiswa2("Frinanda Al Fitrah Ramadhani", "230441100019", "Sistem Informasi", "Sumenep");
        System.out.println("\n == Profil Mahasiswa ==");
        System.out.println("Nama          : " +mhs.getNama());
        System.out.println("NIM           : " +mhs.getNim());
        System.out.println("Jurusan/Prodi : " +mhs.getProdi());
        System.out.println("Alamat        : " +mhs.getAlamat());
        System.out.println("Universitas   : " +Mahasiswa2.getUniv());
        mhs.showUkm();
    }
    
}
