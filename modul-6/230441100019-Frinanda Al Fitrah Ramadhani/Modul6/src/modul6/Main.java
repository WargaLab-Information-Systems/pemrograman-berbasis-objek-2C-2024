/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println();
            System.out.println("(S = Smartphone/T = Tablet/L = Laptop)");
            System.out.println("Masukan Jenis Gadget : ");
            String jenis = input.nextLine();
            
            if(jenis.equalsIgnoreCase("S")){
                System.out.println("Masukan Merk 1  : ");
                String Merk1 = input.nextLine();

                System.out.println("Masukan Model 1 : ");
                String Model1 = input.nextLine();
          
                System.out.println("Masukan Merk 2  : ");
                String Merk2 = input.nextLine();

                System.out.println("Masukan Model 2 : ");
                String Model2 = input.nextLine();
                
                Smartphone hp1 = new Smartphone(Merk1, Model1);
                hp1.display();
                
                Smartphone hp2 = new Smartphone(Merk2, Model2);
                hp2.display();
            } else if(jenis.equalsIgnoreCase("T")){
                System.out.println("Masukan Merk 1  : ");
                String Merk1 = input.nextLine();

                System.out.println("Masukan Model 1 : ");
                String Model1 = input.nextLine();
          
                System.out.println("Masukan Merk 2  : ");
                String Merk2 = input.nextLine();

                System.out.println("Masukan Model 2 : ");
                String Model2 = input.nextLine();
                
                Tablet tb1 = new Tablet(Merk1, Model1);
                tb1.display();
                
                Tablet tb2 = new Tablet(Merk2, Model2);
                tb2.display();
            } else if(jenis.equalsIgnoreCase("L")){
                System.out.println("Masukan Merk 1  : ");
                String Merk1 = input.nextLine();

                System.out.println("Masukan Model 1 : ");
                String Model1 = input.nextLine();
          
                System.out.println("Masukan Merk 2  : ");
                String Merk2 = input.nextLine();

                System.out.println("Masukan Model 2 : ");
                String Model2 = input.nextLine();
                
                Laptop pc1 = new Laptop(Merk1, Model1);
                pc1.display();
                
                Laptop pc2 = new Laptop(Merk2, Model2);
                pc2.display();
            } else {
                System.out.println("Jenis Gadget Tidak Ada!");
            }

            System.out.print("Ingn Melanjutkan Pencarian? (Y = Yes/N = No)");
                String tanya = input.nextLine();
                if (tanya.equalsIgnoreCase("N")) break;
        } 
    }
}
