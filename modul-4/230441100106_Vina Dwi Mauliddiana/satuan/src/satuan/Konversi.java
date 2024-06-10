/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package satuan;

import java.util.Scanner;

/**
 *
 * @author pinokio
 */
public class Konversi {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);

        boolean ulangiKonversi = true;

        while (ulangiKonversi) {
            // Meminta jenis konversi (panjang, suhu, berat, waktu)
            System.out.print("Pilih jenis konversi (panjang, suhu, berat, waktu): ");
            String jenisKonversi = inputUser.next().toLowerCase();

            // Menampilkan satuan yang tersedia berdasarkan jenis konversi
            boolean jenisKonversiValid = true;
            switch (jenisKonversi) {
                case "panjang":
                    System.out.println("Satuan yang tersedia:");
                    System.out.println("- Meter");
                    System.out.println("- Kilometer");
                    System.out.println("- Centimeter");
                    break;
                case "suhu":
                    System.out.println("Satuan yang tersedia:");
                    System.out.println("- Celsius");
                    System.out.println("- Fahrenheit");
                    System.out.println("- Kelvin");
                    break;
                case "berat":
                    System.out.println("Satuan yang tersedia:");
                    System.out.println("- Kilogram");
                    System.out.println("- Gram");
                    System.out.println("- Ton");
                    break;
                case "waktu":
                    System.out.println("Satuan yang tersedia:");
                    System.out.println("- Detik");
                    System.out.println("- Menit");
                    System.out.println("- Jam");
                    break;
                default:
                    System.out.println("Jenis konversi tidak valid.");
                    jenisKonversiValid = false;
                    break;
            }

            // Meminta nilai dan satuan asal dari pengguna
            if (jenisKonversiValid) {
                System.out.print("Masukkan satuan asal: ");
                String satuanAsal = inputUser.next().toLowerCase();

                System.out.print("Masukkan nilai: ");
                double nilai = inputUser.nextDouble();

                System.out.print("Masukkan satuan tujuan: ");
                String satuanTujuan = inputUser.next().toLowerCase();

                // Konversi nilai berdasarkan jenis konversi, satuan asal dan tujuan
                double hasilKonversi = 0;
                switch (jenisKonversi) {
                    case "panjang":
                        hasilKonversi = Konversipanjang(nilai, satuanAsal, satuanTujuan);
                        break;
                    case "suhu":
                        hasilKonversi = Konversisuhu(nilai, satuanAsal, satuanTujuan);
                        break;
                    case "berat":
                        hasilKonversi = Konversiberat(nilai, satuanAsal, satuanTujuan);
                        break;
                    case "waktu":
                        hasilKonversi = Konversiwaktu(nilai, satuanAsal, satuanTujuan);
                        break;
                }

                // Menampilkan hasil konversi
                if (hasilKonversi != 0) {
                    System.out.printf("%.2f %s = %.2f %s\n", nilai, satuanAsal, hasilKonversi, satuanTujuan);
                }
            }

            // Menanyakan apakah ingin mengulang konversi
            System.out.print("Apakah ingin mengulang konversi? (Ya/Tidak): ");
            String jawabanUlang = inputUser.next().toLowerCase();

            if (!jawabanUlang.equals("ya")) {
                ulangiKonversi = false;
                System.out.println("Terima kasih telah menggunakan program konversi satuan.");
            }
        }
    }
    private static double Konversipanjang(double nilai, String satuanAsal, String satuanTujuan) {
        switch (satuanAsal) {
            case "meter":
                if (satuanTujuan.equals("meter")) {
                    return nilai;
                } else if (satuanTujuan.equals("kilometer")) {
                    return nilai / 1000;
                } else if (satuanTujuan.equals("centimeter")) {
                    return nilai * 100;
                } else {
                    return nilai;
                }
            case "kilometer":
                if (satuanTujuan.equals("meter")) {
                    return nilai * 1000;
                } else if (satuanTujuan.equals("kilometer")) {
                    return nilai;
                } else if (satuanTujuan.equals("centimeter")) {
                    return nilai * 100000;
                } else {
                    return nilai;
                }
            case "centimeter":
                if (satuanTujuan.equals("meter")) {
                    return nilai / 100;
                } else if (satuanTujuan.equals("kilometer")) {
                    return nilai / 100000;
                } else if (satuanTujuan.equals("centimeter")) {
                    return nilai;
                } else {
                    return nilai;
                }
            default:
                return nilai;
}
       }

    private static double Konversisuhu(double nilai, String satuanAsal, String satuanTujuan) {
        switch (satuanAsal) {
            case "celsius":
                if (satuanTujuan.equals("celsius")) {
                    return nilai;
                } else if (satuanTujuan.equals("fahrenheit")) {
                    return (nilai * 9 / 5) + 32;
                } else if (satuanTujuan.equals("kelvin")) {
                    return nilai + 273.15;
                } else {
                    return nilai;
                }
            case"fahrenheit":
                if(satuanTujuan.equals("celcius")){
                    return(nilai - 32) * 5 / 9;
                }else if(satuanTujuan.equals("kelavin")){
                    return (nilai - 32) * 5 / 9 + 273.15;
                }else{
                    return nilai;
                }
            case"kelvin":
                if (satuanTujuan.equals("celsius")) {
                    return nilai - 273.15;
                } else if (satuanTujuan.equals("fahrenheit")) {
                    return (nilai - 273.15) * 9 / 5 + 32;
                } else if (satuanTujuan.equals("kelvin")) {
                    return nilai;
                } else {
                    return nilai;
                }
            default:
                return nilai;
        }    
    }
        
    private static double Konversiberat(double nilai, String satuanAsal, String satuanTujuan) {
        switch (satuanAsal) {
            case "kilogram":
                if (satuanTujuan.equals("kilogram")) {
                    return nilai;
                } else if (satuanTujuan.equals("gram")) {
                    return nilai * 1000;
                } else if (satuanTujuan.equals("ton")) {
                    return nilai / 1000;
                } else {
                    return nilai;
                }
            case "gram":
                if (satuanTujuan.equals("kilogram")) {
                    return nilai / 1000;
                } else if (satuanTujuan.equals("gram")) {
                    return nilai;
                } else if (satuanTujuan.equals("ton")) {
                    return nilai / 1000000;
                } else {
                    return nilai;
                }
            case "ton":
                if (satuanTujuan.equals("kilogram")) {
                    return nilai * 1000;
                } else if (satuanTujuan.equals("gram")) {
                    return nilai * 1000000;
                } else if (satuanTujuan.equals("ton")) {
                    return nilai;
                } else {
                    return nilai;
                }
            default:
                return nilai;
}    
    }



    private static double Konversiwaktu(double nilai, String satuanAsal, String satuanTujuan) {
      switch (satuanAsal) {
        case "detik":
            if (satuanTujuan.equals("detik")) {
                return nilai;
            } else if (satuanTujuan.equals("menit")) {
                return nilai / 60;
            } else if (satuanTujuan.equals("jam")) {
                return nilai / 3600;
            } else {
                return nilai;
            }
        case "menit":
            if (satuanTujuan.equals("detik")) {
                return nilai * 60;
            } else if (satuanTujuan.equals("menit")) {
                return nilai;
            } else if (satuanTujuan.equals("jam")) {
                return nilai / 60;
            } else {
                return nilai;
            }
        case "jam":
            if (satuanTujuan.equals("detik")) {
                return nilai * 3600;
            } else if (satuanTujuan.equals("menit")) {
                return nilai * 60;
            } else if (satuanTujuan.equals("jam")) {
                return nilai;
            } else {
                return nilai;
            }
        default:
            return nilai;
      }    
    }
        }