
package mahasiswaa;


public class mhsukm {
    //variabel
    String nama;
    String nim;
    String jurusan;
    String alamat;
    String [] ukm = new String[5]; //max.5 ukm yg dpt diikuti
    static String universitas; 
    
    //constructor :method yg otomatis dijalankan ketika membuat object
    mhsukm(String namaMhs, String nimMhs, String jurusanMhs, String alamatMhs){
        nama = namaMhs;
        nim = nimMhs;
        jurusan = jurusanMhs;
        alamat = alamatMhs;
    }
    //setter getter u/ nama,nim,jurusan,dan alamat
    public void setNama(String namaBaru){
        nama = namaBaru;
    }
    public String getNama(){
        return nama;
    }
    public void setNIM(String nimBaru){
         nim = nimBaru;
    }
    public String getNIM (){
        return nim;
    }
    public void setJurusan(String jurusanBaru){
         jurusan = jurusanBaru;
    }
    public String getJurusan (){
        return jurusan;
    }
    public void setAlamat(String alamatBaru){
         alamat = alamatBaru;
    }
    public String getAlamat (){
        return alamat;
    }
    //setter getter u/univ
    public static void setUniversitas(String universitasBaru){
        universitas = universitasBaru;
    }
    public static String getUniversitas(){
        return universitas;
    }
    //Static method untuk menambahkan UKM
//    public void tambahUKM(String namaUKM) {
//        for (int i = 0; i < ukm.length; i++) {
//            if (ukm[i] == null) {
//                ukm[i] = namaUKM;
//                break;
//            }
//        }
//    }
    //Static method untuk menampilkan ukm yg diikuti mhs
    public void tampilkanUKM(){
        System.out.println("UKM yang diikuti oleh " + nama + ":");
        for (String namaUKM : ukm){
            if (namaUKM != null) {
                System.out.println("- " + namaUKM);
            }
        }
    }

    public static void main(String[] args) {
        // Mengatur nilai universitas
        setUniversitas("Universitas ABC");
         // Membuat objek Mahasiswa
        mhsukm Mhsukm1 = new mhsukm("Adzikry", "123456", "Teknik Informatika", "Jl. Kali pelayaran No. 1508");
        mhsukm Mhsukm2 = new mhsukm("Devega", "654321", "Sistem Informasi", "Jl. Jenderal Sudirman No. 226");       
        Mhsukm1.ukm[0]="tofatek";
        Mhsukm1.ukm[1]="ITC";
        Mhsukm2.ukm[2]="Pramuka";
        // Menambahkan UKM
//        Mhsukm1.tambahUKM("Paskibra");
//        Mhsukm1.tambahUKM("Futsal");
//        Mhsukm2.tambahUKM("Paduan Suara");

        // Menampilkan informasi mahasiswa
        System.out.println("Universitas: " + getUniversitas());
        System.out.println("Mahasiswa1:");
        System.out.println("Nama: " + Mhsukm1.getNama());
        System.out.println("NIM: " + Mhsukm1.getNIM());
        System.out.println("Jurusan/Prodi: " + Mhsukm1.getJurusan());
        System.out.println("Alamat: " + Mhsukm1.getAlamat());
        Mhsukm1.tampilkanUKM();
        System.out.println();
        System.out.println("Mahasiswa 2:");
        System.out.println("Nama: " + Mhsukm2.getNama());
        System.out.println("NIM: " + Mhsukm2.getNIM());
        System.out.println("Jurusan/Prodi: " + Mhsukm2.getJurusan());
        System.out.println("Alamat: " + Mhsukm2.getAlamat());
        Mhsukm2.tampilkanUKM();
    }
}

