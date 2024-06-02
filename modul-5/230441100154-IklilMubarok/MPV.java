
package mobil;


public class MPV extends Mobil{
    @Override
    void showFeature(){
        display();
        System.out.println("Kelebihan Tipe MPV :");
        System.out.println("-> Kapasitas Penumpang yang Besar");
        System.out.println("-> Fleksibilitas Ruang Penumpang");
        System.out.println("-> Ruang Kargo yang Luas");
        System.out.println("-> Kenyamanan dalam Berkendara");
        System.out.println("-> Effisiensi Bahan Bakar yang Baik");
        System.out.println("-> Kemudahan Manuver");
    }
    
    void showFeature(String jenis) {
        System.out.println("jenis mobil ini : "+jenis);
    }
    
}
