/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul2_2;


public class DataMahasiswa {
    String nama;
    int nim;
    String jurusan;
    String alamat;
    
    DataMahasiswa(String nama, int nim, String jurusan, String alamat){
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.alamat = alamat;
    }
    
    void setNama(String nama){
        this.nama = nama;
    }
    void setNim(int nim){
        this.nim = nim;
    }
    void setJurusan(String jurusan){
        this.jurusan = jurusan;
    }
    void setAlamat(String alamat){
        this.alamat = alamat;
    }
    
    String getNama(){
        return this.nama;
    }
    int getNim(){
        return this.nim;
    }
    String getJurusan(){
        return this.jurusan;
    }
    String getAlamat(){
        return this.alamat;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        DataMahasiswa data = new DataMahasiswa("saya",2304411,"Sistem informasi","jatim");
        
        System.out.println("            Data Mahasiswa       ");
        System.out.println(" Nama                : "+data.getNama());
        System.out.println(" NIM                 : "+data.getNim());
        System.out.println(" Jurusan/Prodi       : "+data.getJurusan());
        System.out.println(" Alamat              : "+data.getAlamat());
    }
}


