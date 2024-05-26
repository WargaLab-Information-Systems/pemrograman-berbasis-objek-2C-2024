package MODUL5;
import java.util.Scanner;


public class MAIN {

    public static void main(String[] args) {
        Scanner objek = new Scanner(System.in);

               
        System.out.print("TIPE ( MPV/SUV/M.SPORT/M.LISTRIK ) = ");
        String pilih = objek.next();
        
        System.out.print("MEREK = ");
        String merek = objek.next();
        
        System.out.print("MODEL = ");
        String model = objek.next();

        
        System.out.print("TAHUN = ");
        int tahun = objek.nextInt();
        
        System.out.println("");
        
        MOBIL konver ;
        if (pilih.equalsIgnoreCase("MPV")) {
        konver = new MPV(pilih,merek,model,tahun);
        konver.showfeature();
        
        }else if (pilih.equalsIgnoreCase("SUV")) {
        konver = new SUV(pilih,merek,model,tahun);
        konver.showfeature();
        
        }else if (pilih.equalsIgnoreCase("M.SPORT")) {
        konver = new M_SPORT(pilih,merek,model,tahun);
        konver.showfeature();
        
        }else if (pilih.equalsIgnoreCase("M.LISTRIK")) {
        konver = new M_LISTRIK(pilih,merek,model,tahun);
        konver.showfeature();

        }
        
    }
}



String camera = "Mengambil foto";
    String film = "Merekam Vidio";
    String kirim = "Mengirim File";
    String terima = "Menerima File";
    String perangkat = "Terhubung dengan perangkat lain ";
    String Jaringan = "mencari jaringan wifi";
    String wifi = "Terhhubung dengan wifi";
    String lupakan = "Jaringan dilupakan";
    String kordinat = "000000000000";        

    public Smartphone(String merk, String model) {
        super(merk, model);
    }
    
    @Override
    public void tampilkanInfo() {
        System.out.println("=== Smartphone ===");
        System.out.println("Merk: " + getMerk());
        System.out.println("Model: " + getModel());
    }

    @Override
    public void ambilFoto() {
        System.out.println(" mengambil foto." + camera);
    }

    @Override
    public void rekamVideo() {
        System.out.println(" merekam video." + film);
    }

    @Override
    public void kirimFile() {
        System.out.println(" mengirim file." + kirim);
    }

    @Override
    public void terimaFile() {
        System.out.println(" menerima file." + terima);
    }

    @Override
    public void koneksiPerangkat() {
        System.out.println(" terhubung dengan perangkat lain." + perangkat);
    }

    @Override
    public void cariJaringan() {
        System.out.println(" mencari jaringan WiFi." + Jaringan);
    }

    @Override
    public void hubunganJaringan() {
        System.out.println(" terhubung ke jaringan WiFi." + wifi);
    }

    @Override
    public void lupakanJaringan() {
        System.out.println(" melupakan jaringan WiFi." + lupakan);
    }

    @Override
    public void ambilKoordinat() {
        System.out.println(" melupakan jaringan WiFi." + kordinat);
    }

}


