package tugascoding;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Gadget[] ggt = new Gadget[6]; 
       
        for( int i = 1; i <= 2; i++ ){
            System.out.print("Merek Smartphone " + i + " \t:");
            String merek = scan.nextLine();

            System.out.print("Model Smartphone " + i + " \t:");
            String model = scan.nextLine();
            
            if (i == 1) {
                ggt[0] = new Smartphone(merek, model);
            }else {
                ggt[1] = new Smartphone(merek, model);
            }
        }
        
        for( int i = 1; i <= 2; i++ ){
            System.out.print("Merek Tablet " + i + " \t:");
            String merek = scan.nextLine();

            System.out.print("Model Tablet " + i + " \t:");
            String model = scan.nextLine();
            
            if (i == 1) {
                ggt[2] = new Tablet(merek, model);
            }else {
                ggt[3] = new Tablet(merek, model);
            }
        }
        
        for( int i = 1; i <= 2; i++ ){
            System.out.print("Merek Laptop " + i + " \t:");
            String merek = scan.nextLine();

            System.out.print("Model Laptop " + i + " \t:");
            String model = scan.nextLine();
            
            if (i == 1) {
                ggt[4] = new Laptop(merek, model);
            }else {
                ggt[5] = new Laptop(merek, model);
            }
        }
        
        for(Gadget g: ggt) {
            g.displayInfo();
        }
        
    }
}
