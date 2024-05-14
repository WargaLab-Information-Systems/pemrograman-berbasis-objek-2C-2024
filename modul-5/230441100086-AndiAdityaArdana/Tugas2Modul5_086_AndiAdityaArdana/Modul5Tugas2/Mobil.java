package Modul5Tugas2;

class Mobil {
    String merk;
    String model;
    int tahunProduksi;

    public Mobil(String merk, String model, int tahunProduksi) {
        this.merk = merk;
        this.model = model;
        this.tahunProduksi = tahunProduksi;
    }

    public void showFeature() {
        System.out.println("Mobil " + merk + " " + model + " tahun " + tahunProduksi);
    }
}