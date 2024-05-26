package MODUL5;

//PEWARISAN DARI SUP CLASS TERHADAP SUB CLASS
public class MPV extends MOBIL{
    
    String mampu = "KAPASITAS PENUMPANG LEBIH BANYAK DAN FITUR KEAMANAN YANG LENGKAP";
    
    MPV(String pilih, String merek, String model, int tahun){
        super(pilih,merek,model,tahun);
    }

//OVERRIDING
    @Override
    void showfeature(){
        super.showfeature();
        System.out.println("KELEBIHAN     : " +this.mampu);
    }
} 

