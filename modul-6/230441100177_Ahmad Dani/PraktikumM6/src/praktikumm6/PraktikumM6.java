
package praktikumm6;

interface mobilIce {
    void berjalan();
}

interface mobilListrik {
    void warna();
}

class mobilHybrid implements mobilIce, mobilListrik {
    public void berjalan() {
        System.out.println("Mobil Hybrid sedang berjalan");
    }
    
    public void warna() {
        System.out.println("Mobil ini berwarna Hitam");
    }
}

public class PraktikumM6 {

    public static void main(String[] args) {
        mobilHybrid mHyb = new mobilHybrid();
        mHyb.berjalan();
        mHyb.warna();
    }
    
}
