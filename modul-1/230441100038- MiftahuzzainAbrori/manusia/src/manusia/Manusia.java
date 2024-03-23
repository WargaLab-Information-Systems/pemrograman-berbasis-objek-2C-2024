package manusia;
public class Manusia {
//    atribut
    String nama;
    int umur;
    String alamat;
 
    void berjalan(){
        System.out.println("METHOD 1 : BERJALAN");      
 }
    void berlari(){
        System.out.println("MWTHOD 2 : BERLARI");
        
 }  
    public static void main(String[] args) {
        Manusia atribut = new Manusia();

        atribut.nama="MIFTAHUZZAIN ABRORI";
        atribut.umur =20;
        atribut.alamat="KEC.MASALEMBU KAB SUMENEP";
        atribut.berjalan();
        atribut.berlari();
        
        System.out.println("NAMA : "+atribut.nama);
        System.out.println("UMUR : "+atribut.umur);
        System.out.println("ALAMAT :"+atribut.alamat);        
    }
    
}
