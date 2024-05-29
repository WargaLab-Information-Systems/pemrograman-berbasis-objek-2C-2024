/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugasno2;
class Mahasiswa {
    // Deklarasi variabel instance
    String nama;
    String nim;
    String jurusan;
    String alamat;
    static String universitas;
    String ukm ;
     

    // Konstruktor
    Mahasiswa(String nama, String nim, String jurusan, String alamat, String ukm) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.alamat = alamat;
        this.ukm = ukm;
        
    }


    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }


    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getJurusan() {
        return jurusan;
    }


    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAlamat() {
        return alamat;
    }


    // Method setter dan getter untuk atribut universitas
    public static void setUniversitas(String namaUniversitas) {
        universitas = namaUniversitas;
    }

    public static String getUniversitas() {
        return universitas;
    }
        // Method untuk menampilkan UKM yang diikuti oleh mahasiswa
//    public void displayUKM() {
//        System.out.println("UKM yang diikuti oleh " + nama + ":");
//        for (String namaUkm : ukm) {
//            System.out.println("- " + namaUkm);
        
        public void setUkm(String ukm) {
        this.ukm = ukm;
    }

    public String getUkm() {
        return ukm;
    }

}

/**
 *
 * @author admin
 */
public class Tugasno2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

                // Mengubah nilai atribut universitas
        Mahasiswa.setUniversitas("Trunojoyo Madura");
        
//   
        // Membuat objek Mahasiswa
        Mahasiswa mahasiswa1 = new Mahasiswa("Amalia", "23044110046", "Sistem Informasi", "Lamongan", "basket, voli");

        // Menampilkan informasi mahasiswa dan UKM yang diikuti
        System.out.println("Informasi mahasiswa:");
        System.out.println("Nama: " + mahasiswa1.getNama());
        System.out.println("NIM: " + mahasiswa1.getNim());
        System.out.println("Jurusan/Prodi: " + mahasiswa1.getJurusan());
        System.out.println("Alamat: " + mahasiswa1.getAlamat());
        System.out.println("UKM: " + mahasiswa1.getUkm());

        // Menampilkan nilai atribut universitas
        System.out.println("\nUniversitas: " + Mahasiswa.getUniversitas());
        
    }
}

  