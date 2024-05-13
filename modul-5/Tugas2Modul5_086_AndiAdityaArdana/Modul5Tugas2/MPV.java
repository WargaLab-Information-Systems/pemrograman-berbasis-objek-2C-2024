package Modul5Tugas2;

class MPV extends Mobil {
    public MPV(String merk, String model, int tahunProduksi) {
        super(merk, model, tahunProduksi);
    }

    @Override
    public void showFeature() {
        super.showFeature();
        System.out.println("Keunggulan: Multi guna");
    }
}