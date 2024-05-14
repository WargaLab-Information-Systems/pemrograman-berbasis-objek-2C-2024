/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mahasiswaa;

public class Mahasiswaa {
    String nama;
    int nim;
    String jurusan;
    String alamat;
    String prodi ;
    String ukm;
    static String universitas;

    Mahasiswaa(String nama, int NIM, String jurusan, String alamat, String prodi) {
        this.nama = nama;
        nim = NIM;
        this.jurusan = jurusan;
        this.alamat = alamat;
        this.prodi = prodi;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNim(int NIM) {
        nim = NIM;
    }

    int getNim() {
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

    public static void setUniversitas(String namaUniversitas) {
        universitas = namaUniversitas;
    }

    public static String getUniversitas() {
        return universitas;
    }
    
    public void SetProdi(String prodi) {
        this.prodi = prodi;
    }
    
    public String getProdi() {
        return prodi;
    }

    void setUKM(String ukm) {
        this.ukm = ukm;
    }

    public String getUKM() {
        return ukm;
    }

    public static void main(String[] args) {
        Mahasiswaa.setUniversitas("Universitas Trunojoyo Madura");

        Mahasiswaa mahasiswa1 = new Mahasiswaa("Alfath Nashrullah Arif", 59, "Teknik Informatika", "Jl. Flamboyan A 11","Sistem Informasi");
        mahasiswa1.setUKM("ITC");

        System.out.println("Nama        : " + mahasiswa1.getNama());
        System.out.println("NIM         : " + mahasiswa1.getNim());
        System.out.println("Jurusan     : " + mahasiswa1.getJurusan());
        System.out.println("Prodi       : " + mahasiswa1.getProdi());
        System.out.println("Alamat      : " + mahasiswa1.getAlamat());
        System.out.println("Universitas : " + Mahasiswaa.getUniversitas());
        System.out.println("UKM         : " + mahasiswa1.getUKM());
    }
}
