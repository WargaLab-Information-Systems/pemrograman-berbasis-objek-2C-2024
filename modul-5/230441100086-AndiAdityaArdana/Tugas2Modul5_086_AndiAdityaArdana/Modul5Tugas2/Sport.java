package Modul5Tugas2;


class Sport extends Mobil {
    public Sport(String merk, String model, int tahunProduksi) {
        super(merk, model, tahunProduksi);
    }

    @Override
    public void showFeature() {
        super.showFeature();
        System.out.println("Keunggulan: Kencang dan sporty");
    }
}