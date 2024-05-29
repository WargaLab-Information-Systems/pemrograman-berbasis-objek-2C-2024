/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datamahasiswa;
public class Datamahasiswa {

    // Atribut
    private String nama;
    private String nim;
    private String jurusan;
    private String alamat;

    // Konstruktor digunakan untuk menginisialisasi atribut diatas dan menerima parameter diatas
    public Datamahasiswa(String nama, String nim, String jurusan, String alamat) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.alamat = alamat;
    }

    // Metode untuk menampilkan informasi mahasiswa
    public void Info() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan/Prodi: " + jurusan);
        System.out.println("Alamat: " + alamat);
    }
}
 // lalu buat class main untuk memanggil datamahasiswa yang sudah didefinisikan