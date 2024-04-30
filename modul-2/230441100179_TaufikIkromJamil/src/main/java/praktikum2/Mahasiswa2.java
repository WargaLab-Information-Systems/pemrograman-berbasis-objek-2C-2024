/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum2;

import java.util.Arrays;

/**
 *
 * @author TAUFIK IKROM JAMIL
 */
public class Mahasiswa2 {
     String nama1;
     String nim2;
     String jurusanProdi3;
     String alamat4;
     String ukm5[]=new String[3];
     static String hobi="Mancing";
     
     static void halo(){
         System.out.println("halo");
     }
     
     // Atribut untuk menyimpan data
    
    static String universitas;
    
    public Mahasiswa2  (String nama, String nim, String jurusanProdi, String alamat) {
        nama1 = nama;
        nim2 = nim;
        jurusanProdi3 = jurusanProdi;
        alamat4 = alamat;
       
    }

    
    // Getter dan setter untuk atribut non-static
    public String getNama() {
        return nama1;
    }

    public void setNama(String nama) {
        nama1 = nama;
    }

    public String getNim() {
        return nim2;
    }

    public void setNim(String nim) {
        nim2 = nim;
    }

    public String getJurusanProdi() {
        return jurusanProdi3;
    }

    public void setJurusanProdi(String jurusanProdi) {
        jurusanProdi3 = jurusanProdi;
    }

    public String getAlamat() {
        return alamat4;
    }

    public void setAlamat(String alamat) {
        alamat4 = alamat;
    }

    // Getter dan setter untuk atribut static universitas
    public static String getUniversitas() {
        return universitas;
    }

    public static void setUniversitas(String universitas) {
        Mahasiswa2 .universitas = universitas;
    }
//
//    // Getter dan setter untuk atribut ukm
//    public String[] getUkm() {
//        return ukm5;
//    }
//
//    public void setUkm(String[] ukm) {
//        ukm5 = ukm;
//    }

    // Method static untuk menampilkan nilai atribut static universitas
    public static void displayUniversitas() {
        System.out.println("Universitas: " + universitas);
    }
    
    
    
    public static void main(String[] args) {
      // Pengaturan nilai atribut static universitas
        Mahasiswa2 .setUniversitas("Universitas Trunojoyo Madura");
        
        System.out.println("Universitas: " + universitas);

        // Membuat objek mahasiswa
        Mahasiswa2  mhs = new Mahasiswa2 ("fik", "179", "Sistem Informasi", "bankalan");
        mhs.nim2="234";
        Mahasiswa2.halo();
        System.out.println(Mahasiswa2.hobi);
        
        
        mhs.setNim("123");
        System.out.println(mhs.getNim());
        
       
        // Menampilkan informasi mahasiswa
        System.out.println("Nama: " + mhs.getNama());
        System.out.println("NIM: " + mhs.getNim());
        System.out.println("Jurusan/Prodi: " + mhs.getJurusanProdi());
        System.out.println("Alamat: " + mhs.getAlamat());

        mhs.ukm5[0]="ecom";
        mhs.ukm5[1]="tofatek";
        mhs.ukm5[2]="pena";
        System.out.println("ukm1:"+mhs.ukm5[0]);
        System.out.println("ukm2:"+mhs.ukm5[1]);
        System.out.println("ukm3:"+mhs.ukm5[2]);
        
        // Menampilkan nilai atribut static universitas
        Mahasiswa2 .displayUniversitas();
    }   
}