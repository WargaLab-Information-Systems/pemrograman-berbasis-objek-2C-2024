package modul1.praktikumpbo.nomor1;

public class Modul1PraktikumPBONomor1 {
    public static void main(String[] args) {
        Manusia orang1 = new Manusia();
        Manusia orang2 = new Manusia();
        
        orang1.nama = "Andi";
        orang1.umur = 19;
        orang1.alamat = "Sidoarjo";
        System.out.println("Nama objek 1 adalah " + orang1.nama);
        System.out.println("Umur objek 1 adalah " + orang1.umur + " Tahun");
        System.out.println("Alamat objek 1 adalah " + orang1.alamat);
        orang1.berjalan();
        orang1.berlari();
        System.out.println("Terimakasih");
        
        
        orang2.nama = "Nindi";
        orang2.umur = 19;
        orang2.alamat = "Surabaya";
        System.out.println("Nama objek 2 adalah " + orang2.nama);
        System.out.println("Umur objek 2 adalah " + orang2.umur +" Tahun");
        System.out.println("Alamat objek 2 adalah " + orang2.alamat);
        orang2.berjalan();
        orang2.berlari();
        System.out.println("Terimakasih");
    }
}

class Manusia {
    String nama;
    int umur;
    String alamat;
    
    public void berlari(){
        System.out.println("Objek ini " + this.nama + " Sedang berlari");
    }
    
    void berjalan() {
         System.out.println("Objek ini "  + this.nama + " Sedang berjalan");  
    }
}
