
package pekerja;


class Guru extends Pekerja {
    public Guru(String nama, int usia) {
        super(nama, usia);
    }

    @Override
    public void pekerjaan() {
        System.out.println(nama + " (usia " + usia + " tahun) adalah seorang guru.");
    }
}
