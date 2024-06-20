package conversi;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);   
        while (true) {
            System.out.println("=====Konversi Suhu, Panjang, Berat, dan Waktu=====\n");
            System.out.println("1. Suhu");
            System.out.println("2. Panjang");
            System.out.println("3. Berat");
            System.out.println("4. Waktu");
            System.out.print("Masukkan pilihan(Suhu/Panjang/Berat/Waktu):");
            String pilihAwal = inputUser.nextLine();
            double angka;
            String SatuanAwal;
            String to;
            double konversi;
            if (pilihAwal.equalsIgnoreCase("Suhu")) { //Suhu
                while (true) {
                    System.out.print("\nMasukkan angka:");
                    angka = inputUser.nextDouble();
                    inputUser.nextLine();
                    System.out.println("c = Celcius");
                    System.out.println("f = Fahrenheit");
                    System.out.println("k = Kelvin");
                    System.out.println("r = Reamur");
                    System.out.print("dari satuan:");
                    SatuanAwal = inputUser.nextLine();
                    System.out.print("ke satuan:");
                    to = inputUser.nextLine();
        
                    Suhu suhuKonversi = new Suhu(angka);
                
                    konversi = suhuKonversi.konversi(SatuanAwal, to);
                    if (konversi != 0) {
                        break;
                    }
                    System.out.println("inputan salah");
                }
                System.out.println(angka+SatuanAwal+" = "+konversi+to);
                String tanya;
                while (true) {
                    System.out.print("lagi? (Y/N):");
                    tanya = inputUser.nextLine();
                    if (tanya.equalsIgnoreCase("N")) {
                        break;
                    } else if (tanya.equalsIgnoreCase("Y")) {
                        break;
                    } else {
                        System.out.println("inputkan Y atau N");
                    }
                }
                if (tanya.equalsIgnoreCase("N")) {
                    break;
                }
            } else if (pilihAwal.equalsIgnoreCase("Panjang")) { //Panjang
                while (true) {
                    System.out.print("\nMasukkan angka:");
                    angka = inputUser.nextDouble();
                    inputUser.nextLine();
                    System.out.println("mm = Milimeter");
                    System.out.println("m  = Meter");
                    System.out.println("km = Kilometer");
                    System.out.println("mi = Mile");
                    System.out.println("in = inci");
                    System.out.print("Di konversi dari:");
                    SatuanAwal = inputUser.nextLine();
                    System.out.print("di konversi ke:");
                    to = inputUser.nextLine();
        
                    Panjang panjangKonversi = new Panjang(angka);
                
                    konversi = panjangKonversi.konversi(SatuanAwal, to);;
                    if (konversi != 0) {
                        break;
                    }
                    System.out.println("inputan anda salah");
                }
                System.out.println(angka+SatuanAwal+" = "+konversi+to);
                String tanya;
                while (true) {
                    System.out.print("lagi? (Y/N):");
                    tanya = inputUser.nextLine();
                    if (tanya.equalsIgnoreCase("N")) {
                        break;
                    } else if (tanya.equalsIgnoreCase("Y")) {
                        break;
                    } else {
                        System.out.println("inputkan Y atau N");
                    }
                }
                if (tanya.equalsIgnoreCase("N")) {
                    break;
                }
            } else if (pilihAwal.equalsIgnoreCase("Berat")) { //Berat
                while (true) {
                    System.out.print("\nMasukkan angka:");
                    angka = inputUser.nextDouble();
                    inputUser.nextLine();
                    System.out.println("mg = Miligram");
                    System.out.println("g  = Gram");
                    System.out.println("kg = Kilogram");
                    System.out.println("ton = ton");
                    System.out.print("Di konversi dari:");
                    SatuanAwal = inputUser.nextLine();
                    System.out.print("di konversi ke:");
                    to = inputUser.nextLine();
        
                    Berat beratKonversi = new Berat(angka);
                
                    konversi = beratKonversi.konversi(SatuanAwal, to);
                    if (konversi != 0) {
                        break;
                    }
                    System.out.println("yang anda inputkan salah");
                }
                System.out.println(angka+SatuanAwal+" = "+konversi+to);
                String tanya;
                while (true) {
                    System.out.print("lagi? (Y/N):");
                    tanya = inputUser.nextLine();
                    if (tanya.equalsIgnoreCase("N")) {
                        break;
                    } else if (tanya.equalsIgnoreCase("Y")) {
                        break;
                    } else {
                        System.out.println("inputkan Y atau N");
                    }
                }
                if (tanya.equalsIgnoreCase("N")) {
                    break;
                }
            } else if (pilihAwal.equalsIgnoreCase("Waktu")) { //Waktu
                while (true) {
                    System.out.print("\nMasukkan angka:");
                    angka = inputUser.nextDouble();
                    inputUser.nextLine();
                    System.out.println("d = Detik");
                    System.out.println("m = Menit");
                    System.out.println("j = Jam");
                    System.out.println("h = Hari");
                    System.out.print("Di konversi dari:");
                    SatuanAwal = inputUser.nextLine();
                    System.out.print("di konversi ke:");
                    to = inputUser.nextLine();
        
                    Waktu waktuKonversi = new Waktu(angka);

                    konversi = waktuKonversi.konversi(SatuanAwal, to);
                    if (konversi != 0) {
                        break;
                    }
                    System.out.println("inputan anda salah");
                }
                System.out.println(angka+SatuanAwal+" = "+konversi+to);
                String tanya;
                while (true) {
                    System.out.print("lagi? (Y/N):");
                    tanya = inputUser.nextLine();
                    if (tanya.equalsIgnoreCase("N")) {
                        break;
                    } else if (tanya.equalsIgnoreCase("Y")) {
                        break;
                    } else {
                        System.out.println("inputkan Y atau N");
                    }
                }
                if (tanya.equalsIgnoreCase("N")) {
                    break;
                }
            } else {
                System.out.println("inputan yang anda masukkan salah");
            }
        }
    }
}