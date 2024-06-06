
package pekerja;

public class Main {
    public static void main(String[] args) {
        // Membuat objek dari masing-masing subclass
        Pekerja pekerja1 = new Mekanik("Pisces", 32);
        Pekerja pekerja2 = new Guru("Capricorn", 35);
        Pekerja pekerja3 = new Penyanyi("Libra", 25);

        // Memanggil metode pekerjaan() dari masing-masing objek
        pekerja1.pekerjaan();
        pekerja2.pekerjaan();
        pekerja3.pekerjaan();
    }
}