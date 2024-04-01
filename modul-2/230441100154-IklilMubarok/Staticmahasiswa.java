
package staticmahasiswa;


public class Staticmahasiswa {
    String nama;
    String nim;
    String jurusan;
    String alamat;
    static String universitas;
    String ukm[]=new String[4];
    
    public Staticmahasiswa(String nama, String nim, String jurusan, String alamat) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.alamat = alamat;
    }
    
    //setter memasukkan nilai
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    //getter memanggil
    public String getNama() {
        return nama;
    }
    
    public void setNim(String nim) {
        this.nim = nim;
    }
    
    public String getNim() {
        return nim;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAlamat() {
        return alamat;
    }
    
    public static void setUniversitas(String universitas) {
        Staticmahasiswa.universitas = universitas;
    }
    
    public static String getUniversitas() {
        return universitas;
    }

    public void setUkm(String[] ukm) {
        this.ukm = ukm;
    }

    public String[] getUkm() {
        return ukm;
    }
    
    public static void Universitas() {
        System.out.println("Universitas: " + universitas);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Staticmahasiswa.setUniversitas("Universitas Trunojoyo Madura");
        
        Staticmahasiswa mhs = new Staticmahasiswa("Iklil", "230441100154", "Sistem Informasi", "Bangkalan");
        
//        String[] ukm = {"Olahraga", "PSHT",};
//        mhs.setUkm(ukm);
        mhs.ukm[0]="olahraga";
        mhs.ukm[1]="silat";
        mhs.ukm[2]="voly";
        mhs.ukm[3]="bola";
        
        
        

        System.out.println("Nama : " + mhs.getNama());
        System.out.println("NIM : " + mhs.getNim());
        System.out.println("Jurusan : " + mhs.getJurusan());
        System.out.println("Alamat : " + mhs.getAlamat());
        System.out.println("Universitas : " + Staticmahasiswa.getUniversitas());
        System.out.println("UKM : ");
        for (String ukmName : mhs.getUkm()) {
            System.out.println("- " + ukmName);
        }
    }
    
}
