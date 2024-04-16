package mhsiswa;


public class Mhsiswa {
    String Nama, NIM, Jurusan, Alamat;
    
    //Konstruktor method yg otomatis dijalankan ketika membuat object
    public Mhsiswa(String iniNama, String iniNIM, String iniJurusan, String iniAlamat){
        Nama = iniNama;
        NIM = iniNIM;
        Jurusan = iniJurusan;
        Alamat = iniAlamat;
    }
    
    //Getter digunakan untuk mengambil nilai
    String getNama(){
        return Nama;
    }
    
    String getNIM(){
        return NIM;
    }
    
    String getJurusan(){
        return Jurusan;
    }
    
    String getAlamat(){
        return Alamat;
    }
    
    //Setter mengatur atau memperbarui nilai dari suatu variabel.
    public void setNama(String Nama){
        this.Nama = Nama;
    }
    
    public void setNIM(String NIM){
        this.NIM = NIM;
    }
    
    public void setJurusan(String Jurusan){
        this.Jurusan = Jurusan;
    }
    
    public void setAlamat(String Alamat){
        this.Alamat = Alamat;
    }
    
       
    public static void main(String[] args) {
   Mhsiswa mhs = new Mhsiswa("Amanda", "230441100096", "Sistem Informasi", "Gresik");
        System.out.println("Nama: " + mhs.getNama());
        System.out.println("NIM: " + mhs.getNIM());
        System.out.println("Jurusan: " + mhs.getJurusan());
        System.out.println("Alamat: " + mhs.getAlamat());
    }
    
}
