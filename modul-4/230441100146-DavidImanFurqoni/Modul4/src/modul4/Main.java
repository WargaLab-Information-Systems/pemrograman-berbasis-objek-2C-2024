package modul4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Pilih Salah Satu satuan konversi Yang Sesuai :"
                + "\nCentimeter"+" "+"(Cm)\t\t Ke\tMeter"+"      "+"(M)"
                + "\nCelcius"+"    "+"(C)\t\t Ke\tFahrenheit"+"  "+"(F)"
                + "\nKilogram"+"   "+"(Kg)\t\t Ke\tTon"+"        "+"(Ton)"
                + "\nJam"+"        "+"(Jam)\t Ke\tMenit"+"       "+"(Menit)"
                + "\n================Atau Sebaliknya================"
                + "\nMeter"+"      "+"(M)\t\t Ke\tCentimeter"+"  "+"(C)"
                + "\nFahrenheit"+" "+"(F)\t\t Ke\tCelcius"+"  "+"(C)"
                + "\nTon"+"        "+"(Ton)\t Ke\tKilogram"+"    "+"(Kg)"
                + "\nMenit"+"      "+"(Menit)\t Ke\tJam"+"       "+"(Jam)"
                + "\n==========================================="
                + "\nKetikkan Yang Di Dalam Kurung Disini : ");
        String dariSatuan = scanner.next();

        System.out.print("Pilih Satuan Tujuan Konversi:"
                + "\nCentimeter"+" "+"(Cm)\t\t Ke\tMeter"+"      "+"(M)"
                + "\nCelcius"+"    "+"(C)\t\t Ke\tFahrenheit"+"  "+"(F)"
                + "\nKilogram"+"   "+"(Kg)\t\t Ke\tTon"+"        "+"(Ton)"
                + "\nJam"+"        "+"(Jam)\t Ke\tMenit"+"       "+"(Menit)"
                + "\n================Atau Sebaliknya================"
                + "\nMeter"+"      "+"(M)\t\t Ke\tCentimeter"+"  "+"(C)"
                + "\nFahrenheit"+" "+"(F)\t\t Ke\tCelcius       "+"  "+"(C)"
                + "\nTon"+"        "+"(Ton)\t Ke\tKilogram"+"    "+"(Kg)"
                + "\nMenit"+"      "+"(Menit)\t Ke\tJam"+"       "+"(Jam)"
                + "\n==========================================="
                + "\nKetikkan Disini : ");
        String keSatuan = scanner.next();
        
        System.out.print("Masukkan Nilai Yang Akan Dikonversi:");
        double nilai = scanner.nextDouble();

        Konverter konverter = null;

        if (dariSatuan.equals("m") || dariSatuan.equals("cm") || keSatuan.equals("m") ||
                keSatuan.equals("cm")) {
            konverter = new KonversiPanjang();
        }else if (dariSatuan.equalsIgnoreCase("c") || dariSatuan.equalsIgnoreCase("f") ||
                keSatuan.equalsIgnoreCase("c") || keSatuan.equalsIgnoreCase("f")) {
            konverter = new KonversiSuhu();   
        }else if (dariSatuan.equals("kg") || dariSatuan.equals("ton") || keSatuan.equals("kg") ||
                keSatuan.equals("ton")) {
            konverter = new KonversiBerat();
        } else if (dariSatuan.equals("menit") || dariSatuan.equals("jam") || keSatuan.equals("menit") ||
                keSatuan.equals("jam")) {
            konverter = new KonversiWaktu();
        } else {
            throw new IllegalArgumentException("Satuan tidak valid");
        }
        double hasil = konverter.konversi(nilai, dariSatuan, keSatuan);
        System.out.println("Konversi dari " + nilai + " " + dariSatuan + " ke " + keSatuan + ": " + hasil);

        scanner.close();
    }
}
