package Converter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Suhu suhu = new Suhu();
        Panjang panjang = new Panjang();
        Berat berat = new Berat(); 
        Waktu waktu = new Waktu(); 

        while (true) {
            double Angka;
            System.out.println("Aplikasi Converter :");
            System.out.println("1.Suhu");
            System.out.println("2.Panjang");
            System.out.println("3.Berat");
            System.out.println("4.Waktu");
            System.out.println("5.Keluar");
            System.out.print("Silahkan Masukan Pilihan Anda:");
            int Pilihan = input.nextInt();

            switch (Pilihan) {
                case 1:
                    while (true) {
                        System.out.println("1. Celcius :");
                        System.out.println("2. Reamur :");
                        System.out.println("3. Fahrenheit :");
                        System.out.println("4. Kelvin :");
                        System.out.print("Pilih Suhu Awal Yang Ingin Dirubah:");
                        int PilihanAwal = input.nextInt();
                        if (PilihanAwal < 1 || PilihanAwal > 4) {
                            System.out.println("Kode error");
                            continue;
                        }
                        System.out.print("Akan Dirubah Ke:");
                        int PilihanTujuan = input.nextInt();
                        if (PilihanTujuan < 1 || PilihanTujuan > 4) {
                            System.out.println("Kode error");
                            continue;
                        }
                        System.out.print("Masukan Angka Suhu:");
                        Angka = input.nextDouble();
                        System.out.println(suhu.Convert(PilihanAwal, PilihanTujuan, Angka));
                        System.out.println();
                        break; // Keluar dari loop
                    }
                    break; // Keluar dari switch case
                case 2:
                    while (true) {
                        System.out.println("1. Kilometer (km)");
                        System.out.println("2. Hektometer (hm)");
                        System.out.println("3. Dekameter (dam)");
                        System.out.println("4. Meter (m)");
                        System.out.print("Pilih Panjang Awal Yang Ingin Dirubah:");
                        int PilihanAwal = input.nextInt();
                        if (PilihanAwal < 1 || PilihanAwal > 4) {
                            System.out.println("Kode error");
                            continue;
                        }
                        System.out.print("Akan Dirubah Ke:");
                        int PilihanTujuan = input.nextInt();
                        if (PilihanTujuan < 1 || PilihanTujuan > 4) {
                            System.out.println("Kode error");
                            continue;
                        }
                        System.out.print("Masukan Angka Panjang:");
                        Angka = input.nextDouble();
                        System.out.println(panjang.Convert(PilihanAwal, PilihanTujuan, Angka));
                        System.out.println();
                        break; // Keluar dari loop
                    }
                    break; // Keluar dari switch case
                case 3:
                    // Implementasi konversi berat
                    while (true) {
                        System.out.println("1. Gram (g)");
                        System.out.println("2. Kilogram (kg)");
                        System.out.println("3. Ons (ons)");
                        System.out.println("4. Pon (pon)");
                        System.out.println("5. Kuintal (kw)");
                        System.out.println("6. Ton (t)");
                        System.out.print("Pilih Berat Awal Yang Ingin Dirubah:");
                        int PilihanAwal = input.nextInt();
                        if (PilihanAwal < 1 || PilihanAwal > 6) {
                            System.out.println("Kode error");
                            continue;
                        }
                        System.out.print("Akan Dirubah Ke:");
                        int PilihanTujuan = input.nextInt();
                        if (PilihanTujuan < 1 || PilihanTujuan > 6) {
                            System.out.println("Kode error");
                            continue;
                        }
                        System.out.print("Masukan Angka Berat:");
                        Angka = input.nextDouble();
                        System.out.println(berat.Convert(PilihanAwal, PilihanTujuan, Angka));
                        System.out.println();
                        break; // Keluar dari loop
                    }
                    break; // Keluar dari switch case
                case 4:
                    // Implementasi konversi waktu
                    while (true) {
                        System.out.println("1. Detik (s)");
                        System.out.println("2. Menit (m)");
                        System.out.println("3. Jam (h)");
                        System.out.println("4. Hari (d)");
                        System.out.print("Pilih Waktu Awal Yang Ingin Dirubah:");
                        int PilihanAwal = input.nextInt();
                        if (PilihanAwal < 1 || PilihanAwal > 4) {
                            System.out.println("Kode error");
                            continue;
                        }
                        System.out.print("Akan Dirubah Ke:");
                        int PilihanTujuan = input.nextInt();
                        if (PilihanTujuan < 1 || PilihanTujuan > 4) {
                            System.out.println("Kode error");
                            continue;
                        }
                        System.out.print("Masukan Angka Waktu:");
                        Angka = input.nextDouble();
                        System.out.println(waktu.Convert(PilihanAwal, PilihanTujuan, Angka));
                        System.out.println();
                        break; // Keluar dari loop
                    }
                    break; // Keluar dari switch case
                case 5:
                    // Keluar dari program jika user memilih keluar
                    System.out.println("Terima kasih telah menggunakan aplikasi converter.");
                    input.close();
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }
    }
}
