package KonversiSatuan ;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner inputUser = new Scanner(System.in);
        
        while (true) {
            System.out.println("======> Konversi satuan dari suhu, panjang, berat, dan waktu <=====");
            System.out.println("1. Suhu");
            System.out.println("2. Panjang");
            System.out.println("3. Berat");
            System.out.println("4. Waktu");
            System.out.print("Masukkan Input(1/2/3/4):");
            String pilihAwal = inputUser.nextLine();
            double angka;
            String dari;
            String ke;
            double konversi;
            if (pilihAwal.equals("1")) { //Suhu
                while (true) {
                    System.out.print("Masukkan angka:");
                    angka = inputUser.nextDouble();
                    inputUser.nextLine();
                    System.out.println("---------------");
                    System.out.println("c = Celcius");
                    System.out.println("f = Fahrenheit");
                    System.out.println("k = Kelvin");
                    System.out.println("r = Reamur");
                    System.out.println("---------------");
                    System.out.print("Di konversi dari:");
                    dari = inputUser.nextLine();
                    System.out.print("di konversi ke:");
                    ke = inputUser.nextLine();
        
                    Suhu suhuKonversi = new Suhu(angka);
                
                    konversi = suhuKonversi.konversi(dari, ke);
                    if (konversi != 0) {
                        break;
                    }
                    System.out.println("yang anda inputkan salah");
                }
                System.out.println(angka+dari+" = "+konversi+ke);
                String tanya;
                while (true) {
                    System.out.print("lagi? (y/n):");
                    tanya = inputUser.nextLine();
                    if (tanya.equals("n")) {
                        break;
                    } else if (tanya.equals("y")) {
                        break;
                    } else {
                        System.out.println("inputkan y atau n");
                    }
                }
                if (tanya.equals("n")) {
                    break;
                }
            } else if (pilihAwal.equals("2")) { //Panjang
                while (true) {
                    System.out.print("Masukkan angka:");
                    angka = inputUser.nextDouble();
                    inputUser.nextLine();
                    System.out.println("---------------");
                    System.out.println("mm = Milimeter");
                    System.out.println("m  = Meter");
                    System.out.println("km = Kilometer");
                    System.out.println("cm = Centimeter");
                    System.out.println("in = inci");
                    System.out.println("---------------");
                    System.out.print("Di konversi dari:");
                    dari = inputUser.nextLine();
                    System.out.print("di konversi ke:");
                    ke = inputUser.nextLine();
        
                    Panjang panjangKonversi = new Panjang(angka);
                
                    konversi = panjangKonversi.konversi(dari, ke);
                    if (konversi != 0) {
                        break;
                    }
                    System.out.println("yang anda inputkan salah");
                }
                System.out.println(angka+dari+" = "+konversi+ke);
                String tanya;
                while (true) {
                    System.out.print("lagi? (y/n):");
                    tanya = inputUser.nextLine();
                    if (tanya.equals("n")) {
                        break;
                    } else if (tanya.equals("y")) {
                        break;
                    } else {
                        System.out.println("inputkan y atau n");
                    }
                }
                if (tanya.equals("n")) {
                    break;
                }
            } else if (pilihAwal.equals("3")) { //Berat
                while (true) {
                    System.out.print("Masukkan angka:");
                    angka = inputUser.nextDouble();
                    inputUser.nextLine();
                    System.out.println("---------------");
                    System.out.println("mg = Miligram");
                    System.out.println("g  = Gram");
                    System.out.println("kg = Kilogram");
                    System.out.println("ton = ton");
                    System.out.println("---------------");
                    System.out.print("Di konversi dari:");
                    dari = inputUser.nextLine();
                    System.out.print("di konversi ke:");
                    ke = inputUser.nextLine();
        
                    Berat beratKonversi = new Berat(angka);
                
                    konversi = beratKonversi.konversi(dari, ke);
                    if (konversi != 0) {
                        break;
                    }
                    System.out.println("yang anda inputkan salah");
                }
                System.out.println(angka+dari+" = "+konversi+ke);
                String tanya;
                while (true) {
                    System.out.print("lagi? (y/n):");
                    tanya = inputUser.nextLine();
                    if (tanya.equals("n")) {
                        break;
                    } else if (tanya.equals("y")) {
                        break;
                    } else {
                        System.out.println("inputkan y atau n");
                    }
                }
                if (tanya.equals("n")) {
                    break;
                }
            } else if (pilihAwal.equals("4")) { //Waktu
                while (true) {
                    System.out.print("Masukkan angka:");
                    angka = inputUser.nextDouble();
                    inputUser.nextLine();
                    System.out.println("---------------");
                    System.out.println("d = Detik");
                    System.out.println("m = Menit");
                    System.out.println("j = Jam");
                    System.out.println("h = Hari");
                    System.out.println("---------------");
                    System.out.print("Di konversi dari:");
                    dari = inputUser.nextLine();
                    System.out.print("di konversi ke:");
                    ke = inputUser.nextLine();
        
                    Waktu waktuKonversi = new Waktu(angka);

                    konversi = waktuKonversi.konversi(dari, ke);
                    if (konversi != 0) {
                        break;
                    }
                    System.out.println("yang anda inputkan salah");
                }
                System.out.println(angka+dari+" = "+konversi+ke);
                String tanya;
                while (true) {
                    System.out.print("lagi? (y/n):");
                    tanya = inputUser.nextLine();
                    if (tanya.equals("n")) {
                        break;
                    } else if (tanya.equals("y")) {
                        break;
                    } else {
                        System.out.println("inputkan y atau n");
                    }
                }
                if (tanya.equals("n")) {
                    break;
                }
            } else {
                System.out.println("inputan anda salah");
            }
        }
    }
}