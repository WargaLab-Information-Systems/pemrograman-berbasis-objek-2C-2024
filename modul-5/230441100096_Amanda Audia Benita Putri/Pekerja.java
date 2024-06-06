
package pekerja;


class Pekerja {
     String nama;
     int usia;

    public Pekerja(String nama, int usia) {
        this.nama = nama;
        this.usia = usia;
    }

    public void pekerjaan() {
        System.out.println(nama + " (usia " + usia + " tahun) adalah seorang pekerja.");
    }
}

