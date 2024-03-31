package com.mycompany.ukmmahasiswa;

import java.util.ArrayList;
import java.util.List;

public class Staticmahasiswa {
    private String nama;
    private String nim;
    private String jurusan;
    private String alamat;
    private List<String> ukm = new ArrayList<>(); // Atribut untuk menyimpan UKM-UKM yang diikuti

    // Atribut statis untuk universitas
    private static String universitas;

    // Konstruktor untuk inisialisasi data mahasiswa
    public Staticmahasiswa(String nama, String nim, String jurusan, String alamat) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.alamat = alamat;
    }

    // Setter untuk universitas (metode statis)
    public static void setUniversitas(String namaUniversitas) {
        universitas = namaUniversitas;
    }

    // Getter untuk universitas (metode statis)
    public static String getUniversitas() {
        return universitas;
    }

    // Setter untuk nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter untuk nama
    public String getNama() {
        return nama;
    }

    // Setter untuk nim
    public void setNim(String nim) {
        this.nim = nim;
    }

    // Getter untuk nim
    public String getNim() {
        return nim;
    }

    // Setter untuk jurusan
    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    // Getter untuk jurusan
    public String getJurusan() {
        return jurusan;
    }

    // Setter untuk alamat
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    // Getter untuk alamat
    public String getAlamat() {
        return alamat;
    }

   
    public void tambahUKM(String namaUKM) {
        ukm.add(namaUKM);
    }

    
    public List<String> getUKM() {
        return ukm;
    }

    public static void main(String[] args) {
        // Mengatur nama universitas menggunakan metode statis
        Staticmahasiswa.setUniversitas("Universitas trunojoyo madura");

        // Membuat objek mahasiswa dengan menggunakan konstruktor
        Staticmahasiswa mahasiswa = new Staticmahasiswa("Jasmine kurnia ramadhani", "230441100021", "sistem informaasi", "Situbondo");
        mahasiswa.tambahUKM("UKM seni nanggala");
        mahasiswa.tambahUKM("UKM Duta kampus utm");

        
        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("NIM: " + mahasiswa.getNim());
        System.out.println("Jurusan: " + mahasiswa.getJurusan());
        System.out.println("Alamat: " + mahasiswa.getAlamat());
        System.out.println("Universitas: " + Staticmahasiswa.getUniversitas());
        System.out.println("UKM yang diikuti:");
        for (String ukm : mahasiswa.getUKM()) {
            System.out.println("- " + ukm);
        }
    }
}
