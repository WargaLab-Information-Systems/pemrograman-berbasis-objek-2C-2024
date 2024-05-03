public class Mahasiswa {
    private String nama;
    private Long nim;
    private String prodi;
    private String alamat;

    void isiNama (String inputNama) {
        this.nama = inputNama;
    }
    void isiNim (Long inputNim) {
        this.nim = inputNim;
    }
    void isiProdi (String inputProdi) {
        this.prodi = inputProdi;
    }
    void isiAlamat (String inputAlamat) {
        this.alamat = inputAlamat;
    }

    void tampilData() {
        System.out.println("<----------------------------->");
        System.out.println("Nama : " + this.nama);
        System.out.println("NIM : " + this.nim);
        System.out.println("Prodi : " + this.prodi);
        System.out.println("Alamat : " + this.alamat);
        System.out.println("<----------------------------->");
    }
}
