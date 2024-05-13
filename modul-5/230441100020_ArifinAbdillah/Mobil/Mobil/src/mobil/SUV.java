/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
    package mobil;


    public class SUV extends Mobil{
        String Kelebihan ="Kemampuan Off-Road";

        SUV(String merk, String model, int TahunProduksi) {
            super(merk, model, TahunProduksi);
        }   

        @Override
        void showfeature(){
            super.showfeature();
                System.out.println("Kelebihan         : "+Kelebihan);
        }
    }

