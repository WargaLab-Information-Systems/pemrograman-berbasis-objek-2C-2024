package menkonversi;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--Mengkonversi Satuan--");
        System.out.print("Masukkan satuan suhu dalam Celsius: ");
        double inputkansuhu = scanner.nextDouble();
            suhu suhu = new suhu(inputkansuhu);
            suhu.konversi();
            System.out.print("Masukkan satuan panjang dalam sentimeter: ");
            double inputkanpanjang = scanner.nextDouble();
            panjang panjang = new panjang(inputkanpanjang);
            panjang.konversi(); 
            System.out.print("Masukkan satuan berat dalam kilogram: ");
            double inputkanberat = scanner.nextDouble();
            berat berat = new berat(inputkanberat);
            berat.konversi(); 
            System.out.print("Masukkan satuan waktu dalam hari: ");
            double inputkanwaktu = scanner.nextDouble();
            waktu waktu = new waktu(inputkanwaktu);
            waktu.konversi(); 
    }
}
