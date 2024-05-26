package MODUL5;

public class M_SPORT extends MOBIL{
    
    String mampu = "DESAIN YANG MENAWAN, TEKNOLOGI CANGGIH DAN MAMPU DIGUNAKAN DALAM KECEPATAN TINGGI";
    M_SPORT(String pilih, String merek, String model,int tahun){
        super(pilih,merek,model,tahun);
    }


//OVERRIDING
    @Override
    void showfeature(){
        super.showfeature();
        System.out.println("KELEBIHAN     : " +this.mampu);
    }
    
}
