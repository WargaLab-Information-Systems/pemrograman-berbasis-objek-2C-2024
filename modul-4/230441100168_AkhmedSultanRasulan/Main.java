/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul4;
import java.util.Scanner;

// Kelas abstrak untuk Konverter
abstract class Konverter {
    abstract double konversi(double nilai, String dariSatuan, String keSatuan);
}

// Konverter Suhu
class KonverterSuhu extends Konverter {
    @Override
    double konversi(double nilai, String dariSatuan, String keSatuan) {
        // Celsius ke Fahrenheit
        if (dariSatuan.equals("C") && keSatuan.equals("F")) {
            return nilai * 9 / 5 + 32;
        }
        // Celsius ke Reamur
        else if (dariSatuan.equals("C") && keSatuan.equals("R")) {
            return nilai  * 4 / 5;
        } 
        // Celsius ke Kelvin
        else if (dariSatuan.equals("C") && keSatuan.equals("K")) {
            return nilai  + 273;
        } 
        // Fahrenheit ke Celsius
        else if (dariSatuan.equals("F") && keSatuan.equals("C")) {
            return (nilai - 32) * 5 / 9;
        }
        // Fahrenheit ke Reamur
        else if (dariSatuan.equals("F") && keSatuan.equals("R")) {
            return (nilai - 32) * 4 / 9;
        }
        // Fahrenheit ke Kelvin
        else if (dariSatuan.equals("F") && keSatuan.equals("K")) {
            return (nilai - 32) * 5 / 9 + 273;
        }
        // Reamur ke Celcius
        else if (dariSatuan.equals("R") && keSatuan.equals("C")) {
            return nilai * 5 / 4;
        }
        // Reamur ke Fahrenheit
        else if (dariSatuan.equals("R") && keSatuan.equals("F")) {
            return (nilai * 9 / 4)+32;
        }        
        // Reamur ke Kelvin
        else if (dariSatuan.equals("R") && keSatuan.equals("K")) {
            return (nilai * 5 / 4)+273;
        }
        // Kelvin ke Celcius
        else if (dariSatuan.equals("K") && keSatuan.equals("C")) {
            return nilai - 273;
        }
        // Kelvin ke Fahrenheit
        else if (dariSatuan.equals("K") && keSatuan.equals("F")) {
            return (nilai - 273) * 9 / 5 + 32;
        }
        // Kelvin ke Reamur
        else if (dariSatuan.equals("K") && keSatuan.equals("R")) {
            return (nilai - 273) * 4 / 5;
        }
        else {
            throw new IllegalArgumentException("Satuan tidak valid untuk konversi suhu");
        }
    }
}
// Konverter Panjang
class KonverterPanjang extends Konverter {
    @Override
    double konversi(double nilai, String dariSatuan, String keSatuan) {
        // Meter ke Centimeter
        if (dariSatuan.equals("m") && keSatuan.equals("cm")) {
            return nilai * 100;
        }// Meter ke Desimeter
        else if (dariSatuan.equals("m") && keSatuan.equals("dm")) {
            return nilai * 10;
        }// Meter ke milimeter
        else if (dariSatuan.equals("m") && keSatuan.equals("mm")) {
            return nilai / 1000;
        }// Desimeter ke Meter
        else if (dariSatuan.equals("dm") && keSatuan.equals("m")) {
            return nilai / 10;
        }// Desimeter ke Centimeter
        else if (dariSatuan.equals("dm") && keSatuan.equals("cm")) {
            return nilai * 10;
        }// Desimeter ke Milimeter
        else if (dariSatuan.equals("dm") && keSatuan.equals("mm")) {
            return nilai * 100;
        }// Centimeter ke Meter
        else if (dariSatuan.equals("cm") && keSatuan.equals("m")) {
            return nilai / 100;
        }// Centimeter ke Desimeter
        else if (dariSatuan.equals("cm") && keSatuan.equals("dm")) {
            return nilai / 10;
        }// Centimeter ke Milimeter
        else if (dariSatuan.equals("cm") && keSatuan.equals("mm")) {
            return nilai * 10;
        }// Milimeter ke Centimeter
        else if (dariSatuan.equals("mm") && keSatuan.equals("cm")) {
            return nilai / 10;
        }// Milimeter ke Desiimeter
        else if (dariSatuan.equals("mm") && keSatuan.equals("dm")) {
            return nilai / 100;
        }// Milimeter ke Meter
        else if (dariSatuan.equals("mm") && keSatuan.equals("m")) {
            return nilai / 1000;
        }else {
            throw new IllegalArgumentException("Satuan tidak valid untuk konversi panjang");
        }
    }
}

