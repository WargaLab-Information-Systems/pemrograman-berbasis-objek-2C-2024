
package pbo.baranggadget2;
import java.util.Scanner;

interface kamera {
    public void ambilFoto();
    public void ambilVideo();
}

interface bluetooth {
   public void kirimFile();
   public void terimaFile();
   public void koneksiPerangkat();
}

interface wifi {
    public void cariJaringan();
    public void hubungkanJaringan();
    public void lupakanJaringan();
}

interface gps {
   public void ambilKoordinat();
}

abstract class gadget implements kamera, bluetooth, wifi, gps {
    String merk;
    String model;
    
    gadget(String merk, String model) {
        this.merk = merk;
        this.model = model;
    }

    public void showFeature() {
        System.out.println("Merek: " + merk);
        System.out.println("Model: " + model);
    }
}

class smartphone extends gadget {

    public smartphone(String merk, String model) {
        super(merk, model);
    }

    @Override
    public void ambilFoto() {
        System.out.println("1. Mengambil gambar atau foto");
    }
    public void ambilVideo() {
        System.out.println("2. Mengambil rekaman atau video");
    }
    public void kirimFile() {
        System.out.println("3. Dapat mengirim file");
    }
    public void terimaFile(){
        System.out.println("4. Dapat menerima file");
    }
    public void koneksiPerangkat() {
        System.out.println("5. Menyambungkan koneksi dengan perangkat lain");
    }
    public void cariJaringan() {
        System.out.println("6. Mencari Jaringan internet WIFI");
    }
    public void hubungkanJaringan() {
        System.out.println("7. Menyambungkan Jaringan WIFI yang telah didapat");
    }
    public void lupakanJaringan() {
        System.out.println("8. Melupakan Jaringan Wifi yang sebelumnya sudah terkoneksi");
    }
    public void ambilKoordinat() {
        System.out.println("9. Mengetahui keberadaan seseorang melalui wifi");
    }
    
    
    
}

class tablet extends gadget {
    public tablet(String merk, String model) {
        super(merk, model);
    }
    
    @Override
    public void ambilFoto() {
        System.out.println("1. Mengambil gambar atau foto");
    }
    public void ambilVideo() {
        System.out.println("2. Mengambil rekaman atau video");
    }
    public void kirimFile() {
        System.out.println("3. Dapat mengirim file");
    }
    public void terimaFile(){
        System.out.println("4. Dapat menerima file");
    }
    public void koneksiPerangkat() {
        System.out.println("5. Menyambungkan koneksi dengan perangkat lain");
    }
    public void cariJaringan() {
        System.out.println("6. Mencari Jaringan internet WIFI");
    }
    public void hubungkanJaringan() {
        System.out.println("7. Menyambungkan Jaringan WIFI yang telah didapat");
    }
    public void lupakanJaringan() {
        System.out.println("8. Melupakan Jaringan Wifi yang sebelumnya sudah terkoneksi");
    }
    public void ambilKoordinat() {
        System.out.println("9. Mengetahui keberadaan seseorang melalui wifi");
    }
    
    
    
}

class laptop extends gadget {
    public laptop(String merk, String model) {
        super(merk, model);
    }
    
    @Override
    public void ambilFoto() {
        System.out.println("1. Mengambil gambar atau foto");
    }
    public void ambilVideo() {
        System.out.println("2. Mengambil rekaman atau video");
    }
    public void kirimFile() {
        System.out.println("3. Dapat mengirim file");
    }
    public void terimaFile(){
        System.out.println("4. Dapat menerima file");
    }
    public void koneksiPerangkat() {
        System.out.println("5. Menyambungkan koneksi dengan perangkat lain");
    }
    public void cariJaringan() {
        System.out.println("6. Mencari Jaringan internet WIFI");
    }
    public void hubungkanJaringan() {
        System.out.println("7. Menyambungkan Jaringan WIFI yang telah didapat");
    }
    public void lupakanJaringan() {
        System.out.println("8. Melupakan Jaringan Wifi yang sebelumnya sudah terkoneksi");
    }
    public void ambilKoordinat() {
        System.out.println("9. Mengetahui keberadaan seseorang melalui wifi");
    }
    
    
    
}
public class Baranggadget2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Pilih jenis gadget yang ingin Anda lihat fiturnya:");
        System.out.println("1. Smartphone");
        System.out.println("2. Tablet");
        System.out.println("3. Laptop");
        System.out.println("Pilih Antara 1/2/3:");
        
        int pilihan = scanner.nextInt();
        scanner.nextLine(); 
        
        System.out.println("Masukkan merek gadget:");
        String merk = scanner.nextLine();
        
        System.out.println("Masukkan model gadget:");
        String model = scanner.nextLine();
        
        System.out.println("Masukkan merek gadget:");
        String merk2 = scanner.nextLine();
        
        System.out.println("Masukkan model gadget:");
        String model2 = scanner.nextLine();
        
        
        gadget Fitur1, Fitur2;
        
        switch (pilihan) {
            case 1:
                System.out.println(" ");
                System.out.println("---Barang Gadget---");
                Fitur1 = new smartphone(merk, model);
                Fitur2 = new smartphone(merk2, model2);
                break;
            case 2:
                System.out.println(" ");
                System.out.println("---Barang Gadget---");
                Fitur1 = new tablet(merk, model);
                Fitur2 = new tablet(merk2, model2);
                break;
            case 3:
                System.out.println(" ");
                System.out.println("---Barang Gadget---");
                Fitur1 = new laptop(merk, model);
                Fitur2 = new laptop(merk2, model2);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                
                return;
        }
        
        Fitur1.showFeature();
        Fitur2.showFeature();
        
        System.out.println("\nFitur pertama:");
        Fitur1.ambilFoto();
        Fitur1.ambilVideo();
        Fitur1.kirimFile();
        Fitur1.terimaFile();
        Fitur1.koneksiPerangkat();
        Fitur1.cariJaringan();
        Fitur1.hubungkanJaringan();
        Fitur1.lupakanJaringan();
        Fitur1.ambilKoordinat();
        
        System.out.println("\nFitur Kedua:");
        Fitur2.ambilFoto();
        Fitur2.ambilVideo();
        Fitur2.kirimFile();
        Fitur2.terimaFile();
        Fitur2.koneksiPerangkat();
        Fitur2.cariJaringan();
        Fitur2.hubungkanJaringan();
        Fitur2.lupakanJaringan();
        Fitur2.ambilKoordinat();
        
       
        
    }
}
