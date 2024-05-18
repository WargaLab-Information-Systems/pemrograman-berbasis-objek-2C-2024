package praktikum2;


public class Praktikum2 {
    String nama;
    int nim;
    String prodi;
    String alamat;
    
    Praktikum2(String nama, int nim, String prodi, String alamat) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.alamat = alamat;
    }
    
    void setNama(String nama) {
        this.nama = nama;
    }

    void setNim(int nim) {
        this.nim = nim;
    }

    int getNim() {
        return nim;
    }

    void setProdi(String prodi) {
        this.prodi = prodi;
    }

    void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    void showOutput() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Prodi: " + prodi);
        System.out.println("Alamat: " + alamat);
    }

    
    public static void main(String[] args) {
        
        Praktikum2 mahasiswa = new Praktikum2("Rival", 140, "Sistem Informasi", "JLNo. 140");

        mahasiswa.showOutput();

        mahasiswa.setAlamat("Jl.Telang 456");

        System.out.println("\n ganti alamat:");
        mahasiswa.showOutput();
       
    }
    
}