// Konverter Berat
class KonverterBerat extends Konverter {
    @Override
    double konversi(double nilai, String dariSatuan, String keSatuan) {
        // Kilogram ke Ton
        if (dariSatuan.equals("kg") && keSatuan.equals("ton")) {
            return nilai / 1000; // 1 ton = 1000 kg
        }// Kilogram ke Kuintal
        else if (dariSatuan.equals("kg") && keSatuan.equals("kw")) {
            return nilai / 100; // 
        }// Kilogram ke Gram
        else if (dariSatuan.equals("kg") && keSatuan.equals("kw")) {
            return nilai * 1000; // 
        }// Ton ke Kuintal
        else if (dariSatuan.equals("ton") && keSatuan.equals("kw")) {
            return nilai * 10; // 
        }// Ton ke Kilgram
        else if (dariSatuan.equals("ton") && keSatuan.equals("kg")) {
            return nilai * 100; // 
        }// Ton ke Gram
        else if (dariSatuan.equals("ton") && keSatuan.equals("g")) {
            return nilai * 1000000; // 
        }// kuintal ke Ton
        else if (dariSatuan.equals("kw") && keSatuan.equals("ton")) {
            return nilai / 10; // 
        }// kuintal ke Kilogram
        else if (dariSatuan.equals("kw") && keSatuan.equals("kg")) {
            return nilai * 100; // 
        }// kuintal ke Gram
        else if (dariSatuan.equals("kw") && keSatuan.equals("g")) {
            return nilai * 100000; // 
        }//  Gram ke Ton
        else if (dariSatuan.equals("g") && keSatuan.equals("ton")) {
            return nilai / 1000000; // 
        }//  Gram ke Kuintal
        else if (dariSatuan.equals("g") && keSatuan.equals("kw")) {
            return nilai / 100000; // 
        }//  Gram ke Kilogram
        else if (dariSatuan.equals("g") && keSatuan.equals("kg")) {
            return nilai / 1000; // 
        }else {
            throw new IllegalArgumentException("Satuan tidak valid untuk konversi berat");
        }
    }
}
// Konverter Waktu
class KonverterWaktu extends Konverter {
    @Override
    double konversi(double nilai, String dariSatuan, String keSatuan) {
        // Menit ke Jam
        if (dariSatuan.equals("M") && keSatuan.equals("H")) {
            return nilai / 60;
        }//Menit ke Detik 
        else if (dariSatuan.equals("M") && keSatuan.equals("S")) {
            return nilai * 60;
        }//Menit ke Hari 
        else if (dariSatuan.equals("M") && keSatuan.equals("D")) {
            return nilai /1440 ;
        }// Jam ke Menit
        else if (dariSatuan.equals("H") && keSatuan.equals("M")) {
            return nilai * 60;
        }// Jam ke Detik
        else if (dariSatuan.equals("H") && keSatuan.equals("D")) {
            return nilai * 3600;
        }// Jam ke hari
        else if (dariSatuan.equals("H") && keSatuan.equals("D")) {
            return nilai / 24;
        }// Detik ke Hari
        else if (dariSatuan.equals("S") && keSatuan.equals("D")) {
            return nilai / 86400;
        }// Detik ke jam
        else if (dariSatuan.equals("S") && keSatuan.equals("D")) {
            return nilai / 3600;
        }// Detik ke menit
        else if (dariSatuan.equals("S") && keSatuan.equals("D")) {
            return nilai / 60; 
        }else {
            throw new IllegalArgumentException("Satuan tidak valid untuk konversi waktu");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan nilai:");
        double nilai = scanner.nextDouble();

        System.out.println("Masukkan satuan asal:");
        String dariSatuan = scanner.next();

        System.out.println("Masukkan satuan tujuan:");
        String keSatuan = scanner.next();

        Konverter konverter;

        // Menentukan konverter yang akan digunakan berdasarkan satuan yang diberikan
        if (dariSatuan.equals("C") || dariSatuan.equals("F") || dariSatuan.equals("R") || dariSatuan.equals("K") || keSatuan.equals("C") || keSatuan.equals("F")|| keSatuan.equals("R") || keSatuan.equals("K")) {
            konverter = new KonverterSuhu();
        } else if (dariSatuan.equals("m") || dariSatuan.equals("cm") ||dariSatuan.equals("dm") ||dariSatuan.equals("mm") || keSatuan.equals("m") || keSatuan.equals("cm")|| keSatuan.equals("dm") || keSatuan.equals("mm")) {
            konverter = new KonverterPanjang();
        } else if (dariSatuan.equals("kg") || dariSatuan.equals("ton") ||dariSatuan.equals("kw") ||dariSatuan.equals("g") || keSatuan.equals("kg") || keSatuan.equals("kw") ||keSatuan.equals("g") ||keSatuan.equals("ton")) {
            konverter = new KonverterBerat();
        } else if (dariSatuan.equals("M") || dariSatuan.equals("H") || dariSatuan.equals("D") ||dariSatuan.equals("S") ||keSatuan.equals("M") || keSatuan.equals("H")||keSatuan.equals("S") ||keSatuan.equals("D")){
            konverter = new KonverterWaktu();
        } else {
            throw new IllegalArgumentException("Satuan tidak valid");
        }

        // Melakukan konversi
        double hasil = konverter.konversi(nilai, dariSatuan, keSatuan);
        System.out.println("Konversi dari " + nilai + " " + dariSatuan + " ke " + keSatuan + ": " + hasil);

        scanner.close();
    }
}