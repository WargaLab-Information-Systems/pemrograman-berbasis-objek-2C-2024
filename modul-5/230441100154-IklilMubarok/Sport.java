
package mobil;


public class Sport extends Mobil{
    @Override
    void showFeature(){
        display();
        System.out.println("Kelebihan Tipe Sport :");
        System.out.println("-> Kinerja Tinggi");
        System.out.println("-> Handling yang Superior");
        System.out.println("-> Desain Menawan");
        System.out.println("-> Pengalaman Berkendara yang Memuaskan");
        System.out.println("-> Inovasi Teknologi");
        System.out.println("-> Prestise dan Citra");
    }
    
    void showFeature(int kecepatan){
        System.out.println("kecepatan mobil:"+kecepatan+"km/jam");
        
    }
}


