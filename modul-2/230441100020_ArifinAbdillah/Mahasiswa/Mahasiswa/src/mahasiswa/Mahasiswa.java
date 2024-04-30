public class Mahasiswa {
    static String universitas;
    String nama;
    String nim;
    String prodi;
    String ukm;

    Mahasiswa(String nama, String nim, String prodi, String ukm) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.ukm= ukm;
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

    void setProdi(String prodi) {
        this.prodi = prodi;
    }
    String getProdi() {
        return prodi;
    }
     
   void setUkm(String ukm) {
        this.ukm = ukm;
    }
    String getUkm() {
        return ukm;
        }

    void setUniversitas(String universitas) {
        Mahasiswa.universitas = universitas;
    }
    String getUniversitas() {
        return universitas;
    }
   
    void tampilData() {
        System.out.println("Nama : " + nama);
        System.out.println("Nim : " + nim);
        System.out.println("Prodi : " + prodi);
        System.out.println("Universitas : " + universitas);
        System.out.println("Ukm :" + ukm);
    }   
}
