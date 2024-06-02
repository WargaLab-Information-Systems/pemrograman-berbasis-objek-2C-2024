package elektronik;
import java.util.Scanner;

  interface Kamera{
        void ambilfoto();
        void ambilvidio();
    }
    interface Bluetooth{
        void kirimfile();
        void terimafile();
        void koneksiperangkat();
    }
    interface WIFI{
        void carijaringan();
        void hubungkanjaringan();
        void lupakanjaringan();
    }
    interface GPS{
        void ambilkordinat();
    }
    abstract class gedget implements Kamera,Bluetooth,WIFI,GPS{
        String merk, model;
    abstract void displayInfo();
    }

    class Smartphone extends gedget{
        public void Smartphone(String merk, String model){
            super.merk = merk;
            super.model = model;
            System.out.println("Keunggulan Smartphone");
        }
        //        Kamera
    @Override
    public void ambilfoto(){
        System.out.println("Smartphone " + super.merk + " Bisa Ambil Foto");
    }
    @Override
    public void ambilvidio(){
        System.out.println("Smartphone " + super.merk + " Bisa Ambil video");
    }
//    Bluetoooth
    @Override
    public void kirimfile(){
        System.out.println("Smartphone " + super.merk + 
                " mengirim File menggunakan bluetooth");
    }
    @Override
    public void terimafile(){
        System.out.println("Smartphone " + super.merk + " menerima File menggunakan bluetooth");
    }
    @Override
    public void koneksiperangkat(){
        System.out.println("Smartphone " + super.merk + 
                " bisa mengkoneksikan perangkat lain menggunakan bluetooth");
    }
//    Wifi
    @Override
    public void carijaringan(){
        System.out.println("Smartphone " + super.merk + " Mencari Jaringan Wifi");
    }
    @Override
    public void hubungkanjaringan(){
        System.out.println("Smartphone " + super.merk + " Menghubungkan ke jaringan WiFi");
    }
    @Override
    public void lupakanjaringan(){
        System.out.println("fitur di Smartphone " + super.merk + " dapat melupakan jaringan");
    }
//    GPS
    @Override
    public void ambilkordinat(){
        System.out.println("Smartphone " + super.merk + " Ambil Koordinat Gps");
    }
    
    @Override
     void displayInfo() {
        System.out.println("\nSpesifikasi Smartphone");
        System.out.println("Merk \t: " + super.merk);
        System.out.println("Model \t: " + super.model + "\n");
        System.out.println("Fitur Kamera \t: ");
        this.ambilfoto();
        this.ambilvidio();
        System.out.println("\nFitur Bluetooth \t: ");
        this.kirimfile();
        this.terimafile();
        this.koneksiperangkat();
        System.out.println("\nFitur WiFi \t: ");
        this.carijaringan();
        this.hubungkanjaringan();
        this.lupakanjaringan();
        System.out.println("\nFitur Gps \t: ");
        this.ambilkordinat();
        System.out.println("--------------------");
    }
}



    class Tablet extends gedget{
        public void Tablet(String merk, String model){
            super.merk = merk;
            super.model = model;
            System.out.println("Keunggulan Tablet");
        }
        //        Kamera
    @Override
    public void ambilfoto(){
        System.out.println("Tablet " + super.merk + " Bisa Ambil Foto");
    }
    @Override
    public void ambilvidio(){
        System.out.println("Tablet " + super.merk + " Bisa Ambil video");
    }
//    Bluetoooth
    @Override
    public void kirimfile(){
        System.out.println("Tablet " + super.merk + 
                " mengirim File menggunakan bluetooth");
    }
    @Override
    public void terimafile(){
        System.out.println("Tablet " + super.merk + " menerima File menggunakan bluetooth");
    }
    @Override
    public void koneksiperangkat(){
        System.out.println("Tablet " + super.merk + 
                " bisa mengkoneksikan perangkat lain menggunakan bluetooth");
    }
//    Wifi
    @Override
    public void carijaringan(){
        System.out.println("Tablet " + super.merk + " Mencari Jaringan Wifi");
    }
    @Override
    public void hubungkanjaringan(){
        System.out.println("Tablet " + super.merk + " Menghubungkan ke jaringan WiFi");
    }
    @Override
    public void lupakanjaringan(){
        System.out.println("fitur di Tablet " + super.merk + " dapat melupakan jaringan");
    }
//    GPS
    @Override
    public void ambilkordinat(){
        System.out.println("Tablet " + super.merk + " Ambil Koordinat Gps");
    }
    
    @Override
     void displayInfo() {
        System.out.println("\nSpesifikasi Tablet");
        System.out.println("Merk \t: " + super.merk);
        System.out.println("Model \t: " + super.model + "\n");
        System.out.println("Fitur Kamera \t: ");
        this.ambilfoto();
        this.ambilvidio();
        System.out.println("\nFitur Bluetooth \t: ");
        this.kirimfile();
        this.terimafile();
        this.koneksiperangkat();
        System.out.println("\nFitur WiFi \t: ");
        this.carijaringan();
        this.hubungkanjaringan();
        this.lupakanjaringan();
        System.out.println("\nFitur Gps \t: ");
        this.ambilkordinat();
        System.out.println("--------------------");
    }
}


    class Laptop extends gedget{
        public void Laptop(String merk, String model){
            super.merk = merk;
            super.model = model;
            System.out.println("Keunggulan Laptop");
        }
        //        Kamera
    @Override
    public void ambilfoto(){
        System.out.println("Laptop " + super.merk + " Bisa Ambil Foto");
    }
    @Override
    public void ambilvidio(){
        System.out.println("Laptop " + super.merk + " Bisa Ambil video");
    }
//    Bluetoooth
    @Override
    public void kirimfile(){
        System.out.println("Laptop " + super.merk + " mengirim File menggunakan bluetooth");
    }
    @Override
    public void terimafile(){
        System.out.println("Laptop " + super.merk + " menerima File menggunakan bluetooth");
    }
    @Override
    public void koneksiperangkat(){
        System.out.println("Laptop " + super.merk + 
                " bisa mengkoneksikan perangkat lain menggunakan bluetooth");
    }
//    Wifi
    @Override
    public void carijaringan(){
        System.out.println("Laptop " + super.merk + " Mencari Jaringan Wifi");
    }
    @Override
    public void hubungkanjaringan(){
        System.out.println("Laptop " + super.merk + " Menghubungkan ke jaringan WiFi");
    }
    @Override
    public void lupakanjaringan(){
        System.out.println("fitur di Laptop " + super.merk + " dapat melupakan jaringan");
    }
//    GPS
    @Override
    public void ambilkordinat(){
        System.out.println("Laptop " + super.merk + " Ambil Koordinat Gps");
    }
    
    @Override
     void displayInfo() {
        System.out.println("\nSpesifikasi Laptop");
        System.out.println("Merk \t: " + super.merk);
        System.out.println("Model \t: " + super.model + "\n");
        System.out.println("Fitur Kamera \t: ");
        this.ambilfoto();
        this.ambilvidio();
        System.out.println("\nFitur Bluetooth \t: ");
        this.kirimfile();
        this.terimafile();
        this.koneksiperangkat();
        System.out.println("\nFitur WiFi \t: ");
        this.carijaringan();
        this.hubungkanjaringan();
        this.lupakanjaringan();
        System.out.println("\nFitur Gps \t: ");
        this.ambilkordinat();
        System.out.println("--------------------");
    }
}


