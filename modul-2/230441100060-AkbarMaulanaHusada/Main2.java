package TugasPraktikum2;
import java.util.Scanner;

class Mahasiswa {
    private String nama;
    private Long nim;
    private String jurusan;
    private String alamat;
    private static String universitas;
    private String[] ukm;

    public Mahasiswa(String namaMain2, Long nimMain2, String jurusanMain2, String alamatMain2){
        nama = namaMain2;
        nim = nimMain2;
        jurusan = jurusanMain2;
        alamat = alamatMain2;
    }

        void tampilkanData() {
        System.out.println();
        System.out.print("\\");
        System.out.println("\\========== DATA MAHASISWA ==========//");
        System.out.println("Nama         : " + getNama());
        System.out.println("NIM          : " + getNim());
        System.out.println("Jurusan/Prodi: " + getJurusan());
        System.out.println("Alamat       : " + getAlamat());
        System.out.println("Universitas  : " + getUniv());
        System.out.print("Ukm          : ");
        getUkm();
        System.out.print("//====================================\\");
        System.out.print("\\");
    }

    public void setNama(String namaMain1){
        nama = namaMain1;
    }
    public void setNim(Long nimMain1){
        nim = nimMain1;
    }
    public void setAlamat(String alamatMain1){
        alamat = alamatMain1;
    }
    public void setJurusan(String jurusanMain1){
        jurusan = jurusanMain1;
    }
    public static void setUniv(String univ){
        Mahasiswa.universitas = univ;
    }
    public void setUkm(int banyakUkm){
        try (Scanner inputUkm = new Scanner(System.in)) {
            String[] ukm = new String[banyakUkm];
            for(int i=1; i<=banyakUkm; i++){
                System.out.print("Ukm ke-" + i + "               : ");
                ukm[i-1] = inputUkm.nextLine();
            }
            this.ukm = ukm;
        }
    }


    public String getNama(){
        return nama;
    }
    public Long getNim(){
        return nim;
    }
    public String getJurusan(){
        return jurusan;
    }
    public String getAlamat(){
        return alamat;
    }
    public static String getUniv(){
        return universitas;
    }
    public void getUkm(){
        for (int i = 0; i < ukm.length; i++) { 
            System.out.println((i+1) + ". " + ukm[i]);
        }
    }
    
}

public class Main2 {

    public static void main(String[] args) {
        
            @SuppressWarnings("resource")
            Scanner scanner = new Scanner(System.in);
            System.out.print("\\");
            System.out.println("\\======= INPUT DATA MAHASISWA =======//");
            System.out.print("Nama Mahasiswa         : ");
            String namaInput = scanner.nextLine();
            System.out.print("NIM Mahasiswa          : ");
            Long nimInput = scanner.nextLong();
            scanner.nextLine();
            System.out.print("Jurusan/Prodi Mahasiswa: ");
            String jurusanInput = scanner.nextLine();
            System.out.print("Alamat Mahasiswa       : ");
            String alamatInput = scanner.nextLine();
            System.out.print("Universitas Mahasiswa  : ");
            String inputUniv = scanner.nextLine();
            Mahasiswa.setUniv(inputUniv);
            System.out.print("Banyak UKM Mahasiswa   : ");
            int UkmInput = scanner.nextInt();
            
            
            Mahasiswa Maba = new Mahasiswa(namaInput, nimInput, jurusanInput, alamatInput);
            Maba.setUkm(UkmInput);

            Maba.tampilkanData();

            
}

}
