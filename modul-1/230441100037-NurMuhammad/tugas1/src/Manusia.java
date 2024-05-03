
public class Manusia {
    String nama;
    int umur;
    String alamat;

    void tampilBiodata () {
        System.out.println("Nama : " + this.nama);
        System.out.println("Umur : " + this.umur);
        System.out.println("Alamat : " + this.alamat);
    }
    void berlari() {
        System.out.println(this.nama + " sedang berlari");
    }
    void berjalan() {
        System.out.println(this.nama + " sedang berjalan");
    }
}
