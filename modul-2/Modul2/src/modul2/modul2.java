package modul2;

class Mahasiswa{

    //data mahasiswa
    String nama;
    int NIM;
    String Prodi;
    String Alamat;

    //constructor prosedur atau method yg pertama kali dipanggil saat objek dibuat
    Mahasiswa(String nama, int inputNIM, String inputProdi, String inputAlamat){
        this.nama = nama;
        NIM = inputNIM;
        Prodi = inputProdi;
        Alamat = inputAlamat;
    }

    // method tanpa return dan dengan parameter (setter)
    void setNama(String nama){
        this.nama = nama;
    }

    void setNim(int NIM){
        this.NIM = NIM;
    }

    void setProdi(String Prodi){
        this.Prodi = Prodi;
    }

    void setAlamat(String Alamat){
        this.Alamat = Alamat;
    }

    // method dengan return tapi tidak ada parameter --> getter
    String getNama(){
        return this.nama;
    }

    int getNIM(){
        return this.NIM;
    }

    String getProdi(){
        return this.Prodi;
    }

    String getAlamat(){
        return this.Alamat;
    }



}

public class modul2{
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("Shelly",2388,"Sistem Informasi","Lamongan");
        System.out.println("Nama : "+mahasiswa1.nama);
        System.out.println("NIM :"+mahasiswa1.NIM);
        System.out.println("Prodi : "+mahasiswa1.Prodi);
        System.out.println("Alamat : "+mahasiswa1.Alamat);

        
        //method buat manggil setter-->untuk mengatur nilai atau mengubah 
        mahasiswa1.setNama("Hoshi");
        System.out.println("Nama : "+mahasiswa1.nama);
        mahasiswa1.setNim(234411);
        System.out.println("NIM : " +mahasiswa1.NIM);
        mahasiswa1.setProdi("Teknik Informatika");
        System.out.println("Prodi : " +mahasiswa1.Prodi);
        mahasiswa1.setAlamat("Surabaya");
        System.out.println("Alamat : " +mahasiswa1.Alamat);
        // method buat menggil getter-->menapatkan nilai 
        System.out.println("Nama : " +mahasiswa1.getNama());
        System.out.println("NIM : " +mahasiswa1.getNIM());
        System.out.println("Prodi : " +mahasiswa1.getProdi());
        System.out.println("Alamat : " +mahasiswa1.getAlamat());
    }
}

