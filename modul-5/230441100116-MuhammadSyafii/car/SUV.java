
package car;

public class SUV extends Mobil {     
    String kelebihan = "Kuat di berbagai medan";      
    SUV(String Merk, String Model, int TahunProduksi){         
        super(Merk, Model, TahunProduksi);     
    }      
    
    @Override
    void Feature(){ 
           System.out.println("Feature : Anti air"); 
        }
    void Display(){         
    super.Display();         
    System.out.println("Kelebihan : "+ this.kelebihan);     
    } 
}
