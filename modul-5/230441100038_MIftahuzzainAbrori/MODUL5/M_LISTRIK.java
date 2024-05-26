package MODUL5;


public class M_LISTRIK extends MOBIL{
    
    String mampu = "RAMAH LINGKUNGAN KARENA TIDAK MENGHASILKAN EMISI YANG DAPAT MEMPENGARUHI POLUSI";
    M_LISTRIK(String pilih, String merek, String model,int tahun){
        super(pilih,merek,model,tahun);
    }


//OVERRIDING
    @Override
    void showfeature(){
        super.showfeature();
        System.out.println("KELEBIHAN     : " +this.mampu);
    }
    
}

    

