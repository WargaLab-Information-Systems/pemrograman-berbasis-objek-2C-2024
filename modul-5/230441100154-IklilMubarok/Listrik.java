
package mobil;


public class Listrik extends Mobil {
    @Override
    void showFeature(){
        display();
        System.out.println("Kelebhan Tipe Listrik :");
        System.out.println("-> Teknologi Canggih");
        System.out.println("-> Kenyamanan dan Ketenangan");
        System.out.println("-> Subsidi dan Insentif Pemerintah");
        System.out.println("-> Pengalaman Berkendara yang Memuaskan");
        System.out.println("-> Ramah Lingkungan");
        System.out.println("-> Biaya Operasional yang Rendah");
    }
    
    void showFeature(String warna){
        System.out.println("Warna mobil ini : "+ warna);
    }
}
