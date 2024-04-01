
public class mahasiswano2 {
   
     String nama;
     String nim;
     String jurusan;
     String alamat;
     String ukm;
     static String universitas;

    
    mahasiswano2(String nama,String nim, String jurusan, String alamat) {
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

    //static setter
    static void setUniversitas(String namaUniversitas) {
        universitas = namaUniversitas;
    }

    //static getter
    static String getUniversitas() {
        return universitas;
    }

    void setUKM(String ukm) {
        this.ukm = ukm;
    }

    String getUKM() {
        return ukm;
    }

    public static void main(String[] args) {
        
        mahasiswano2.setUniversitas("Universitas Trunojoyo Madura");

        mahasiswano2 mahasiswa1 = new mahasiswano2("M Syafi'i", "230441100116", "Sistem Informasi", "Jl. Kenangan");
        mahasiswa1.setUKM("ITC");
        mahasiswano2 mahasiswa2 = new mahasiswano2("ilham","22304442","Teknik Informatika","jl sawo");
        mahasiswa2.setUKM("Paduan Suara");
        
        System.out.println("Nama: " + mahasiswa1.getNama());
        System.out.println("NIM: " + mahasiswa1.getNim());
        System.out.println("Jurusan: " + mahasiswa1.getJurusan());
        System.out.println("Alamat: " + mahasiswa1.getAlamat());
        System.out.println("Universitas: " + mahasiswano2.getUniversitas());
        System.out.println("UKM yang diikuti:"+mahasiswa2.getUKM());
        System.out.println("UKM yang diikuti: " + mahasiswa1.getUKM());
    }
}
