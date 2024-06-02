
package mobil;


class MobilSport extends Mobil {
    public MobilSport(String merek, String model, int tahunProduksi) {
        super(merek, model, tahunProduksi);
    }

    @Override
     public void showFeature() {
        super.showFeature();
        System.out.println("kelebihan MobilSport: Kencang dan Sporty");
    }
}  

