package car;

public class MobilListrik extends Mobil {     
    String kelebihan = "Bahan bakar efisien";      
    MobilListrik(String Merk, String Model, int TahunProduksi){         
    super(Merk, Model, TahunProduksi);     
    }      
    
    @Override
    void Feature(){ 
           System.out.println("Feature : Auto pilot"); 
        }
    void Display(){        
    super.Display(); 
    
    System.out.println("Kelebihan : "+ this.kelebihan);     
    } 
}
