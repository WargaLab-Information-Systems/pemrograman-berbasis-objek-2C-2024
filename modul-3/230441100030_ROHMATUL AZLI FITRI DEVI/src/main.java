import java.util.Scanner;
 
public class main {
    public static void main(String[] args) {
    Informasi info = new Informasi();

    Scanner input = new Scanner(System.in);
    String pilihan = "1";
    
    while (pilihan=="1"){
    info.tampil();

    System.out.print("\nMengulang lagi? [y/t]: ");
    pilihan = input.nextLine();
        if (pilihan.startsWith("y")){
        pilihan="1";
        System.out.println("\n\n\n");
        }
        else{

    System.out.println("\n===================================================="); 
    System.out.println("Terimakasih Telah Menggunakan Rental kendaraan kita"); 
    System.out.println("===================================================="); 
 }
 
 } 
 }
}
