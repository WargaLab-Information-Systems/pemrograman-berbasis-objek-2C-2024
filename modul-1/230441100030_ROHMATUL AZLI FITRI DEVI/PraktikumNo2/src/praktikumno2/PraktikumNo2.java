/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikumno2;

public class PraktikumNo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.util.Scanner input = new java.util.Scanner (System.in);
        
        String NAMA;
        String NIM;
        String ALAMAT;
        String JURUSAN;
        
        System.out.println("INPUT NAMA =");
        NAMA=input.nextLine();
        System.out.println("INPUT NIM =");
        NIM=input.nextLine();
        System.out.println("INPUT ALAMAT =");
        ALAMAT=input.nextLine();
        System.out.println("INPUT JURUSAN =");
        JURUSAN=input.nextLine();
        
        System.out.println("------------------------------");
        System.out.println("NAMA SAYA ="+ NAMA);
        System.out.println("NIM SAYA ="+ NIM);
        System.out.println("NIM SAYA ="+ ALAMAT);
        System.out.println("JURUSAN SAYA ="+ JURUSAN);
    }
    
}
