public class Mahasiswa {
    String nama;
    long nim;
    String prodi;
    String alamat;

    void isiNama (String inputNama) {
        this.nama = inputNama;
    }
      void isiProdi (String inputProdi) {
        this.prodi = inputProdi;
    }
    void isiNim (long inputNim) {
        this.nim = inputNim;
    }
    void isiAlamat (String inputAlamat) {
        this.alamat = inputAlamat;
    }
  
    void tampilData() {
        System.out.println("Nama : " + this.nama);
        System.out.println("Prodi : " + this.prodi);
        System.out.println("NIM : " + this.nim);
        System.out.println("Alamat : " + this.alamat);
    }
}
