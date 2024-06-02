/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car;

import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class Main {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);

        boolean lanjut = true;
        while (lanjut) {
            System.out.println("\n->->Tipe Mobil<-<- ");
            System.out.println("1.Mobil Sport");
            System.out.println("2.Mobil Electric");
            System.out.println("3.Mobil crossover");
            System.out.println("4.Mobil sedan");
            
            Car car;
            while (true) {
                System.out.print("Input 1 / 2 / 3 / 4 : ");
                String pilihMobil = inputUser.nextLine();
                if (pilihMobil.equals("1")) {
                    car = new Sports();
                    break;
                }
                else if (pilihMobil.equals("2")) {
                    car = new Electric();
                    break;
                }
                else if (pilihMobil.equals("3")) {
                    car = new Crossover();
                    break;
                }
                else if (pilihMobil.equals("3")) {
                    car = new Sedan();
                    break;
                }
                else{
                    System.out.println("Input yang bener dong..!");
                }
            }
            String inputMerk, inputModel;
            int inputTahunProduksi;
            System.out.println("Input Data Mobil");
            System.out.print("Input Merk Mobil : ");
            inputMerk = inputUser.nextLine();
            System.out.print("Input Model Mobil : ");
            inputModel = inputUser.nextLine();
            System.out.print("Input Tahun Produksi Mobil : ");
            inputTahunProduksi = inputUser.nextInt();
            inputUser.nextLine();
            car.setAtribute(inputMerk, inputModel, inputTahunProduksi);
            car.showFeature();
            System.out.println();
            while (true) {
                System.out.print("Mau input lagi tidak ? ( y ) or ( t ) : ");
                String mau = inputUser.nextLine();
                if (mau.equalsIgnoreCase("y")) {
                    break;
                }else if (mau.equalsIgnoreCase("t")) {
                    System.out.println("program selesai...");
                    lanjut = false;
                    break;
                } else {
                    System.out.println("Yang bener dong..!");
                }

            }
        }
    }
    
}
