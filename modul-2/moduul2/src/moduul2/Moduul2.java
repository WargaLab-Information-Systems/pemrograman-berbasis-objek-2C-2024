/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package moduul2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

 class pbo2 {
  static  String namaa;
    String nim;
    String jurusan;
    String alamat;
    String prodi;
    String ukm; // Atribut untuk menyimpan UKM
    
    // Atribut statis untuk universitas
    static String universitas;
    
        // Konstruktor
    public pbo2(String nama, String nim, String jurusan, String alamat, String prodi) {
        namaa = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.alamat = alamat;
        this.prodi = prodi;
    }

    
    // Getter untuk nama
    public String getNama() {
        return namaa;
    }
    // Setter untuk nama
    public void setNama(String nama) {
        namaa = nama;
    }
    // Getter untuk nama
    public String getNim() {
        return nim;
    }
    // Setter untuk nim
    public void setNim(String nim) {
        this.nim = nim;
    }
    // Getter untuk Jurusan
    public String getJurusan() {
        return jurusan;
    }
     // Setter untuk Jurusan
    public void setJurusan(String jurusanProdi) {
        this.jurusan = jurusanProdi;
    }
    // Getter untuk alamat
    public String getAlamat() {
        return alamat;
    }
    // Setter untuk alamat
    public void setAlamat(String alamat) {
        this.alamat = alamat;
        
    }
    public String getprodi() {
        return prodi;
    }
    public void setprodi(String prodi) {
        this.prodi = prodi;
    }
    
    

    // Getter dan setter untuk atribut static universitas
    public static String getUniversitas() {
        return universitas;
    }

    public static void setUniversitas(String universitas) {
        pbo2.universitas = universitas;
    }

    // Getter dan setter untuk atribut ukm
    public void setUKM(String ukm) {
        this.ukm = ukm;
    }

    // Getter untuk UKM
    public String getUKM() {
        return ukm;
    }

    public static void main(String[] args) {
            // Set universitas
        pbo2.setUniversitas("Universitas Trunojoyo Madura");

        // Mengisi kontruktor
        pbo2 mahasiswa = new pbo2("Moh.Hamdi Baihaqi","230441100160", "Sistem Informasi", "Sumenep", "SI");
        mahasiswa.setUKM("TOFATEK,TRPELC,FTYUU");

        // Menampilkan informasi mahasiswa
        System.out.println("Nama        : " + mahasiswa.getNama());
        System.out.println("NIM         : " + mahasiswa.getNim());
        System.out.println("Jurusan     : " + mahasiswa.getJurusan());
        System.out.println("Alamat      : " + mahasiswa.getAlamat());
        System.out.println("prodi       : " + mahasiswa.getprodi());
        System.out.println("Universitas : " + pbo2.getUniversitas());
        System.out.println("UKM         : " + mahasiswa.getUKM());
    }
}
