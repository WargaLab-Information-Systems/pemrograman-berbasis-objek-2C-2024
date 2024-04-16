public class Mahasiswa {
    // Atribut non-static
    private String nama;
    private String nim;
    private String jurusan;
    private String alamat;
    private String ukm;

    // Atribut static
    private static String universitas;

    // Konstruktor dengan parameter 
    public Mahasiswa(String nama, String nim, String jurusan, String alamat, String ukm) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.alamat = alamat;
        this.ukm= ukm;
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

    public static void setUniversitas(String namaUniversitas) {
        universitas = namaUniversitas;
    }

    public static String getUniversitas() {
        return universitas;
    }

    public void setUkm(String ukm) {
        this.ukm = ukm;
    }

    public String getUkm() {
        return ukm;
    }

    public static void main(String[] args) {
        Mahasiswa.setUniversitas("Universitas ABC");
        Mahasiswa mahasiswa1 = new Mahasiswa("Alini Mira", "230441100031", "Sistem Informasi", "Gresik","LPM-Saint");


        System.out.println("Informasi Mahasiswa:");
        System.out.println("Universitas: " + Mahasiswa.getUniversitas());
        System.out.println("Nama: " + mahasiswa1.getNama());
        System.out.println("NIM: " + mahasiswa1.getNim());
        System.out.println("Jurusan: " + mahasiswa1.getJurusan());
        System.out.println("Alamat: " + mahasiswa1.getAlamat());
        System.out.println("Mengikuti Ukm: " + mahasiswa1.getUkm());
        }
    }
