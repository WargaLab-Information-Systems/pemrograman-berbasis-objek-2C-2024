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
