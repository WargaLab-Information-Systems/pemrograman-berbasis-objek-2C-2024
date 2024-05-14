
package mahasiswa2;

public class Mahasiswa2 {
     String namaa;
     String niim;
     String jurusanProdii;
     String alamatt;
     String ukmm[]=new String[3];
     // Atribut untuk menyimpan data
    
    static String universitas;
    
    public Mahasiswa2  (String nama, String nim, String jurusanProdi, String alamat) {
        namaa = nama;
        niim = nim;
        jurusanProdii = jurusanProdi;
        alamatt = alamat;
       
    }

    
    // Getter dan setter untuk atribut non-static
    public String getNama() {
        return namaa;
    }

    public void setNama(String nama) {
        namaa = nama;
    }

    public String getNim() {
        return niim;
    }

    public void setNim(String nim) {
        niim = nim;
    }

    public String getJurusanProdi() {
        return jurusanProdii;
    }

    public void setJurusanProdi(String jurusanProdi) {
        jurusanProdii = jurusanProdi;
    }

    public String getAlamat() {
        return alamatt;
    }

    public void setAlamat(String alamat) {
        alamatt = alamat;
    }

    // Getter dan setter untuk atribut static universitas
    public static String getUniversitas() {
        return universitas;
    }

    public static void setUniversitas(String universitas) {
        Mahasiswa2 .universitas = universitas;
    }

    // Getter dan setter untuk atribut ukm
    public String[] getUkm() {
        return ukmm;
    }

    public void setUkm(String[] ukm) {
        ukmm = ukm;
    }

    // Method static untuk menampilkan nilai atribut static universitas
    public static void displayUniversitas() {
        System.out.println("Universitas: " + universitas);
    }
    
    
    
    public static void main(String[] args) {
      // Pengaturan nilai atribut static universitas
        Mahasiswa2 .setUniversitas("Universitas Trunojoyo Madura");
        
        System.out.println("Universitas: " + universitas);

        // Membuat objek mahasiswa
        Mahasiswa2  mhs = new Mahasiswa2 ("Adzka", "165", "Sistem Informasi", "Jombang");
        
       
        // Menampilkan informasi mahasiswa
        System.out.println("Nama: " + mhs.getNama());
        System.out.println("NIM: " + mhs.getNim());
        System.out.println("Jurusan/Prodi: " + mhs.getJurusanProdi());
        System.out.println("Alamat: " + mhs.getAlamat());
//        System.out.println("UKM: " + mhs.getUkm());
                // Menambahkan UKM
//        String[] ukm = {"EECOM", "ITC"};
//        mhs.setUkm(ukm);
        mhs.ukmm[0]="eecom";
        mhs.ukmm[1]="tofatek";
        mhs.ukmm[2]="pena";
        System.out.println("ukm1:"+mhs.ukmm[0]);
        System.out.println("ukm2:"+mhs.ukmm[1]);
        System.out.println("ukm3:"+mhs.ukmm[2]);
        
//
//        
//            // Menampilkan UKM yang diikuti mahasiswa
//        System.out.println("UKM:");
//        for (String namaUKM : mhs.getUkm()) {
//            System.out.println("- " + namaUKM);
//        }


        // Menampilkan nilai atribut static universitas
        Mahasiswa2 .displayUniversitas();
    }   
    }
     
       
    
