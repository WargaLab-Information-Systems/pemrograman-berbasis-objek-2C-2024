
package pekerja;


class Penyanyi extends Pekerja {
    public Penyanyi(String nama, int usia) {
        super(nama, usia);
    }

    @Override
    public void pekerjaan() {
        System.out.println(nama + " (usia " + usia + " tahun) adalah seorang penyanyi.");
    }
}
