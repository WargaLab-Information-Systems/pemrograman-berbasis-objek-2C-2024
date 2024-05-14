package tugasCoding;

import java.util.Scanner;

abstract class Konverter {
    abstract double konversi(double nilai, String dariSatuan, String keSatuan);
}

class KonverterSuhu extends Konverter {
    @Override
    double konversi(double nilai, String dariSatuan, String keSatuan) {
        
        // Celsius ke Fahrenheit
        if (dariSatuan.equals("C") && keSatuan.equals("F")) {
            return nilai * 9 / 5 + 32;
        }
        // Fahrenheit ke Celsius
        else if (dariSatuan.equals("F") && keSatuan.equals("C")) {
            return (nilai - 32) * 5 / 9;
        } else {
            throw new IllegalArgumentException("Satuan tidak valid untuk konversi suhu");
        }
    }
}

class KonverterPanjang extends Konverter {
    @Override
    double konversi(double nilai, String dariSatuan, String keSatuan) {
        // Meter ke Centimeter
        if (dariSatuan.equals("m") && keSatuan.equals("cm")) {
            return nilai * 100;
        }
        // Centimeter ke Meter
        else if (dariSatuan.equals("cm") && keSatuan.equals("m")) {
            return nilai / 100;
        } else {
            throw new IllegalArgumentException("Satuan tidak valid untuk konversi panjang");
        }
    }
}

class KonverterBerat extends Konverter {
    @Override
    double konversi(double nilai, String dariSatuan, String keSatuan) {
        // Kilogram ke Ton
        if (dariSatuan.equals("kg") && keSatuan.equals("ton")) {
            return nilai / 1000; // 1 ton = 1000 kg
        }
        // Ton ke Kilogram
        else if (dariSatuan.equals("ton") && keSatuan.equals("kg")) {
            return nilai * 1000; // 1 ton = 1000 kg
        } else {
            throw new IllegalArgumentException("Satuan tidak valid untuk konversi berat");
        }
    }
}

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

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nPilih kode satuan Asal \n Suhu - Fahrenheit (F) atau Celcius (C) "
                + "\n Waktu - Jam (J) atau Menit (MT) \n Berat - Kilogram (KG) atau Ton (T) "
                + "\n Panjang - Centimeter (CM) atau Meter (MR)");
        
        System.out.println("============================");
        
        System.out.print("Masukkan kode satuan asal: ");
        String dariSatuan = scanner.next().toUpperCase();
        
        if (dariSatuan.equals("C") || dariSatuan.equals("F")) {
            System.out.println("\nPilih kode Satuan Tujuan \n Celcius (C) atau Fahrenheit (F)");
        } else if (dariSatuan.equals("MR") || dariSatuan.equals("CM")) {
             System.out.println("\nPilih kode Satuan Tujuan \n Meter (MR) atau Centimeter (CM)");
        } else if (dariSatuan.equals("KG") || dariSatuan.equals("T")) {
             System.out.println("\nPilih kode Satuan Tujuan \n Kilogram (KG) atau Ton (T)");
        } else if (dariSatuan.equals("MT") || dariSatuan.equals("J")) {
             System.out.println("\nPilih kode Satuan Tujuan \n Menit (MT) atau Jam (J)");
        } else {
            throw new IllegalArgumentException("Satuan tidak valid");
        }
        
        System.out.print("\nMasukkan satuan tujuan: ");
        String keSatuan = scanner.next().toUpperCase();
        
        Konverter konverter;
        
        // Menentukan konverter yang akan digunakan berdasarkan satuan yang diberikan
        if (keSatuan.equals("C") || keSatuan.equals("F")) {
            konverter = new KonverterSuhu();
        } else if (keSatuan.equals("MR") || keSatuan.equals("CM")) {
            konverter = new KonverterPanjang();
        } else if ( keSatuan.equals("KG") || keSatuan.equals("T")) {
            konverter = new KonverterBerat();
        } else if (keSatuan.equals("MT") || keSatuan.equals("J")) {
            konverter = new KonverterWaktu();
        } else {
            throw new IllegalArgumentException("Satuan tidak valid");
        }

        System.out.print("\nMasukkan nilai: ");
        double nilai = scanner.nextDouble();
        
        // Melakukan konversi
        double hasil = konverter.konversi(nilai, dariSatuan, keSatuan);
        System.out.println("\nKonversi dari " + nilai + " " + dariSatuan + " ke " + keSatuan + ": " + hasil);

        scanner.close();
    }
}
