
public class mahasiswano1 {
   
     String nama;
     String nim;
     String jurusan;
     String alamat;

    
    mahasiswano1(String nama,String nim, String jurusan, String alamat) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.alamat = alamat;
    }
   
    void setNama(String nama) {
        this.nama = nama;
    }
  
    String getNama() {
        return nama;
    }
   
    void setNim(String nim) {
        this.nim = nim;
    }
    
    String getNim() {
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


    public static void main(String[] args) {
        

        mahasiswano1 mahasiswa1 = new mahasiswano1("M Syafi'i", "230441100116", "Sistem Informasi", "Jl. Kenangan");
        
        System.out.println("Nama: " + mahasiswa1.getNama());
        System.out.println("NIM: " + mahasiswa1.getNim());
        System.out.println("Jurusan: " + mahasiswa1.getJurusan());
        System.out.println("Alamat: " + mahasiswa1.getAlamat());
    }
}