public class Elektronik { 
    public static void main(String[] args) {      
        Scanner objek = new Scanner(System.in);

        gedget gt[] = new gedget[6];
        gt[0] = new Smartphone();
        System.out.println("Merek : ");
        String merk = objek.nextLine();
        System.out.println("Model : ");
        String model = objek.nextLine();
        gt[0].merk=merk;
        gt[0].model=model;
        gt[1] = new Smartphone();
        System.out.println("Merek : ");
        merk = objek.nextLine();
        System.out.println("Model : ");
        model = objek.nextLine();
        gt[1].merk=merk;
        gt[1].model=model;
        gt[2] = new Tablet();
        System.out.println("Merek : ");
        merk = objek.nextLine();
        System.out.println("Model : ");
        model = objek.nextLine();
        gt[2].merk=merk;
        gt[2].model=model;
        gt[3] = new Tablet();
        System.out.println("Merek : ");
        merk = objek.nextLine();
        System.out.println("Model : ");
        model = objek.nextLine();
        gt[3].merk=merk;
        gt[3].model=model;
        gt[4] = new Laptop();
        System.out.println("Merek : ");
        merk = objek.nextLine();
        System.out.println("Model : ");
        model = objek.nextLine();
        gt[4].merk=merk;
        gt[4].model=model;
        gt[5] = new Laptop();
        System.out.println("Merek : ");
        merk = objek.nextLine();
        System.out.println("Model : ");
        model = objek.nextLine();
        gt[5].merk=merk;
        gt[5].model=model;
        
        for (gedget gt1 : gt) {
            gt1.displayInfo();
        }
    }
}
       