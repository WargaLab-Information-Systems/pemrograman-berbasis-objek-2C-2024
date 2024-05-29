
package penyewaan.kendaraan;
import java.util.Scanner;
/**
 *
 * @author LENOVO V13 HENDRIK
 */
public class main {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("---penyewaan kendaraan Alin---");
        System.out.print("kendaraan yang akan di sewa :");
        int jumlahKendaraan = scanner.nextInt();
        scanner.nextLine();
        
        PenyewaanKendaraan[] kendaraan = new PenyewaanKendaraan[jumlahKendaraan];
        
        for (int n=0;n< jumlahKendaraan; n++){
            System.out.println("\nData kendaraan yang ke-"+(n+1));
            System.out.print("Jenis kendaraan :");
            String jenisKendaraan = scanner.nextLine();
            String merek, model;
            char status;
            int tahun;
            
            if (jenisKendaraan.equalsIgnoreCase("mobil")) {
                System.out.print ("Merek mobil : " );
                merek = scanner.nextLine();
                System.out.print ("Model mobil : " );
                model = scanner.nextLine();
                System.out.print ("status mobil : " );
                status = scanner.next().charAt(0);
                System.out.print ("Tahun mobil : " );
                tahun = scanner.nextInt();

                kendaraan[n] = new mobil(jenisKendaraan, merek, model, status, tahun);
}
            else if (jenisKendaraan.equalsIgnoreCase("motor")) {
                System.out.print ("Merek motor : " );
                merek = scanner.nextLine();
                System.out.print ("Model motor : " );
                model = scanner.nextLine();
                System.out.print ("status motor : " );
                status = scanner.next().charAt(0);
                System.out.print ("Tahun motor : " );
                tahun = scanner.nextInt();

                kendaraan[n] = new motor(jenisKendaraan, merek, model, status, tahun);
        }
            else if (jenisKendaraan.equalsIgnoreCase("sepeda")) {
                System.out.print ("Merek sepeda : " );
                merek = scanner.nextLine();
                System.out.print ("Model sepeda : " );
                model = scanner.nextLine();
                System.out.print ("status sepeda : " );
                status = scanner.next().charAt(0);
                System.out.print ("Tahun sepeda : " );
                tahun = scanner.nextInt();

                kendaraan[n] = new sepeda(jenisKendaraan, merek, model, status, tahun);
                
    }
            else {
                System.out.println("pilih yang ada di pilihan");
                n--;
            }
            scanner.nextLine();
            System.out.println("\nKendaraan ke-"+ (n+1));
            kendaraan[n].display();
            System.out.println(" ");
            System.out.println("==============================");
}
        
        
    }}

