/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mahasiswaaaa;

/**
 *
 * @author pinokio
 */
public class Mahasiswaaaa {
// Data mahasiswa
    String nama;
    int NIM;
    String Prodi;
    String Alamat;

// Constructor prosedur atau method yg pertama kali dipanggil saat objek dibuat
    Mahasiswaaaa(String inputNama, int inputNIM, String inputProdi, String inputAlamat) {
        this.nama = inputNama;
        this.NIM = inputNIM;
        this.Prodi = inputProdi;
        this.Alamat = inputAlamat;
 
        }
    //stter
public String setNama() {
    this.nama = "Melati";
    return nama ;
}

public void setNIM(int NIM) {
    this.NIM = NIM;
}

public void setProdi(String Prodi) {
    this.Prodi = Prodi;
}

public void setAlamat(String Alamat) {
    this.Alamat = Alamat;
}
//getter 
public String getNama() {
    return nama;
}

public int getNIM() {
    return NIM;
}

public String getProdi() {
    return Prodi;
}

public String getAlamat() {
    return Alamat;
}

    public static void main(String[] args) {
        Mahasiswaaaa object1 = new Mahasiswaaaa("Vina", 106, "Sistem Informasi", "Jombang");
            System.out.println("Nama : " + object1.nama);
            System.out.println("NIM :" + object1.NIM);
            System.out.println("Prodi : " + object1.Prodi);
            System.out.println("Alamat : " + object1.Alamat);
           // Mengubah nama dengan setter
        object1.setNama();

        // Mendapatkan nama dengan getter
        String nama = object1.getNama();

        // Menampilkan nama
        System.out.println("Nama: " + nama);

        // Mengubah NIM dengan setter
        object1.setNIM(123);

        // Mendapatkan NIM dengan getter
        int NIM = object1.getNIM();

        // Menampilkan NIM
        System.out.println("NIM: " + NIM);

        // Mengubah Prodi dengan setter
        object1.setProdi("PSIKOLOGI");

        // Mendapatkan Prodi dengan getter
        String Prodi = object1.getProdi();

        // Menampilkan Prodi
        System.out.println("Prodi: " + Prodi);

        // Mengubah Alamat dengan setter
        object1.setAlamat("Malang");

        // Mendapatkan Alamat dengan getter
        String Alamat = object1.getAlamat();

        // Menampilkan Alamat
        System.out.println("Alamat: " + Alamat);
        
    } 

            }

