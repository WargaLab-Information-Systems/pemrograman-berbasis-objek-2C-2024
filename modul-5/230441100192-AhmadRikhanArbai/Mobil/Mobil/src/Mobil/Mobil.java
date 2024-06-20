package Mobil;

abstract class Mobil {
    String merek;
    String model;
    int tahun;


    public Mobil(String merek, String model, int tahun) {
        this.merek = merek;
        this.model = model;
        this.tahun = tahun;
    }

    abstract void showfeature(String merek);

    public void info(){
        System.out.println();
        System.out.println("Merek: " + merek);
        System.out.println("Model: " + model);
        System.out.println("Tahun: " + tahun);
        System.out.println();
    }
}
