/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mobil;

public class MSport extends Mobil{
    
    String mampu = "DESAIN YANG MENAWAN, TEKNOLOGI CANGGIH DAN MAMPU DIGUNAKAN DALAM KECEPATAN TINGGI";
    MSport(String kategori, String merek, String model,int tahun){
        super(kategori,merek,model,tahun);
    }
    //OVERRIDING
    @Override
    void display(){
        super.display();
        System.out.println("KELEBIHAN     : " +this.mampu);
    }
   
    void display(int kecepatan) {
        System.out.println("KECEPATAN: 60km/j");
    }
    
}
