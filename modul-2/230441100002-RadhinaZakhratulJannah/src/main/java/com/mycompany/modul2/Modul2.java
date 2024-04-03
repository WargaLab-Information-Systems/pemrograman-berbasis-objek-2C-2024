/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.modul2;
public class Modul2 {
    String nama;
    int nim;
    String prodi;
    String alamat;
    String ukm;
    static String universitas;
    //construcktor
    Modul2(String namasaya, int nimku, String prodiku, String alamatku) {
        nama =  namasaya ;
        nim = nimku ;
        prodi = prodiku ;
        alamat = alamatku ;
    }
    void setNama(String namasaya){
        nama = namasaya;
    }
    String getNama(){
        return nama;
    }
    void setNim(int nimku) {
        nim = nimku;
    }
    int getNim(){
        return nim;
    }
    void setProdi(String prodiku) {
        prodi = prodiku ;
    }
    String getProdi(){
        return prodi;
    }
    void setAlamat(String alamatku) {
        alamat = alamatku;
    }
    String getAlamat(){
        return alamat;
    }
    void setUkm(String ukm){
        this.ukm = ukm;
    }
    String getUkm(){
        return ukm;
    }
    static void setUniversitas (String univ){
        universitas = univ ;
    }
    static String getUniversitas (){
        return universitas ;
    }
    public static void main(String[] args) {
        setUniversitas("Universitas Indonesia") ;
        
        Modul2 object1 = new Modul2("Radhina Zakhratul Jannah",23002,"Sistem Informasi","bangkalan");
        System.out.println(object1.nama);
        System.out.println(object1.nim);
        System.out.println(object1.prodi);
        System.out.println(object1.alamat);

//        manggil set 
        object1.setNama("Nadhira");
        System.out.println("Nama             :"+object1.getNama());
        
        object1.setNim(20032);
        System.out.println("NIM              :"+object1.getNim()); 

        object1.setProdi("TIF");
        System.out.println("Prodi            :"+object1.getProdi());

        object1.setAlamat("semarang");
        System.out.println("Alamat           :"+object1.getAlamat());

        object1.setUniversitas("UGM");
        System.out.println("Universitas      :"+object1.getUniversitas());
        
        object1.setUkm("Seni");
        System.out.println("Ukm              :"+object1.getUkm());
    }
}
