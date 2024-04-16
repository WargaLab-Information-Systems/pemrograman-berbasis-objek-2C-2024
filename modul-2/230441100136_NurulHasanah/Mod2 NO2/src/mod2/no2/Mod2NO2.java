package mod2.no2;

public class Mod2NO2 {
    String nama;
    int nim;
    String prodi;
    String alamat;
    static String universitas;
    static String ukm;

    Mod2NO2(String namasaya, int nimsaya, String prodisaya, String alamatsaya){
        this.nama = namasaya;
        nim = nimsaya;
        prodi = prodisaya;
        alamat  = alamatsaya;
    }
    
    void setNama(String nama){
        this.nama = nama;
    }
    
    int getNim(){ 
        return nim;
    }
    
    void setProdi(String prodi){
        this.prodi = prodi;
    }
    
    void setAlamat(String alamat){
        this.alamat = alamat;
    }
    
    void showOutput(){
        System.out.println("Nama \t:" +nama);
        System.out.println("Nim \t:" +nim);
        System.out.println("Prodi \t:" +prodi);
        System.out.println("Alamat \t:" +alamat);
    }    
    
    static void staticTes(){ 
        System.out.println("Saya sedang berkuliah di Universitas Trunojoyo Madura");
        System.out.println("Saya mengikuti UKM TOFATEK");
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Mod2NO2 object = new Mod2NO2 ("Nurul Hasanah", 136, "Sistem Informasi", "Bangkalan");
        object.showOutput();
        System.out.println("=====================================");
        object.setNama ("Nama saya adalah Nurul Hasanah");
        System.out.println(object.nama);
        System.out.println("Nim saya adalah"+ " "+ object.nim);
        object.setProdi ("Prodi saya adalah Sistem Informasi");
        System.out.println(object.prodi);
        object.setAlamat ("Alamat rumah saya adalah Bangkalan");
        System.out.println(object.alamat);
        Mod2NO2.staticTes(); 
    }
    
}
