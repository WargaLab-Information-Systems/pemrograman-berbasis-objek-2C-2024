
package mobil;

public class Suv extends Mobil {
    public Suv(String merek, String model, int tahunProduksi) {
        super(merek, model,tahunProduksi);
    }

    @Override
    public void showFeature() {
        super.showFeature();
        System.out.println("kelebihan SUV: Kemampuan off-road");
    }
}
