
package satuan;

abstract class KonversiSatuan {
    double value;

    public KonversiSatuan(double value) {
        this.value = value;
    }

    public abstract double konversi(String dari, String ke);
}









//tipe data  double 
//digunakan untuk menentukan anggota class yang hanya bisa diakses 
//oleh method yang ada didalam class tersebut.

//value yang bertipe data double, yang akan digunakan untuk menyimpan nilai yang akan dikonversi.
//method abstrak yaitu konversi, yang akan diimplementasikan oleh kelas turunannya