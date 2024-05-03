/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal1;

import java.util.Scanner;

/**
 *
 * @author IBUCOMP
 */
public class Main {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
           
            while (true){
                String jenis;
                while (true){
                    System.out.println("Masukkan Jenis Kendaraan (Mobil/Motor/Sepeda) :");
                    jenis = input.nextLine();
                    if (jenis.equalsIgnoreCase("Mobil")){
                        break;
                    } else if (jenis.equalsIgnoreCase("Motor")){
                        break;
                    } else if (jenis.equalsIgnoreCase("Sepeda")){
                        break;
                    } else {
                        System.out.println("Jenis Kendaraan Tidak Ada");
                    }
                }    

                System.out.println("Masukkan Merek Kendaraan :");
                String merek = input.nextLine();

                System.out.println("Masukkan Model Kendaraan :");
                String model = input.nextLine();
                
                char status;
                while (true){
                    System.out.println("Masukkan Status Kendaraan (T = Tersedia/D = Disewakan) :");
                    status = Character.toUpperCase(input.nextLine().charAt(0));
                    if (status == 'T'){
                        break;
                    } else if (status == 'D'){
                        break;
                    } else {
                        System.out.println("Pilih (T/D) Untuk Memasukkan Status Kendaraan");
                    }
                }

                System.out.println("Masukkan Tahun Kendaraan :");
                int tk = input.nextInt();
                input.nextLine();

                if (jenis.equalsIgnoreCase("Mobil")) {
                    Mobil mobil = new Mobil(merek, model, status, tk);
                    mobil.info_penyewaan();
                } else if (jenis.equalsIgnoreCase("Motor")) {
                    Motor motor = new Motor(merek, model, status, tk);
                    motor.info_penyewaan();
                } else if (jenis.equalsIgnoreCase("Sepeda")) {
                    Sepeda sepeda = new Sepeda(merek, model, status, tk);
                    sepeda.info_penyewaan();
                }
                
                System.out.print("Apakah Ingin Memasukkan Data Lagi ?(Y/N):");
                String tanya = input.nextLine();
                if (tanya.equalsIgnoreCase("N")) break;
            }
            
            
            
        input.close();
    }
}
