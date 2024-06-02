package modul4.praktikumpbo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Satuan Panjang m(meter) ke cm(centimeter) dan sebaliknya");
        System.out.println("Satuan Berat ton ke kg(kilogram) dan sebaliknya");
        System.out.println("Satuan Waktu jam ke menit dan sebaliknya");
        System.out.println("Satuan Suhu Celcius ke Fahrenheit dan sebaliknya");
        
        
        
        System.out.println("Masukkan nilai:");
        double nilai = scanner.nextDouble();

        System.out.println("Masukkan satuan asal:");
        String dariSatuan = scanner.next();

        System.out.println("Masukkan satuan tujuan:");
        String keSatuan = scanner.next();

        Konverter konverter;

        // Menentukan konverter yang akan digunakan berdasarkan satuan yang diberikan
        if (dariSatuan.equals("Celcius") || dariSatuan.equals("Fahrenheit") || keSatuan.equals("Celcius") || keSatuan.equals("Fahrenheit")) {
            konverter = new KonverterSuhu();
        } else if (dariSatuan.equals("m") || dariSatuan.equals("cm") || keSatuan.equals("m") || keSatuan.equals("cm")) {
            konverter = new KonverterPanjang();
        } else if (dariSatuan.equals("kg") || dariSatuan.equals("ton") || keSatuan.equals("kg") || keSatuan.equals("ton")) {
            konverter = new KonverterBerat();
        } else if (dariSatuan.equals("menit") || dariSatuan.equals("jam") || keSatuan.equals("menit") || keSatuan.equals("jam")) {
            konverter = new KonverterWaktu();
        } else {
            throw new IllegalArgumentException("Satuan tidak valid");
        }

        // Melakukan konversi
        double hasil = konverter.konversi(nilai, dariSatuan, keSatuan);
        System.out.println("Merubah dari " + nilai + " " + dariSatuan + " menjadi " + hasil + " " + keSatuan);

        scanner.close();
    }
}
