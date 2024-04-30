/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectmanusia;
class Manusia {
//menyatakan manusia kelas
    String nama;//mendeklarasikan string atribut yg diberi nama untuk menyimpan nama manusia
    int umur;
    String alamat;
    String setnama;
    String getnama;

    
    void berjalan(String taman) {
        //mendeklarasikan metode bernama berjalan yg mengambil string parameter taman 
        String jalan = taman;
        //menetapkan nilai parameter taman ke variabel lokal jalan
        System.out.println(nama+" berjalan "+jalan);
        //menampilkan pesan bahwa manusia sedang berjalan di lokasi yang ditentukan
        }

    void berlari(String jembatan) {
        String lari = jembatan;
        System.out.println(nama+" berlari "+lari);
        }
    

    void kampus(String trunojoyo) {
        String kampus = trunojoyo;
        System.out.println(nama+"kampus"+kampus);
        }

}
