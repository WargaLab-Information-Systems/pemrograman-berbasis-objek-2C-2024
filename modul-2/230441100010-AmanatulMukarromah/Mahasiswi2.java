/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mahasiswi2;
public class Mahasiswi2 {

    String nama;
    int nim;
    String jurusan;
    String alamat;
    String prodi ;
    static String universitas;
    String ukm;
    String dosen;
    //
    Mahasiswi2(String nama, int NIM, String jurusan, String prodi, String alamat) {
        this.nama = nama;
        nim = NIM;
        this.jurusan = jurusan;
        this.prodi = prodi;
        this.alamat = alamat;
    }

    //method seter dan getter
    void setNama(String nama) {
        this.nama = nama;
    }

    String getNama() { //getter untuk mendapatkan nilai suatu atribut dari sebuah objek dengan mengembalikan nilai
        return nama;
    }

    void setNim(int NIM) {//settermendapatkan nilai suatu atribut dari sebuah objek yang diubah/ditambah
        nim = NIM;
    }

    int getNim() {
        return nim;
    }

    void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    String getJurusan() {
        return jurusan;
    }
    
    void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    String getAlamat() {
        return alamat;
    }
    
    void SetProdi(String prodi) {
        this.prodi = prodi;
    }
    
    String getProdi() {
        return prodi;
    }
    
    static void setUniversitas(String namaUniversitas) {
        universitas = namaUniversitas;
    }

    static String getUniversitas() {
        return universitas;
    }

    void setUKM(String ukm) {
        this.ukm = ukm;
    }

    String getUKM() {
        return ukm;
    }
    
    void setDosen(String dosen) {
        this.dosen = dosen;
    }

    String getDosen() {
        return dosen;
    }

    public static void main(String[] args) {
        Mahasiswi2.setUniversitas("Universitas Trunojoyo Madura");
        Mahasiswi2 mahasiswi = new Mahasiswi2("Amanatul mukarromah", 10, "Teknik Informatika", "Sistem Informasi", "jl. kencur, keleyan socah");
        mahasiswi.setUKM("ITC");
        mahasiswi.setDosen("zain");
        mahasiswi.setJurusan("industri");
        System.out.println("Nama        : " + mahasiswi.getNama());
        System.out.println("NIM         : " + mahasiswi.getNim());
        System.out.println("Jurusan     : " + mahasiswi.getJurusan());
        System.out.println("Prodi       : " + mahasiswi.getProdi());
        System.out.println("Alamat      : " + mahasiswi.getAlamat());
        System.out.println("Universitas : " + mahasiswi.getUniversitas());
        System.out.println("UKM         : " + mahasiswi.getUKM());
        System.out.println("Dosen       : " + mahasiswi.getDosen());
    }
}

