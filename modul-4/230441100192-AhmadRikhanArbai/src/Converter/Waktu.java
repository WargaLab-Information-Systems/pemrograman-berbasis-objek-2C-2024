package Converter;

public class Waktu extends Converter {

    @Override
    double Convert(int PilihanAwal, int PilihanTujuan, double Angka) {
        double hasilKonversi = 0;

        if (PilihanAwal == 1 && PilihanTujuan == 1) {
            hasilKonversi = Angka;
        }
        else if (PilihanAwal == 1 && PilihanTujuan == 2) {
            hasilKonversi = Angka / 60;
        }
        else if (PilihanAwal == 1 && PilihanTujuan == 3) {
            hasilKonversi = Angka / 3600;
        }
        else if (PilihanAwal == 1 && PilihanTujuan == 4) {
            hasilKonversi = Angka / (3600 * 24);
        }
        else if (PilihanAwal == 2 && PilihanTujuan == 1) {
            hasilKonversi = Angka * 60;
        }
        else if (PilihanAwal == 2 && PilihanTujuan == 2){
            hasilKonversi = Angka;
        }
        else if (PilihanAwal == 2 && PilihanTujuan == 3) {
            hasilKonversi = Angka / 60;
        }
        else if (PilihanAwal == 2 && PilihanTujuan == 4) {
            hasilKonversi = Angka / (60 * 24);
        }
        else if (PilihanAwal == 3 && PilihanTujuan == 1) {
            hasilKonversi = Angka * 3600;
        }
        else if (PilihanAwal == 3 && PilihanTujuan == 2) {
            hasilKonversi = Angka * 60;
        }
        else if (PilihanAwal == 3 && PilihanTujuan == 3) {
            hasilKonversi = Angka;
        }
        else if (PilihanAwal == 3 && PilihanTujuan == 4) {
            hasilKonversi = Angka / 24 ;
        }
        else if (PilihanAwal == 4 && PilihanTujuan == 1) {
            hasilKonversi = Angka * (3600 * 24);
        }
        else if (PilihanAwal == 4 && PilihanTujuan == 2) {
            hasilKonversi = Angka * (60 * 24);
        }
        else if (PilihanAwal == 4 && PilihanTujuan == 3) {
            hasilKonversi = Angka * 24;
        }
        else if (PilihanAwal == 4 && PilihanTujuan == 4) {
            hasilKonversi = Angka;
        } else {
            System.out.println("Konversi tidak valid.");
        }

        return hasilKonversi;
    }
}
