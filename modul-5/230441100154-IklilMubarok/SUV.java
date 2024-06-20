
package mobil;


public class SUV extends Mobil {
    @Override
    void showFeature(){
        display();
        System.out.println("Kelebihan Tipe SUV :");
        System.out.println("-> Kemampuan Off-road yang Baik");
        System.out.println("-> Kapasitas Angkut yang Baik");
        System.out.println("-> Ruang Kargo yang Luas");
        System.out.println("-> Fleksibilitas Ruang");
        System.out.println("-> Gaya dan Keamanan");
        System.out.println("-> Kinerja Berkendara yang Lebih Baik di Cuaca Buruk");
    }
    
    void showFeature(int berat){
        System.out.println("Berat mobil ini : "+ berat +"ton");
    }
   
}
