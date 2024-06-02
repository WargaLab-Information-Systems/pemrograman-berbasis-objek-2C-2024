package modul6;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        gadgett gadget[]=new gadgett[6];
            
            System.out.print("Masukkan Merek Smartphone 1 : ");
            String merkSmartphone1 = scanner.next();
            System.out.print("Masukkan Model Smartphone 1 : ");
            String modelSmartphone1 = scanner.next();
            System.out.print("Masukkan Merek Smartphone 2 : ");
            String merkSmartphone2 = scanner.next();
            System.out.print("Masukkan Model Smartphone 2 : ");
            String modelSmartphone2 = scanner.next();
            System.out.println(" ");
          
            System.out.print("Masukkan Merek Tablet 1 : ");
            String merktablet1 = scanner.next();
            System.out.print("Masukkan Model Tablet 1 : ");
            String modeltablet1 = scanner.next();
            System.out.print("Masukkan Merek Tablet 2 : ");
            String merktablet2 = scanner.next();
            System.out.print("Masukkan Model Tablet 2 : ");
            String modeltablet2 = scanner.next();
            System.out.println(" ");

            System.out.print("Masukkan Merek Laptop 1 : ");
            String merklaptop1 = scanner.next();
            System.out.print("Masukkan Model Laptop 1 : ");
            String modellaptop1 = scanner.next();
            System.out.print("Masukkan Merek Laptop 2 : ");
            String merklaptop2 = scanner.next();
            System.out.print("Masukkan Model Laptop 2 : ");
            String modellaptop2 = scanner.next();
        
        gadget[0] = new smartphone(merkSmartphone1, modelSmartphone1);
                    gadget[1] = new smartphone(merkSmartphone2, modelSmartphone2);                 
                    gadget[2] =  new tablet(merktablet1, modeltablet1);                  
                    gadget[3] =  new tablet(merktablet2, modeltablet2);                   
                    gadget[4] = new laptop(merklaptop1, modellaptop1);
                    gadget[5] = new laptop(merklaptop2, modellaptop2);
            
        for (int i=0; i<gadget.length; i++){

            System.out.println("\n ^^^^^^^^^^^^^^^^^^^FITUR - FITUR^^^^^^^^^^^^^^^^^^^^");
            gadget[i].ambilFoto();
            gadget[i].rekamVideo();
            gadget[i].kirimFile();
            gadget[i].terimaFile();
            gadget[i].koneksiPerangkat();
            gadget[i].carijaringan();
            gadget[i].hubungkanJaringan();
            gadget[i].lupakanJaringan();
                  
        }
    }
}

 
    