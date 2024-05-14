package Converter;

public class Suhu extends Converter {
    @Override
     double Convert(int PilihanAwal, int PilihanTujuan, double Angka) {
        double hasilKonversi = 0;

        // Konversi dari Celcius ke Reamur
        if (PilihanAwal == 1 && PilihanTujuan == 2) {
            hasilKonversi = Angka * 4 / 5;
        }
        // Konversi dari Celcius ke Fahrenheit
        else if (PilihanAwal == 1 && PilihanTujuan == 3) {
            hasilKonversi = (Angka * 9 / 5) + 32;
        }
        // Konversi dari Celcius ke Kelvin
        else if (PilihanAwal == 1 && PilihanTujuan == 4) {
            hasilKonversi = Angka + 273.15;
        }
        // Konversi dari Reamur ke Celcius
        else if (PilihanAwal == 2 && PilihanTujuan == 1) {
            hasilKonversi = Angka * 5 / 4;
        }
        // Konversi dari Reamur ke Fahrenheit
        else if (PilihanAwal == 2 && PilihanTujuan == 3) {
            hasilKonversi = (Angka * 9 / 4) + 32;
        }
        // Konversi dari Reamur ke Kelvin
        else if (PilihanAwal == 2 && PilihanTujuan == 4) {
            hasilKonversi = (Angka * 5 / 4) + 273.15;
        }
        // Konversi dari Fahrenheit ke Celcius
        else if (PilihanAwal == 3 && PilihanTujuan == 1) {
            hasilKonversi = (Angka - 32) * 5 / 9;
        }
        // Konversi dari Fahrenheit ke Reamur
        else if (PilihanAwal == 3 && PilihanTujuan == 2) {
            hasilKonversi = (Angka - 32) * 4 / 9;
        }
        // Konversi dari Fahrenheit ke Kelvin
        else if (PilihanAwal == 3 && PilihanTujuan == 4) {
            hasilKonversi = ((Angka - 32) * 5 / 9) + 273.15;
        }
        // Konversi dari Kelvin ke Celcius
        else if (PilihanAwal == 4 && PilihanTujuan == 1) {
            hasilKonversi = Angka - 273.15;
        }
        // Konversi dari Kelvin ke Reamur
        else if (PilihanAwal == 4 && PilihanTujuan == 2) {
            hasilKonversi = (Angka - 273.15) * 4 / 5;
        }
        // Konversi dari Kelvin ke Fahrenheit
        else if (PilihanAwal == 4 && PilihanTujuan == 3) {
            hasilKonversi = ((Angka - 273.15) * 9 / 5) + 32;
        } else {
            System.out.println("Konversi tidak valid.");
        }

        return hasilKonversi;
    }
}
