
package mahasiswaa;


public class Mahasiswaa {
    
    //variabel
    String nama;
    String nim;
    String jurusan;
    String alamat;
    
    //constructor u/menginisialisasi object dg variabel 
    Mahasiswaa(String namaMhs,String nimMhs,String jurusanMhs,String alamatMhs){
        nama = namaMhs;
        nim = nimMhs;
        jurusan = jurusanMhs;
        alamat = alamatMhs;
    }
     // Setter (mengatur) dan Getter(mengambil) untuk Nama
    public void setNama(String namaBaru) {
        nama = namaBaru;
    }

    public String getNama() {
        return nama;
    }

    // Setter dan Getter untuk NIM
    public void setNim(String nimBaru) {
        nim = nimBaru;
    }

    public String getNim() {
        return nim;
    }

    // Setter dan Getter untuk Jurusan/Prodi
    public void setJurusan(String jurusanBaru) {
        jurusan = jurusanBaru;
    }

    public String getJurusan() {
        return jurusan;
    }
      // Setter dan Getter untuk Alamat
    public void setAlamat(String alamatBaru) {
        alamat = alamatBaru;
    }

    public String getAlamat() {
        return alamat;
    }

    public static void main(String[] args) {
        // Membuat objek Mahasiswa
        Mahasiswaa mahasiswaa = new Mahasiswaa("Adzikry", "230441100128", "Sistem Informasi", "Jl. kali pelayaran No. 1508");
        
        // Menampilkan data mahasiswa
        System.out.println("Nama: " + mahasiswaa.getNama());
        System.out.println("NIM: " + mahasiswaa.getNim());
        System.out.println("Jurusan/Prodi: " + mahasiswaa.getJurusan());
        System.out.println("Alamat: " + mahasiswaa.getAlamat());
}
}
