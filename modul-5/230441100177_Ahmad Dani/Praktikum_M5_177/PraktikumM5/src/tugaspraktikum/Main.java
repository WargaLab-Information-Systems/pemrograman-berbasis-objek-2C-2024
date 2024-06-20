package tugaspraktikum;

import java.util.Scanner;

class Mobil {
    protected String warna;
    private String merk, model;
    private int tahunProduksi;

    public Mobil(String merk, String model, int tahunProduksi) {
        this.merk = merk;
        this.model = model;
        this.tahunProduksi = tahunProduksi;
    }
    
    public String getWarna() {
        return warna;
    }
    
    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getTahunProduksi() {
        return tahunProduksi;
    }

    public void setTahunProduksi(int tahunProduksi) {
        this.tahunProduksi = tahunProduksi;
    }
    
    public void showFeature() {
        System.out.println("Fitur mobil : ");
        System.out.println("\t- AC");
        System.out.println("\t- Klakson");
    } 
    
    public void showFeature(String warna) {
        System.out.println("Warna mobil " + warna);
    } 
}

class MPV extends Mobil {

    public MPV(String merk, String model, int tahunProduksi) {
        super(merk, model, tahunProduksi);
    }
    
    @Override
    public void showFeature() {
        super.showFeature();
        System.out.println("Fitur Mobil MPV : ");
        System.out.println("1. Kapasitas penumpang banyak");
        System.out.println("2. Kabin lega dan nyaman");
    }  
    
}

class SUV extends Mobil {
    public SUV(String merk, String model, int tahunProduksi) {
        super(merk, model, tahunProduksi);
    }
    
    @Override
    public void showFeature() {
        super.showFeature();
        System.out.println("Fitur Mobil SUV : ");
        System.out.println("1. Tangguh di segala Medan");
        System.out.println("2. Nyaman dan aman");
    }
    
}

class MobilSport extends Mobil {

    public MobilSport(String merk, String model, int tahunProduksi) {
        super(merk, model, tahunProduksi);
    }

    @Override
    public void showFeature() {
        super.showFeature();
        System.out.println("Fitur Mobil Sport : ");
        System.out.println("1. Performa Superior");
        System.out.println("2. Teknologi Terkini");
    }
}

class MobilListrik extends Mobil {
    private int kapasitasBaterai;

    public MobilListrik(String merk, String model, int tahunProduksi, int kapasitasBaterai) {
        super(merk, model, tahunProduksi);
        this.kapasitasBaterai = kapasitasBaterai;
    }
    
    @Override
    public void showFeature () {
        super.showFeature();
        System.out.println("Fitur Mobil Listrik : ");
        System.out.println("1. Suara senyap.");
        System.out.println("2. Pemakaian Energi Efisien");
    }
}

public class Main {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Data Mobil");
        System.out.println("----------");
        
        System.out.println("Masukan tipe Mobil(MPV, SUV, MobilSport, MobilListrik): ");
        String tipeMobil = scan.nextLine();
        
        Mobil mobil;
        
        System.out.print("Merk Mobil \t: ");
        String merk = scan.nextLine();
                
        System.out.print("Model Mobil \t: ");
        String model = scan.nextLine();
                
        System.out.print("Tahun Produksi Mobil \t: ");
        int tahunProduksi = scan.nextInt();
                
        scan.nextLine();
                
        System.out.print("Warna Mobil \t: ");
        String warna = scan.nextLine();
               
        switch(tipeMobil.toUpperCase()) {
            case "MPV" :
                mobil = new MPV(merk, model, tahunProduksi);
                mobil.showFeature(warna);
                break;
            case "SUV" :
                mobil = new SUV(merk, model, tahunProduksi);
                mobil.showFeature(warna);
                break;
            case "MOBILSPORT" :
                mobil = new MobilSport(merk, model, tahunProduksi);
                mobil.showFeature(warna);
                break;
            case "MOBILLISTRIK" :
                System.out.print("Kapasitas Baterai Mobil \t: ");
                int kapasitasBaterai = scan.nextInt();
                
                mobil = new MobilListrik(merk, model, tahunProduksi, kapasitasBaterai);
                mobil.showFeature(warna);
                break;
            default :
                System.out.println("Data mobil tidak ditemukan");
                mobil = null; 
        }
        
        if(mobil != null) {
            System.out.println("\nData Mobil ");
            System.out.println("\t- Merk : " + mobil.getMerk());
            System.out.println("\t- Model : " + mobil.getModel());
            System.out.println("\t- Tahun Produksi : " + mobil.getTahunProduksi());
            mobil.showFeature(warna);
            mobil.showFeature();
        }
    }
}
