public class Mahasiswa {
    static String universitas;
    private String nama;
    private String nim;
    private String alamat;
    private String prodi;
    private String[] ukm;

    Mahasiswa(String nama, String nim, String alamat, String prodi) {
        this.nama = nama;
        this.nim = nim;
        this.alamat = alamat;
        this.prodi = prodi;
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

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public String getAlamat() {
        return alamat;
    }

    boolean cariProdi(String angka) {
        if(angka.equals("41")) {
            prodi = "Teknik Informatika";
            return true;
        } else if(angka.equals("42")) {
            prodi = "Teknik Industri";
            return true;
        } else if(angka.equals("43")) {
            prodi = "Teknik Elektro";
            return true;
        } else if(angka.equals("44")) {
            prodi = "Sistem Informasi";
            return true;
        } else if(angka.equals("48")) {
            prodi = "Teknik Mesin";
            return true;
        } else if(angka.equals("49")) {
            prodi = "Teknik Mekatronika";
            return true;
        }
        return false;
    }
    String getProdi() {
        return prodi;
    }

    void setUkm(String ukm) {
        this.ukm = ukm.split(",");
    }
    void getUkm() {
        for (int i = 0; i < ukm.length; i++) {
            System.out.println((i+1) + ". " + ukm[i]);
        }
    }

    public static void setUniversitas(String universitas) {
        Mahasiswa.universitas = universitas;
    }
    public static String getUniversitas() {
        return universitas;
    }

    void tampilData() {
        System.out.println("Nama : " + nama);
        System.out.println("Nim : " + nim);
        System.out.println("Alamat : " + alamat);
        System.out.println("Prodi : " + prodi);
        System.out.println("Universitas : " + universitas);
    }
}
