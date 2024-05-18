package car;

public class Mobil {     
    String Merk, Model;     
    int TahunProduksi ;      
    
    Mobil(String Merk, String Model, int TahunProduksi){         
    this.Merk = Merk ;         
    this.Model = Model ;         
    this.TahunProduksi = TahunProduksi ;     
    }      
    
    void Feature(){         
      System.out.println("Fitur : Sensor parking and keyless entry");     
    }      
    
    void Display(){         
      System.out.println("\nInformasi Kendaraaan");
      System.out.println("Merk  : " +this.Merk);         
      System.out.println("Model : " +this.Model);         
      System.out.println("Tahun Produksi  : " +this.TahunProduksi);     
    } 
}