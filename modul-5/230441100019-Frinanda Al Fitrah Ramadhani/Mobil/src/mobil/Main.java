/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mobil;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println(" -- Pencarian Mobil -- ");
            
            System.out.println("Masukan merk mobil : ");
            String merk = input.nextLine();

            System.out.println("Masukan model mobil : ");
            String model = input.nextLine();

            System.out.println("Masukan tahun produksi mobil : ");
            int tahun_kendaraan = input.nextInt();

            if (merk.equalsIgnoreCase("Toyota") && model.equalsIgnoreCase("Cayla") && tahun_kendaraan == 2016 || merk.equalsIgnoreCase("Daihatsu") && model.equalsIgnoreCase("Sigra") && tahun_kendaraan == 2016){
                Mobil mpv = new MPV(merk, model, tahun_kendaraan);
                mpv.ShowFeature();
            } else if (merk.equalsIgnoreCase("Toyota") && model.equalsIgnoreCase("Rush") && tahun_kendaraan == 2006 || merk.equalsIgnoreCase("Honda") && model.equalsIgnoreCase("HR-V") && tahun_kendaraan == 2014){
                Mobil suv = new SUV(merk, model, tahun_kendaraan);
                suv.ShowFeature();
            } else if (merk.equalsIgnoreCase("Mercedes") && model.equalsIgnoreCase("AMG GT") && tahun_kendaraan == 2022 || merk.equalsIgnoreCase("Subaru") && model.equalsIgnoreCase("WRX STI") && tahun_kendaraan == 2021){
                Mobil ms = new MobilSport(merk, model, tahun_kendaraan);
                ms.ShowFeature();
            } else if (merk.equalsIgnoreCase("Nissan") && model.equalsIgnoreCase("Leaf") && tahun_kendaraan == 2010 || merk.equalsIgnoreCase("Toyota") && model.equalsIgnoreCase("bZ4X") && tahun_kendaraan == 2022){
                Mobil ml = new MobilListrik(merk, model, tahun_kendaraan);
                ml.ShowFeature();
            } else {
                System.out.println("Mobil Tidak Ada!");
            }
            System.out.println();
            System.out.println("Apakah ingin melanjutkan pencarian?");
            input.nextLine();
            System.out.println("Y = Yes/N = No : ");
            String tanya = input.nextLine();
            if (tanya.equalsIgnoreCase("N")) break;
        }
    }
    
}
