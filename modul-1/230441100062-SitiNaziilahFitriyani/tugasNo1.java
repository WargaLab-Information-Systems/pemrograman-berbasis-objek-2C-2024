
package praktikumpbo;

class Manusia {
    String Nama ;
    int Umur ;
    String Alamat ;
    
    void berjalan (){
        System.out.println(Nama + " dapat berjalan");
    }
    void berlari () {
        System.out.println(Nama + " dapat berlari");
    }
    
}

public class tugasNo1 {

    public static void main(String[] args) {
        // TODO code application logic here
        Manusia orang1 = new Manusia ();
        Manusia orang2 = new Manusia ();
        Manusia orang3 = new Manusia ();
        
        orang1.Nama = "Mail";
        orang2.Nama = "Susanti";
        orang3.Nama = "Mei-mei";
        
        orang1.Umur = 14;
        orang2.Umur = 11;
        orang3.Umur = 12;
        
        orang1.Alamat = "Malaysia";
        orang2.Alamat = "Indonesia";
        orang3.Alamat = "China";
        
        
        System.out.println("              ORANG PERTAMA         ");
        System.out.println("Nama    : "+orang1.Nama);
        System.out.println("Umur    : "+orang1.Umur);
        System.out.println("Alamat  : "+orang1.Alamat);
        orang1.berjalan();
        orang1.berlari();
        System.out.println("------------------------------------");
        
        System.out.println();
        System.out.println("             ORANG KEDUA          ");
        System.out.println("Nama    : "+orang2.Nama);
        System.out.println("Umur    : "+orang2.Umur);
        System.out.println("Alamat  : "+orang2.Alamat);
        orang2.berjalan();
        orang2.berlari();
        System.out.println("------------------------------------");
        
        System.out.println();
        System.out.println("              ORANG KETIGA         ");
        System.out.println("Nama    : "+orang3.Nama);
        System.out.println("Umur    : "+orang3.Umur);
        System.out.println("Alamat  : "+orang3.Alamat);
        orang3.berjalan();
        orang3.berlari();
 
    }
    
}
