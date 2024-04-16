
package mahasiswi2;
public class Mahasiswi2 {

    String nama, jurusan, alamat, prodi, ukm;
    int nim;
    static String universitas = "Universitas Gajah Mada"; 
    
    Mahasiswi2(String ininama, int iniNIM, String inijurusan, String iniprodi, String inialamat, String iniukm) {
        nama = ininama; 
        nim = iniNIM;
        jurusan = inijurusan;
        prodi = iniprodi;
        alamat = inialamat;
        ukm = iniukm;
    }
    static void univeristas(){
        System.out.println(universitas);
        
    }
    static void setUniversitas(String namaUniversitas) { //untk mengakses variabel pd class tertentu tnp hrs membuat suatu objek dari class itu.
        universitas = namaUniversitas;
    }

    static String getUniversitas() {
        return universitas;
    }

    public static void main(String[] args) {
        Mahasiswi2.setUniversitas("Universitas Trunojoyo Madura");
        Mahasiswi2 mahasiswi = new Mahasiswi2("Amanda Audia", 96, "Teknik Informatika", "Sistem Informasi", "Gresik", "Tofatek");
        System.out.println("Nama        : " + mahasiswi.nama);
        System.out.println("NIM         : " + mahasiswi.nim);
        System.out.println("Jurusan     : " + mahasiswi.jurusan);
        System.out.println("Prodi       : " + mahasiswi.prodi);
        System.out.println("Alamat      : " + mahasiswi.alamat);
        System.out.println("Universitas : " + mahasiswi.getUniversitas());
        System.out.println("UKM         : " + mahasiswi.ukm);
        
       
    }
}