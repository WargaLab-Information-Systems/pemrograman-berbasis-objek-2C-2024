package modul1_no1;

class Manusia {
    String nama;
    int umur;
    String alamat;
    
     void berjalan() {
        System.out.println(nama + " sedang berjalan santai.\n");
    }
    
    
     void berlari() {
        System.out.println(nama + " sedang berlari dengan cepat.");
    }

   
     void Informasi() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Alamat: " + alamat);
    }
    
}

public class Modul1_no1 {

    
    public static void main(String[] args) {
       
        Manusia manusia1 = new Manusia();
        manusia1.nama = "Ambatubang";
        manusia1.umur = 25;
        manusia1.alamat = "Jl. Anomali No. 123";
        
        Manusia manusia2 = new Manusia();
        manusia2.nama = "Rusdi";
        manusia2.umur = 30;
        manusia2.alamat = "Jl. Ngawi Dua No. 45";
      
        
        manusia1.Informasi();
        manusia1.berjalan();
        
        manusia2.Informasi();
        manusia2.berlari();
    }
    
}
