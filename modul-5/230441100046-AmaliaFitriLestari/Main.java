/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mobil;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         // Meminta input data mobil dari pengguna
        System.out.println("------MASUKKAN DATA MOBIL------");
        System.out.print("Pilih jenis mobil (1. MPV, 2. SUV, 3. Mobil Sport, 4. Mobil Listrik): ");
        int jenis = input.nextInt();
        input.nextLine();
        System.out.print("Merk: ");
        String merk = input.nextLine();
        System.out.print("Model: ");
        String model = input.nextLine();
        System.out.print("Tahun Produksi: ");
        int tahunProduksi = input.nextInt();
        System.out.println("");   
          
        Mobil mobil;
        // menampilkan data mobil sesuai dengan jenis mobil yang dipilih
        switch (jenis) {
            case 1:
                mobil = new MPV(merk, model, tahunProduksi);
                break;
            case 2:
                mobil = new SUV(merk, model, tahunProduksi);
                break;
            case 3:
                mobil = new Mobilsport(merk, model, tahunProduksi);
                break;
            case 4:
                mobil = new MobilListrik(merk, model, tahunProduksi);
                break;
            default:
                mobil = new Mobil(merk, model, tahunProduksi);
                break;
        }

        // Memanggil method showFeature() untuk objek yang telah dibuat
        mobil.showFeature();      
        input.close();
    }
}
  
