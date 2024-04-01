
package modul2.pkg1;

public class Mahasiswa {
    String nama;
    int nim;
    String jurusan;
    String alamat;
    static String universitas;
    String[] ukm;
    
    Mahasiswa(String nama, int nim, String jurusan, String alamat){
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.alamat = alamat;
    }
    
    void setNama(String nama){
        this.nama = nama;
    }
    void setNim(int nim){
        this.nim = nim;
    }
    void setJurusan(String jurusan){
        this.jurusan = jurusan;
    }
    void setAlamat(String alamat){
        this.alamat = alamat;
    }
    void setUkm(String[] ukm){
        this.ukm = ukm;
    }
    
    String getNama(){
        return this.nama;
    }
    int getNim(){
        return this.nim;
    }
    String getJurusan(){
        return this.jurusan;
    }
    String getAlamat(){
        return this.alamat;
    }
    String[] getUkm(){
        return this.ukm;
    }
     static String getUniversitas(){
        return universitas;
    }
    static void setUniversitas(String newNama){
        universitas = newNama;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa data = new Mahasiswa("nana",230062,"Sistem Informasi","Jatim");
        String[] dataUkm = {"olahraga", "fotografi", "computer"};
        data.setUkm(dataUkm);
        
        System.out.println("            Data Mahasiswa       ");
        System.out.println(" Nama                : "+data.getNama());
        System.out.println(" NIM                 : "+data.getNim());
        System.out.println(" Jurusan/Prodi       : "+data.getJurusan());
        System.out.println(" Alamat              : "+data.getAlamat());
        System.out.println(" Ukm yang diikuti    : "+String.join(", ", data.getUkm()));
       
        Mahasiswa.setUniversitas("Universitas Trunojoyo Madura");
        System.out.println(" Universitas         : " + Mahasiswa.getUniversitas());
      
    }
}
