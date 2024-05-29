package Converter;

public class Berat extends Converter {

    @Override
    double Convert(int PilihanAwal, int PilihanTujuan, double Angka) {
        double hasilKonversi = 0;

        if (PilihanAwal == 1 && PilihanTujuan == 2) {
            hasilKonversi = Angka * 1000; // Gram to Kilogram
        }

        else if (PilihanAwal == 1 && PilihanTujuan == 3) {
            hasilKonversi = Angka * 10; // Gram to Ons
        }

        else if (PilihanAwal == 1 && PilihanTujuan == 4) {
            hasilKonversi = Angka / 0.5; // Gram to Pon
        }

        else if (PilihanAwal == 1 && PilihanTujuan == 5) {
            hasilKonversi = Angka / 100; // Gram to Kuintal
        }

        else if (PilihanAwal == 1 && PilihanTujuan == 6) {
            hasilKonversi = Angka / 1000; // Gram to Ton
        }

        else if (PilihanAwal == 2 && PilihanTujuan == 1) {
            hasilKonversi = Angka / 1000; // Kilogram to Gram
        }

        else if (PilihanAwal == 2 && PilihanTujuan == 3) {
            hasilKonversi = Angka * 100; // Kilogram to Ons
        }

        else if (PilihanAwal == 2 && PilihanTujuan == 4) {
            hasilKonversi = Angka / 0.05; // Kilogram to Pon
        }

        else if (PilihanAwal == 2 && PilihanTujuan == 5) {
            hasilKonversi = Angka / 10; // Kilogram to Kuintal
        }

        else if (PilihanAwal == 2 && PilihanTujuan == 6) {
            hasilKonversi = Angka / 1000; // Kilogram to Ton
        }

        else if (PilihanAwal == 3 && PilihanTujuan == 1) {
            hasilKonversi = Angka / 10; // Ons to Gram
        }

        else if (PilihanAwal == 3 && PilihanTujuan == 2) {
            hasilKonversi = Angka / 100; // Ons to Kilogram
        }

        else if (PilihanAwal == 3 && PilihanTujuan == 4) {
            hasilKonversi = Angka / 0.05; // Ons to Pon
        }

        else if (PilihanAwal == 3 && PilihanTujuan == 5) {
            hasilKonversi = Angka / 1000; // Ons to Kuintal
        }

        else if (PilihanAwal == 3 && PilihanTujuan == 6) {
            hasilKonversi = Angka / 10000; // Ons to Ton
        }

        else if (PilihanAwal == 4 && PilihanTujuan == 1) {
            hasilKonversi = Angka * 0.5; // Pon to Gram
        }

        else if (PilihanAwal == 4 && PilihanTujuan == 2) {
            hasilKonversi = Angka * 0.05; // Pon to Kilogram
        }

        else if (PilihanAwal == 4 && PilihanTujuan == 3) {
            hasilKonversi = Angka * 20; // Pon to Ons
        }

        else if (PilihanAwal == 4 && PilihanTujuan == 5) {
            hasilKonversi = Angka / 10; // Pon to Kuintal
        }

        else if (PilihanAwal == 4 && PilihanTujuan == 6) {
            hasilKonversi = Angka / 100; // Pon to Ton
        }

        else if (PilihanAwal == 5 && PilihanTujuan == 1) {
            hasilKonversi = Angka * 100; // Kuintal to Gram
        }

        else if (PilihanAwal == 5 && PilihanTujuan == 2) {
            hasilKonversi = Angka * 10; // Kuintal to Kilogram
        }

        else if (PilihanAwal == 5 && PilihanTujuan == 3) {
            hasilKonversi = Angka * 1000; // Kuintal to Ons
        }

        else if (PilihanAwal == 5 && PilihanTujuan == 4) {
            hasilKonversi = Angka * 10; // Kuintal to Pon
        }

        else if (PilihanAwal == 5 && PilihanTujuan == 6) {
            hasilKonversi = Angka / 10; // Kuintal to Ton
        }

        else if (PilihanAwal == 6 && PilihanTujuan == 1) {
            hasilKonversi = Angka * 1000; // Ton to Gram
        }

        else if (PilihanAwal == 6 && PilihanTujuan == 2) {
            hasilKonversi = Angka * 1000; // Ton to Kilogram
        }

        else if (PilihanAwal == 6 && PilihanTujuan == 3) {
            hasilKonversi = Angka * 10000; // Ton to Ons
        }

        else if (PilihanAwal == 6 && PilihanTujuan == 4) {
            hasilKonversi = Angka * 100; // Ton to Pon
        }

        else if (PilihanAwal == 6 && PilihanTujuan == 5) {
            hasilKonversi = Angka * 10; // Ton to Kuintal
        }

        else if (PilihanAwal == 6 && PilihanTujuan == 6) {
            hasilKonversi = Angka; // Ton to Ton
        }

        else {
            System.out.println("Konversi tidak valid.");
        }

        return hasilKonversi;
    }
}
