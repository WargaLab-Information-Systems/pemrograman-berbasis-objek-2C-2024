package tugaspraktikummodul1no1;

class manusia{
    String nama;
    int umur;
    String alamat;


    void berjalan(){
        System.out.println("berjalan kaki");
    }
    void berlari(){
        System.out.println("jogging");
    }
}
public class TugasPraktikumModul1No1 {
    public static void main(String[] args) {
        manusia orang = new manusia();
        orang.nama = "Romy";
        orang.umur = 20;
        orang.alamat = "Surabaya";
        
        System.out.println("Dia adalah "+orang.nama);
        System.out.println("Dia berumur "+orang.umur);
        System.out.println("Romy berasal dari kota "+orang.alamat);
        
        System.out.print(orang.nama+" pergi ke sekolah dengan ");
        orang.berjalan();
        System.out.print(orang.nama+" juga hobi ");
        orang.berlari();
    }
}
