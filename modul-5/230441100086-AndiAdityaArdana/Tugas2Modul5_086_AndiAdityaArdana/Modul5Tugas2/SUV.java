package Modul5Tugas2;

class SUV extends Mobil {
    public SUV(String merk, String model, int tahunProduksi) {
        super(merk, model, tahunProduksi);
    }

    @Override
    public void showFeature() {
        super.showFeature();
        System.out.println("Keunggulan: Kemampuan off-road");
    }
}