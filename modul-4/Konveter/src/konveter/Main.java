package Konveter;

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
        }// Celsius ke Reamur
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
        if (dariSatuan.equals("M") && keSatuan.equals("Cm")) {
            return nilai * 100;
        }// Meter ke Desimeter
        else if (dariSatuan.equals("M") && keSatuan.equals("Dm")) {
            return nilai * 10;
        }// Meter ke milimeter
        else if (dariSatuan.equals("M") && keSatuan.equals("Mm")) {
            return nilai / 1000;
        }// Desimeter ke Meter
        else if (dariSatuan.equals("Dm") && keSatuan.equals("M")) {
            return nilai / 10;
        }// Desimeter ke Centimeter
        else if (dariSatuan.equals("Dm") && keSatuan.equals("Cm")) {
            return nilai * 10;
        }// Desimeter ke Milimeter
        else if (dariSatuan.equals("Dm") && keSatuan.equals("Mm")) {
            return nilai * 100;
        }// Centimeter ke Meter
        else if (dariSatuan.equals("Cm") && keSatuan.equals("M")) {
            return nilai / 100;
        }// Centimeter ke Desimeter
        else if (dariSatuan.equals("Cm") && keSatuan.equals("Dm")) {
            return nilai / 10;
        }// Centimeter ke Milimeter
        else if (dariSatuan.equals("Cm") && keSatuan.equals("Mm")) {
            return nilai * 10;
        }// Milimeter ke Centimeter
        else if (dariSatuan.equals("Mm") && keSatuan.equals("Cm")) {
            return nilai / 10;
        }// Milimeter ke Desiimeter
        else if (dariSatuan.equals("Mm") && keSatuan.equals("Dm")) {
            return nilai / 100;
        }// Milimeter ke Meter
        else if (dariSatuan.equals("Mm") && keSatuan.equals("M")) {
            return nilai / 1000;
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
        // Kilogram ke Ton
        if (dariSatuan.equals("Kg") && keSatuan.equals("T")) {
            return nilai / 1000; //
        }// Kilogram ke Kuintal
        else if (dariSatuan.equals("Kg") && keSatuan.equals("Kw")) {
            return nilai / 100; // 
        }// Kilogram ke Gram
        else if (dariSatuan.equals("Kg") && keSatuan.equals("G")){
            return nilai * 1000; // 
        }// Ton ke Kilgram
        else if (dariSatuan.equals("T") && keSatuan.equals("Kg")) {
            return nilai * 100; // 
        }// Ton ke Gram
        else if (dariSatuan.equals("T") && keSatuan.equals("G")) {
            return nilai * 1000000; // 
        }// kuintal ke Ton
        else if (dariSatuan.equals("Kw") && keSatuan.equals("T")) {
            return nilai / 10; // 
        }// kuintal ke Kilogram
        else if (dariSatuan.equals("Kw") && keSatuan.equals("Kg")) {
            return nilai * 100; // 
        }// kuintal ke Gram
        else if (dariSatuan.equals("Kw") && keSatuan.equals("G")) {
            return nilai * 100000; // 
        }//  Gram ke Ton
        else if (dariSatuan.equals("G") && keSatuan.equals("T")) {
            return nilai / 1000000; // 
        }//  Gram ke Kuintal
        else if (dariSatuan.equals("G") && keSatuan.equals("Kw")) {
            return nilai / 100000; // 
        }//  Gram ke Kilogram
        else if (dariSatuan.equals("G") && keSatuan.equals("Kg")) {
            return nilai / 1000; //
        }
        else {
            throw new IllegalArgumentException("Satuan tidak valid untuk konversi berat");
        }
        
    }
}

