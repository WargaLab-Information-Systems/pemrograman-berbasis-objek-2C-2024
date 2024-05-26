package abstrak;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner objek = new Scanner(System.in);
        
//    OPSI UNTUK PENGKORVESIAN NILAI
        System.out.println("Pilih Salah Satu satuan konversi Yang Sesuai");
        System.out.println("A. (Meter ke Centimeter)     ||      B. (Centimeter ke Meter)");
        System.out.println("C. (Kilogram ke Ton)         ||      D. (Ton ke Kilogram)");
        System.out.println("D. (Ton ke Kilogram)         ||      E. (Jam ke Menit)");
        System.out.println("F. (Menit ke Jam)            ||      G. (Celsius ke Fahrenheit)");
        System.out.println("H. (Celcius Ke Reamur)       ||      I. (Celcius ke Kelvin)");
        System.out.println("j. (Fahrenheit ke Celsius)   ||      K. (Fahrenheit Ke Reamur)");
        System.out.println("L. (Fahrenheit ke Kelvin)    ||      M. (Reamur ke Celsius)");
        System.out.println("N. (Reamur Ke Fahrenheit)    ||      O. (Reamur ke Kelvin)");
        System.out.println("P. (Kelvin ke Celsius)       ||      Q. (Kelvin Ke Fahrenheit)");
        System.out.println("R. (Kelvin ke Reamur)        ||     =============================");
        System.out.println("");
        
        System.out.println("Pilih Opsi ( A/B/C/D/E/F/G/H/I/J/K/L/M/N/O/P/Q/R ) = ");

        String Pilihan = objek.next();
        
//    UNTUK MEMEBERIKAN NILAI YANG AKAN DIKONVERSIKAN
        System.out.print("Masukkan Nilai Yang Akan Dikonversi = ");
        double nilai = objek.nextDouble();

        ABSTRAK konverter ;

//    KONDISI PILIHAN 
        if (Pilihan.equalsIgnoreCase("A")) {
            konverter = new panjang();
        }else if (Pilihan.equalsIgnoreCase("B")) {
            konverter = new panjang();   
        }else if (Pilihan.equalsIgnoreCase("C")) {
            konverter = new kilo();
        } else if (Pilihan.equalsIgnoreCase("D")) {
            konverter = new kilo();
        } else if (Pilihan.equalsIgnoreCase("E")) {
            konverter = new waktu();  
        } else if (Pilihan.equalsIgnoreCase("F")) {
            konverter = new waktu();
        } else if (Pilihan.equalsIgnoreCase("G")) {
            konverter = new suhu();
        } else if (Pilihan.equalsIgnoreCase("H")) {
            konverter = new suhu();
        } else if (Pilihan.equalsIgnoreCase("I")) {
            konverter = new suhu();
        } else if (Pilihan.equalsIgnoreCase("J")) {
            konverter = new suhu();
        } else if (Pilihan.equalsIgnoreCase("K")) {
            konverter = new suhu();
        } else if (Pilihan.equalsIgnoreCase("L")) {
            konverter = new suhu();
        } else if (Pilihan.equalsIgnoreCase("M")) {
            konverter = new suhu();
        } else if (Pilihan.equalsIgnoreCase("O")) {
            konverter = new suhu();
        } else if (Pilihan.equalsIgnoreCase("P")) {
            konverter = new suhu();
        } else if (Pilihan.equalsIgnoreCase("Q")) {
            konverter = new suhu();
        } else if (Pilihan.equalsIgnoreCase("R")) {
            konverter = new suhu();
        } else {
            throw new IllegalArgumentException("Satuan tidak valid");
        }
        
        double hasil = konverter.konversi(nilai, Pilihan);
        System.out.println("Konversi dari " + nilai + " dengan pilihan konversi (" + Pilihan + ") adalah : " + hasil);

    }
}

