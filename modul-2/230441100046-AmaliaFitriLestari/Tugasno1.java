/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugasno1;
class Mahasiswa {
     String nama;
     String nim;
     String jurusan;
     String alamat;
      
            
    Mahasiswa(String nama, String nim, String jurusan, String alamat) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.alamat = alamat;
    }

    // Method setter dan getter untuk nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    // Method setter dan getter untuk nim
    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    // Method setter dan getter untuk jurusan/prodi
    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getJurusan() {
        return jurusan;
    }

    // Method setter dan getter untuk alamat
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAlamat() {
        return alamat;
    }

}
    public class Tugasno1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Mahasiswa mahasiswa1 = new Mahasiswa("Amalia", "230441100046", "Sistem Informasi", "Lamongan");

        // Menampilkan informasi mahasiswa
        System.out.println("Nama: " + mahasiswa1.getNama());
        System.out.println("NIM: " + mahasiswa1.getNim());
        System.out.println("Jurusan/Prodi: " + mahasiswa1.getJurusan());
        System.out.println("Alamat: " + mahasiswa1.getAlamat());

    }
}

    
    

