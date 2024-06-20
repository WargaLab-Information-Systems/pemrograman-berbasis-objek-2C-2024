/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul5;

import java.util.Scanner;
public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pilih jenis mobil :");
        System.out.println("1. MPV");
        System.out.println("2. SUV");
        System.out.println("3. Mobil Listrik");
        System.out.println("4. Mobil Sport");

        System.out.println();
        System.out.println("Masukkan Pilihan : ");
        int pilihan = input.nextInt();
        input.nextLine();

        Mobil mobil = null;

        if (pilihan >= 1 && pilihan <= 4) {
            System.out.println();
            System.out.print("Masukkan merk mobil : ");
            String merk = input.nextLine();

            System.out.print("Masukkan model mobil : ");
            String model = input.nextLine();

            System.out.print("Masukkan tahun produksi : ");
            int tahunProduksi = input.nextInt();

            if (pilihan == 1) {
                mobil = new MPV(merk, model, tahunProduksi);
            } else if (pilihan == 2) {
                mobil = new SUV(merk, model, tahunProduksi);
            } else if (pilihan == 3) {
                mobil = new mobilListrik(merk, model, tahunProduksi);
            } else if (pilihan == 4) {
                mobil = new mobilSport(merk, model, tahunProduksi);
            }
            
            System.out.println();
            System.out.println("===== Detail =====");
            System.out.println("Merk : " + mobil.merk);
            System.out.println("Model : " + mobil.model);
            System.out.println("Tahun Produksi : " + mobil.tahunProduksi);
            mobil.showFeature();
        } else {
            System.out.println("Pilihan tidak tersedia");
            input.close();
        }
    }
}
