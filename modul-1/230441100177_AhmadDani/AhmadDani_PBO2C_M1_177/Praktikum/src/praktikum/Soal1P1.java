package praktikum;
class Manusia {
    String nama, alamat;
    int umur;
        
    String berjalan() {
        return (nama + " Sedang berjalan");
    }
    
    String berlari() {
        return (nama + " Sedang berlari");
    }
}

public class Soal1P1 {
    public static void main(String[] args) {
        Manusia upin = new Manusia();
        upin.nama = "Upin";
        upin.alamat = "Malaysia";
        upin.umur = 12;
        System.out.println(upin.berjalan());
        System.out.println(upin.berlari());
        
        Manusia ipin = new Manusia();
        ipin.nama = "Susanti";
        ipin.alamat = "Indonesia";
        ipin.umur = 12;
        System.out.println(ipin.berjalan());
        System.out.println(ipin.berlari());
        
    }
}