// Konverter Waktu
class KonverterWaktu extends Konverter {
    @Override
    double konversi(double nilai, String dariSatuan, String keSatuan) {
        // Menit ke Jam
        if (dariSatuan.equals("Me") && keSatuan.equals("J")) {
            return nilai / 60;
        }//Menit ke Detik 
        else if (dariSatuan.equals("Me") && keSatuan.equals("D")) {
            return nilai * 60;
        }//Menit ke Hari 
        else if (dariSatuan.equals("Me") && keSatuan.equals("H")) {
            return nilai /1440 ;
        }// Jam ke Menit
        else if (dariSatuan.equals("J") && keSatuan.equals("Me")) {
            return nilai * 60;
        }// Jam ke Detik
        else if (dariSatuan.equals("J") && keSatuan.equals("D")) {
            return nilai * 3600;
        }// Jam ke hari
        else if (dariSatuan.equals("J") && keSatuan.equals("H")) {
            return nilai / 24;
        }// Detik ke Hari
        else if (dariSatuan.equals("D") && keSatuan.equals("H")) {
            return nilai / 86400;
        }// Detik ke jam
        else if (dariSatuan.equals("D") && keSatuan.equals("J")) {
            return nilai / 3600;
        }// Detik ke menit
        else if (dariSatuan.equals("D") && keSatuan.equals("Me")) {
            return nilai / 60;
        } else {
            throw new IllegalArgumentException("Satuan tidak valid untuk konversi waktu");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Looping untuk terus melakukan konversi hingga pengguna memilih untuk keluar
        do {
            System.out.println("Masukkan nilai:");
            double nilai = scanner.nextDouble();
            
            System.out.println("\nPilih konverter satuan asal :"
                    + "\nSuhu:"
                    +"\nCelsius (c)\tFahrenheit(F)"
                    +"\nReamur  (R)\tKelvin    (k)"
                    +"\n============================"
                    +"\nPanjang"
                    +"\nMeter     (M)\tCentiMeter (Cm)"
                    +"\nDesimeter (Dm)\tMilimeter (Mm)"
                    +"\n============================"
                    +"\nBerat"
                    +"\nKilogram  (Kg)\tTon     (T)"
                    +"\nKwintal   (Kw)\tGram    (G)"
                    +"\n============================"
                    +"\nWaktu"
                    +"\nDetik     (D)\tMenit (Me)"
                    +"\nJam       (J)\tHari  (H)"
                    +"\n ");
            
            System.out.println("Masukkan satuan asal:");
            String dariSatuan = scanner.next();

            System.out.println("Masukkan satuan tujuan:");
            String keSatuan = scanner.next();
            
            Konverter konverter;

            // Menentukan konverter yang akan digunakan berdasarkan satuan yang diberikan
            if (dariSatuan.equals("C") || dariSatuan.equals("F") || 
                    dariSatuan.equals("R") || dariSatuan.equals("K") || 
                    keSatuan.equals("C") || keSatuan.equals("F") || 
                    keSatuan.equals("R") || keSatuan.equals("K")) {
                konverter = new KonverterSuhu();
            } else if (dariSatuan.equals("M") || dariSatuan.equals("Cm") || 
                    dariSatuan.equals("Dm") || dariSatuan.equals("Mm") ||
                    keSatuan.equals("M") || keSatuan.equals("Cm") || 
                    keSatuan.equals("Dm") || keSatuan.equals("Mm")) {
                konverter = new KonverterPanjang();
            } else if (dariSatuan.equals("Kg") || dariSatuan.equals("T") || 
                    dariSatuan.equals("Kw") || dariSatuan.equals("G") ||
                    keSatuan.equals("kg") || keSatuan.equals("T") || 
                    keSatuan.equals("Kw") || keSatuan.equals("G")) {
                konverter = new KonverterBerat();
            } else if (dariSatuan.equals("D") || dariSatuan.equals("Me") || 
                    dariSatuan.equals("J") || dariSatuan.equals("H") ||
                    keSatuan.equals("D") || keSatuan.equals("Me") || 
                    keSatuan.equals("J") || keSatuan.equals("H")) {
                konverter = new KonverterWaktu();
            } else {
                throw new IllegalArgumentException("Satuan tidak valid");
            }

            // Melakukan konversi
            double hasil = konverter.konversi(nilai, dariSatuan, keSatuan);
            System.out.println("Konversi dari " + nilai + " " + dariSatuan + " ke " + keSatuan + ": " + hasil);

            // Meminta pengguna untuk memilih apakah ingin melanjutkan konversi atau keluar
            System.out.println("Apakah Anda ingin melanjutkan konversi? (y/n)");
            String lanjut = scanner.next();

            if (!lanjut.equalsIgnoreCase("y")) {
                break; // Keluar dari loop jika pengguna tidak ingin melanjutkan
            }
        } while (true);

        scanner.close();
    }
}





