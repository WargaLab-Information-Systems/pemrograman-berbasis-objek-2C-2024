package modul2.praktikumpbo;

public class Nomor1 {
    private String nama;
    private String nim;
    private String jurusan;
    private String alamat;

    // Konstruktor
    public Nomor1(String nama, String nim, String jurusan, String alamat) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.alamat = alamat;
    }

    // Setter dan Getter untuk nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    // Setter dan Getter untuk NIM
    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    // Setter dan Getter untuk jurusan/prodi
    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getJurusan() {
        return jurusan;
    }

    // Setter dan Getter untuk alamat
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAlamat() {
        return alamat;
    }

    public static void main(String[] args) {
        // Membuat objek Mahasiswa
        Nomor1 mahasiswa = new Nomor1("Reva", "230441100086", "Psikologi", "Jl. Songgokerto No. 14");

        // Menampilkan informasi mahasiswa menggunakan getter
        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("NIM: " + mahasiswa.getNim());
        System.out.println("Jurusan: " + mahasiswa.getJurusan());
        System.out.println("Alamat: " + mahasiswa.getAlamat());

        // Mengubah informasi mahasiswa menggunakan setter
        mahasiswa.setAlamat("Jl. Pesanggrahan No. 21");
        mahasiswa.setJurusan("Sosiologi");

        // Menampilkan informasi mahasiswa setelah perubahan alamat
        System.out.println("\nInformasi setelah perubahan alamat:");
        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("NIM: " + mahasiswa.getNim());
        System.out.println("Jurusan: " + mahasiswa.getJurusan());
        System.out.println("Alamat: " + mahasiswa.getAlamat());
    }
}
