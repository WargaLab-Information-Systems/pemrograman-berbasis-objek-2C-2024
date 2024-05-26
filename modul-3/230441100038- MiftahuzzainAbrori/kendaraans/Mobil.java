
package kendaraans;

//Inheritence atau Pewarisan dari superclass
public class Mobil extends KENDARAANS{
    String tipe = "mewah";
    public Mobil(String merekkendaraan, String modelkendaraan, char statuskendaraan, int tahunkendaraan) {
        super("mobil", merekkendaraan, modelkendaraan, statuskendaraan, tahunkendaraan);
    }   

    //Memanngil superclass ke dalam sublass
    @Override
    public void displayInfo(){
         super.displayInfo();
         System.out.println("vasilitas : "+this.tipe);
         
         
    }
}
