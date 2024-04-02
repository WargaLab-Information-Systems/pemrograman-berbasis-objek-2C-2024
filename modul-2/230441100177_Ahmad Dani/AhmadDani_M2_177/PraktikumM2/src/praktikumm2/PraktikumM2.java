package praktikumm2;

class PraktikumM2 {
    String nama, prodi, alamat;
    int nim;
    static String universitas;
    String[] ukm = new String[3];
    
    public PraktikumM2 (String nama, int nim, String prodi, String alamat) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.alamat = alamat;
    }
    
    static void setUniv(String univ) {
        universitas = univ;
    }
    
    static String getUniv(){
        return universitas;
    }
    
    void printUkm(String[] ukm){
        for(int i = 0; i < ukm.length; i++) {
            System.out.println("UKM ke " + (i+1) + " " + ukm[i]);
        }
    }
    
    void setNama(String nama) {
        this.nama = nama;
    }
    
    String getNama() {
        return this.nama;
    }
    
    void setNim(int nim) {
        this.nim = nim;
    }
    
    int getNim() {
        return this.nim;
    }
    
    void setProdi(String prodi) {
        this.prodi = prodi;
    }
    
     String getProdi() {
        return this.prodi;
    }

    void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
     String getAlamat() {
        return this.alamat;
    }
   
    public static void main(String[] args) {
        PraktikumM2 mahasiswa = new PraktikumM2("Ahmad Dani", 177, "Sistem Informasi", "KOkop");
     
        mahasiswa.setNama("Ahmad Dani");
        mahasiswa.setNim(177);
        mahasiswa.setProdi("Sistem Informasi");
        mahasiswa.setAlamat("Kokop");
        
        System.out.print("Nama \t: ");
        System.out.println(mahasiswa.getNama());
        System.out.print("Nim \t: ");
        System.out.println(mahasiswa.getNim());
        System.out.print("Prodi \t: ");
        System.out.println(mahasiswa.getProdi());
        System.out.print("Alamat \t: ");
        System.out.println(mahasiswa.getAlamat());
        
        PraktikumM2.setUniv("Universitas Trunojoyo Madura");
        System.out.println("Saya kuliah di " + PraktikumM2.getUniv());
        System.out.println("Saya mengikuti ukm ");
        mahasiswa.ukm[0] = "tofatek";
        mahasiswa.ukm[1] = "itc";
        mahasiswa.ukm[2] = "triple c";
        mahasiswa.printUkm(mahasiswa.ukm);
    }
    
}