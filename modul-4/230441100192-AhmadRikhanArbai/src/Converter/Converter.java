package Converter;

public abstract class Converter {
    int PilihanTujuan;
    int PilihanAwal;
    double Angka;

    abstract double Convert(int PilihanAwal, int PilihanTujuan, double Angka);
}
