package Mahasiswaa;

public class Mahasiswa {
// Data mahasiswa
    String nama;
    int NIM;
    String Prodi;
    String Alamat;
    // Atribut ukm
    String ukm;
    // deklarasi variabel static universitas
    static String universitas = "Universitas Malang";
    // Constructor prosedur atau method yg pertama kali dipanggil saat objek dibuat
    Mahasiswa(String inputNama, int inputNIM, String inputProdi, String inputAlamat, String inputUkm) {
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
        // method yang dimiliki kelas itu sendiri, bukan objek individu dari kelas tersebut
        //Metode statis ini menetapkan nilai variabel statis universitas
        static void setUniversity(String universitas) {
            Mahasiswa.universitas = universitas;
        }
            // Static get university Metode statis ini mengembalikan nilai variabel statis universitas
         static String getUniversity() {
            return universitas;
        }
            public static void main(String[] args) {
            Mahasiswa object1 = new Mahasiswa("Melati", 181, "Sistem Informasi", "Ngjk", "PMR, Eecom");
            System.out.println("Nama : " + object1.nama);
            System.out.println("NIM :" + object1.NIM);
            System.out.println("Prodi : " + object1.Prodi);
            System.out.println("Alamat : " + object1.Alamat);
            System.out.println("UKM : " + object1.ukm);
            // Calling static langsung tanpa harus melakukan instansiasi objek
            Mahasiswa.university();
            //
            // Setting and getting university
            Mahasiswa.setUniversity("University 1");
                System.out.println("universitas : "+ Mahasiswa.getUniversity());
            }
}