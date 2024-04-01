/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.modul2;

/**
 *
 * @author safira rihadatul a
 */
public class Modul2 {
    String nama;
    int NIM;
    String prodi;
    String alamat;  
    String ukm;
    String Fakultas;
    static String universitas;

    //Construktor
    Modul2 (String namasaya, int NIMsaya, String prodisaya, String alamatsaya){
        nama = namasaya;
        NIM = NIMsaya;
        prodi = prodisaya;
        alamat = alamatsaya;
    }

    void setNama(String namasaya){
        nama = namasaya;
    }
    String getNama(){
        return nama;
    }
    void setNIM(int NIMsaya){
        NIM = NIMsaya;
    }
    int getNIM(){
        return NIM;
    }
    void setProdi(String prodisaya){
        prodi = prodisaya;
    }
    String getProdi(){
        return prodi;
    }
    void setAlamat(String alamatsaya){
        alamat = alamatsaya;
    }
    String getAlamat(){
        return alamat;
    }
    void setUKM(String ukm) {
        this.ukm = ukm;
    }

    public String getUKM() {
        return ukm;
    }
    void setFakultas(String Fakultas) {
        this.Fakultas = Fakultas;
    }

    public String getFakultas() {
        return Fakultas;
    }
    static void setUniversitas (String univ){
        universitas = univ ;
    }
    static String getUniversitas (){
        return universitas;
    }
    
    public static void main(String[] args) {
        Modul2.setUniversitas("Universitas Trunojoyo Madura");

        Modul2 object1 = new Modul2("catur",12345,"FK","Demangan");
        System.out.println(object1.nama);
        System.out.println(object1.NIM);
        System.out.println(object1.prodi);
        System.out.println(object1.alamat);
        

//      manggil set dan get
        object1.setNama("sapayo");
        System.out.println("nama        :"+object1.getNama());
        
        object1.setNIM(54321);
        System.out.println("NIM         :"+object1.getNIM());
        
        object1.setProdi("SI");
        System.out.println("Prodi       :"+object1.getProdi());

        object1.setAlamat("bangkalan");
        System.out.println("alamat      :"+object1.getAlamat());

        object1.setUniversitas("UI");
        System.out.println("Universitas :"+object1.getUniversitas());
        
        object1.setUKM("BM");
        System.out.println("ukm         :"+object1.getUKM());
        
        object1.setFakultas("Teknik");
        System.out.println("Fakultas    :"+object1.getFakultas());
    }
}