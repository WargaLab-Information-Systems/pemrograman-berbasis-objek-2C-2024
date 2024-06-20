/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mobil;

public class SUV extends Mobil{
    
    String mampu = "KUAT DI BERBAGAI MEDAN DAN LEBIH EFISIEN UNTUK MEMBAWA BARANG BANYAK";
    SUV(String kategori, String merek, String model,int tahun){
        super(kategori,merek,model,tahun);
    }
    //OVERRIDING
    @Override
    void display(){
        super.display();
        System.out.println("KELEBIHAN     : " +this.mampu);
    }
     void display(int kecepatan) {
            System.out.println("KECEPATAN: 90km/j");
    }
     
}

