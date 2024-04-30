/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.modul2soal2;

/**
 *
 * @author USER
 */
public class Modul2soal2 {
    String nama;
    int nim;
    String prodi;
    String alamat;
    static String universitas;
    String ukm;
    String dosen;
    
    Modul2soal2(String nama, int nim, String prodi, String alamat) {
        this.nama =  nama;
        this.nim = nim;
        this.prodi = prodi;
        this.alamat = alamat;
    }
    
    void setNama (String nama) {
        this.nama = nama;
    }
    String getNama(){
        return nama;
    }
    void setNim (int nama) {
        this.nim = nim;
    }
    int getNim(){
        return nim;
    }
    void setProdi (String prodi) {
        this.prodi = prodi;
    }
    String getProdi(){
        return prodi;
    }
    void setAlamat (String alamat) {
        this.alamat = alamat;
    }
    String getAlamat(){
        return alamat;
    }
    static void setUniversitas(String namaUniversitas){
        universitas = namaUniversitas;
    }
    static String getUniversitas() {
        return universitas;
    }
    void setUkm(String ukm){
        this.ukm = ukm;
    }
    String getUkm(){
        return ukm;
    }
    void setDosen(String dosen){
        this.dosen = dosen;
    }
    String getDosen(){
        return dosen;
    }

    public static void main(String[] args) {
        Modul2soal2 object1 = new Modul2soal2("Madu",23003,"Informatika","bangkalan");
        System.out.println(object1.nama);
        System.out.println(object1.nim);
        System.out.println(object1.prodi);
        System.out.println(object1.alamat);
        
        
//        memanggil set dan get
    object1.setNama("kaizo");
    System.out.println("nama : "+object1.getNama());
    
    object1.setNim(22008);
    System.out.println("NIM : "+object1.getNim());
    
    object1.setProdi("Mesin");
    System.out.println("Prodi : "+object1.getProdi());
    
    object1.setAlamat("Bali");
    System.out.println("Alamat : "+object1.getAlamat());
    
    object1.setUniversitas("Universitas Bali");
    System.out.println("Universitas : "+getUniversitas());
    
    object1.setUkm("Voli");
    System.out.println("UKM : "+object1.getUkm());
    
    object1.setDosen("Cipi");
    System.out.println("Dosen : "+object1.getDosen());
    }
}