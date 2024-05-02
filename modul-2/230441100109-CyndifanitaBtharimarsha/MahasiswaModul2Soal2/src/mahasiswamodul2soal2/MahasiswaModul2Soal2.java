/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MahasiswaModul2Soal2;

/**
 *
 * @author HP
 */
public class MahasiswaModul2Soal2 {
     String namaa;
     String niim;
     String jurusanProdii;
     String alamatt;
     String[] ukmm; // Atribut untuk menyimpan UKM
    
    static String universitas;
    
    public MahasiswaModul2Soal2(String nama, String nim, String jurusanProdi, String alamat) {
        namaa = nama;
        niim = nim;
        jurusanProdii = jurusanProdi;
        alamatt = alamat;
    }

    
    // Getter dan setter untuk atribut non-static
    public String getNama() {
        return namaa;
    }

    public void setNama(String nama) {
        namaa = nama;
    }

    public String getNim() {
        return niim;
    }

    public void setNim(String nim) {
        niim = nim;
    }

    public String getJurusanProdi() {
        return jurusanProdii;
    }

    public void setJurusanProdi(String jurusanProdi) {
        jurusanProdii = jurusanProdi;
    }

    public String getAlamat() {
        return alamatt;
    }

    public void setAlamat(String alamat) {
        alamatt = alamat;
    }

    // Getter dan setter untuk atribut static universitas
    public static String getUniversitas() {
        return universitas;
    }

    public static void setUniversitas(String universitas) {
        MahasiswaModul2Soal2.universitas = universitas;
    }

    // Getter dan setter untuk atribut ukm
    public String[] getUkm() {
        return ukmm;
    }

    public void setUkm(String[] ukm) {
        ukmm = ukm;
    }

    // Method static untuk menampilkan nilai atribut static universitas
    public static void displayUniversitas() {
        System.out.println("Universitas: " + universitas);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Pengaturan nilai atribut static universitas
        //static method diakses langsung tanpa melalui object
      
        MahasiswaModul2Soal2.setUniversitas("Universitas ABC");
        
        System.out.println("Universitas: " + universitas);

        // Membuat objek mahasiswa
        MahasiswaModul2Soal2 mhs = new MahasiswaModul2Soal2("John Doe", "123456", "Teknik Informatika", "Jl. Contoh No. 123");
        
        // Menambahkan UKM
        String[] ukm = {"ITC", "pramuka"};
        mhs.setUkm(ukm);

        // Menampilkan informasi mahasiswa
        System.out.println("Nama: " + mhs.getNama());
        System.out.println("NIM: " + mhs.getNim());
        System.out.println("Jurusan/Prodi: " + mhs.getJurusanProdi());
        System.out.println("Alamat: " + mhs.getAlamat());

        // Menampilkan UKM yang diikuti mahasiswa
        System.out.println("UKM:");
        for (String namaUKM : mhs.getUkm()) {
            System.out.println("- " + namaUKM);
        }

        // Menampilkan nilai atribut static universitas
        MahasiswaModul2Soal2.displayUniversitas();
    }
    
}