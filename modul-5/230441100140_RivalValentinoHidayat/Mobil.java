/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mobil;

class Mobil {
    String merk;
    String model;
    String TahunProduksi;

    Mobil(String merk, String model, String TahunProduksi){
        this.merk = merk;
        this.model = model;
        this.TahunProduksi = TahunProduksi;
    }
    
   //ini
    Mobil(String merk, String model){
        this(merk, model, " ");
    }

    void showFeature(){
        System.out.println("Fitur mobil: " +
                "Merknya " + merk + " " +
                "Modelnya " + model + " " +
                "Tahun Produksi " + TahunProduksi);
    }

    //ini
    void showFeature(String additionalInfo){
        System.out.println("Fitur mobil: " +
                "Merk nya " + merk + " " +
                "Model nya " + model + " " +
                "Tahun Produksi " + TahunProduksi + " " +
                additionalInfo);
    }
}

class MPV extends Mobil {
    MPV(String merk, String model, String TahunProduksi){
        super(merk, model, TahunProduksi);
    }
    
    @Override
    void showFeature(){
        System.out.println("================================");
        super.showFeature();
        System.out.println("MPV ini sangat besar");
        System.out.println();
    }
}

class SUV extends Mobil {
    SUV(String merk, String model, String TahunProduksi){
        super(merk, model, TahunProduksi);
    }
    
    @Override
    void showFeature(){
        System.out.println("================================");
        super.showFeature();
        System.out.println("SUV ini bisa di semua medan");
        System.out.println();
    }
}

class MobilSport extends Mobil {
    MobilSport(String merk, String model, String TahunProduksi){
        super(merk, model, TahunProduksi);
    }
    
    @Override
    void showFeature(){
        System.out.println("================================");
        super.showFeature();
        System.out.println("Mobil sport ini sangat keren");
        System.out.println();
    }
}

class MobilListrik extends Mobil {
    MobilListrik(String merk, String model, String TahunProduksi){
        super(merk, model, TahunProduksi);
    }
    
    @Override
    void showFeature(){
        System.out.println("================================");
        super.showFeature();
        System.out.println("Mobil listrik ini mengurangi pemanasan global");
        System.out.println();
    }
}

//public class Main{
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner (System.in);
//        
//        System.out.print("Masukkan merk mobil: ");
//        String merk= scanner.nextLine();
//        System.out.print("Masukkan modelnya mobil: ");
//        String model= scanner.nextLine();
//        System.out.print("Masukkan tahun produksi mobil: ");
//        String TahunProduksi= scanner.nextLine();
//        
//        Mobil mobil = new Mobil(merk, model, TahunProduksi);
//        mobil.method();
//        
//        
//        MPV mpv = new MPV (merk, model, TahunProduksi);
//        mpv.method();
//        
//        SUV suv = new SUV (merk, model, TahunProduksi);
//        suv.method();
//        
//        MobilSport mobilsport = new MobilSport (merk, model, TahunProduksi);
//        mobilsport.method();
//        
//        MobilListrik mobillistrik = new MobilListrik (merk, model, TahunProduksi);
//        mobillistrik.method();
//    }
//}
// 
//
