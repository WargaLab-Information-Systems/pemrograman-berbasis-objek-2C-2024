
package MODUL5;

public class SUV extends MOBIL{
    
    String mampu = "KUAT DI BERBAGAI MEDAN DAN LEBIH EFISIEN UNTUK MEMBAWA BARANG BANYAK";
    SUV(String pilih, String merek, String model,int tahun){
        super(pilih,merek,model,tahun);
    }


//OVERRIDING
    @Override
    void showfeature(){
        super.showfeature();
        System.out.println("KELEBIHAN     : " +this.mampu);
    }
    
}
