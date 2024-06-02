package tugasmod6;
import java.util.Scanner;
import java.util.ArrayList;

interface Kamera {

    public abstract void AmbilFoto();
    public abstract void RekamVideo();
   
}

interface Bluetooth{
    public abstract void KirimFile();
    public abstract void TerimaFile();
    public abstract void KoneksiPerangkat();
}

interface Wifi{
    public abstract void CariJaringan();
    public abstract void HubungkanJaringan();
    public abstract void LupakanJaringan();
}

interface Gps{
    public abstract void Ambilkoordinat();  
}

// =================================================================================

abstract class Gadget implements Kamera, Bluetooth, Wifi, Gps{

    String Merk;
    String model;    

    public Gadget(String Merk, String Model) {
        this.Merk = Merk;
        this.model = Model;
    }

}
// =================================================================================
class Smartphone extends Gadget{
    
    
    public Smartphone(String Merk, String Model) {
        super(Merk, Model);
    }

    @Override
    public void AmbilFoto() {
        System.out.println("Ambil Foto mengggunakan smartphone " + Merk + "dengan Model " + model);
    }
    
    @Override
    public void RekamVideo() {
        System.out.println("Rekam video mengggunakan smartphone " +Merk + "dengan Model " +model);
    }
    
    @Override
    public void KirimFile() {
        System.out.println("Megirim file mengggunakan smartphone " +Merk + "dengan Model " +model);
    }
    
    @Override
    public void TerimaFile() {
        System.out.println("Menerima file mengggunakan smartphone " +Merk + "dengan Model " +model);
    }
    
    @Override
    public void KoneksiPerangkat() {
        System.out.println("mengoneksikan perangkat mengggunakan smartphone " +Merk + "dengan Model " +model);
    }
    
    @Override
    public void CariJaringan() {
        System.out.println("mencari jaringan mengggunakan smartphone " +Merk + "dengan Model " +model);
    }
    
    @Override
    public void HubungkanJaringan() {
        System.out.println("hubungkan jaringan mengggunakan " +Merk + "dengan Model " +model);
    }
    
    @Override
    public void LupakanJaringan() {
        System.out.println("melupakan jaringan yang tersambung mengggunakan smartphone " +Merk + "dengan Model " +model);
    }
    
    @Override
    public void Ambilkoordinat() {
        System.out.println("mengambil koordiinat lokasi mengggunakan smartphone " +Merk + "dengan Model " +model);
    }

    @Override
    public String toString() {
        return "Smartphone{" + "Merk = " + Merk + ", model = " + model + '}';
    }
}


// =================================================================================
class Tablet extends Gadget{
    public Tablet(String Merk, String model) {
        super(Merk, model);
    }
    
    @Override
    public void AmbilFoto() {
        System.out.println("Gadget dapat mengambil foto");
    }
    
    @Override
    public void RekamVideo() {
        System.out.println("Gadget dapat mengambil video");
    }
    
    @Override
    public void KirimFile() {
        System.out.println("Gadget dapat mengirim file");
    }
    
    @Override
    public void TerimaFile() {
        System.out.println("Gadget dapat menerima file");
    }
    
    @Override
    public void KoneksiPerangkat() {
        System.out.println("Gadget dapat menghubungkan perangkat");
    }
    
    @Override
    public void CariJaringan() {
        System.out.println("Gadget dapat mencari jaringan");
    }
    
    @Override
    public void HubungkanJaringan() {
        System.out.println("Gadget dapat menghubungkan jaringan");
    }
    
    @Override
    public void LupakanJaringan() {
        System.out.println("Gadget dapat lupakan jaringan");
    }
    
    @Override
    public void Ambilkoordinat() {
        System.out.println("Gadget dapat mengambil koordinat");
    }

    @Override
    public String toString() {
        return "Smartphone{" + "Merk = " + Merk + ", model = " + model + '}';
    }
}

// =================================================================================
class app{      
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Gadget> gadgets = new ArrayList<>();

        System.out.println("Jumlah gadget yang akan diinputkan");
        int jumlahGadget = input.nextInt();
        input.nextLine();
        
        for (int i = 0; i < jumlahGadget; i++) {
            System.out.println("\nMasukkan data Smartphone " + (i + 1) + ":");
            System.out.print("Masukkan Merk: ");
            String merkPhone = input.nextLine();
            System.out.print("Masukkan Model: ");
            String modelPhone = input.nextLine();
            gadgets.add(new Smartphone(merkPhone, modelPhone));         

            System.out.println("\nMasukkan data for Tablet " + (i + 1) + ":");
            System.out.print("Masukkan Merk: ");
            String merkTablet = input.nextLine();
            System.out.print("Masukkan Model: ");
            String modelTablet = input.nextLine();
            gadgets.add(new Tablet(merkTablet, modelTablet));
        }

        System.out.println("\nData Gadget:");
        System.out.println("=================");
        for (Gadget gadget : gadgets) {
            System.out.println(gadget);
            gadget.AmbilFoto();
            gadget.RekamVideo();
            gadget.KirimFile();
            gadget.TerimaFile();
            gadget.KoneksiPerangkat();
            gadget.CariJaringan();
            gadget.HubungkanJaringan();
            gadget.LupakanJaringan();
            gadget.Ambilkoordinat();

            System.out.println("=================");
            
            
        }

        input.close();
    }
}



