
package mobil;


class Mpv extends Mobil {
    public Mpv(String merek, String model,  int tahunProduksi) {
        super(merek, model,tahunProduksi);
    }

    
    @Override
    public void showFeature() {
        super.showFeature();
        System.out.println("kelebihan Mpv: Penyimpanan ruang luas");
    }
}
    

