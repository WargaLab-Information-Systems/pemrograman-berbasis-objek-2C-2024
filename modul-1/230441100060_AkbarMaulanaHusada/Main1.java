package PBOTugas1;


class manusia {
    String nama;
    String umur;
    String alamat;

    void berjalan(){
        System.out.println(nama + " berjalan");
    }

    void berlari(){
        System.out.println(nama + " berlari");
    }

    void terbang(){
        System.out.println(nama + "Terbang");
    }
    
}

public class Main1 {
    
    public static void main(String[] args) {

        manusia manusia1 = new manusia();
        manusia1.nama = "Akbar";
        manusia1.umur = "19 Tahun";
        manusia1.alamat = "Sumenep";
        System.out.println("Nama : " +manusia1.nama);
        System.out.println("Umur : " +manusia1.umur);
        System.out.println("Alamat : "+manusia1.alamat);
        manusia1.berjalan();
        System.out.println();
        
        manusia manusia2 = new manusia();
        manusia2.nama = "Memet";
        manusia2.umur = "19 Tahun";
        manusia2.alamat = "Sumenep";
        System.out.println("Nama : " +manusia2.nama);
        System.out.println("Umur : " +manusia2.umur);
        System.out.println("Alamat : "+manusia2.alamat);
        manusia2.berlari();
        System.out.println();
        
        manusia manusia3 = new manusia();
        manusia3.nama = "Ari";
        manusia3.umur = "20 Tahun";
        manusia3.alamat = "Pamekasan";
        System.out.println("Nama : " +manusia3.nama);
        System.out.println("Umur : " +manusia3.umur);
        System.out.println("Alamat : "+manusia3.alamat);
        manusia3.berlari();

        manusia manusia4 = new manusia();
        manusia4.nama = "Syafii";
        manusia4.umur = "21 Tahun";
        manusia4.alamat = "Pamekasan";
        System.out.println("Nama : " +manusia4.nama);
        System.out.println("Umur : " +manusia4.umur);
        System.out.println("Alamat : "+manusia4.alamat);
        manusia4.terbang();
        
    }
}
