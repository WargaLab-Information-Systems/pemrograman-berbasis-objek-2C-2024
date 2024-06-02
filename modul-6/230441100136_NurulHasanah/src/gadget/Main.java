package gadget;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Gadget gadget[]=new Gadget[6];
                    System.out.println("=================== INPUT JENIS GADGET ===================");
                    System.out.print("Masukkan Merek Smartphone 1 : ");
                    String merekSmartphone1 = scanner.next();
                    System.out.print("Masukkan Model Smartphone 1 : ");
                    String modelSmartphone1 = scanner.next();
                    System.out.print("Masukkan Merek Smartphone 2 : ");
                    String merekSmartphone2 = scanner.next();
                    System.out.print("Masukkan Model Smartphone 2 : ");
                    String modelSmartphone2 = scanner.next();
                    System.out.println(" ");

                    System.out.print("Masukkan Merek Tablet 1 : ");
                    String merekTablet1 = scanner.next();
                    System.out.print("Masukkan Model Tablet 1 : ");
                    String modelTablet1 = scanner.next();
                    System.out.print("Masukkan Merek Tablet 2 : ");
                    String merekTablet2 = scanner.next();
                    System.out.print("Masukkan Model Tablet 2 : ");
                    String modelTablet2 = scanner.next();
                    System.out.println(" ");

                    System.out.print("Masukkan Merek Laptop 1 : ");
                    String merekLaptop1 = scanner.next();
                    System.out.print("Masukkan Model Laptop 1 : ");
                    String modelLaptop1 = scanner.next();
                    System.out.print("Masukkan Merek Laptop 2 : ");
                    String merekLaptop2 = scanner.next();
                    System.out.print("Masukkan Model Laptop 2 : ");
                    String modelLaptop2 = scanner.next();

                    System.out.println(" ");
                    System.out.println("=================== HASIL INFORMASI SEMUA GADGET ===================");
                    System.out.println(" ");
                    System.out.println(" ");
                    gadget[0] = new Smartphone(merekSmartphone1, modelSmartphone1);
                    gadget[1] = new Smartphone(merekSmartphone2, modelSmartphone2);                 
                    gadget[2] =  new Tablet(merekTablet1, modelTablet1);                  
                    gadget[3] =  new Tablet(merekTablet2, modelTablet2);                   
                    gadget[4] = new Laptop(merekLaptop1, modelLaptop1);
                    gadget[5] = new Laptop(merekLaptop2, modelLaptop2);
                    for (int i=0; i<gadget.length; i++){
                        int ke =i+1;
                        System.out.println("=================== DATA GADGET KE " +ke +" ===================");
                        gadget[i].gadget();
                        gadget[i].ambilFoto();
                        gadget[i].rekamvideo();
                        gadget[i].kirimFile();
                        gadget[i].terimaFile();
                        gadget[i].koneksiPerangkat();
                        gadget[i].cariJaringan();
                        gadget[i].hubungkanJaringan();
                        gadget[i].lupakanJaringan();
                        gadget[i].ambilKoordinat();
                        System.out.println(" ");
                    }                    
    }
    
}