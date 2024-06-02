/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kendaraan;

//Inheritence atau Pewarisan dari superclass
public class Mobil extends Kendaraan{
    String tipe = "mewah";
    public Mobil(String merekkendaraan, String modelkendaraan, char statuskendaraan,
            int tahunkendaraan) {
        super("mobil", merekkendaraan, modelkendaraan, statuskendaraan,
                tahunkendaraan);
    }

    //Memanngil superclass ke dalam sublass 
    @Override
    public void displayInfo(){
         super.displayInfo();
         System.out.println("vasilitas : "+this.tipe);
         
         
    }
}


