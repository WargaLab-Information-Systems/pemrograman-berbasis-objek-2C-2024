/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mahasiswa_ll;

/**
 *
 * @author HP
 */
public class Mahasiswa_ll {
     String nama;
     String nim;
     String jurusanProdi;
     String alamat;
     String[] ukm = new String[3];

    
    static String universitas;
    
    public Mahasiswa_ll(String nama, String nim, String jurusanProdi, String alamat) {
        this.nama = nama;
        this.nim = nim;
        this.jurusanProdi = jurusanProdi;
        this.alamat = alamat;
    }

    

    public String Nama_get() {
        return nama;
    }

    public void Nama_set(String nama) {
        this.nama = nama;
    }

    public String Nim_get() {
        return nim;
    }

    public void Nim_set(String nim) {
        this.nim = nim;
    }

    public String Jurusan_get() {
        return jurusanProdi;
    }

    public void Jurusan_set(String jurusanProdi) {
        this.jurusanProdi = jurusanProdi;
    }

    public String Alamat_get() {
        return alamat;
    }

    public void Alamat_set(String alamat) {
        this.alamat = alamat;
    }


    public static String Universitas_get() {
        return universitas;
    }

    public static void Universitas_set(String universitas) {
        Mahasiswa_ll.universitas = universitas;
    }


    public String[] Ukm_get() {
        return ukm;
    }

    public void Ukm_set(String[] ukm) {
        this.ukm = ukm;
    }


    public static void Data_Universitas() {
        System.out.println("Universitas: " + universitas);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        Mahasiswa_ll.Universitas_set("Universitas TRUNOJOYO MADURA");
        System.out.println("Universitas: " + universitas);
        
       


        Mahasiswa_ll mhs = new Mahasiswa_ll("AHMAD RIKHAN ARBAI", "230441100192", "SISTEM INFORMASI", "TELANG");

        mhs.ukm [0] = "TOFATEK";
        mhs.ukm[1] = "ITC";
        mhs.ukm[2] = "BM";
        
        System.out.println("Nama: " + mhs.Nama_get());
        System.out.println("NIM: " + mhs.Nim_get());
        System.out.println("Jurusan/Prodi: " + mhs.Jurusan_get());
        System.out.println("Alamat: " + mhs.Alamat_get());
        

        System.out.println("UKM:");
        for (String namaUKM : mhs.Ukm_get()) {
            System.out.println("- " + namaUKM);
        }


        Mahasiswa_ll.Data_Universitas();

    }
    
}
