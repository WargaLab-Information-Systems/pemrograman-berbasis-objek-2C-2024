package gadgett;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);

        Gadgett gadget[] = new Gadgett[6];
        
        System.out.println("Masukkan merk Smartphone ke-1 : ");
        String merksmrpn1 = inputUser.nextLine();
        System.out.println("Masukkan model Smartphone ke-1 : ");
        String modelsmrpn1 = inputUser.nextLine();
        
        System.out.println("Masukkan merk Smartphone ke-2 : ");
        String merksmrpn2 = inputUser.nextLine();
        System.out.println("Masukkan model Smartphone ke-2 : ");
        String modelsmrpn2 = inputUser.nextLine();
        
        System.out.println("Masukkan merk Tablet ke-1 : ");
        String merktblt1 = inputUser.nextLine();
        System.out.println("Masukkan model Tablet ke-1 : ");
        String modeltblt1 = inputUser.nextLine();
        
        System.out.println("Masukkan merk Tablet ke-2 : ");
        String merktblt2 = inputUser.nextLine();
        System.out.println("Masukkan model Tablet ke-2 : ");
        String modeltblt2 = inputUser.nextLine();
        
        System.out.println("Masukkan merk Laptop ke-1 : ");
        String merklptp1 = inputUser.nextLine();
        System.out.println("Masukkan model Laptop ke-1 : ");
        String modellptp1 = inputUser.nextLine();
        
        System.out.println("Masukkan merk Laptop ke-2 : ");
        String merklptp2 = inputUser.nextLine();
        System.out.println("Masukkan model Laptop ke-2 : ");
        String modellptp2 = inputUser.nextLine();
        
        
        gadget[0]=new Smartphone(merksmrpn1, modelsmrpn1);
        gadget[1]=new Smartphone(merksmrpn2, modelsmrpn2);
        gadget[2]=new Tablet(merktblt1, modeltblt1);
        gadget[3]=new Tablet(merktblt2, modeltblt2);
        gadget[4]=new Laptop(merklptp1, modellptp1);
        gadget[5]=new Laptop(merklptp2, modellptp2);
                        
        
        for(int i=0; i<gadget.length;i++){
        gadget[i].ambilFoto();
        gadget[i].rekamVideo();
        gadget[i].kirimFile();
        gadget[i].terimaFile();
        gadget[i].cariJaringan();
        gadget[i].hubungkanJaringan();
        gadget[i].lupakanJaringan();
        gadget[i].ambilKoordinat();
        
    }
        

    }
}
