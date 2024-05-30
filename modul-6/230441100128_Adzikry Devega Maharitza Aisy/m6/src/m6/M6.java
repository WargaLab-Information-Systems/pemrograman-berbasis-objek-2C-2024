//
package m6;

import java.util.Scanner;

interface Kamera {
    void ambilFoto();
    void rekamVideo();
}

interface Bluetooth {
    void kirimFile();
    void terimaFile();
    void koneksiPerangkat();
}

interface Wifi {
    void cariJaringan();
    void hubungkanJaringan();
    void lupakanJaringan();
}

interface GPS {
    void ambilKoordinat();
}

abstract class Gadget implements Kamera, Bluetooth, Wifi, GPS {
    String merk;
    String model;

    Gadget(String merk, String model) {
        this.merk = merk;
        this.model = model;
    }

    abstract void displayInfo();

}

class Smartphone extends Gadget  {
    Smartphone(String merk, String model) {
        super(merk, model);
    }

    @Override
    void displayInfo() {
        System.out.println("Smartphone \nMerk: " + merk + " \nModel: " + model);
    }

    @Override
    public void ambilFoto() {
        System.out.println("pengambilan foto pada smartphone jernih");
    }
    @Override
    public void rekamVideo() {
        System.out.println("perekaman video pada smartphone stabil");
    }

    @Override
    public void kirimFile() {
        System.out.println("Smartphone mengirim file dengan cepat.");
    }
    @Override
    public void terimaFile() {
        System.out.println("smartphone menerima file dengan cepat");
    }
    @Override
    public void koneksiPerangkat() {
        System.out.println("koneksi perangkat smartphone menggunakan bluetooth cepat");
    }

    @Override
    public void cariJaringan() {
        System.out.println("mencari jaringan wifi pada smartphone dengan cepat");
    }
    @Override
    public void hubungkanJaringan() {
        System.out.println("fitur menghubungkan jaringan wifi pada smartphone cepat");
    }
    @Override
    public void lupakanJaringan() {
        System.out.println("terdapat fitur melupakan jaringan pada wifi smartphone");
    }

    @Override
    public void ambilKoordinat() {
        System.out.println("titik pengambilan koordinat pada GPS akurat");
    }
}

class Tablet extends Gadget {
    Tablet(String merk, String model) {
        super(merk, model);
    }

    @Override
    void displayInfo() {
        System.out.println("Tablet \nMerk: " + merk + " \nModel: " + model);
    }

    @Override
    public void ambilFoto() {
        System.out.println("pengambilan foto pada tablet jernih");
    }
    @Override
    public void rekamVideo() {
        System.out.println("perekaman video pada tablet stabil");
    }

    @Override
    public void kirimFile() {
        System.out.println("tablet mengirim file dengan cepat");
    }
    @Override
    public void terimaFile() {
        System.out.println("tablet menerima file dengan cepat");
    }
    @Override
    public void koneksiPerangkat() {
        System.out.println("koneksi perangkat tablet menggunakan bluetooth cepat");
    }

    @Override
    public void cariJaringan() {
        System.out.println("mencari jaringan wifi pada tablet dengan cepat");
    }
    @Override
    public void hubungkanJaringan() {
        System.out.println("fitur menghubungkan jaringan wifi pada tablet cepat");
    }
    @Override
    public void lupakanJaringan() {
        System.out.println("terdapat fitur melupakan jaringan pada wifi tablet");
    }

    @Override
    public void ambilKoordinat() {
        System.out.println("titik pengambilan koordinat pada GPS tablet akurat.");
    }
}

class Laptop extends Gadget  {
    Laptop(String merk, String model) {
        super(merk, model);
    }

    @Override
    void displayInfo() {
        System.out.println("Laptop \nMerk: " + merk + " \nModel: " + model);
    }
    
    @Override
    public void ambilFoto() {
        System.out.println("pengambilan foto pada Laptop lumayan baik");
    }
    @Override
    public void rekamVideo() {
        System.out.println("perekaman video pada laptop lumayan baik");
    }

    @Override
    public void kirimFile() {
        System.out.println("laptop mengirim file dengan cepat");
    }
    @Override
    public void terimaFile() {
        System.out.println("laptop menerima file dengan cepat");
    }
    @Override
    public void koneksiPerangkat() {
        System.out.println("koneksi perangkat laptop menggunakan bluetooth cepat.");
    }

    @Override
    public void cariJaringan() {
        System.out.println("mencari jaringan wifi pada laptop sangatcepat");
    }
    @Override
    public void hubungkanJaringan() {
        System.out.println("fitur menghubungkan jaringan wifi pada laptop cepat.");
    }
    @Override
    public void lupakanJaringan() {
        System.out.println("terdapat fitur melupakan jaringan pada wifi tablet");
    }
    @Override
    public void ambilKoordinat() {
        System.out.println("titik pengambilan koordinat pada GPS laptop lumayan akurat.");
    }
}

public class M6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan merk Smartphone ke-1: ");
        String merk = scanner.nextLine();
        System.out.print("Masukkan model Smartphone ke-1: ");
        String model = scanner.nextLine();
        
        System.out.print("Masukkan merk Smartphone ke-2: ");
        String merk2 = scanner.nextLine();
        System.out.print("Masukkan model Smartphone ke-2: ");
        String model2 = scanner.nextLine();
        
        System.out.print("Masukkan merk Tablet ke-1: ");
        String merkTablet = scanner.nextLine();
        System.out.print("Masukkan model Tablet ke-1: ");
        String modelTablet = scanner.nextLine();
        
        System.out.print("Masukkan merk Tablet ke-2: ");
        String merkTablet2 = scanner.nextLine();
        System.out.print("Masukkan model Tablet ke-2: ");
        String modelTablet2 = scanner.nextLine();
        
        System.out.print("Masukkan merk Laptop ke-1: ");
        String merkLaptop = scanner.nextLine();
        System.out.print("Masukkan model laptop ke-1: ");
        String modelLaptop = scanner.nextLine();
        
        System.out.print("Masukkan merk Laptop ke-2: ");
        String merkLaptop2 = scanner.nextLine();
        System.out.print("Masukkan model laptop ke-2: ");
        String modelLaptop2 = scanner.nextLine();
        
        Gadget[] gadget=new Gadget[6];
        gadget[0]=new Smartphone(merk,model);
        gadget[1]=new Smartphone(merk2,model2);
        gadget[2]=new Tablet(merkTablet,modelTablet);
        gadget[3]=new Tablet(merkTablet2,modelTablet2);
        gadget[4]=new Laptop(merkLaptop,modelLaptop);
        gadget[5]=new Laptop(merkLaptop2,modelLaptop2);
        
        for(int i=0; i<gadget.length; i++){
            System.out.println("\nMASUKKAN INFORMASI:");
            gadget[i].displayInfo();
            gadget[i].ambilFoto();
            gadget[i].rekamVideo();
            gadget[i].kirimFile();
            gadget[i].terimaFile();
            gadget[i].koneksiPerangkat();
            gadget[i].cariJaringan();
            gadget[i].hubungkanJaringan();
            gadget[i].lupakanJaringan();
            gadget[i].ambilKoordinat();
            System.out.println();

        }
    }
}

