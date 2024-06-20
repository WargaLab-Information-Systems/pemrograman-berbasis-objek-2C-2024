/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gadget;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        
        Scanner scanner = new Scanner(System.in);
        Gadget gadget[]=new Gadget[6];
                    System.out.println(" MASUKKAN INFORMASI SMARTPHONE");
                    System.out.print("Masukkan Merek Smartphone 1 : ");
                    String merksmartphone1 = scanner.next();
                    System.out.print("Masukkan Model Smartphone 1 : ");
                    String modelSmartphone1 = scanner.next();
                    System.out.print("Masukkan Merek Smartphone 2 : ");
                    String merksmartphone2 = scanner.next();
                    System.out.print("Masukkan Model Smartphone 2 : ");
                    String modelsmartphone2 = scanner.next();
                    System.out.println(" ");
                     System.out.println(" MASUKKAN INFORMASI TABLET");
                    System.out.print("Masukkan Merek Tablet 1 : ");
                    String merktablet1 = scanner.next();
                    System.out.print("Masukkan Model Tablet 1 : ");
                    String modeltablet1 = scanner.next();
                    System.out.print("Masukkan Merek Tablet 2 : ");
                    String merktablet2 = scanner.next();
                    System.out.print("Masukkan Model Tablet 2 : ");
                    String modeltablet2 = scanner.next();
                    System.out.println(" ");
                    System.out.println(" MASUKKAN INFORMASI LAPTOP");
                    System.out.print("Masukkan Merek Laptop 1 : ");
                    String merklaptop1 = scanner.next();
                    System.out.println("Masukkan Model Laptop 1 : ");
                    String modellaptop1 = scanner.next();
                    System.out.println("Masukkan Merek Laptop 2 : ");
                    String merklaptop2 = scanner.next();
                    System.out.println("Masukkan Model Laptop 2 : ");
                    String modellaptop2 = scanner.next();

                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(" ");
                    gadget[0] = new Smartphone(merksmartphone1, modelSmartphone1);
                    gadget[1] = new Smartphone(merksmartphone2, modelsmartphone2);                 
                    gadget[2] =  new Tablet(merktablet1, modeltablet1);                  
                    gadget[3] =  new Tablet(merktablet2, modeltablet2);                   
                    gadget[4] = new Laptop(merklaptop1, modellaptop1);
                    gadget[5] = new Laptop(merklaptop2, modellaptop2);
                    for (int i=0; i<gadget.length; i++){
                        int ke =i+1;
                        System.out.println(" Menamipilkan informasi GADGET");
                        gadget[i].gadget();
                        gadget[i].ambilFoto();
                        gadget[i].rekamVideo();
                        gadget[i].kirimFile();
                        gadget[i].terimaFile();
                        gadget[i].koneksiPerangkat();
                        gadget[i].carijaringan();
                        gadget[i].hubungkanJaringan();
                        gadget[i].lupakanJaringan();
                        gadget[i].ambilKoordinat();
                        System.out.println(" ");
                    }                    
        }
    
    }
           