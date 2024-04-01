/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mahasiswaaaaa;

/**
 *
 * @author pinokio
 */
public class Mahasiswaaaaa {
// Data mahasiswa
    String nama;
    int NIM;
    String Prodi;
    String Alamat;
// Atribut ukm
    String ukm;
// deklarasi variabel static universitas
    static String universitas = "Universitas Trunojoyo Madura";
// Constructor prosedur atau method yg pertama kali dipanggil saat objek dibuat
    Mahasiswaaaaa(String inputNama, int inputNIM, String inputProdi, String inputAlamat, String inputUkm) {
        this.nama = inputNama;
        this.NIM = inputNIM;
        this.Prodi = inputProdi;
        this.Alamat = inputAlamat;
        this.ukm = inputUkm;
        }
           // Static Metode statis ini mencetak nilai variabel statis universitas
        static void university() {
            System.out.println(universitas);
        }
    /**
     * @param args the command line arguments
     */
        // method yang dimiliki kelas itu sendiri, bukan objek individu dari kelas tersebut
        //Metode statis ini menetapkan nilai variabel statis universitas
        
        static void setUniversity(String universitas) {
            Mahasiswaaaaa.universitas = universitas;
        }
        //set memperbarui suatu nilai 
            // Static get university Metode statis ini mengembalikan nilai variabel statis universitas
         static String getUniversity() {
            return universitas;
        }
        public static void main(String[] args) {
        Mahasiswaaaaa object1 = new Mahasiswaaaaa("Vina", 106, "Sistem Informasi", "Jombang", "Ukm Eecom");
            System.out.println("Nama : " + object1.nama);
            System.out.println("NIM :" + object1.NIM);
            System.out.println("Prodi : " + object1.Prodi);
            System.out.println("Alamat : " + object1.Alamat);
            System.out.println("UKM : " + object1.ukm);
     //Calling
        Mahasiswaaaaa.university();
     //Setting and getting university
        Mahasiswaaaaa.setUniversity("Diponegoro University ");
        System.out.println("Universitas Baru : " + Mahasiswaaaaa.getUniversity());
            }
}
    
