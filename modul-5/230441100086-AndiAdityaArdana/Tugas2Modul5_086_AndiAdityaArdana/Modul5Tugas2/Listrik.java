package Modul5Tugas2;


class Listrik extends Mobil {
    public Listrik(String merk, String model, int tahunProduksi) {
        super(merk, model, tahunProduksi);
    }

    @Override
    public void showFeature() {
        super.showFeature();
        System.out.println("Keunggulan: Ramah lingkungan");
    }
}