
package mobil;
import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) {
        Scanner objek = new Scanner(System.in);

        System.out.print("KATAGORI = ");
        String kategori = objek.next();
        
        System.out.print("MEREK = ");
        String merek = objek.next();
        
        System.out.print("MODEL = ");
        String model = objek.next();

        
        System.out.print("TAHUN = ");
        int tahun = objek.nextInt();
        
        System.out.println("------------------------------------------");
        
        Mobil konver ;
        if (kategori.equalsIgnoreCase("MPV")) {
        konver = new MPV(kategori,merek,model,tahun);
        konver.display();
        konver.display(23);
        
        }else if (kategori.equalsIgnoreCase("SUV")) {
        konver = new SUV(kategori,merek,model,tahun);
        konver.display();
        konver.display(29);
        
        }else if (kategori.equalsIgnoreCase("M.SPORT")) {
        konver = new MSport(kategori,merek,model,tahun);
        konver.display();
        konver.display(02);
        
        }else if (kategori.equalsIgnoreCase("M.LISTRIK")) {
        konver = new MListrik(kategori,merek,model,tahun);
        konver.display();
        konver.display(7593);
    
        }else {
            throw new IllegalArgumentException("Satuan tidak valid");
        
        }
        
    }
    }