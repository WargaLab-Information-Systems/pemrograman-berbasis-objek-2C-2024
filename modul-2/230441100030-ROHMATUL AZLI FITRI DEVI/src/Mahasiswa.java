public class Mahasiswa {
    private String nama;
    private String nim;
    private String jurusan;
    private String alamat;
    private static String universitas;
    private String ukm;

    // Constructor
    public Mahasiswa(String nama, String nim, String jurusan, String alamat, String ukm) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.alamat = alamat;
        this.ukm= ukm;
    }

    // Getter and Setter methods
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public static String getUniversitas() {
        return universitas;
    }

    public static void setUniversitas(String universitas) {
        Mahasiswa.universitas = universitas;
    }

    public String getUkm() {
        return ukm;
    }

    public void setUkm(String ukm) {
        this.ukm = ukm;
    }

    // Static method to access university attribute
    public static void displayUniversity() {
        System.out.println("Universitas: " + universitas);
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("Alamat: " + alamat);
        System.out.println("Universitas: " + universitas);
        System.out.println("UKM yang diikuti:" + ukm);
        
    }

    public static void main(String[] args) {
        Mahasiswa.setUniversitas("Universitas Trunojoyo Madura");

        Mahasiswa mahasiswa1 = new Mahasiswa("Azli", "23-030", "Sistem Informasi", "Jl. Raya No. 123","ITC");
 
        System.out.println("Informasi Mahasiswa 1:");
        mahasiswa1.displayInfo();

        
    }
}
