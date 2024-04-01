package konstruktor1;


public class KONSTRUKTOR1 {
    String nama;
    int nim;
    String jurusan;
    String alamat;
    String prodi;
  // Atribut untuk menyimpan UKM
    String ukm; 
    
  // Atribut statis untuk universitas
    static String universitas;
    static String dosen;
    
  // Konstruktor
    public KONSTRUKTOR1(String nama, int nim, String jurusan, String alamat, String prodi) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.alamat = alamat;
        this.prodi = prodi;
    }

  // Getter untuk nama
    public String getNama() {
        return nama;
    }
  // Setter untuk nama
    public void setNama(String nama) {
       this. nama = nama;
    }
  // Getter untuk nama
    public int getNim() {
        return nim;
    }
  // Setter untuk nim
    public void setNim(int nim) {
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
  //getter untuk prodi
    public String getprodi() {
        return prodi;
    }
  //setter untuk prodi
    public void setprodi(String prodi) {
        this.prodi = prodi;
    }
    
    

   // Getter dan setter untuk atribut static universitas
    public static String getUniversitas() {
        return universitas;
    }
   public static String getdosen(){
       return dosen;
   }


    public static void setUniversitas(String universitas) {
        KONSTRUKTOR1.universitas = universitas;
        
    }
    public static void setdosen(String dosen){
        KONSTRUKTOR1.dosen = dosen;
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
        KONSTRUKTOR1.setUniversitas("UNIVERSITAS TRUNOJOYO MADURA");
        KONSTRUKTOR1.setdosen("ZAINUR ");


      // Mengisi kontruktor
        KONSTRUKTOR1 objek = new KONSTRUKTOR1("MFTAHUZZAIN ABRORI",230441333, 
                "TEKNIK INFORMATIKA", "KAB.SUMENEP", "SISTEM INFORMASI");
        
      //mengisi setter
        objek.setUKM("TOFATEK");

      // Menampilkan informasi mahasiswa
        System.out.println("NAMA        : " + objek.getNama());
        System.out.println("NIM         : " + objek.getNim());
        System.out.println("JURUSAN     : " + objek.getJurusan());
        System.out.println("ALAMAT      : " + objek.getAlamat());
        System.out.println("PRODI       : " + objek.getprodi());
        System.out.println("UNIVERSITAS : " + KONSTRUKTOR1.getUniversitas());
        System.out.println("UKM         : " + objek.getUKM());
        System.out.println("DOSEN : " + KONSTRUKTOR1.getdosen());
    }
    
}
