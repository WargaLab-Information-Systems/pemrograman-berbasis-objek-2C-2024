package kendaraans;

//Inheritence atau Pewarisan dari superclass
public class Motor extends KENDARAANS{
    public Motor(String merekkendaraan, String modelkendaraan, char statuskendaraan, int tahunkendaraan) {
        super("motor", merekkendaraan, modelkendaraan, statuskendaraan, tahunkendaraan);
    }   
    
    //Memanngil superclass ke dalam sublass
    @Override
    public void displayInfo(){
         super.displayInfo();
        
         
    }
}
