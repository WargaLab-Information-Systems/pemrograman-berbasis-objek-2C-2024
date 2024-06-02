
package mobil;


class MobilListrik extends Mobil {
    public MobilListrik(String merek, String model, int tahunProduksi){
        super(merek, model, tahunProduksi);
    }
    
    @Override
    public void showFeature(){
        super.showFeature();
        System.out.println("Kelebihan MobilListrik: Berjalan menggunakan baterai");
    }
    
}


