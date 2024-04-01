package modul2.praktikumpbo;

public class Nomor2 {
    String nama;
    int nim;
    String prodi;
    String alamat;
    String ukm;
    static String universitas;
    
    Nomor2(String name, int NIM, String prodi, String alamat){
        nama = name;
        nim = NIM;
        this.prodi = prodi;
        this.alamat = alamat;  
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getNama(){
        return nama;
    }

    public void setNim(int NIM){
        nim = NIM;
    }
    
    int getNim(){
        return nim;
    }
    
    public void setProdi(String prodi){
        this.prodi = prodi;
    }
    
    public String getProdi(){
        return prodi;
    }
    
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    
    public String getAlamat(){
        return alamat;
    }
    
    public static void setUniversitas(String namaUniversitas){
        universitas = namaUniversitas;
    }
    
    public static String getUniversitas(){
        return universitas;
    }
    
    public void setUkm(String ukm){
        this.ukm = ukm;
    }
    
    public String getUkm(){
        return ukm;
    }
    
   
    public static void main(String[] args) {
        Nomor2.setUniversitas("Universitas Trunojoyo Madura");
        Nomor2 mahasiswa = new Nomor2("Muhammad Dias Mukholif", 23094, 
                "Sistem Informasi", "Lamongan");
        mahasiswa.setUkm("ITC");
        
        System.out.println("Nama :"+mahasiswa.getNama());
        System.out.println("Nim :"+mahasiswa.getNim());
        System.out.println("Prodi:"+mahasiswa.getProdi());
        System.out.println("Alamat :"+mahasiswa.getAlamat());
        System.out.println("Universitas :"+Nomor2.getUniversitas());
        System.out.println("UKM :"+mahasiswa.getUkm());
    }
}
