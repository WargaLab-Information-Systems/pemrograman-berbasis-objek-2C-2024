
package konversi;


abstract class Konversi {
    public double value ;
    
    public Konversi(double value){
        this.value = value ; 
    }
    
    public abstract double KonversiSatuan(String SatuanAsal, String to); 
}
