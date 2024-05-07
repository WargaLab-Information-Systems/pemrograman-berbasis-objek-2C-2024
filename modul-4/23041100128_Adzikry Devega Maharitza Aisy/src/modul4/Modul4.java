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
        //R ke K
        else if (dariSatuan.equals("R") && keSatuan.equals("K")) {
            return nilai * 5 / 4 + 273;
        }    
        // Fahrenheit ke Celsius
        else if (dariSatuan.equals("F") && keSatuan.equals("C")) {
            return (nilai - 32) * 5 / 9;
        } 
        //R ke K
        else if (dariSatuan.equals("R") && keSatuan.equals("K")) {
            return (nilai - 273) * 5 / 4;
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
        // M ke CM
        if (dariSatuan.equals("m") && keSatuan.equals("cm")) {
            return nilai * 100;
        }
        //KM ke HM
        else if (dariSatuan.equals("km") && keSatuan.equals("hm")) {
            return nilai / 100;
        }
        // CM ke M
        else if (dariSatuan.equals("cm") && keSatuan.equals("m")) {
            return nilai / 100;
        } 
        //KM ke HM
        else if (dariSatuan.equals("hm") && keSatuan.equals("km")) {
            return nilai * 100;
        }
        else {
            throw new IllegalArgumentException("Satuan tidak valid untuk konversi panjang");
        }
    }
}

// Konverter Berat
class KonverterBerat extends Konverter {
    @Override
    double konversi(double nilai, String dariSatuan, String keSatuan) {
        // KG ke Ton
        if (dariSatuan.equals("kg") && keSatuan.equals("ton")) {
            return nilai / 1000; // 1 ton = 1000 kg
        }
        // Ton ke KG
        else if (dariSatuan.equals("ton") && keSatuan.equals("kg")) {
            return nilai * 1000; // 1 ton = 1000 kg
        } else {
            throw new IllegalArgumentException("Satuan tidak valid untuk konversi berat");
        }
    }
}

// Konverter Waktu
class KonverterWaktu extends Konverter {
    @Override
    double konversi(double nilai, String dariSatuan, String keSatuan) {
        // Menit ke Jam
        if (dariSatuan.equals("menit") && keSatuan.equals("jam")) {
            return nilai / 60;
        }
        // Jam ke Menit
        else if (dariSatuan.equals("jam") && keSatuan.equals("menit")) {
            return nilai * 60;
        } else {
            throw new IllegalArgumentException("Satuan tidak valid untuk konversi waktu");
        }
    }
}

public class Modul4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean ulangi = true;
            
            while (ulangi){
                
             System.out.println("Masukkan nilai:");
            double nilai = scanner.nextDouble(); 
            
                System.out.println("SATUAN YANG TERSEDIA:");
                System.out.println(" ");
                System.out.println("Satuan Suhu:");
                System.out.println("Fahrenheit (F)");
                System.out.println("Celcius (C)");
                System.out.println("Reamur (R)");
                System.out.println("Kelvin (K)");
                System.out.println(" ");
                System.out.println("Satuan Panjang:");
                System.out.println("Kilometer (Km)");
                System.out.println("Meter (m)");
                System.out.println("Hektometer (hm)");
                System.out.println(" ");
                System.out.println("Satuan Berat:");
                System.out.println("Kilogram (Kg)");
                System.out.println("Ton (ton)");
                System.out.println(" ");
                System.out.println("Satuan Waktu:");
                System.out.println("menit");
                System.out.println("jam");
                System.out.println(" ");
            System.out.println("Masukkan satuan asal:");
            String dariSatuan = scanner.next();
            
            System.out.println("Masukkan satuan tujuan:");
            String keSatuan = scanner.next();
            
            Konverter konverter;
            
            // Menentukan konverter yang akan digunakan berdasarkan satuan yang diberikan
            if (dariSatuan.equals("C") || dariSatuan.equals("F") || keSatuan.equals("C") || keSatuan.equals("F")) {
                konverter = new KonverterSuhu();
            } else if (dariSatuan.equals("m") || dariSatuan.equals("cm") || keSatuan.equals("m") || keSatuan.equals("cm")) {
                konverter = new KonverterPanjang();
            } else if (dariSatuan.equals("kg") || dariSatuan.equals("ton") || keSatuan.equals("kg") || keSatuan.equals("ton")) {
                konverter = new KonverterBerat();
            } else if (dariSatuan.equals("menit") || dariSatuan.equals("jam") || keSatuan.equals("menit") || keSatuan.equals("jam")) {
                konverter = new KonverterWaktu();
            } else if (dariSatuan.equals("R") || dariSatuan.equals("K") || keSatuan.equals("R") || keSatuan.equals("K")) {
                konverter = new KonverterSuhu();
            } else if (dariSatuan.equals("km") || dariSatuan.equals("hm") || keSatuan.equals("km") || keSatuan.equals("hm")) {
                konverter = new KonverterPanjang();  
            } else {
                throw new IllegalArgumentException("Satuan tidak valid");
            }
            
            // Melakukan konversi
            double hasil = konverter.konversi(nilai, dariSatuan, keSatuan);
            System.out.println("Konversi dari " + nilai + " " + dariSatuan + " ke " + keSatuan + ": " + hasil);
                System.out.println("ulangi:y/t");
                String ulang=scanner.next();
                ulangi="y".equals(ulang);
            }
        }
    }
}
