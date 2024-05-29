/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mobil;


import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan merk mobil untuk MPV:");
        String merkMPV = input.nextLine();
        System.out.println("Masukkan model mobil untuk MPV:");
        String modelMPV = input.nextLine();
        System.out.println("Masukkan tahun produksi mobil untuk MPV:");
        String tahunProduksiMPV = input.nextLine();

        MPV mpv = new MPV(merkMPV, modelMPV, tahunProduksiMPV);

        System.out.println("Masukkan merk mobil untuk SUV:");
        String merkSUV = input.nextLine();
        System.out.println("Masukkan model mobil untuk SUV:");
        String modelSUV = input.nextLine();
        System.out.println("Masukkan tahun produksi mobil untuk SUV:");
        String tahunProduksiSUV = input.nextLine();

        SUV suv = new SUV(merkSUV, modelSUV, tahunProduksiSUV);

        System.out.println("Masukkan merk mobil untuk Mobil Sport:");
        String merkMobilSport = input.nextLine();
        System.out.println("Masukkan model mobil untuk Mobil Sport:");
        String modelMobilSport = input.nextLine();
        System.out.println("Masukkan tahun produksi mobil untuk Mobil Sport:");
        String tahunProduksiMobilSport = input.nextLine();

        MobilSport mobilSport = new MobilSport(merkMobilSport, modelMobilSport, tahunProduksiMobilSport);

        System.out.println("Masukkan merk mobil untuk Mobil Listrik:");
        String merkMobilListrik = input.nextLine();
        System.out.println("Masukkan model mobil untuk Mobil Listrik:");
        String modelMobilListrik = input.nextLine();
        System.out.println("Masukkan tahun produksi mobil untuk Mobil Listrik:");
        String tahunProduksiMobilListrik = input.nextLine();

        MobilListrik mobilListrik = new MobilListrik(merkMobilListrik, modelMobilListrik, tahunProduksiMobilListrik);

        input.close();

        mpv.showFeature();
        mpv.evaluate();

        suv.showFeature();
        suv.evaluate();

        mobilSport.showFeature();
        mobilSport.evaluate();

        mobilListrik.showFeature();
        mobilListrik.evaluate();
    }
}

