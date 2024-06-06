
package pekerja;


class Mekanik extends Pekerja {
    public Mekanik(String nama, int usia) {
        super(nama, usia);
    }

    @Override
    public void pekerjaan() {
        System.out.println(nama + " (usia " + usia + " tahun) adalah seorang mekanik.");
    }
}

