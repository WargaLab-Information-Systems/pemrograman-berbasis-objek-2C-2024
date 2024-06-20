/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum2;

public class PraktikumNo2 {
    static String universitas = "Universitas UTM";
    String[] ukm;

    String nama;
    int nim;
    String prodi;
    String alamat;

    PraktikumNo2(String nama, int nim, String prodi, String alamat) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.alamat = alamat;
    }

    void setNama(String nama) {
        this.nama = nama;
    }

    void setNim(int nim) {
        this.nim = nim;
    }

    void setProdi(String prodi) {
        this.prodi = prodi;
    }

    void setAlamat(String alamat) {
        this.alamat = alamat;
    }


    static void setUniversitas(String namaUniversitas) {
        universitas = namaUniversitas;
    }

     void setUkm(String[] namaUkm) {
        ukm = namaUkm;
    }

     String[] getUkm() {
        return ukm;
    }

    void showOutput() {
       System.out.println("Nama: " + nama);
       System.out.println("NIM: " + nim);
       System.out.println("Prodi: " + prodi);
       System.out.println("Alamat: " + alamat);
       System.out.println("Universitas: " + universitas);
       System.out.println("UKM yang diikuti: " + ukm[1] + " "+ ukm[0]); 
       System.out.println(); 
}
    public static void main(String[] args) {
        PraktikumNo2 object = new PraktikumNo2("Rival", 140, "Sistem Informasi", "Jl.Telang");
        System.out.println(object.nama);
        System.out.println(object.nim); 
        System.out.println(object.prodi);
        String[] ukmRival = {"Tofatek", "ITC"};
        object.setUkm(ukmRival);

        object.showOutput();
    }
}